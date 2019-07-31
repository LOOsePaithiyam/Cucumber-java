Feature: Login functionality

Background: Welcome
Given Display Welcome message

Scenario: Login with valid data
When user opens chrome browser and opens the application 
When user enters username as "mercury" and password in field
And user clicks on signin buttoon
Then verify the login functionality