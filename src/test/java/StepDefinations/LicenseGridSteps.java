package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import Constants.Constants;
import Pages.ChangePasswordPage;
import Pages.LicenseGridPage;
import Pages.LoginPage;
import Pages.TasksPage;
import Utils.BaseClass;
import Utils.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static org.junit.Assert.*;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;

public class LicenseGridSteps extends BaseClass {

	LoginPage loginPage = new LoginPage(driver);
	LicenseGridPage licenseGridPage = new LicenseGridPage(driver);
	TasksPage tasksPage = new TasksPage(driver);

	public Constants loginconstant;

	@And("^I see client dropdown company dropdown and facility dropdown are selected All by default$")
	public void verifyClientDropdownCompanyDropdownFacilityDropdownDefaultSelectedAll() {
		licenseGridPage.verifyClientDropdownCompanyDropdownFacilityDropdownDefaultSelectedAll(driver);
	}
	
	@And("^I see reset filter feature should be available for the global filters$")
	public void verifyResetFilterFeatureShouldBeAvailableForTheGlobalFilters() {
		licenseGridPage.verifyResetFilterFeatureShouldBeAvailableForTheGlobalFilters(driver);
	}
	
	@And("^I see column search for each columnIn the grid$")
	public void verifyColumnSearchForEachColumnInTheGrid() {
		Assert.assertTrue(licenseGridPage.verifyColumnSearchForEachColumnInTheGrid(driver));
	}
	
	@And("^I see export button$")
	public void verifyExportButton() {
		Assert.assertTrue(licenseGridPage.verifyExportButton(driver));
	}
	@And("^I see advanced filters link$")
	public void verifyAdvancedFiltersLink() {
		Assert.assertTrue(licenseGridPage.verifyAdvancedFiltersLink(driver));
	}
	@And("^I see global search filters$")
	public void verifyGlobalSearch() {
		Assert.assertTrue(licenseGridPage.verifyGlobalSearch(driver));
	}
	@And("^I see url icon for each requirement in the grid$")
	public void verifyUrlIconForEachLicenseInTheGrid() {
		Assert.assertTrue(licenseGridPage.verifyUrlIconForEachLicenseInTheGrid(driver));
	}
	@And("^I see status help icon and active help icon$")
	public void verifyStatusHelpIconAndActiveHelpIcon() {
		Assert.assertTrue(licenseGridPage.verifyStatusHelpIconAndActiveHelpIcon(driver));
	}
	@And("^I see call the log icon$")
	public void verifyCallTheLogIcon() {
		Assert.assertTrue(licenseGridPage.verifyCallTheLogIcon(driver));
	}
	
	@And("^I see requirements grid underline color is yellow$")
	public void verifyLicensesGridUnderlineColorYellow() {
		Assert.assertTrue(licenseGridPage.verifyLicensesGridUnderlineColorYellow(driver));
	}
	
	@And("^I hover mouse on status i icon and i see tool tip$")
	public void hoverMouseOnStatusIIconAndVerifyTooltip() {
		Assert.assertTrue(licenseGridPage.hoverMouseOnStatusIIconAndVerifyTooltip(driver));
	}
	
	@And("^I hover mouse on active i icon and i see tool tip$")
	public void hoverMouseOnActiveIIconAndVerifyTooltip() {
		Assert.assertTrue(licenseGridPage.hoverMouseOnActiveIIconAndVerifyTooltip(driver));
	}
	
	@Then("^I click on the url icon for the requirement$")
	public void clickOnUrlIconLicenses() {
		licenseGridPage.clickOnUrlIconLicenses(driver);
	}
	
	@And("^I see the url opens and loads successfully if the url is valid$")
	public void verifyTheUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid() {
		Assert.assertTrue(licenseGridPage.verifyTheUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid(driver));
	}
	
	@Then("^I click on requirement go to activity icon$")
	public void clickOnGoToActivityIcon() {
		licenseGridPage.clickOnGoToActivityIcon(driver);
	}
	
