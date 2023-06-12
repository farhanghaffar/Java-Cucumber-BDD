Feature: LicenseGrid
		
		Scenario: Step_25_As a user i verify Add and view pdf icon
		Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I click on upload requirement pdf button
		Then I choose file to upload
		Then I click on save button
		And I see pdf file success popup
		Then I click on pdf file success popup ok button
		And I click on view icon and see pdf file
		
  	Scenario: Step_21_As a user i validate the following sections and tabs and grid records are visible on the requirement Grid
    Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		And I see client dropdown company dropdown and facility dropdown are selected All by default
		And I see reset filter feature should be available for the global filters
		And I see column search for each columnIn the grid
		And I see export button
		And I see advanced filters link
		And I see global search filters
		And I see url icon for each requirement in the grid
		And I see status help icon and active help icon
		And I see call the log icon
		
		Scenario: Step_24_As a user i click the url icon for the requirements
    Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I click on the url icon for the requirement
		And I see the url opens and loads successfully if the url is valid
		
		Scenario: Step_22_As a user i click on the advanced filters search icon and users can view the pop up which should have the following
    Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I click on advanced filters
		And I see the advance filters popup		
		Then I see column names Of the grid in field dropdown and select value from it
		And I see data in operator dropdown and select value from it
		Then I enter advance filters value in input fields
		And I click on advance filters save button
		And I see advance filters is closed
		And I see the requirement grid is filtered
		Then I click on advanced filters
		Then I click on add condition link
		And I see dropdown have AND OR value and with the delete button
		And I see field dropdown operator dropdown and value text filed
		And I click on advance filters close button
		And I see advance filters is closed

		Scenario: Step_27_As a user i validate add requirement popup
		Then I click on dashboard grid
		Then I click on requirements grid
		And I see requirement Page Title
		Then I click on add new requirement button
		Then I select company from dropdown
		And I select facility from dropdown
		Then I select states from dropdown
		Then I select requirement status from dropdown
		And I enter requirement name in input fields
		And I enter requirement number in input fields
		And I click on add requirement save button
		And I see requirement details saved successfully
		Then I click on success popup ok button
		And I see the newly added requirement is listed in the requirement grid		
		
		Scenario: Step_28_As a user i validate Edit requirement popup
		Then I click on dashboard grid
		Then I click on requirements grid
		And I see requirement Page Title
		Then I double click on licens to edit
		And I see the edit requirement page titel
		And I see the user is allowed to edit all the fields except the company facility state
		And I see the user is allowed to remove the requirement pdf file if the file exists
		Then I double click on licens to edit
		Then I see the user is able to view the delete button if the user has a permission to delete requirements
		Then I double click on licens to edit
		And I see the edit requirement page titel
		And I see the editing a requirement is successful
		And I see the user is redirection to the requirement grid and verify the newly edited requirement is listed in the requirement grid with the newly edited values
		
		Scenario: Step_30_As a user i verify the list of entries or entries is showing for requirements on requirements grid
   Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I see label showing xx of xx entries
		
		Scenario: Step_31_As a user i verify reset filter works in the requirements grid
   Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I enter value in requirement name search filter
		And I click on reset page filters link
		Then I see the reset filter works in the requirements grid
		
		Scenario: Step_32_As a user i verify call log popup
    Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
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
		
		Scenario: Step_39_As a user i verify requirement expiration
    Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I see the requirement with expiration field populated
		Then I double click on expiration date
		And I see the edit requirement page titel
		Then I see the expiry date matches the expiration date noted in the requirement grid
		
		Scenario: Step_37_As a user i enters the keyword by typing in two characters in the column search text field
    Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I enter two characters in column search filter
		Then I see the requirements activities are filtered based on the entered column wise search keywords

		Scenario: Step_26_As a user i verify add and go to activity
		Then I click on dashboard grid
    Then I click on requirements grid
		And I see requirement Page Title
		Then I click on requirement go to activity icon
		And I see activities page title
		And I see the activity data for the chosen requirements
		Then click on requirements grid
		And I see requirement Page Title
		Then I click on add activity icon
		And I add activity and task entry for the chosen requirement
		And I see the task details saved successfully popup
		And I click on task details saved successfully popup ok button

		Scenario: Step_97_As a user i verify custom menu options for the requirement grid 
		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
   	Then I verify custome menu options
   	
   	Scenario: Step_98_As a user i verify Show requirement notes is active while display the menu options on requirement grid
	  Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I verify show requirement notes is active

   	Scenario: Step_99_As a user i verify Show task notes and show activity notes should be grayed out on requirement grid
    Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I verify show task and activity notes grayed out

		Scenario: Step_100_As a user i verify detail on the task notes pop up window on requirement grid
		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	And I verify Task notes pop up is displaying
   	And I verify detail on requirement notes pop up window
   
   	Scenario: Step_101_As a user i verify close task notes pop up window on requirement grid
    Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	And I verify Task notes pop up is displaying
   	And I click on task notes close
    And I verify Task notes pop up is close
    

    Scenario: Step_102_As a user i verify requirements notes saved successfully on requirement grid
		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	And I verify text area with add notes label
   
    Scenario: Step_103_As a user i verify requirements notes saved successfully on requirement grid
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   
   
    Scenario: Step_104_As a user i verify requirements notes saved display on top
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	And I verify latest notes displaying at top
   
    Scenario: Step_105_As a user i verify selected notes color turned into gold
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	Then I click on first note
   	And I verify notes turn into gold
   
    Scenario: Step_106_As a user i verify requirements notes saved display in pop up modal
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I add four lines
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	And I verify latest notes displaying at top   
   
    Scenario: Step_107_As a user is able to see highlights purple when placing cursor over mouse line items
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I mouse hover over first row
    And I verify row background turn purple   
   
    Scenario: Step_108_As a user i verify that user is able to see added note in Date (MM/DD/YYYY) Username Note format
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on save notes
   	And I verify task notes save successfully
   	Then I click on task details saved successfully popup ok button
   	And I verify notes displaying according to MM-dd-yyyy format      
   
    Scenario: Step_109_As a user i verify that user is able to see a warning message
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on close note pop up
   	And I verify alert message
   
    Scenario: Step_110_As a user i verify that requirement note popup modal get closed
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I click on close note pop up
   	And I verify Task notes pop up is close   
   
    Scenario: Step_111_As a user i verify that user is able to see a warning message click on X
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I add notes
   	Then I click on task notes close icon
   	And I verify alert message
   	Then I click yes alert box
   	
   	Scenario: Step_112_As a user i verify that requirement note popup modal get closed click on X
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	Then I click on add notes
   	Then I click on task notes close icon
   	And I verify Task notes pop up is close
   
    Scenario: Step_113_As a user is not able to select nay other requirement notes line item if License Notes expanded
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
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
   
    Scenario: Step_114_As a user I Verify that Order notes in descending date order, top to bottom
 		Then I click on dashboard grid
    Then I click on requirements grid
    Then I right click on line item
    Then I verify custome menu options
   	Then I click on requirement notes
   	And I verify notes displaying according to the decending order
  
    