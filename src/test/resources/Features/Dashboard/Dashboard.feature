Feature: Dashboard

  #Scenario: Step_14_As a user i validate logout
    #Then I click on dashboard grid
    #And I see dashboard grid
    #Then I click logout on menu under user menu hove
    
    Scenario: Step_15_As a user i check the menu items after the successful login
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on dashboard grid
    And I see dashboard grid
    And I see the right menu items are enabled
    
    #Scenario: Step_17_As a user i select client, company facility value in a drop-down
    #Then I click on dashboard grid
    #And I see dashboard grid
    #Then I Select Client, Company Facility value in a dropdown
    #And I see filter to revert client, company, facility to all
    #Then I click active requirement kpi
    #And I see kpi reflects in grid    
#
  #Scenario: Step_16_As a user i check for dashboard load conditions after the successful login
    #Then I click on dashboard grid
    #And I see dashboard grid
    #And I see requirements grid
    #Then I see activities grid
    #And I see tasks grid
    #Then I see documents grid
    #Then I click on dashboard grid
    #And I see upcoming renewals Label
    #And I see expiring documents Label
    #And I see tasks Label
  #	 And I see USA map
    #And I see client label and default value all
    #And I see company label and default value all
    #And I see facility label and default value all
    #Then I see grid available on toolbar and showing correct data in each visual
    #
    #Scenario: Step_18_As a user i on the dashboard grids double click on a requirement
    #Then I click on dashboard grid
    #And I double click on requirement detials
    #And I see requirement Page Title
    #Then I see requirement detials data on requirement page
    #
    #Scenario: Step_19_As a user on the kpi i double click on a Tasks Incomplete and verify Incomplete status on requirement page
    #Then I click on dashboard grid
    #Then I double click on kpi task all incomplete option
    #And I see tasks page title
    #And I see only the incomplete requirements for the selected global filter values should be shown in the grid
    #
    #Scenario: Step_20_As a user i double click on a Document Expiring kpi value and the document detail opens on the document grid
    #Then I click on dashboard grid
    #Then I select client from filter options and verify expiring document on kpi
    #Then I double click on kpi expiring documents expired option
    #And I see only the expiring requirements on document grid
    #And I see Number of rows in the grid should match the kpi value in the dashboard
    #
    #Scenario: Step_29_validate delete requirement feature
    #Then I click on dashboard grid
    #Then I click on requirement navigaiton
    #And I double click on requirement detail
    #And I click on delete button
    #And I see the activites under selected requirement
    #And I see the task under selected requirement
    #And I see the requirement documents under selected requirement
    #And I see the task documents under selected requirement
    #And I see the task notification under selected requirement
    #Then I click on confirm button on delete popup
    #And I see the requirement details records deleted successfully
    #And I double click on requirement detail
    #And I click on delete button
    #Then I click on cancel button on delete popup
    #And I see the requirement details records not deleted

        