Feature: Login functionality

Description: Registered user login to the application by entering valid credentials
Mapping: John would like to access the online shopping page
Scenario: login with valid data
When user opens chrome browser and opens application
When user entering username as "mercury" And password in the field
And user clicks on signin button 
And verify the login result

Scenario: Login with valid data
When user opens chrome browser and opens application
When user entering username as "merry" And password in field
And user clicks on signin button
Then verify login result