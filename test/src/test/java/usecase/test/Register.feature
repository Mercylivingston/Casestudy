

Feature: Register 
 


  Scenario: Register Testmeapp
     Given User in the Testme application
     When  User click the SignUp button
     Then  Registration is displayed 
     Then  User enter the Username "Alexfraniss"
     Then  User enter the firstname "Alex"
     Then  User enter the lastname "franis"
     Then  User enter the password "Mercy131"
     Then  User enter the confirmed password "Mercy131" 
     Then  User click the Gender radio button "gender"
     Then  User enter the Email  "Mercy@gamil.com"
     Then  User enter the MObile No "9840291368"
     Then  User enter the DOB "06\08\1997"
     Then  User enter the Address "Vettuvankeni"
     When  Click the sceurity question "411011"
     Then  User enter the Answer for security question "Chennai"
     And   Click the Register Button
   