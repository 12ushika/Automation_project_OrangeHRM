Feature: Log in function

Background: Commen step
Given open the application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario Outline: Verify user ID an Password with valid inputs

When user gives valid cridentials "Admin" and "admin123"
Then validate user is landed on "Dashboard" or "Invalid credentials"


Scenario Outline: Verify user ID an Password with Invalid password

When user gives valid cridentials "Admin" and "rush123"
Then validate user is landed on "Dashboard" or "Invalid credentials"


Scenario Outline: Verify user ID an Password with Invalid username

When user gives valid cridentials "rushika" and "admin123"
Then validate user is landed on "Dashboard" or "Invalid credentials"


Scenario Outline: verify Forgot Password button is working or not

When user click forgot your password button
And user given valid cridentials "Admin"
Then validate user is landed on "Reset Password"