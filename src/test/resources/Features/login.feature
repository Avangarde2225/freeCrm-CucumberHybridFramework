Feature: Free CRM Login Feature

  Scenario: Free CRM Login Test Scenario Test

    Given User is on the Login Page
    When Title of Login Pages is Free CRM
    Then User enters Username and Password
    Then User clicks on login button
    Then User is on home page

#Feature: Free CRM Login Feature Test
#
#  Scenario Outline: Free CRM Login Test Scenario
#
#    Given User is on the Login Page
#    When Title of Login Pages is Free CRM
#    Then User enters "<username>" and "<password>"
#    Then User clicks on login button
#    Then User is on home page
#    Then Close the browser
#
#    Examples:
#    |username                     | password |
#    |naveen                       | test456  |
