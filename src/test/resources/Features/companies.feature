Feature: Create Company

  Scenario Outline: Creating Company in the system

    Given Go to the CRM page
    And Type the username and password and click on login button
    And Click on companies
    And Click on new
    And Enter company details "<name>"
    Then Click on save
    Then Close the browser

    Examples:
      | name |
      | Jenkins|