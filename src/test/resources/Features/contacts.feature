Feature: Free CRM Create Contacts

  Scenario Outline: Free CRM Create a new contact scenario

    Given Go to the CRM page
    And Type the username and password and click on login button
    And Click on contacts
    And Click on new
    And Enter contact details "<firstname>" and "<lastname>"
    Then Click on save
    Then Verify
    Then Close the browser

    Examples:
      | firstname | lastname |
      | Naveen    | automo   |
