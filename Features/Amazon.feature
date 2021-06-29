
Feature:Amazon Feature

  @Demo
  Scenario: Amazon search for item
    Given Open Browser
    Then Navigate to Amazon Web Page
    Then Search for item
    When Results appear open item
    Then Check Price
    And Close Browser
