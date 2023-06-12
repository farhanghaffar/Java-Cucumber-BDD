Feature: TasksGrid

		Scenario: Step_61_As a user i verify go to tasks icon
		When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    Then I click on tasks grid
		And I see tasks page title
		Then I click on go to tasks button
		And I click on go to tasks requirement activities button
		Then I see the tasks page
		
		Scenario: Step_60_As a user i verify call log popup on tasks grid
    Then I click on dashboard grid
    Then I click on tasks grid
		And I see tasks page title
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
		
		Scenario: Step_59_As a user i verify reset filter works in the requirements tasks grid
    Then I click on dashboard grid
   	Then I click on tasks grid
		And I see tasks page title
		Then I enter value in requirement name search filter
		And I click on reset page filters link
		Then I see the reset filter works in the requirements grid
		
		Scenario: Step_57_As a user i validate delete tasks feature
    Then I click on dashboard grid
    Then I click on tasks grid
    And I double click on requirement detail
    And I click on delete button
    And I see the task documents under selected requirement
    And I see the task notification under selected requirement
    Then I click on confirm button on delete popup
    And I see the requirement details records deleted successfully
    And I double click on requirement detail
    And I click on delete button
    Then I click on cancel button on delete popup
    And I see the requirement details records not deleted
		
		Scenario: Step_58_As a user i verify the list of entries or entries is showing for requirements on tasks grid
    Then I click on dashboard grid
    Then I click on tasks grid
		And I see tasks page title
		Then I see label showing xx of xx entries
    
    Scenario: Step_62_As a user i verify the back to tasks icon
		Then I click on dashboard grid
    Then I click on tasks grid
		And I see tasks page title
		Then I click on go to tasks button
		And I click on go to tasks requirement activities button
		Then I see the tasks page
		And I click on back to tasks button
		Then I see the tasks page
		
    Scenario: Step_51_As a user i Validate the following sections and tabs and grid records are visible on the Tasks Grid
    Then I click on dashboard grid
    Then I click on tasks grid
    Then I see client company facility global filters and reset filter
    Then I see export button on task grid
    Then I see export with notes button on task grid
    Then I see  alltasks mytasks filter assigned tasks dropdown default dropdown value is all tasks
    Then I see tasks standing filter drop down default dropdown value selected is incomplete only
    Then I see advance filter icon on task grid
    Then I see global search on task grid
    Then I see column search for each column in the grid
    Then I see show all links on task grid
    Then I see column wise sort for each column in the grid
    And I double click on requirement detail
    Then I see edit tasks on double click of each task in the grid    
    
    Scenario: Step_50_As a user i validate delete tasks feature
    Then I click on dashboard grid
    Then I click on tasks grid
    And I double click on requirement detail
    And I click on delete button
    And I see the task documents under selected requirement
    And I see the task notification under selected requirement
    Then I click on confirm button on delete popup
    And I see the requirement details records deleted successfully
    And I double click on requirement detail
    And I click on delete button
    Then I click on cancel button on delete popup
    And I see the requirement details records not deleted    

    Scenario: Step_54_As a user i validate select the below values in the all tasks my tasks
    Then I click on dashboard grid
    Then I click on tasks grid
    Then I click on all task drop down
    Then I click on my task drop down
    And I double click on requirement detail
    And I see my task in the grid
    Then I click on task notes close
    Then I click yes alert box
    Then I click on assigned task drop down
    And I see assigned task in the grid  
  	
		Scenario: Step_56_As a user i enters the keyword by typing in two characters in the column search text field on task grid
    Then I click on dashboard grid
    Then I click on tasks grid
		Then I enter two characters in column search filter on task grid page
		Then I see the requirements activities are filtered based on the entered column wise search keywords on task grid page
		
		Scenario: Step_49_A User i Validate edit tasks popup
		Then I click on dashboard grid
    Then I click on tasks grid
    And I double click on task detail
    Then I see header section display chosen activity details
    Then I see following fields are mandatory and non editable date and createdBy
		Then I see following fields are mandatory and editable type task Status assignee and dueDate
		Then I see user is able to view delete task button
		And I click on add task save button
		Then I click on success popup ok button
		Then I see task is edited successfully		
		
		Scenario: Step_52_As a user i click the export button on requirement grid page
    Then I click on dashboard grid
    Then I click on tasks grid
		And I click on export button
		And I see the count of selected rows in excel sheet
		And I see fields in spreadsheet matches on the task grid
		
		Scenario: Step_53_As a user i click the export with notes button on requirement grid page
    Then I click on dashboard grid
    Then I click on tasks grid
		And I click on export with notes button
		And I see the count of selected rows in excel sheet
		And I see fields in spreadsheet matches on the task grid notes		
		
		Scenario: Step_90_As a user i verify custom menu options for the task grid
		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
   	Then I verify custome menu options
   	
   	Scenario: Step_91_As a user i verify Show requirement notes is active while display the menu options on task grid
	  Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I verify show task notes is active

   	Scenario: Step_92_As a user i verify Show requirement notes and show activity notes should be grayed out on task grid
    Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I verify show requriement and activity notes grayed out

		Scenario: Step_93_As a user i verify detail on the task notes pop up window on task grid
		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	And I verify Task notes pop up is displaying
   	And I verify detail on task notes pop up window
   
   	Scenario: Step_94_As a user i verify close task notes pop up window on task grid
    Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	And I verify Task notes pop up is displaying
   	And I click on task notes close
    And I verify Task notes pop up is close
    
    Scenario: Step_95_As a user i verify task notes saved successfully on task grid
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	And I verify text area with add notes label
    
    Scenario: Step_96_As a user i verify task notes saved successfully on task grid
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   	
     	
   	 Scenario: Step_124_As a user I Verify that Order notes in descending date order, top to bottom
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	Then I click on task details saved successfully popup ok button
   	And I verify notes displaying according to the decending order
   
   Scenario: Step_125_As a user i verify selected notes color turned into gold on task grid
    Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	Then I click on first note
   	And I verify notes turn into gold
   
    Scenario: Step_126_As a user i verify task notes saved display in pop up modal
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I add four lines
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	And I verify latest notes displaying at top
   
    Scenario: Step_127_As a user is able to see highlights purple when placing cursor over mouse line items in activity grid 
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I mouse hover over first row
    And I verify row background turn purple

    Scenario: Step_128_As a user i verify that user is able to see added note in Date (MM/DD/YYYY) Username Note format
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	And I verify notes displaying according to MM-dd-yyyy format
   	
   	Scenario: Step_129_As a user i verify that user is able to see a warning message
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on close note pop up
   	And I verify alert message
    
    Scenario: Step_130_As a user i verify that task note popup modal get closed
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I click on close note pop up
   	And I verify Task notes pop up is close
   
    Scenario: Step_131_As a user i verify that user is able to see a warning message click on X
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on task notes close icon
   	And I verify alert message
   	Then I click yes alert box
   	
   	Scenario: Step_132_As a user i verify that task note popup modal get closed click on X
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
   	Then I click on add notes
   	Then I click on task notes close icon
   	And I verify Task notes pop up is close
   
    Scenario: Step_133_As a user is not able to select nay other task notes line item if task Notes expanded
 		Then I click on dashboard grid
    Then I click on tasks grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on task notes
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
  
    