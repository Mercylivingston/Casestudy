
Feature: Cart
  

@tag1
  Scenario: Add to cart (invalid)
     Given User has registered into testme app
     When  User search particular product like "head"
     And   Try to proceed to the payment without adding the any item in cart
     Then  TestmeApp doesn't display the cart icon

 @tag2
  Scenario: Add to cart
     Given Alex signin   app
     When  enter search product 
     And   User click the Add to cart button to adding a product
     Then  click the cart icon for process to the payment
     
   

   