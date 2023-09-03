Feature: Adding new Language 

Background: Commen step
Given open the application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And user given valid input "Admin" and "admin123"


Scenario Outline: Verify and Adding new language in textbox with valid data

When user click Admin tab
And open configuration dropdown function
And Select Localization Packages Dropdown option
And Click Add button
And Select new lanuage package in Dropdown option
Then Click Save button

Scenario Outline: verify HR module 

When user click Admin tab
And open configuration dropdown function
And Select modules dropdown option
And select Recruitment Module checkbox tab
Then Click Save button