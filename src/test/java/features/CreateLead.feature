Feature: Create a lead
Login and create a new lead.


Scenario Outline: Create Lead(Positive)

Given Enter username <username>
And enter password <password>
And click Login
And click crmsfa
And click leads
And click CreateLead
Given enter CompName <compname>
Given enter Firstame <fname>
Given enter lastname <lname>
And click create
Then verify leadname <leadname>

Examples:
|username|password|compname|fname|lname|leadname|
|DemoSalesManager|crmsfa|testleaf|john|test|john|
|DemoSalesManager|crmsfa|HCL|divya|test|divya|
