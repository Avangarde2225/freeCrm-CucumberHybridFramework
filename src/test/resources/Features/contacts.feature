Feature: Free CRM Create Contacts

  Scenario Outline: Free CRM Create a new contact scenario

    Given User is on the Login Page
    When Title of Login Pages is Free CRM
    Then User enters Username and Password
    Then User clicks on login button
    Then User is on home page
    Then User clicks on contacts button
    Then User touches on new icon
    Then User enters contact details "<firstname>" and "<lastname>"
    Then User clicks on Save button
    Then Close the browser

    Examples:
      | firstname | lastname |
      | Naveen    | automo   |
