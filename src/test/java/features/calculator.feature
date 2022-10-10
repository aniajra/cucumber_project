Feature: This feature would be creating a calculator for Add and Subtract

  #Basic Scenario
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9

  #Scenario using Outline five different scenarios
  @sanity
  Scenario Outline: To Add two numbers
    Given I have a calculator
    When I add <number1> and <number2>
    Then I should get the result as <result>

    Examples: 
      | number1 | number2 | result |
      |       4 |       6 |     10 |
      |      10 |      10 |     20 |
      |      22 |      12 |     34 |

  # Scenario to add using DataTable
  Scenario: To Add two numbers
    Given I have a calculator
    When I add below numbers
      | 2 |
      | 3 |
      | 4 |
      | 5 |
      | 6 |
    Then I should get the result as 20
