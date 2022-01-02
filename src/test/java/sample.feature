
Feature: Flipkart search 

 @smoketest 
  Scenario: search for mobile
    Given open Browser
    And Enter Url
    When Wait for Page
    And search for mobile 
    And Close Browser
    
    

@regressiontest
  Scenario: search for TVMI
    Given open Browser
    And Enter Url
    When Wait for Page
    And search for Mi TV "MI TV"
    And Close Browser
    
    Scenario: search for TVMI
    Given open Browser
    And Enter Url
    When Wait for Page
    And search for Mi TV "MI TV"
    And Close Browser
    
    