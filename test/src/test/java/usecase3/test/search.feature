
Feature: search
 

 
  Scenario Outline: searching a product
     Given User in Loginpage
     When User enter the username"<username>"
     And user enter the password"<password>"
     And user click the login button
     Then user search the product in search field"head"
     And user click the Find Detail

    Examples: 
      | username   | password  | 
      | Alexfranis | mercy131  |

