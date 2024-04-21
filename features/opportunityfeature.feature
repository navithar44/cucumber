Feature: accounts_tab scenarios
Background: user logging into the application
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"

@opportunity
Scenario: user enters into the opportunity_tab
Given user is on "opportunitypage"
Then user waits for Element "opportunities"
Then click on the button "opportunities" 
Then click on the button "opportunities_list"

@create_opportunity
Scenario: user creates the opportunity
Given user is on "opportunitypage"
Then click on the button "opportunities"
Then user waits for Element "new_button"
Then click on the button "new_button"
Then user waits for Element "op_name"
Then user enter into the textbox "op_name" "cucumber_opt1"
Then user waits for Element "close_date"
Then click on the button "close_date"
Then user waits for Element "stage"
When user select from the dropdown "stage" "Qualification"
Then user waits for Element "leadsource"
When user select from the dropdown "leadsource" "Phone Inquiry"
Then user waits for Element "probability"
Then user enter into the textbox "probability" "0"
Then user waits for Element "save"
Then click on the button "save"

@opportunity_line
Scenario: user enters the opportunity pipeline page
Given user is on "opportunitypage"
Then click on the button "opportunities"
Then click on the button "opportunity_pipeline"

@stuck_opportunities
Scenario: user enters the stuck opportunity page
Given user is on "opportunitypage"
Then click on the button "opportunities"
Then click on the button "stuck_opp"

@quarter
Scenario: user enters the Quarterly opportunity page
Given user is on "opportunitypage"
Then click on the button "opportunities"
Then user waits for Element "qtrly_interval"
When user select from the dropdown "qtrly_interval" "Previous FQ"
Then user waits for Element "qtrly_include"
When user select from the dropdown "qtrly_include" "Closed/Won Opportunities"
Then user waits for Element "run_report"
Then click on the button "run_report"




