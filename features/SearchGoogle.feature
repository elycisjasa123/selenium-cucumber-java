Feature: Google Search
  Scenario: Should be able to search in Google
    Given User navigates to Google site
    When User searched for a "Test Automation"
    Then User should be redirected to Result Page
    Then User close browser