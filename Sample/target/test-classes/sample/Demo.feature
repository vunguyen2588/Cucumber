Feature: Guru Testing
  Scenario: User login to Guru99
    Given I navigate to the guru99
    And I login to the Guru99
    And I create a new customer
    And I create a new account
    And I deposit to new account
    Then I close the browser