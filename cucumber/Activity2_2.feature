@activity2_2
Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
    Given User will be on Login page
    When User should enters Usernames and Passwords
    Then Read the login page title and confirmation message
    And Close the browser4
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |