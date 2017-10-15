Feature: Validation of plans and rates for an employee displayed correctly based on Benefits Group //Benefits Plans And Rates
@Regression 
Scenario Outline: Correct plans and rates shown for an employee based on Benefits Group

Given I am on Home Page as Admin
|Credentials::UserType | Eligibility             |
|FeatureID             | RM_01                   |
#|WorksheetID               | RM_FTR_001_Utilities |
|TestScriptID          | <Test_Script_Id>        |
|PermutationNumber     | <Permutation_Number>    | 
When I click on People from the Menu bar
And I click on Benefits from the list
And I click on Life Events
And I enter Employee ID field
And I click on Search button
And I click on employee's last name hyperlink
#And I select Enroll on behalf of the employee
And I enter Emulation Date as current date on the Date field
And I click on Report a Life Event
And I select Admin Correction from the drop-down
And I select current Date in the date field
And I click on Submit
And I click on Submit Again
And I click on Admin Correction link on Enrollments page
When I click on Eligibility Summary link in My Links dropdown
Then I should be able to see Eligibility Summary of the employee on a new web page
Examples: 
|Test_Script_Id| Permutation_Number |
|22746        |1                   |