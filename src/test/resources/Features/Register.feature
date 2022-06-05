@smoke
Feature: To check the Registration function of openmrs page
Scenario: To check the Registration function of openmrs page 
    Given The user should be in  openmrs page login page
    And The user should enter valid username "Admin"and password"Admin123"
    When The user should click the login button
    And The user should click the registarionPatient button
    And The user should be in Registration page
    #register
    And The user should fill the given,Middle and family name
    |Durai|Arasan|dj|
    |Durai|sadhana|ds|
    |Durai|priya|dp|
    And The user should click next button 
    And The user should select the gender "Male" in dropdown
    And The user should click next button 
    And The user should fill the date "02",month"December" and year"1997"
    And The user should click next button 
    And The user should fill the address1,address2,city,state,country,postal
     |address1|address2|city|state|country|postal|
     |Ariyalur|tam|Tamabaram|Tn|india|621851|
     |Ariyalur|tam|Tamabaram|Tn|india|621851|
    And The user should click next button 
    And The user should fill the patient phone number "9942754605"
    And The user should click next button 
    And The user should select the RealtionshipType and enter Person name"Ajith"
    And The user should click next button 
    And The user should click the submit button
    And then user have patentId  
    #patientId

