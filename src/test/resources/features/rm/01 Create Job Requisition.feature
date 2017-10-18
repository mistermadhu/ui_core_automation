Feature: Create job requsition
#Feature Id: RM_FTR_001
# Feature Description:
#As a HR Manager or Recruitment Manager
#want to create a new job requisitions
# Covered Test Scripts in this Feature are given below in Business Outcome ID - Scenario ID - Script ID format


#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_114
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_113
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_112
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_111
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_110
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_109
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_059
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_060
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_061
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_062
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_063
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_064
#	RM_BO_04.1 - RM_UCS_003.3 - RM_TS_065


@Regression 
Scenario Outline: Create Job Requisition for Corporate and Global

# Scenario Description: This scenario covers the Test Scripts of Create Job Requisition that uses Corporate and Global Form

 Given I am logged on to the administration side of MyInfo as an HR or Recruitment Manager
|Credentials::UserType   | Recruitment   |
|FeatureID               | RM__FTR_01          |
|WorksheetID               | RM_FTR_001_CorpNGlobal |
|TestScriptID              | <Test_Script_Id>        |
|PermutationNumber              | <Permutation_Number>  |
    When I open create new Corporate and Global req form
    And I fill in the required info and then click Create button
    Then the job posting should be created and saved as Draft
    
Examples: 
|Test_Script_Id   | Permutation_Number   |
| RM_TS_114       |1                     |

