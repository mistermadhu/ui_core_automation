package com.sempra.hr.cucumber.frwk.util;

import java.io.Serializable;

import com.sempra.hr.cucumber.frwk.annotations.Data;
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class TestDataInfo  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Data(name = "BusinessUnit")
	private String businessUnit;

	@Data(name = "Item")
	private String item;

	@Data(name = "InspectionQuantity")
	private String inspectionQty = "";


	/**
	 * @return the businessUnit
	 */
	public String getBusinessUnit() {
		return businessUnit.replaceAll("\\[", "").replaceAll("\\]","");
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item.replaceAll("\\[", "").replaceAll("\\]","");
	}

	/**
	 * @return the inspectionQty
	 */
	public String getInspectionQuantity() {
		return inspectionQty.replaceAll("\\[", "").replaceAll("\\]","");
//		.substring(0, inspectionQty.indexOf(".") - 1)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ImmediateNeedsDataInfo [ businessUnit="+ businessUnit + ", item=" + item + ", inspectionQty=" + inspectionQty + "]";
	}
}
