Feature: Free CRM Create Contacts

  Scenario Outline: Free CRM Create a new contact scenario

    Given User is on the Login Page
    When Title of Login Pages is Free CRM
    Then User enters "<username>" and "<password>"
    Then User clicks on login button
    Then User is on home page
    Then User moves to Contacts page
    Then User touches on new icon
    Then User enters contact details "<firstname>" and "<lastname>"
    Then User clicks on Save button
    Then Close the browser

    Examples:
      |username                     | password | firstname | lastname |
      |rrzbhlxhkzwacrpnme@awdrt.org | Test@123 | Naveen    | automo   |
