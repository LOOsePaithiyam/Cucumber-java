Feature: Login to the applicatipon
Scenario Outline: Login with valid data
When  user opens newtours application in chrome browser
When user enters username as "<username>" And  password as "<password>"
Then user clicks on signin button And then verify the login functionality

Examples: 
|username|password|
|Lalitha|Password123|
#|Sample|Password123|
|mercury|mercury|