	@And("^I see the activity data for the chosen requirements$")
	public void verifyActivityDataForTheChosenLicenses() {
		Assert.assertTrue(licenseGridPage.verifyActivityDataForTheChosenLicenses(driver));
	}
	
	@Then("^I click on add activity icon$")
	public void clickOnAddActivityIcon() {
		licenseGridPage.clickOnAddActivityIcon(driver);
	}
	
	@And("^I see the activity data on requirement details page$")
	public void verifyActivityDataOnLicenseDetailsPage() {
		licenseGridPage.verifyActivityDataOnLicenseDetailsPage(driver);
	}
	
	@And("^I add activity and task entry for the chosen requirement$")
	public void addActivityAndTaskEntryForTheChosenLicense() throws ParseException {
		licenseGridPage.addActivityAndTaskEntryForTheChosenLicense(driver);
	}
	
	@And("^I see the task details saved successfully popup$")
	public void verifyTaskDetailsSavedSuccessfullyPopup() {
		licenseGridPage.verifyTaskDetailsSavedSuccessfullyPopup(driver);
	}
	
	
	@Then("^I click on task details saved successfully popup ok button$")
	public void clickOnTaskDetailsSavedSuccessfullyPopupOkButton() {
		licenseGridPage.clickOnTaskDetailsSavedSuccessfullyPopupOkButton(driver);
	}
	
	@Then("^I click on advanced filters$")
	public void clickOnAdvancedFilters() {
		licenseGridPage.clickOnAdvancedFilters(driver);
	}
	 
	@And("^I see the advance filters popup$")
	public void verifyAdvanceFiltersPopup() {
		licenseGridPage.verifyAdvanceFiltersPopup(driver);
	}
	
	@Then("^I see column names Of the grid in field dropdown and select value from it$")
	public void verifyColumnNamesOfTheGridInFieldDropdownAndselectValueFromField() {
		Assert.assertTrue(licenseGridPage.verifyColumnNamesOfTheGridInFieldDropdownAndselectValueFromDropdown(driver));
	}
	
	@And("^I see data in operator dropdown and select value from it$")
	public void verifyDataInDropdownAndselectValueFromOperator() {
		Assert.assertTrue(licenseGridPage.verifyDataInDropdownAndselectValueFromOperatorDropdown(driver));
	}
	
	@Then("^I enter advance filters value in input fields$")
	public void enterAdvanceFiltersValue() {
		licenseGridPage.enterAdvanceFiltersValue(driver);
	}
	
	@And("^I see dropdown have AND OR value and with the delete button$")
	public void verifyDropdownhaveAndOrValueWithTheDeleteButton() {
		Assert.assertTrue(licenseGridPage.verifyDropdownhaveAndOrValueWithTheDeleteButton(driver));
	}
	
	@And("^I see field dropdown operator dropdown and value text filed$")
	public void verifyDropdownFieldOperatorAndValueTextFiled() {
		Assert.assertTrue(licenseGridPage.verifyDropdownFieldOperatorAndValueTextFiled(driver));
	}
	
	@Then("^I click on add condition link$")
	public void clickOnAddConditionLink() {
		licenseGridPage.clickOnAddConditionLink(driver);
	}
	
	@Then("^I click on advance filters close button$")
	public void clickOnAdvanceFiltersCloseButton() {
		licenseGridPage.clickOnAdvanceFiltersCloseButton(driver);
	}
	
	@And("^I see advance filters is closed$")
	public void verifyAdvanceFiltersIsClosed() {
		Assert.assertFalse(licenseGridPage.verifyAdvanceFiltersIsClosed(driver));
	}
	
	@And("^I select advance filters data$")
	public void selectAdvanceFiltersData() {
		Assert.assertTrue(licenseGridPage.selectAdvanceFiltersData(driver));
	}
	
