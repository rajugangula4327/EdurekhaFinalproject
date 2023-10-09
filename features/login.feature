#Author: raju@orange.com
Feature: Login Module of orange application

  Background: 
    Given user open the browser
    When user navigates to the login URL

  Scenario: user should be able to login when Valid credentials are provided
    And user inputs valid "Admin" and "admin123"
    And clicks on login button
    Then the home page is displayed

  @Sanity
  Scenario: user should see error message when logged in with Invalid credentials
    And user inputs invalid "Admin" and "Welcome123"
    And clicks on login button
    Then the login page is displayed with error message
