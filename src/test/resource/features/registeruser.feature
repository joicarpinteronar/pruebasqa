#Author: joicarpinterona@gmail.com
Feature: Validate that the purchase of a new product is successful in the automation portal

  Scenario: Make a purchase of a garment in the portal your logo
    Given That Ivan opens the browser with the url of automation
    When  I enter credentialAcces 'joicarpinterona@gmail.com' and '123456'
    Then  Validate that the user is login successfully is not 'null'
    When  I select a garment
    And   I add products to the cart '2'
    And   I add a comment on the purchase 'Quiero que la blusa sea azul claro'
    And   I finalize the purchase of a garment
    Then  Validate that the purchase is successfully is not 'null'
        