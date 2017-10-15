package com.sempra.hr.cucumber.frwk.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class XLReader {

	private String filePath;
	private String fileName;
	private Workbook XLWorkbook;
	private static final Logger logger = LoggerFactory.getLogger(XLReader.class);

	public XLReader(String filePath, String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
	}

	public void openXLWorkBook() {

		try {
			// Create an object of File class to open xlsx file

			File file = new File(filePath + fileName);
			// Create an object of FileInputStream class to read excel file

			FileInputStream inputStream = new FileInputStream(file);

			// Find the file extension by splitting file name in substring and
			// getting only extension name

			String fileExtensionName = fileName.substring(fileName.indexOf("."));

			// Check condition if the file is xlsx file

			if (fileExtensionName.equals(".xlsx")) {

				// If it is xlsx file then create object of XSSFWorkbook class

				this.XLWorkbook = new XSSFWorkbook(inputStream);

			}

			// Check condition if the file is xls file

			else if (fileExtensionName.equals(".xls")) {

				// If it is xls file then create object of XSSFWorkbook class

				this.XLWorkbook = new HSSFWorkbook(inputStream);

			}
			this.closeWorkbook();
		} catch (IOException ioexp) {
			logger.error("Exception while opening the workbook::" + ioexp);
		}

	}

	public List<List<String>> readExcel(String sheetName, boolean isTestScriptDataSheet) throws IOException { // isTestScriptDataSheet-
																												// Sheets
																												// with
																												// Test
																												// Script
																												// IDs,
																												// Scenario
																												// IDs,
																												// Iteration
																												// No
																												// and
																												// SkipTest
																												// column

		List<String> recordList;
		List<List<String>> rowList = new ArrayList<>();
		try {

			if (this.XLWorkbook == null)
				throw new IOException(" XL Workbook is not open [File=" + this.fileName + this.filePath + "]");

			// Read sheet inside the workbook by its name

			Sheet XLSheet = this.XLWorkbook.getSheet(sheetName);

			// Find number of rows in excel file

			int rowCount = XLSheet.getLastRowNum() - XLSheet.getFirstRowNum();

			// Create a loop over all the rows of excel file to read it

			logger.debug("\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv[" + sheetName
					+ "]vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
			for (int i = 0; i < rowCount + 1; i++) {

				recordList = new ArrayList<>();
				Row row = XLSheet.getRow(i);

				// Create a loop to print cell values in a row

				for (int j = 0; j < row.getLastCellNum(); j++) {

					Cell xlCell = row.getCell(j);
					if (xlCell != null) {
						xlCell.setCellType(CellType.STRING);
						String celVal = row.getCell(j).getStringCellValue();
						if (celVal != null)
							celVal = celVal.trim();
						else
							celVal = "";
						if (isTestScriptDataSheet) {
							if (j == 0 && celVal.length() != 0 && celVal.equalsIgnoreCase("TRUE")) // SkipType=TRUE
																									// will
																									// skip,
																									// rest
																									// will
																									// get
																									// executed.
							{
								row.getCell(1).setCellType(CellType.STRING);
								Cell cell2 = row.getCell(2);
								if (cell2 != null)
									cell2.setCellType(CellType.STRING);
								Cell cell4 = row.getCell(4);
								if (cell4 != null)
									cell4.setCellType(CellType.STRING);
								logger.debug("[[ SKIPPED==========>>[" + row.getCell(1).getStringCellValue() + "-"
										+ ((cell2 != null) ? cell2.getStringCellValue()
												: FrameworkConstants.EMTPY_LABEL)
										+ "-" + ((cell4 != null) ? cell4.getStringCellValue()
												: FrameworkConstants.EMTPY_LABEL)
										+ "]");
								break;
							}
							if (j == 2 && celVal.length() == 0) // If the
																// iterationNo
																// column is
																// empty, then
																// assign it to
																// 1
							{
								recordList.add("1");
							}
						}
						System.out.print(row.getCell(j).getStringCellValue() + "|| ");
						recordList.add(row.getCell(j).getStringCellValue());
					} else {
						if (isTestScriptDataSheet) {
							if (j == 2) // If the iterationNo column is empty,
										// then assign it to 1
							{
								recordList.add("1");
							}
						}
						System.out.print(FrameworkConstants.EMTPY_LABEL + "|| ");
						recordList.add("");
					}
				}

				rowList.add(recordList);
				logger.debug(
						"																																			");

			}
			logger.debug("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^[" + sheetName
					+ "]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		} catch (Exception exp) {
			logger.error("Exception while reading the sheet::" + exp);
		}
		return rowList;
	}

	public void closeWorkbook() {
		if (this.XLWorkbook != null) {
			try {
				XLWorkbook.close();
			} catch (IOException ioexp) {
				// TODO Auto-generated catch block
				logger.error("Exception while closing the XLWorkbook::" + ioexp);
			}
		}
	}

	// Main function is calling readExcel function to read data from excel file

	public static void main(String... strings) throws IOException {

		// Create an object of XLReader class
		// XLReader objExcelFile = new XLReader("src/test/resources/testdata/",
		// "old_Eligibility_TestData.xls");
		XLReader objExcelFile = new XLReader("src/test/resources/testdata/", "Eligibility_TestData.xlsx");

		// Open the workbook
		objExcelFile.openXLWorkBook();

		// Call read file method of the class to read data
		// objExcelFile.readExcel("RM_01", true);
		// objExcelFile.readExcel(FrameworkConstants.TEST_DATA_SHEET_COMMON,
		// true);
		objExcelFile.readExcel("Credentials", false);

	}

}