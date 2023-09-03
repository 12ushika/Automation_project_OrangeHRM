Feature: Edit Language and Date 

Background: Commen step
Given open the application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And user given valid input "Admin" and "admin123"


Scenario Outline: Verify and Edit Language and date with valid data

When user click Admin tab
And open configuration dropdown function
And Select localization Option
And Select language Dropdown option
And selcte Date Format dropdown Option
Then Click Save button

 
 
