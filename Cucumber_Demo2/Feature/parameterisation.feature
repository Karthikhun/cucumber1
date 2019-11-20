Feature:Login Action

Scenario Outline:Successful Login with Valid Credentials
Given User opens the application
When User clicks on login link
And User enters "<username>" and "<password>"
Then Message displayed Login Successfully

Examples:
|username| password       |
|lalitha | password123    |
|admin   | password456    |