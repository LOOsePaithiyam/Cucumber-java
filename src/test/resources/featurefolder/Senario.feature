Feature: Login functionality
Description: Registered user login to the application by entering valid username and password
Mapping: John would like access the online shopping page. He should be registered and should use regustered credentials to get logged in to the application
Scenario: Login with valid data 
Given user opens login page in newtours application 
When user enter username as "mercury" and password as "mercury"
And Click on Submit button
Then verify login result