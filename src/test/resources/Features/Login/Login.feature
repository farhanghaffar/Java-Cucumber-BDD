Feature: Login

    Scenario: Step_5_As a user i logged out from the application and redirected to Login screen
 		Then I click on dashboard grid
    Then I click on profile name drop down
    Then I click on logout option
    And I see login page title 

 	  Scenario: Step_1_As a user i enter valid Atlas URL
    When I see login page title    
    
    Scenario: Step_2_As a user i validate the following items Logo Input fields buttons and Link
    When I see login page title
    Then I enter values in input fields and buttons and Link should be clickable
    Then I see logo and background image
    And I see browser tab name should be login
    And I see input fields should have a proper placeholder name

    Scenario: Step_6_As a user i enter invalid user name and valid password
    When I see login page title
    And I enter user name "qaautomation"
    And I enter password "TestQa@#1234"
    Then I click on login button
    And I see invalid username and password please try again Label
    
    Scenario: Step_7_As a user i Enter valid User Name and invalid Password
   	When I see login page title
    And I enter user name "qaautomation@pharma.solutions"
    And I enter password "Tes"
    Then I click on login button
    And I see invalid username and password please try again Label
    
    Scenario: Step_4_As a user i Enter value in the Password field and password value dots or asterisks
    When I see login page title
    And I enter password "TestQa@#1234"
    And I see password value displayed dots Or asterisks characters    
    
    Scenario: Step_3_As a user i verify validation message should be shown in the respective fields
    When I see login page title
    And I enter password "TestQa@#1234"
    Then I click on login button
    And I see username validation message
    And I enter user name "qaautomation@pharma.solutions"
    Then I click on login button
    And I see password validation message
    And I click on login button without values In both username and password fields
    And I see username validation message
    

    
    