	@Then("^I click on advance filters save button$")
	public void clickOnAdvanceFiltersSaveButton() {
		licenseGridPage.clickOnAdvanceFiltersSaveButton(driver);
	}
	
	@Then("^I click on add new requirement button$")
	public void clickOnAddNewLicenseButton() {
		licenseGridPage.clickOnAddNewLicenseButton(driver);
	}
	
	@And("^I see add requirement page title$")
	public void verifyAddLicensePageTitle() {
		Assert.assertFalse(licenseGridPage.verifyAddLicensePageTitle(driver));
	}
	
	@Then("^I select company from dropdown$")
	public void selectCompanyDropdown() {
		licenseGridPage.selectCompanyDropdown(driver);
	}
	
	@Then("^I select facility from dropdown$")
	public void selectFacilityDropdown() {
		licenseGridPage.selectFacilityDropdown(driver);
	}
	
	@Then("^I select states from dropdown$")
	public void selectStatesDropdown() {
		licenseGridPage.selectStatesDropdown(driver);
	}
	
	@Then("^I select requirement status from dropdown$")
	public void selectLicenseStatusDropdown() {
		licenseGridPage.selectLicenseStatusDropdown(driver);
	}
	
	@Then("^I select requirement category from dropdown$")
	public void selectRequirementCategoryDropdown() {
		licenseGridPage.selectRequirementCategoryDropdown(driver);
	}
	
	@Then("^I select requirement type from dropdown$")
	public void selectRequirementTypeDropdown() {
		licenseGridPage.selectRequirementTypeDropdown(driver);
	}
	
	
	@Then("^I enter requirement name in input fields$")
	public void enterLicenseName() {
		licenseGridPage.enterLicenseName(driver);
	}

	@Then("^I enter requirement number in input fields$")
	public void enterLicenseNumber() {
		licenseGridPage.enterLicenseNumber(driver);
	}
	
	@Then("^I click on add requirement save button$")
	public void clickOnAddLicenseSaveButton() {
		licenseGridPage.clickOnAddLicenseSaveButton(driver);
	}
	
	@And("^I see requirement details saved successfully$")
	public void verifyLicenseDetailsSavedSuccessfully() {
		Assert.assertTrue(licenseGridPage.verifyLicenseDetailsSavedSuccessfully(driver));
	}
	
	@Then("^I click on success popup ok button$")
	public void clickOnSuccessPopupOkButton() {
		licenseGridPage.clickOnSuccessPopupOkButton(driver);
	}	

	@And("^I see the newly added requirement is listed in the requirement grid$")
	public void verifyTheNewlyAddedLicenseIsListedInTheLicenseGrid() {
		Assert.assertTrue(licenseGridPage.verifyTheNewlyAddedLicenseIsListedInTheLicenseGrid(driver));
	}
	
	@And("^I see the requirement grid is filtered$")
	public void verifyLicenseGridIsFiltered() {
		Assert.assertTrue(licenseGridPage.verifyLicenseGridIsFiltered(driver));
	}
	
	@Then("^I double click on licens to edit$")
	public void doubleClickOnlicensToEdit() {
		licenseGridPage.doubleClickOnlicensToEdit(driver);
	}
	
	@And("^I see the edit requirement page titel$")
	public void verifyEditLicensePageTitel() {
		Assert.assertTrue(licenseGridPage.verifyEditLicensePageTitel(driver));
	}
	
	@And("^I see the user is allowed to edit all the fields except the company facility state$")
	public void verifyTheUserIsAllowedToEditAllTheFieldsExceptTheCompanyFacilityState() {
		Assert.assertTrue(licenseGridPage.verifyTheUserIsAllowedToEditAllTheFieldsExceptTheCompanyFacilityState(driver));
	}
	
	@And("^I see the user is allowed to remove the requirement pdf file if the file exists$")
	public void verifyTheUserIsAllowedToRemoveTheLicensePdfFileIfTheFileExists() {
		Assert.assertTrue(licenseGridPage.verifyTheUserIsAllowedToRemoveTheLicensePdfFileIfTheFileExists(driver));
	}
	
