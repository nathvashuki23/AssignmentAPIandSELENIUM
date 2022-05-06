Feature: Post with future date and validate



Scenario: Foreign Exchange Page future date
Given API for foreign exchange two
When posted with future date information
Then validate positive response code received from futuredate