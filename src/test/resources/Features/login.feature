@sanity
Feature: To check The login Functionality of openmrs page
Scenario: To check the login functionality with positive test cases
Given The user should be in  openmrs page login page
When The user should enter valid username "Admin"and password"Admin123"
And The user should click the login button
Then The user shoould be in valid login page 
Then The user should click logout button and return to Home page 

Scenario Outline: To check the login functionality with negative test cases
Given The user should be in  openmrs page login page
When The user should enter Invalid "<username>"and "<password>"
And The user should click the login button
Then The user should be in Invalid login page 
Examples:
|username|password|
|Ajith|12345|
|Ramya|qwertyu|
|Durai|5432df|
|josh|jdhdh|