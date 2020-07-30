Feature: Create New Contact
  @SmokeTest
  Scenario Outline: Creating new contact in the system

    Given Go to the CRM page
    Then Type the username and password and click on login button
    Then Hover over on contacts and click on new contact
    Then Enter contact details "<firstname>" and "<lastname>"
    Then Click on save button
    Then Close the browser

    Examples:
      | firstname | lastname |
      | John      | Doe      |