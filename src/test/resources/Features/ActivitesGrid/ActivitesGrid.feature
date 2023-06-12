Feature: ActivitesGrid

		Scenario: Step_35_As a user i select values in the requirement progress all Incomplete Only complete only
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on activities grid
		And I see activities page title
		Then I select incomplete only from requirement progress dropdown
		And I see the requirements activities are filtered based on the chosen requirement progress incomplete only
		Then I select complete only from requirement progress dropdown
		And I see the requirements activities are filtered based on the chosen requirement progress complete only
		Then I select all from requirement progress dropdown
		And I see the requirements activities are filtered based on the chosen requirement progress all    
    
    Scenario: Step_36_As a user i click on the advanced filters on activities grid search icon and users can view the pop up which should have the following
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		Then I get it activities column name and click on advanced filters on activites page
		And I see the advance filters popup		
		Then I see column names Of the grid in field dropdown and select value from it on activity page
		And I see data in operator dropdown and select value from it
		Then I enter advance filters value in input fields on activity page
		And I click on advance filters save button
		And I see advance filters is closed
		And I see the requirement grid is filtered on activities page
		Then I click on advanced filters
		Then I click on add condition link
		And I see dropdown have AND OR value and with the delete button
		And I see field dropdown operator dropdown and value text filed
		And I click on advance filters close button
		And I see advance filters is closed		
		
		Scenario: Step_33_As a user i validate the following sections and tabs and grid records are visible on the Activities Grid
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		And I see client dropdown company dropdown and facility dropdown are selected All by default
		And I see reset filter feature should be available for the global filters
		And I see column search for each column in the activities grid
		And I see export button
		And I see advanced filters link
		And I see global search filters
		And I see Go To tasks button
		And I see url icon for each requirement in the grid
		And I see call the log icon
		Then I see add activity button
		Then I see requirement progress filter default dropdown value section should be incomplete only				
		
		Scenario: Step_38_As a user i click the url icon for the requirements
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		Then I click on the url icon for the activities
		And I see activities url opens and loads successfully if the url is valid
		
		Scenario: Step_44_As a user i verify the list of entries or entries is showing for requirements on  activity grid
    Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I see label showing xx of xx entries
    
		Scenario: Step_45_As a user i verify reset filter works in the requirements activity grid
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		Then I enter value in requirement name search filter
		And I click on reset page filters link
		Then I see the reset filter works in the requirements grid
		
		Scenario: Step_46_As a user i verify call log popup on activities grid
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		Then I select value from clint Filter
		Then I click on communication log button
		And I see the callLog popoup titel
		Then I see the add call log button
		And I see the call log popoup close X icon button
		And I see the call log popoup entries
		And I see the call log popoup global search
		And I click on Add call Log button
		Then I click on save button and verify the new entries are listed in the existing communication logs grid	
		Then I click on communication log button
		Then I double click on existing call log entries and user is allowed to view call log entries
		And I see the type and date fields are mandatory
		Then I click on save button and verify the modified values saved successfully		
		
		Scenario: Step_42_As a user i validate Edit requirement Activity popup
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		Then I double click on active licens to edit
		And I see the edit requirement Activity page titel
		And I see In the edit activity section the following fields are mandatory and non editable company facility state requirement status
		And I see in the add activity section the following fields are mandatory and editable requirement activity and activity start date
		Then I see the user is able to view the delete button if the user has a permission to delete requirements
		Then I double click on active licens to edit
		And I see the edit requirement Activity page titel
		And I click on edit pop up save button

    Scenario: Step_40_As a user i verify go to tasks icon
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		And I see Go To tasks button
		Then I click on go to task button
		And I see tasks section lists the related tasks details of the chosen activities
		
		Scenario: Step_41_As a user i validate add activity pop up on the requirement activity grid
		Then I click on dashboard grid  
    Then I click on activities grid
		And I see activities page title
		Then I click on active licens to select
		And I click on add activity button
		And I see the Add requirement Activity page titel
		And I see In the edit activity section the following fields are mandatory and non editable company facility state requirement status
		And I see in the add activity section the following fields are mandatory and editable requirement activity and activity start date
		Then I click on add activity Next button
		And I see add task titel
		And I see in the add task section the following fields are mandatory and non editable activity createdby
		And I see in the add task section the following fields are mandatory and Editable type taskstatus assignee duedate
		Then I click on add activity add task back button
		And I see the Add requirement Activity page titel
		Then I click on next button
		And I see in the add task section the following fields are mandatory and Editable type taskstatus assignee duedate
		Then I click on add activity add task save button
		Then I click on success popup ok button
		And I see the newly added requirement activity is listed in the requirement activity grid

    Scenario: Step_43_As a user i Validate Delete requirement activity feature
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		And I double click on requirement detail
    And I click on delete button
    And I see the task under selected requirement
    And I see the task documents under selected requirement
    And I see the task notification under selected requirement
    Then I click on confirm button on delete popup
    And I see the requirement details records deleted successfully
    And I double click on requirement detail
    And I click on delete button
    Then I click on cancel button on delete popup
    And I see the requirement details records not deleted
    
		Scenario: Step_47_As a user i validate Tasks Subpanel Load conditions in the requirement Activities grid
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		Then I click on go to task button
		And I see the sub panel header sections displays the chosen activities details
		And I see tasks section lists the related tasks details of the chosen activities
		And I see the add task button in the requirement activity grid
		Then I click add task button
		And I see the global search text box in the requirement activity grid
		And I see the advance filters icon in the requirement activity grid

		Scenario: Step_34_As a user i click the export button on requirement grid page
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		And I click on export button
		And I see the count of selected rows in excel sheet
		And I see fields in spreadsheet matches on the requirements grid	
	
	  Scenario: Step_55_As a user i validate click the advanced filters icon
    Then I click on dashboard grid
    Then I click on tasks grid
    Then I click on advance filter icon
    And I see field drop down have all column values
    And I see operator drop down have folowing values
		And I see text box allowed user to enter text
		And I click on add condition link on advance filter pop up
		Then I see user can see and or drop down
		Then I see user can see one or more field
		Then I see on click of close button pop up closed
		Then I see on click of save button grid is filtered
		
		Scenario: Step_23_As a user i mouse over on the i icon for the status and activity column header
    Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		And I hover mouse on status i icon and i see tool tip
		And I hover mouse on active i icon and i see tool tip

		Scenario: Step_48_As a user i validate add tasks popup
		Then I click on dashboard grid
    Then I click on tasks grid
		And I see tasks page title
		Then I click on go to tasks button
		Then I see the tasks page
		And I click on add task button
		Then I see add task title
		Then I see following fields are mandatory and non editable date and createdBy
		Then I see following fields are mandatory and editable type task Status assignee and dueDate
		And I click on add task save button
		Then I click on success popup ok button
		Then I see the modified requirement activity is listed in the requirement activity grid

    Scenario: Step_115_As a user i verify selected notes color turned into gold on activity grid
     Then I click on dashboard grid
    Then I click on activities grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on activity notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	Then I click on first note
   	And I verify notes turn into gold
   
    Scenario: Step_116_As a user i verify activity notes saved display in pop up modal
 		Then I click on dashboard grid
    Then I click on activities grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on activity notes
   	Then I click on add notes
   	Then I add four lines
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	And I verify latest notes displaying at top
   
    Scenario: Step_117_As a user is able to see highlights purple when placing cursor over mouse line items in activity grid
 		Then I click on dashboard grid
    Then I click on activities grid
    Then I mouse hover over first row
    And I verify row background turn purple

    Scenario: Step_118_As a user i verify that user is able to see added note in Date (MM/DD/YYYY) Username Note format
 		Then I click on dashboard grid
    Then I click on activities grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on activity notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	And I verify notes displaying according to MM-dd-yyyy format
   
    Scenario: Step_119_As a user i verify that user is able to see a warning message
 		Then I click on dashboard grid
    Then I click on activities grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on activity notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on close note pop up
   	And I verify alert message
   	
   	Scenario: Step_120_As a user i verify that activity note popup modal get closed
 		Then I click on dashboard grid
    Then I click on activities grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on activity notes
   	Then I click on add notes
   	Then I click on close note pop up
   	And I verify Task notes pop up is close

    Scenario: Step_121_As a user i verify that user is able to see a warning message click on X
 		Then I click on dashboard grid
    Then I click on activities grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on activity notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on task notes close icon
   	And I verify alert message
   	Then I click yes alert box
   
    Scenario: Step_122_As a user i verify that activity note popup modal get closed click on X
 		Then I click on dashboard grid
    Then I click on activities grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on activity notes
   	Then I click on add notes
   	Then I click on task notes close icon
   	And I verify Task notes pop up is close
   
    Scenario: Step_123_As a user is not able to select nay other activities notes line item if License Notes expanded
 		Then I click on dashboard grid
    Then I click on activities grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on activity notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	Then I click on task details saved successfully popup ok button
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	Then I click on task details saved successfully popup ok button
   	Then I double click on first note
   	Then I double click on second note
   	And I verify user is not allowed to select other note
    