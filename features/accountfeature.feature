Feature: accounts_tab scenarios
Background:
Given user launch the application "chrome"
Given user is on "loginpage"
Then user waits for Element "username"
Then user enter into the textbox "username" "navitha@patel.com"
Then user waits for Element "password"
Then user enter into the textbox "password" "Salesforce@123"
Then click on the button "Login"

@createview
Scenario: Login to validate accounts tab
Given user is on "accountpage"
Then click on the button "accounts_tab"
Then click on the button "create_view"
Then user enter into the textbox "view_name" "michael_view1"
Then click on the button "unique_name"
And click on the button "save" 

@create_report
Scenario: create report in accounts_tab
Given user is on "accountpage"
When click on the button "accounts_tab"
When user clicks on the link "activity_link"
Then click on the button "calendar_btn"
Then click on the button "today_btn"
Then click on the button "report_save"
Then user waits for Element "report_name"
And user enter into the textbox "report_name" "myreport_jon"
And click on the button "report_uniqname"
Then user waits for Element "save_run_report"
And click on the button "save_run_report"
And click on the button "save_run_report"

@merge_account
Scenario: merge accounts in accounts_tab
Given user is on "accountpage"
When click on the button "accounts_tab"
Then click on the button "Merge_button"
And user enter into the textbox "search_box" "cu"
Then user waits for Element "search_btn"
Then click on the button "search_btn"
Then user waits for Element "next_btn"
Then click on the button "next_btn"
And user switch to alert page "merge"
Then click on the button "merge"
Then user waits for page
@create_new_account
Scenario: create account in accounts_tab
Given user is on "accountpage"
When click on the button "accounts_tab"
When click on the button "new_button"
Then user waits for Element "account_name"
And user enter into the textbox "account_name" "cucumberacct_1"
Then user waits for Element "type_dropdown"
When user select from the dropdown "type_dropdown" "Technology Partner"
Then user waits for Element "customer_priority_dropdown"
When user select from the dropdown "customer_priority_dropdown" "High"
Then user waits for Element "save_button"
When click on the button "save_button"
Then user waits for Element "new_account"
When click on the button "new_account"

@edit_view
Scenario: create account in accounts_tab
Given user is on "accountpage"
When click on the button "accounts_tab"
Then user waits for Element "list_view"
When user select from the dropdown "list_view" "new_michael"
Then user waits for Element "edit"
When click on the button "edit"
Then user waits for Element "edit_view_name"
And user enter into the textbox "edit_view_name" "mike"
Then user waits for Element "filters"
When user select from the dropdown "filters" "Account Name"
Then user waits for Element "operators"
When user select from the dropdown "operators" "contains"
Then user waits for Element "value"
Then user clears the textbox "value"
And user enter into the textbox "value" "a"
Then user waits for page
Then user waits for Element "select_fields_list"
Then user waits for page
When user select from the dropdown "select_fields_list" "Last Activity"
Then user waits for Element "add"
When click on the button "add"
Then user waits for Element "save"
When click on the button "save"


























