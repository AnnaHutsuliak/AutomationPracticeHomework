Feature: Reset functionality on login page of Application


  Scenario: Verification of Reset button
    Given Open Login Page
    When Enter the Username and Password
    Then Click Sign Button and check error message appeared
    Then Close chrome driver