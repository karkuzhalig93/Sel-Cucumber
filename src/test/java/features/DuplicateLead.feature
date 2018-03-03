Feature: Duplicate Lead
Duplicate Lead

@smoke
Scenario Outline: Duplicate Lead(Positive)

Given Enter username <username>
And enter password <password>
And click Login
And click crmsfa
And click leads
And click FindLead
And click Email
Given enter email <email>
And click  findleadbutton
And get FirstLeadName
And click firstLead
And click DuplicateLead
And verify Duplicatetitle <title>
And click createLead
Then verify LeadName <leadname>

Examples:
|username|passowrd|email|title|leadname|
|DemoSalesManager|crmsfa|test@test.com|Duplicate Lead|test|
