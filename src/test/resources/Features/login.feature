Feature: Test the Api Functionality

API URL: https://reqres.in/api/users/
@smoke
Scenario: API Get(200) Sucess Message
Given API for Postman
When posted with correct Information
Then validate response and log it on console

