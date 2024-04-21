Feature: usermenu_tab scenarios
Background: user logging into the application
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"

@mycontacts-testcase
Scenario: verify the contacts in the contacts tab page
Given user is on "contactpage"
Then click on the button "contacts"
When user select from the dropdown "my_contact" "My Contacts"

@create_view
Scenario: create new view from contacts tab page
Given user is on "contactpage"
Then click on the button "contacts"
Then user waits for Element "create_view"
Then click on the button "create_view"
Then user waits for Element "name"
Then user enter into the textbox "name" "cucmber_contact"
Then user waits for Element "devname"
Then click on the button "devname"
Then click on the button "save"
@recent_created
Scenario: verify recently created contact from contacts tab page
Given user is on "contactpage"
Then click on the button "contacts"
Then user waits for Element "recent_created"
When user select from the dropdown "recent_created" "Recently Created"
@edit_uniquename
Scenario: create new unique name from contacts tab page
Given user is on "contactpage"
Then click on the button "contacts"
Then user waits for Element "create_view"
Then click on the button "create_view"
Then user waits for Element "name"
Then user waits for Element "devname"
Then user enter into the textbox "devname" "EFGH"
Then click on the button "save"
Then user verifies the message "error_msg" "Error: You must enter a value"
@cancelview
Scenario: cancel view from contacts tab page
Given user is on "contactpage"
Then click on the button "contacts"
Then user waits for Element "create_view"
Then click on the button "create_view"
Then user waits for Element "name"
Then user enter into the textbox "name" "ABCD"
Then user waits for Element "devname"
Then user enter into the textbox "devname" "EFGH"
Then click on the button "cancel"
@view
Scenario: create view from contacts tab page
Given user is on "contactpage"
Then click on the button "contacts"
Then click on the button "new"
Then user clears the textbox "last_name"
Then user enter into the textbox "last_name" "Indian"
Then user clears the textbox "account_name"
Then user enter into the textbox "account_name" "Global Media"
Then user waits for page
Then click on the button "save"

@framecontacts
Scenario: create view from existing contacts tab page
Given user is on "contactpage"
Then click on the button "contacts"
Then click on the button "new"
Then user clears the textbox "last_name"
Then user enter into the textbox "last_name" "cucumber_ct"
Then user start to parent window 
Then user waits for Element "account_lookup"
Then click on the button "account_lookup"
Then user switch to child window 
Given user is on "contactpage"
Then user waits for page
Then user waits for Element "text_box"
Then user enter into the textbox "text_box" "nav"
Then user waits for Element "go"
Then click on the button "go"
Then user switch to default content
Then user waits for page
Then user switch to another frame "frame1"
Then user waits for Element "row_id"
Then user waits for Element "text" 
Then click on the button "text"
Then user waits for page
Then user switch to parent window 
Then user waits for page
Then click on the button "save"
