	@And("^I see the user is able to view the delete button if the user has a permission to delete requirements$")
	public void verifyTheUserIsAbleToViewTheDeleteButtonIfTheUserHasAPermissionToDeleteLicenses() {
		Assert.assertTrue(licenseGridPage.verifyTheUserIsAbleToViewTheDeleteButtonIfTheUserHasAPermissionToDeleteLicenses(driver));
	}
	
	@And("^I see the user is redirection to the requirement grid and verify the newly edited requirement is listed in the requirement grid with the newly edited values$")
	public void verifyRedirectionToTheLicenseGridAndVerifyTheNewlyEditedLicenseIsListedInTheLicenseGridWithTheNewlyEditedValues() {
		Assert.assertTrue(licenseGridPage.verifyRedirectionToTheLicenseGridAndVerifyTheNewlyEditedLicenseIsListedInTheLicenseGridWithTheNewlyEditedValues(driver));
	}
	
	@And("^I see the editing a requirement is successful$")
	public void verifyEditingALicenseIsSuccessful() {
		Assert.assertTrue(licenseGridPage.verifyEditingALicenseIsSuccessful(driver));
	}
	
	@Then("^I see label showing xx of xx entries$")
	public void verifyEntriesIsShowingForLicenseslabel() {
		Assert.assertTrue(licenseGridPage.verifyEntriesIsShowingForLicensesLibel(driver));
	}
	
	@Then("^I enter value in requirement name search filter$")
	public void enterValueInLicenseNameSearch() {
		licenseGridPage.enterValueInLicenseNameSearch(driver);
	}
	
	@And("^I click on reset page filters link$")
	public void clickOnResetPageFiltersLink() {
		licenseGridPage.clickOnResetPageFiltersLink(driver);
	}
	
	@Then("^I see the reset filter works in the requirements grid$")
	public void verifyResetFilterWorksInTheLicensesGrid() {
		Assert.assertTrue(licenseGridPage.verifyResetFilterWorksInTheLicensesGrid(driver));
	}
	
	@Then("^I select value from clint Filter$")
	public void selectValueFromClintFilter() {
		licenseGridPage.selectValueFromClintFilter(driver);
	}
	
	@And("^I see the callLog popoup titel$")
	public void verifyCallLogPopoupTitel() {
		Assert.assertTrue(licenseGridPage.verifyCallLogPopoupTitel(driver));
	}
	
	@Then("^I see the add call log button$")
	public void verifyAddCallLogButton() {
		Assert.assertTrue(licenseGridPage.verifyAddCallLogButton(driver));
	}
	
	@And("^I see the call log popoup close X icon button$")
	public void verifyCallLogPopoupCloseXIconButton() {
		Assert.assertTrue(licenseGridPage.verifyCallLogPopoupCloseXIconButton(driver));
	}
	
	@And("^I see the call log popoup entries$")
	public void verifyCallLogPopoupcallLogListEntries() {
		Assert.assertTrue(licenseGridPage.verifyCallLogPopoupcallLogListEntries(driver));
	}
	
	@And("^I see the call log popoup global search$")
	public void verifyCallLogLogPopoupGlobalSearch() {
		Assert.assertTrue(licenseGridPage.verifyCallLogLogPopoupGlobalSearch(driver));
	}
	
	@Then("^I double click on existing call log entries and user is allowed to view call log entries$")
	public void doubleClickOnExistingCallLogEntriesAndUserIsAllowedToViewCallLogEntries() {
		Assert.assertTrue(licenseGridPage.doubleClickOnExistingCallLogEntriesAndUserIsAllowedToViewCallLogEntries(driver));
	}
	
	@Then("^I see the client and facility fields are not editable$")
	public void verifyClientFacilityAreNotEditable() {
		Assert.assertTrue(licenseGridPage.verifyClientFacilityAreNotEditable(driver));
	}
	
