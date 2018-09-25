Feature: Login Guru99
  I want to verify all case when I login to Guru99 website

	@demo
  Scenario: The user can login to Guru99 successfully with the right user and password
    Given I navigate to the guru99
    And I input the right user
    And I input the right password
    And I click login button
    Then I verify login successfylly