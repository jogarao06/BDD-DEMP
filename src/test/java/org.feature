Feature: Create Organization


Scenario Outline: Title of your scenario Organization
    Given launch Browser
    And enterURL "http://localhost:8888"
    When login page is displayed
    And enterusername "admin"
    And enterPassword "admin"
    Then click on login button
    And verify the homepage title
    Then click on organizationlink
    Then just wait
    And click on createorganization img
    Then enterorgname "<orgname>"
    And enter phonenumber "<phonenumber>"
 		Then save the organization 
 		And logout from the apllication
 		Then close the browser
 		

    Examples: 
      | orgname     				|		| phonenumber  |				 
      | Google_HYD3					|   |     12345671 |  
      | Microsoft_HYD2			|   | 	  98585251 |     
      | Instagram_HYD5    	| 	|	    25255561 |				 
      | IBMA_HYD4   				| 	|		  85285551 |				 
