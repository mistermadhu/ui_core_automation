package com.sempra.hr.cucumber.frwk.datatable;

import java.io.Serializable;

import com.sempra.hr.cucumber.frwk.annotations.Data;
/**
 *  
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class PreConditionDataTable implements Serializable {
	
private static final long serialVersionUID = 1L;

   @Data(name="FeatureID")
   private String featureID;

   @Data(name="User Type")
   private String userType;
   
   @Data(name="UserName")
   private String userName;
   
   @Data(name="Password")
   private String passWord;
   
   @Data(name="Description")
   private String description;
   
   @Data(name="TestScriptID")
   private String testcaseID;
   
   @Data(name="PermutationNumber")
   private String permutationNo;
   

public String getFeatureID() {
	return featureID.replaceAll("\\[", "").replaceAll("\\]","");
}

public String getUserType() {
	return userType.replaceAll("\\[", "").replaceAll("\\]","");
}

public String getUserName() {
	return userName.replaceAll("\\[", "").replaceAll("\\]","");
}

public String getPassWord() {
	return passWord.replaceAll("\\[", "").replaceAll("\\]","");
}


public String getDescription() {
	return description.replaceAll("\\[", "").replaceAll("\\]","");
}

public String getTestcaseID() {
	return testcaseID.replaceAll("\\[", "").replaceAll("\\]","");
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public String getPermutationNo() {
	return permutationNo.replaceAll("\\[", "").replaceAll("\\]","");
}

@Override
public String toString() {
	return "EligibilityPreConditionDataTable [featureID=" + featureID + ", userType=" + userType + ", userName="
			+ userName + ", passWord=" + passWord + ", description=" + description + ", testcaseID=" + testcaseID
			+ ", permutationNo=" + permutationNo + "]";
}

   
   
}
