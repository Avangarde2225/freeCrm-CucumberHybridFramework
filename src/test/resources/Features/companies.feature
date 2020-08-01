Feature: Create New Company
@SmokeTest
  Scenario Outline: Creating Company in the system

    Given Go to the CRM page
    Then Type the username and password and click on login button
    Then Hover over on companies and click on new company
    Then Enter company details "<name>"
    Then Click on the company save button
    Then Close the browser

    Examples:
      | name |
      | Tesla|