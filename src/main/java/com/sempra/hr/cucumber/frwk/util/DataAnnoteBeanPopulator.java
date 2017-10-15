package com.sempra.hr.cucumber.frwk.util;

import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;

/**
 * Populates the value beans based on @Data annotations.
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class DataAnnoteBeanPopulator {

	private final ModelMapper mapper = new ModelMapper();
	private final DataAnnotePropertyMatcher matcher = new DataAnnotePropertyMatcher();
	private final Map<String, List<String>> inputData;

	/**
	 * Initialize the populator.
	 */
	public DataAnnoteBeanPopulator(Map<String, List<String>> inputData) {
		mapper.getConfiguration().setFieldAccessLevel(AccessLevel.PRIVATE).setFieldMatchingEnabled(true)
				.setMatchingStrategy(matcher);
		this.inputData = inputData;
	}

	/**
	 * Returns the populated data bean.
	 * 
	 * @param beanCls
	 * @return
	 */
	public <T> T populate(Class<T> beanCls) {
		return mapper.map(inputData, beanCls);
	}

	public static void main(String[] args) {
		/*
		 * Map<String, List<String>> testData = new HashMap<String,
		 * List<String>>(); testData.put("BUSINESSuNIT",
		 * Arrays.asList("AMEX","GCOTS")); testData.put("ITEM",
		 * Arrays.asList("000750-000-17")); testData.put("INSPECTIONQUANTITY",
		 * Arrays.asList("10.0"));
		 * 
		 * DataAnnoteBeanPopulator populator = new
		 * DataAnnoteBeanPopulator(testData); TestDataInfo dataInfo =
		 * populator.populate(TestDataInfo.class);
		 * 
		 * logger.info("Business Unit: " + dataInfo.getBusinessUnit());
		 * logger.info("Item: " + dataInfo.getItem());
		 * logger.info("Inspection Quantity: " +
		 * dataInfo.getInspectionQuantity());
		 */

	}

}