Feature: CompanyProfile

		Scenario: Step_63_As a user i verify that user is able to click on the company profile from the left menu
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I see the reset page filters button
		Then I see the client title
		Then I see the search label
		Then I see search text field
		And I see plus icon on right side
		And I see each column wise sort
		Then I see view details button		
		
		Scenario: Step_66_As a user i verify that user is able to add client profile		
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I click on plus icon on right side
		Then I see client name text field
		Then I see client code text field
		Then I see client category dropdown
		Then I see client status dropdown
		And I enter client name
		And I enter client code
		Then I select client category
		Then I select client status
		And I check atlas management checkbox
		And I click on save entity button
		And I see client save success popup and click on ok button
		Then I see the newly added client is listed in the grid
		
		Scenario: Step_70_As a user i click on the View Details button and verify the panel from the right with the following options
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I click on view details button
		Then I see sub tabs with the title client projects contacts and disciplines
		Then I see client tab should be opened by default		
		
		Scenario: Step_72_As a user i verify that user is able to edit data in client form
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I click on view details button
		Then I click on edit button
		And I enter client name
		And I click on save entity button
		And I see client save success popup and click on ok button
		Then I see the newly added client is listed in the grid
		
		Scenario: Step_73_As a user i verify that user is not able to switch to other tab in edit mode
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I click on view details button
		Then I click on edit button
		Then I click on projects tab
		Then I see user is not able to switch to any other tab		
		
		Scenario: Step_74_As a user i verify that user is able to see company dropdown section
		Then I click on dashboard grid
    Then I click on company profile menu
		Then I double click on added client
		And I see company reset page filters button
		And I see company title
		And I see company global search text field
		Then I see add company button
		
		Scenario: Step_75_As a user i verify that user is able to add Company in the client
		Then I click on dashboard grid
    Then I click on company profile menu
		Then I double click on added client
		Then I click on add company button
		And I enter company name
		Then I select company status
		Then I click on company save button
		And I see company save success popup and click on ok button
		And I see the newly added company is reflected under the company dropdown section
		
		Scenario: Step_64_As a user i enters the keyword by typing in two characters in the global search text field
		Then I click on dashboard grid
    Then I click on company profile menu
		Then I enter client name in global search
		And I see the company profiles are filtered based on the entered in global search keywords
		
		Scenario: Step_65_As a user i enters the keyword by typing in two characters in the column search text field
		Then I click on dashboard grid
    Then I click on company profile menu
		Then I enter client name in column search
		And I see the company profiles are filtered based on the entered in column search keywords
		
		Scenario: Step_67_As a user i verif that user is able to add project in the client
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I click on view details button
		Then I click on projects tab
		Then I click on add project button
		And I enter project number
		Then I select project status
		And I enter project description
		Then I click on project save button
		And I see project save success popup and click on ok button
		And I see newly added project saved successfully
		
		Scenario: Step_68_As a user i verif that user is able to add contacts in the client
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I click on view details button
		Then I click on contacts tab
		Then I click on add contacts button
		And I enter contact first name
		And I enter contact last name
		Then I select contact status
		Then I click on contacts save button
		And I see contact save success popup and click on ok button
		And I see newly added contact saved successfully

		Scenario: Step_69_As a user i verif that user is able to add disciplines in the client
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I click on view details button
		Then I click on disciplines tab
		Then I click on Add discipline button
		And I select discipline level
		And I select discipline issuedto
		Then I click on discipline save button
		And I see discipline save success popup and click on ok button
		And I see newly added discipline saved successfully

		Scenario: Step_71_As a user i verify that user is able to click on the client projects contacts and disciplines tabs
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I click on view details button
		Then I click on projects tab
		Then I click on contacts tab
		Then I click on disciplines tab
		
		Scenario: Step_76_As a user i verify that user is able to switch to the projects tab
    Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on projects tab
		And I see add plus button
		
		Scenario: Step_77_As a user i verify that user is able to add project
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on projects tab
		Then I click on add project button
		And I enter project number
		Then I select project status
		And I enter project description
		Then I click on project save button
		And I see project save success popup and click on ok button
		And I see newly added project saved successfully
		
		Scenario: Step_78_As a user i verify that user is able to switch to the Contacts tab
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on contacts tab
		And I see add plus button
		
		Scenario: Step_79_As a user i verify that user is able to add contact
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on contacts tab
		Then I click on add contacts button
		And I enter contact first name
		And I enter contact last name
		Then I select contact status
		Then I click on contacts save button
		And I see contact save success popup and click on ok button
		And I see newly added contact saved successfully
		
		Scenario: Step_80_As a user i verify that user is able to switch to the owners tab
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on owner tab
		And I see add plus button
		
		Scenario: Step_81_As a user i verify that user is able to add owners
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on owner tab
		And I click on add plus button
		Then I select owner type
		Then I enter owner name
		Then I select owner status
		Then I click on owner save button
		And I see owner save success popup and click on ok button
		And I see newly added owner saved successfully
		
		Scenario: Step_82_As a user i verify that user is able to switch to the vendors tab
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on vendor tab
		And I see add plus button
		
		Scenario: Step_83_As a user i verify that user is able to add vendors
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on vendor tab
		And I click on add plus button
		Then I select vendor type
		Then I select vendor status
		Then I enter vendor name
		Then I click on vendor save button
		And I see vendor save success popup and click on ok button
		And I see newly added vendor saved successfully
		
		Scenario: Step_85_As a user i verify that user is able to add facility in the company
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		And I double click on added company
		And I click on facility add plus button
		And I enter facility name
		Then I select facility status
		Then I click on facility save button
		And I see facility save success popup and click on ok button
		And I see newly added facility saved successfully
		
		Scenario: Step_84_As a user i verify that user is able to edit data in company form
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		Then I click on view details button
		Then I click on edit button
		And I enter company name
		Then I click on company save button
		And I see company save success popup and click on ok button
		And I see the newly added company is reflected under the company dropdown section
    
    Scenario: Step_86_As a user i verify that user is able to add project in the company
		Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		And I double click on added company
		And I click on facility add plus button
		And I enter facility name
		Then I select facility status
		Then I click on facility save button
		And I see facility save success popup and click on ok button
		Then I click on projects tab
		And I click on project add plus button
		And I enter project number
		Then I select project status
		And I enter project description
		Then I click on project save button
		And I see project save success popup and click on ok button
		And I see newly added project saved successfully		
		
		Scenario: Step_87_As a user i verify that user is able to add contact in the company
    Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		And I double click on added company
		And I click on facility add plus button
		And I enter facility name
		Then I select facility status
		Then I click on facility save button
		And I see facility save success popup and click on ok button
		Then I click on contacts tab
		And I click on project add plus button
		And I enter contact first name
		And I enter contact last name
		Then I select contact status
		Then I click on contacts save button
		And I see contact save success popup and click on ok button
		And I see newly added contact saved successfully		
		
		Scenario: Step_89_As a user i verify that user is able to add vendors in the company		
    Then I click on dashboard grid
    Then I click on company profile menu
		And I see the company profile page title
		Then I double click on added client
		And I double click on added company
		And I click on facility add plus button
		And I enter facility name
		Then I select facility status
		Then I click on facility save button
		And I see facility save success popup and click on ok button
		Then I click on vendor tab
		And I click on project add plus button
		Then I select vendor type
		Then I select vendor status
		Then I enter vendor name
		Then I click on vendor save button
		And I see vendor save success popup and click on ok button
		And I see newly added vendor saved successfully

   