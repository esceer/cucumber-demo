Feature: POC

  @Foo
  Scenario: Green scenario
    Given Foo does not exist
    When Moe creates Foo
    Then Foo exists

  @WIP
  Scenario: Failing scenario
    Given Scenario fails