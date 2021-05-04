Feature: POC

  @Bar
  Scenario: Green scenario
    Given Bar does not exist
    When Moe creates Bar
    Then Bar exists

  @WIP
  Scenario: Failing scenario
    Given Scenario fails