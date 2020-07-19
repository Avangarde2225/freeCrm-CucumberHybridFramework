#Feature: Free CRM Login Feature
#
#  Scenario: Free CRM Login Test Scenario Test
#
#    Given User is on the Login Page
#    When Title of Login Pages is Free CRM
#    Then User enters "rrzbhlxhkzwacrpnme@awdrt.org" and "Test@123"
#    Then User clicks on login button
#    Then User is on home page

Feature: Free CRM Login Feature Test

  Scenario Outline: Free CRM Login Test Scenario

    Given User is on the Login Page
    When Title of Login Pages is Free CRM
    Then User enters "<username>" and "<password>"
    Then User clicks on login button
    Then User is on home page

    Examples:
    |username                     | password |
    |rrzbhlxhkzwacrpnme@awdrt.org | Test@123 |
    |naveen                       | test456  |
