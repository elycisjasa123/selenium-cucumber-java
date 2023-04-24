Feature: Login functionality
  Scenario: Login standard user
    Given I am on Swag Labs login page
    When I enter "standard_user" as username
    And I enter "secret_sauce" as password
    When I click on Login button
    Then I will redirect to sauce demo inventory

  Scenario: Login locked out user
    Given I am on Swag Labs login page
    When I enter "locked_out_user" as username
    And I enter "secret_sauce" as password
    When I click on Login button
    Then The error message "Epic sadface: Sorry, this user has been locked out." show

  Scenario: Login problem user
    Given I am on Swag Labs login page
    When I enter "problem_user" as username
    And I enter "secret_sauce" as password
    When I click on Login button
    Then I will redirect to sauce demo inventory

  Scenario: Login performance glitch user
    Given I am on Swag Labs login page
    When I enter "performance_glitch_user" as username
    And I enter "secret_sauce" as password
    When I click on Login button
    Then I will redirect to sauce demo inventory
