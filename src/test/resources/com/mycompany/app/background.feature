Feature: Background Feature


  @SPEL-1
  Scenario: First Hello
    Given I have "first" task
    And Step from "First Hello" in "Background Feature" feature file
    When I attempt to solve it
    Then I surely succeed

  @SPEL-2
  Scenario: Second Hello
    Given I have "second" task
    And Step from "Second Hello" in "Background Feature" feature file
    When I attempt to solve it
    Then I surely succeed

  @SPEL-3
  Scenario: Third Hello
    Given I have "third" task
    And Step from "Third Hello" in "Background Feature" feature file
    When I attempt to solve it
    Then I surely succeed
