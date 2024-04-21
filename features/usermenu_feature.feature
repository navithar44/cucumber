Feature: usermenu_tab scenarios
Background: user logging into the application
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"
@UserMenu_dropdown
Scenario: Login to validate usermenus drop down list
Given user is on "loginpage"
And user waits for Element "usermenus"
Then click on the button "usermenus"
Then user verifies the message "Error1" "usermenus" # drop down list

@devconsole
Scenario: Login to validate usermenus drop down devconsole
Given user is on "usermenu_page"
And user waits for Element "usermenus"
Then click on the button "usermenus"
And user waits for Element "dev_Console"
And click on the button "dev_Console"
And user switch to default content

@logout
Scenario: Login to validate usermenus login and logout page
Given user is on "loginpage"
And user waits for Element "usermenus"
Then click on the button "usermenus"
Then click on the button "logout"
@personal_dispay_tabs
Scenario: validate display and personal tabs of usermenus mysettings page
Given user is on "usermenu_page"
And user waits for Element "usermenus"
Then click on the button "usermenus"
And user waits for Element "mysettings"
Then click on the button "mysettings"
And user waits for Element "personal_link"
Then click on the button "personal_link"
And user waits for Element "login_history"
Then click on the button "login_history"
And user waits for Element "downloads"
Then click on the button "downloads"
And user waits for Element "display_layout"
Then click on the button "display_layout"
And user waits for Element "customize_my_tabs"
Then click on the button "customize_my_tabs"
And user waits for Element "content_dropdown"
And user select from the dropdown "content_dropdown" "Salesforce Chatter"
And user waits for Element "report"
Then click on the button "report"
And user waits for Element "add_button"
Then click on the button "add_button"
And user waits for Element "save_button"
Then click on the button "save_button"
@Email_calendar
Scenario: validate Email and calendar tabs of usermenus mysettings page
Given user is on "usermenu_page"
And user waits for Element "usermenus"
Then click on the button "usermenus"
And user waits for Element "mysettings"
Then click on the button "mysettings"
And user waits for Element "Email"
Then click on the button "Email"
And user waits for Element "my_email_settings"
Then click on the button "my_email_settings"
And user waits for Element "email_name"
Then user clears the textbox "email_name"
Then user enter into the textbox "email_name" "Navitha abcd"
And user waits for Element "email_address"
Then user clears the textbox "email_address"
Then user enter into the textbox "email_address" "navithar44@gmail.com"
And user waits for Element "automatic"
Then click on the button "automatic"
And user waits for Element "save_button"
Then click on the button "save_button" 
And user waits for Element "calendar_reminders"
Then click on the button "calendar_reminders"
And user waits for Element "activity_reminders"
Then click on the button "activity_reminders"
And user waits for Element "open_a_testreminder" 
Then click on the button "open_a_testreminder"   






















