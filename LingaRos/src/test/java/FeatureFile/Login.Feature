Feature: Login functionality module of automation practise web page
  conatins E2E functionality such as login, add a product to card,place order,
   and signout


  @sce1
  Scenario: verify the user login the application with valid credentials
    Given user navigates to the application
    Given user enter the valid usernames
    And user enter the valid passwords
    And user click the signin buttons