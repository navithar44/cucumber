Feature: Login scenarios
@validlogin
Scenario: Login with valid username and password
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"

@invalidpassword
Scenario: Login with valid username and invalid password
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user enter into the textbox "password" "Saleforce@123"
Then click on the button "Login"
Then user verifies the message "Error" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."

@clearpwd
Scenario: Login with valid username and invalid password
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user clears the textbox "password" 
Then click on the button "Login"
Then user verifies the message "Error" "Please enter your password."

@wrongusernamePassword
Scenario: Login with invalid username and invalid password
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username" 
Then user enter into the textbox "username" "123"
Then user waits for Element "password"
Then user enter into the textbox "password" "22131" 
Then click on the button "Login"
Then user verifies the message "Error" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."

@test_login_logout
Scenario: validate login and logout of application
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username" 
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123" 
Then click on the button "Login"
Then user waits for Element "usermenus"
Then click on the button "usermenus"
#Then user waits for Element "logout"
#Then click on the button "logout"

@validateuser_namefield
Scenario: validate username field
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username" 
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123" 
Then click on the button "checkbox"
Then click on the button "Login"
Then user waits for Element "usermenus"
Then click on the button "usermenus"
Then user waits for Element "logout"
Then click on the button "logout"



@forgotpwd
Scenario: validate username field
Given user launch the application "chrome"
Given user is on "loginpage"
Then click on the button "forgot_pwd"







