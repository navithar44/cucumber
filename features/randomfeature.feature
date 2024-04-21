Feature: usermenu_tab scenarios
Background: user logging into the application
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"

@Home
Scenario: home tab recent items page
Given user is on "randompage"
Then user waits for Element "home"
Then click on the button "home"
Then user waits for Element "recent_items"
Then user waits for Element "user_link"
Then click on the button "user_link"

@rd-tc35
Scenario: verify about tab 
Given user is on "randompage"
Then user waits for Element "home"
Then click on the button "home"
Then user waits for Element "recent_items"
Then user waits for Element "user_link"
Then click on the button "user_link"
Then user waits for Element "edit_profile"
Then click on the button "edit_profile"
And user switch to frame "contactInfoContentId" 
Then user waits for Element "about"
Then click on the button "about"
Then user waits for Element "lastname"
Then user clears the textbox "lastname"
Then user enter into the textbox "lastname" "Abcd"
Then user waits for Element "saveall"
Then click on the button "saveall"

@All_tab
Scenario: verify deleting tab from all tabs link
Given user is on "randompage"
Then user waits for Element "all_tab"
Then click on the button "all_tab"
Then user waits for Element "customize_tab"
Then click on the button "customize_tab"
Then user waits for Element "selected_tab"
When user select from the dropdown "selected_tab" "Leads"
Then user waits for Element "arrow_remove"
Then click on the button "arrow_remove"
Then user waits for Element "save"
Then click on the button "save"
Given user is on "loginpage"
Then click on the button "usermenus"
Then click on the button "logout"
Then user waits for page
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"
Then user waits for page
Given user is on "randompage"
Then user waits for page
Then user waits for Element "home"
@Time_frame:4
Scenario: verify about tab 
Given user is on "randompage"
Then user waits for Element "home"
Then click on the button "home"
Then user waits for Element "currentdate_link"
Then click on the button "currentdate_link"
Then user waits for Element "time_frame"
Then user waits for Element "time_4"
Then click on the button "time_4"
Then user start to parent window 
Then click on the button "combobox"
Then user switch to child window 
And user waits for Element "body"
And user waits for Element "selectfromList"
Then click on the button "selectfromList"
Then user waits for page
Then user switch to parent window 
Then user waits for page
Then user clears the textbox "time"
And user enter into the textbox "time" "7PM"
Then user waits for page
Then click on the button "select_recurence"
Then user waits for page
Then click on the button "weekly"
Then user waits for page
Then user enter into the textbox "recur_endDate" "04/18/2024"
Then user waits for page
Then click on the button "save_recurrence"
Then click on the button "month_view"

@Time6
Scenario: verify timestamp created for given time 
Given user is on "randompage"
Then user waits for Element "home"
Then click on the button "home"
Then user waits for Element "currentdate_link"
Then click on the button "currentdate_link"
Then user waits for page
Then user waits for Element "time_frame"
Then user waits for Element "time_6"
Then click on the button "time_6"
Then user start to parent window 
Then user waits for page
Then click on the button "combobox"
Then user switch to child window 
And user waits for Element "body"
And user waits for Element "selectfromList"
Then click on the button "selectfromList"
Then user waits for page
Then user switch to parent window 
Then user waits for page
Then user clears the textbox "time"
And user enter into the textbox "time" "7PM"
Then click on the button "save_timeframe"























