Feature: leads_tab scenarios
Background:
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"
@lead_tab
Scenario: user enters the leads tab
Given user is on "leadpage" 
Given click on the button "leads"
When user select from the dropdown "lead_dropdown" "Today's Leads"
Then user waits for Element "go"
Then click on the button "go"

@lead2
Scenario: user verifies for lead dropdown option retains after logout
Given user is on "leadpage" 
Given click on the button "leads"
When user select from the dropdown "lead_dropdown" "My Unread Leads"
Given user is on "leadpage" 
And click on the button "usermenus"
Then click on the button "logout"
Then user waits for page 
Given user is on "loginpage"
Then user waits for page 
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"
Then user waits for page 
Given user is on "leadpage" 
Then user waits for page 
Then user waits for Element "leads"
Then click on the button "leads"
Then user waits for Element "go"
Then click on the button "go"

@create_lead
Scenario: user creates the new lead 
Given user is on "leadpage" 
Given click on the button "leads"
When click on the button "new_button"
Then user waits for Element "lastname"
Then user enter into the textbox "lastname" "ABCD"
Then user waits for Element "company_name" 
Then user enter into the textbox "company_name" "ABCD"
Then user waits for Element "lead_status_dropdown" 
When user select from the dropdown "lead_status_dropdown" "Working - Contacted"
Then click on the button "save"
@dropdown
Scenario: user enters the leads tab
Given user is on "leadpage" 
Given click on the button "leads"
When click on the button "lead_dropdown" 
Then user waits for page



