Feature: Deal Data Creation

  Scenario: Creating a new deal scenario

    Given User is already on the Login Page
    When Title of Login Page is Free CRM
    Then Type the username and password
    |Reddy77077 | Saibaba77 |
    Then User clicks on the Login Button
    Then User is on the home page
    And User moves over to Deal Page
    And User enters deal details
    |test deal | 1000 | 50 | 10 |
    And Click on save button
    Then Close the browser