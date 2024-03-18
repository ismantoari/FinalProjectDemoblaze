Feature: Login

  @web
  Scenario: Login with complete username and password
    Given user is on login page
    And user input login username "UserFinalProject"
    And user input login password "FinalProject_2024"
    When user click login button
    Then user see login greeting "Welcome UserFinalProject"

    @web
  Scenario: Login with unregistered user
    Given user is on login page
    And user input login username "UserNotRegister"
    And user input login password "FinalProject_2024"
    And user click login button
    Then user see notification pop up "User does not exist."


  @web
  Scenario: Login with correct username and without input password
    Given user is on login page
    And user input login username "UserFinalProject"
    And user input login password ""
    When user click login button
    Then user see notification pop up "Please fill out Username and Password."

  @web
  Scenario: Login without input username and without password
    Given user is on login page
    And user input login username ""
    And user input login password ""
    When user click login button
    Then user see notification pop up "Please fill out Username and Password."

  @web
  Scenario: Login without input username and input password
    Given user is on login page
    And user input login username ""
    And user input login password "FinalProject_2024"
    When user click login button
    Then user see notification pop up "Please fill out Username and Password."