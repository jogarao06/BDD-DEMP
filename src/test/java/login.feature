Feature: Login to the apllication 


  Scenario: Login into the apllication valid credentials 
    Given open browser 
    And enter Url
    And enter username
    And entrt password
    Then click on loginbtn
    And  close browser
    
  Scenario Outline: login to app through valid credentials run time 
    Given open browser 
    And enter Url "http://localhost:8888/"
    And enter username "admin"
    And entrt password "admin"
    Then click on loginbtn
    And  close browser
  