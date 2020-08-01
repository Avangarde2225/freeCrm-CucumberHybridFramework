Feature: Create New Contact
  @SmokeTest
  Scenario Outline: Creating new contact in the system

    Given Go to the CRM page
    Then Type the username and password and click on login button
    And Hover over on Contacts and click on New Contact
    And Enter contact details "<firstname>" and "<lastname>"
    And Click on save button
    Then Close the browser

    Examples:
      | firstname | lastname |
      | John      | Doe      |