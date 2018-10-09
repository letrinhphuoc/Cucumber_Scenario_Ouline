@liveguru
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Login to live guru site
    Given I open live guru site
    And I open to my account page
    When I input username textbox is "<UserName>"
    And I input password textbox is "<Password>"
    And I click login button
    Then I verify hompage is displayed
    When I click to account link
    And I click to logout link
    And I close browser

    Examples: 
      | UserName                     | Password |
      | trinh123@gmail.com           |   111111 |
      | automationvalid@gmail.com    |   111111 |
      | automationvalid_01@gmail.com |   111111 |
      | automationvalid_02@gmail.com |   111111 |
