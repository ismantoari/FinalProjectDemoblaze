Feature: Sign Up

  @web
  Scenario: Sign up using valid data
    Given user is on sign up form
    And user input username "Ari12345678"
    And user input password "FinalProject_2024"
    When user click sign up button
    Then user see notification pop up "Sign up successful."

#  Scenario: Cancel sign up
#
#  Scenario: Sign up without input username
#
#  Scenario: Sign up without input password
#
#  Scenario: Push x button on signup form