	@And("^I see the type and date fields are mandatory$")
	public void verifyTypeAndDateFieldsAreMandatory() {
		Assert.assertTrue(licenseGridPage.verifyTypeAndDateFieldsAreMandatory(driver));
	}
	
	@Then("^I click on save button and verify the modified values saved successfully$")
	public void clickOnSaveButtonVerifyTheModifiedValuesSavedSuccessfully() {
		Assert.assertTrue(licenseGridPage.clickOnSaveButtonVerifyTheModifiedValuesSavedSuccessfully(driver));
	}
	
	@Then("^I click on communication log button$")
	public void clickOnCommunicationLogButton() {
		licenseGridPage.clickOnCommunicationLogButton(driver);
	}
	
	
	@Then("^I click on save button and verify the new entries are listed in the existing communication logs grid$")
	public void clickOnSaveButtonVerifyTheNewEntriesAreListedInTheExistingCommunicationLogsGrid() {
		Assert.assertTrue(licenseGridPage.clickOnSaveButtonVerifyTheNewEntriesAreListedInTheExistingCommunicationLogsGrid(driver));
	}
	
	@And("^I click on Add call Log button$")
	public void clickOnCallLogPopoupAddCallLogButton() {
		licenseGridPage.clickOnCallLogPopoupAddCallLogButton(driver);
	}	
	
	@Then("^I select incomplete only from requirement progress dropdown$")
	public void selectIncompleteOnlyFromLicenseProgressDropdown() {
		licenseGridPage.selectIncompleteOnlyFromLicenseProgressDropdown(driver);
	}
	
	@Then("^I select all from requirement progress dropdown$")
	public void selectAllFromLicenseProgressDropdown() {
		licenseGridPage.selectAllFromLicenseProgressDropdown(driver);
	}
	
	@Then("^I select complete only from requirement progress dropdown$")
	public void selectCompleteOnlyFromLicenseProgressDropdown() {
		licenseGridPage.selectCompleteOnlyFromLicenseProgressDropdown(driver);
	}
	
	@And("^I see the requirements activities are filtered based on the chosen requirement progress incomplete only$")
	public void verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressIncompleteOnly() {
		Assert.assertTrue(licenseGridPage.verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressIncompleteOnly(driver));
	}
	
	@Then("^I see the requirements activities are filtered based on the chosen requirement progress complete only$")
	public void verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressCompleteOnly() {
		Assert.assertTrue(licenseGridPage.verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressCompleteOnly(driver));
	}
	
	@Then("^I see the requirements activities are filtered based on the chosen requirement progress all$")
	public void verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressAll() {
		Assert.assertTrue(licenseGridPage.verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressAll(driver));
	}
	
	@Then("^I get it activities column name and click on advanced filters$")
	public void getActivitiesTitel() {
		licenseGridPage.getActivitiesTitel(driver);
	}
	
	@Then("^I see the requirement with expiration field populated$")
	public void verifyLicenseWithExpirationFieldPopulated() throws InterruptedException {
		Assert.assertTrue(licenseGridPage.verifyLicenseWithExpirationFieldPopulated(driver));
	}
	
	@Then("^I double click on expiration date$")
	public void doubleClickOnExpirationDate() throws InterruptedException {
		licenseGridPage.doubleClickOnExpirationDate(driver);
	}
	
	@Then("^I see the expiry date matches the expiration date noted in the requirement grid$")
	public void verifyTheExpiryDateMatchesTheExpirationDateNotedInTheLicenseGrid() {
		Assert.assertTrue(licenseGridPage.verifyTheExpiryDateMatchesTheExpirationDateNotedInTheLicenseGrid(driver));
	}
	
