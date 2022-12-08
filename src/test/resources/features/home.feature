Feature: Home page tests

  Background: Navigate to Home page
    Given I open url of homepage

  @US1021 @regression
  Scenario: Test header of the home page
    Then Verify title text is "Advance Systems - Home"
