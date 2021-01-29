@activity
Feature: Basic Syntax

Scenario: Posting a job using parameterization
    Given User is on Jobs page
    When User goes to post a job
    Then Post a job with details "tester@test.com" "Test specialist" and "Hyderabad"
    And Verify job is posted
    And Close the Browser
