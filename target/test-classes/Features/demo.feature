Feature: Feature to test login functionalities

Scenario: Check login is successfull with valid credentials
Given user is on login page
When user login into the app using credentials username and password
Then user is navigated to Home page