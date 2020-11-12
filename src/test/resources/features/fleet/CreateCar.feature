Feature: As a user ,i want to be able to create new cars

@add_car_scenario_outline
  Scenario Outline: Add some car with <license plate> and <model year> year
    Given user is on the login page
    And user logs in as a "<role>"
    And user navigates to "Fleet" and "Vehicles"
    And user clicks on create car button
    When  user adds new vehicle information

    |License Plate|  <license plate> |
    |Model Year   |    <model year>  |

  And user clicks on save and close button
  Examples: auto test data
  | license plate | model year |role|
  |  Florida      |  2020      |store manager|
  |  QA           |  2021      |store manager|
  | Ramazan       | 2030       |sales manager|