	@Then("^I enter two characters in column search filter$")
	public void enterTwoCharactersInColumnSearchField() {
		licenseGridPage.enterTwoCharactersInColumnSearchField(driver);
	}
	@Then("^I enter two characters in column search filter on task grid page$")
	public void enterTwoCharactersInColumnSearchFieldOnTaskGridPage() {
		licenseGridPage.enterTwoCharactersInColumnSearchFieldOnTaskGridPage(driver);
	}
	
	@Then("^I see the requirements activities are filtered based on the entered column wise search keywords$")
	public void verifyFilteredBasedOnEnteredColumnWiseSearchKeywords() {
		Assert.assertTrue(licenseGridPage.verifyFilteredBasedOnEnteredColumnWiseSearchKeywords(driver));
	}
	
	@Then("^I see the requirements activities are filtered based on the entered column wise search keywords on task grid page$")
	public void verifyFilteredBasedOnEnteredColumnWiseSearchKeywordsOnTaskGridPage() {
		Assert.assertTrue(licenseGridPage.verifyFilteredBasedOnEnteredColumnWiseSearchKeywordsOnTaskGridPage(driver));
	}
	
	@And("^I verify show requirement notes is active$")
	public void verifyShowRequirementIsActive() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyShowRequirementNotesIsActive(driver));
	}
	@And("^I verify show task and activity notes grayed out$")
	public void verifyShowRequirementIsGrayedOut() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyShowTaskActivityNotesIsGrayedOut(driver));
	}
	
	@Then("^I click on requirement notes$")
	public void clickOnTaskNotes() {
		tasksPage.clickOnRequirementNotes(driver);
	}
	
	@And("^I verify detail on requirement notes pop up window$")
	public void verifyDetailOnTaskNotesPopUp() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyDetailOnRequirementNotesPopUp(driver));
	}
	
	@And("^I verify latest notes displaying at top$")
	public void verifyLatestNotesDisplayingAtTop() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyLatestNotesDisplayingAtTop(driver));
	}
	
	@Then("^I click on first note$")
	public void clickOnNote() {
		tasksPage.clickOnNote(driver);
	}
	
	@Then("^I double click on first note$")
	public void doubleClickOnFirstNote() {
		tasksPage.doubleClickOnFirstNote(driver);
	}
	
	@Then("^I double click on second note$")
	public void doubleClickOnSecondNote() {
		tasksPage.doubleClickOnSecondNote(driver);
	}
	
	@And("^I verify notes turn into gold$")
	public void verifyNoteColorIntoGold() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyNoteColorIntoGold(driver));
	}
	
	@And("^I verify user is not allowed to select other note$")
	public void verifySecondNoteColorIntoGold() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifySecondNoteColorIntoGold(driver));
	}
	
	@Then("^I mouse hover over first row$")
	public void hoverMouseOverFirstRow() {
		licenseGridPage.hoverMouseOverFirstRow(driver);
	}
	
	@And("^I verify row background turn purple$")
	public void verifyRowColorChangedTopPurple() throws InterruptedException {
		Assert.assertTrue(licenseGridPage.verifyRowColorChangedTopPurple(driver));
	}
	
	@And("^I verify notes displaying according to MM-dd-yyyy format$")
	public void verifyLatestNotesDisplayingAccordingToFormat() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyLatestNotesDisplayingAccordingToFormat(driver));
	}	
	
	@And("^I verify notes displaying according to the decending order$")
	public void verifyNotesDisplayingAccordingToDecendingOrder() {
		Assert.assertTrue(tasksPage.verifyNotesDisplayingAccordingToDecendingOrder(driver));
	}
	
	@Then("^I click on close note pop up$")
	public void clickOnNoteClose() {
		tasksPage.clickOnNoteClose(driver);
	}
	
	@And("^I verify alert message$")
	public void verifyNotesCloseAlertMessage() throws InterruptedException {
		Assert.assertTrue(licenseGridPage.verifyNotesCloseAlertMessage(driver));
	}
	
	@Then("^I click yes alert box$")
	public void clickOnYesAlertMessage() {
		licenseGridPage.clickOnYesAlertMessage(driver);
	}
}
