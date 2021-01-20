@activity2_1
Feature: Data driven test without Example

Scenario: Testing with Data from Scenario
    Given User should be in Login page
    When User Proceeds to add username and password
    Then Read the title and confirmation message
    And Close the browser3