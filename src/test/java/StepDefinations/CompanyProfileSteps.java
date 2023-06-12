package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import Constants.Constants;
import Pages.ActivitesGridPage;
import Pages.ChangePasswordPage;
import Pages.CompanyProfilePage;
import Pages.DashboardPage;
import Pages.LicenseGridPage;
import Pages.LoginPage;
import Pages.TasksPage;
import Utils.BaseClass;
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

public class CompanyProfileSteps extends BaseClass {
	CompanyProfilePage companyProfilePage = new CompanyProfilePage(driver);
	
	
	@Then("^I click on company profile menu$")
	public void clickOnCompanyProfileMenu() {
		companyProfilePage.clickOnCompanyProfileMenu(driver);
	}	
	
	@And("^I see the company profile page title$")
	public void verifyCompanyProfilePageTitle() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyCompanyProfilePageTitle(driver));
	}
	@Then("^I see the reset page filters button$")
	public void verifyResetPageFiltersButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyResetPageFiltersButton(driver));
	}
	
	@Then("^I see the client title$")
	public void verifyClientTitle() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyClientTitle(driver));
	}
	
	@Then("^I see the search label$")
	public void verifySearchLabel() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifySearchLabel(driver));
	}
	
	@Then("^I see search text field$")
	public void verifySearchTextField() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifySearchTextField(driver));
	}
	
	@And("^I see plus icon on right side$")
	public void verifyPlusIconOnRightSide() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyPlusIconOnRightSide(driver));
	}
	
	@Then("^I see each column search$")
	public void verifyColumnSearch() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyColumnSearch(driver));
	}
	
	@Then("^I see each column wise sort$")
	public void verifyColumnWiseSort() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyColumnWiseSort(driver));
	}

	@Then("^I see view details button$")
	public void verifyViewDetailsButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyViewDetailsButton(driver));
	}
	
	@Then("^I see client name text field$")
	public void verifyClientNameTextField() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyClientNameTextField(driver));
	}
	
	@Then("^I see user is not able to switch to any other tab$")
	public void verifyUserIsNotAbleToSwitchToOtherTab() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyClientNameTextField(driver));
	}
	
	@Then("^I see client code text field$")
	public void verifyClientCodeTextField() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyClientCodeTextField(driver));
	}
	
	@And("^I see client category dropdown$")
	public void verifyClientCategoryDropDown() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyClientCategoryDropDown(driver));
	}
	
	@And("^I see client status dropdown$")
	public void verifyClientStatusDropDown() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyClientStatusDropDown(driver));
	}
	
	@And("^I enter client name$")
	public void enterClientName() {
		companyProfilePage.enterClientName(driver);
	}
	
	@And("^I enter client code$")
	public void enterClientCode() {
		companyProfilePage.enterClientCode(driver);
	}
	
	@Then("^I select client category$")
	public void selectClientCategory() {
		companyProfilePage.selectClientCategory(driver);
	}
	
	@Then("^I select client status$")
	public void selectClientStatus() {
		companyProfilePage.selectClientStatus(driver);
	}
	
	@And("^I click on save entity button$")
	public void clickOnSaveEntityButton() {
		companyProfilePage.clickOnSaveEntityButton(driver);
	}	
	
	@And("^I check atlas management checkbox$")
	public void checkAtlasManagementCheckbox() {
		companyProfilePage.CheckAtlasManagementCheckbox(driver);
	}	
	
	
	@And("^I see client save success popup and click on ok button$")
	public void verifyClientSaveSuccessPopupAndClickOnOkButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyClientSaveSuccessPopupAndClickOnOkButton(driver));
	}
	
	@Then("^I see the newly added client is listed in the grid$")
	public void verifyTheNewlyAddedClientIsListedInTheGrid() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyTheNewlyAddedClientIsListedInTheGrid(driver));
	}
	
	@Then("^I click on plus icon on right side$")
	public void clickOnPlusIconOnRightSide() {
		companyProfilePage.clickOnPlusIconOnRightSide(driver);
	}	
	
	@Then("^I click on view details button$")
	public void clickOnViewDetailsButton() {
		companyProfilePage.clickOnViewDetailsButton(driver);
	}
	
	@Then("^I see sub tabs with the title client projects contacts and disciplines$")
	public void verifySubTabsWithTheTitleClientProjectsContactsAndDisciplines() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifySubTabsWithTheTitleClientProjectsContactsAndDisciplines(driver));
	}
	
	@Then("^I see client tab should be opened by default$")
	public void verifyClientTabShouldBeOpenedByDefault() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyClientTabShouldBeOpenedByDefault(driver));
	}
	
	@And("^I see company reset page filters button$")
	public void verifyCompanyResetPageFiltersButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyCompanyResetPageFiltersButton(driver));
	}
	
	@And("^I see company title$")
	public void verifyCompanyTitle() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyCompanyTitle(driver));
	}
	
	@And("^I see company global search text field$")
	public void verifyCompanySearchTextField() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyCompanySearchTextField(driver));
	}
	
	@Then("^I see add company button$")
	public void verifyAddCompanyButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyAddCompanyButton(driver));
	}
	
	@Then("^I double click on added client$")
	public void doubleClickOnAddedFirstClient() {
		companyProfilePage.doubleClickOnAddedFirstClient(driver);
	}
	
	@And("^I double click on added company$")
	public void doubleClickOnAddedFirstCompany() {
		companyProfilePage.doubleClickOnAddedFirstCompany(driver);
	}	
	
	@Then("^I click on add company button$")
	public void clickOnAddCompanyButton() {
		companyProfilePage.clickOnAddCompanyButton(driver);
	}
	
	@And("^I enter company name$")
	public void enterCompanyName() {
		companyProfilePage.enterCompanyName(driver);
	}
	
	
	@Then("^I select company status$")
	public void selectCompanyStatus() {
		companyProfilePage.selectCompanyStatus(driver);
	}
	
	@And("^I see company save success popup and click on ok button$")
	public void verifyCompanySaveSuccessPopupAndClickOnOkButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyCompanySaveSuccessPopupAndClickOnOkButton(driver));
	}

	@Then("^I click on company save button$")
	public void clickOnCompanySaveButton() {
		companyProfilePage.clickOnCompanySaveButton(driver);
	}
	
	@And("^I see the newly added company is reflected under the company dropdown section$")
	public void verifyTheNewlyAddedCompanyIsReflectedUnderTheCompanyDropdownSection() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyTheNewlyAddedCompanyIsReflectedUnderTheCompanyDropdownSection(driver));
	}
	
	@And("^I enter client name in global search$")
	public void enterClientNameInSearch() {
		companyProfilePage.enterClientNameInSearch(driver);
	}
	
	@And("^I see the company profiles are filtered based on the entered in global search keywords$")
	public void verifyCompanyProfilesAreFilteredBasedOnTheEnteredInGlobalSearchKeywords() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyCompanyProfilesAreFilteredBasedOnTheEnteredInGlobalSearchKeywords(driver));
	}
	
	@And("^I see the company profiles are filtered based on the entered in column search keywords$")
	public void verifyCompanyProfilesAreFilteredBasedOnTheEnteredInColumnSearchKeywords() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyCompanyProfilesAreFilteredBasedOnTheEnteredInGlobalSearchKeywords(driver));
	}
	
	@And("^I enter client name in column search$")
	public void enterClientNameInColumnSearch() {
		companyProfilePage.enterClientNameInColumnSearch(driver);	
	}
	
	@Then("^I click on projects tab$")
	public void clickOnSubTabProjects() {
		companyProfilePage.clickOnSubTabProjects(driver);
	}
	
	@And("^I enter project number$")
	public void enterProjectNumber() {
		companyProfilePage.enterProjectNumber(driver);	
	}
	
	@Then("^I select project status$")
	public void selectProjectStatusDropDown() {
		companyProfilePage.selectProjectStatusDropDown(driver);
	}
	
	@And("^I enter project description$")
	public void enterProjectDescription() {
		companyProfilePage.enterProjectDescription(driver);	
	}
	
	@Then("^I click on add project button$")
	public void clickOnAddProjectButton() {
		companyProfilePage.clickOnAddProjectButton(driver);
	}
	
	@Then("^I click on project save button$")
	public void clickOnProjectSaveButton() {
		companyProfilePage.clickOnCompanySaveButton(driver);
	}
	
	@And("^I see project save success popup and click on ok button$")
	public void verifyProjectSaveSuccessPopupAndClickOnOkButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyProjectSaveSuccessPopupAndClickOnOkButton(driver));
	}
	
	@And("^I see newly added project saved successfully$")
	public void verifyProjectNumberSavedSuccessfully() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyProjectNumberSavedSuccessfully(driver));
	}
	
	@Then("^I click on contacts tab$")
	public void clickOnSubTabContacts() {
		companyProfilePage.clickOnSubTabContacts(driver);
	}
	
	@Then("^I click on add contacts button$")
	public void clickOnAddContactsButton() {
		companyProfilePage.clickOnAddContactsButton(driver);
	}
	
	@And("^I enter contact first name$")
	public void enterContactFirstName() {
		companyProfilePage.enterContactFirstName(driver);	
	}
	
	@And("^I enter contact last name$")
	public void enterContactLastName() {
		companyProfilePage.enterContactLastName(driver);	
	}
	
	@Then("^I select contact status$")
	public void selectContactStatusDropDown() {
		companyProfilePage.selectContactStatusDropDown(driver);
	}
	
	@Then("^I click on contacts save button$")
	public void clickOnContactSaveButton() {
		companyProfilePage.clickOnContactSaveButton(driver);
	}
	
	@And("^I see contact save success popup and click on ok button$")
	public void verifyContactSaveSuccessPopupAndClickOnOkButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyContactSaveSuccessPopupAndClickOnOkButton(driver));
	}
	
	@And("^I see newly added contact saved successfully$")
	public void verifyContactSavedSuccessfully() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyContactSavedSuccessfully(driver));
	}
	
	@And("^I select discipline level$")
	public void selectDisciplineLevelDropDown() {
		companyProfilePage.selectDisciplineLevelDropDown(driver);
	}
	
	@And("^I select discipline issuedto$")
	public void selectDisciplineIssuedToDropDown() {
		companyProfilePage.selectDisciplineIssuedToDropDown(driver);
	}
	
	@Then("^I click on Add discipline button$")
	public void clickOnAddDisciplineButton() {
		companyProfilePage.clickOnAddDisciplineButton(driver);
	}
	
	@And("^I see discipline save success popup and click on ok button$")
	public void verifyDisciplineSaveSuccessPopupAndClickOnOkButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyDisciplineSaveSuccessPopupAndClickOnOkButton(driver));
	}
	
	@And("^I see newly added discipline saved successfully$")
	public void verifyDisciplineSavedSuccessfully() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyDisciplineSavedSuccessfully(driver));
	}
	
	@Then("^I click on discipline save button$")
	public void clickOnDisciplineSaveButton() {
		companyProfilePage.clickOnDisciplineSaveButton(driver);
	}
	
	
	@Then("^I click on disciplines tab$")
	public void clickOnSubTabDisciplines() {
		companyProfilePage.clickOnSubTabDisciplines(driver);
	}
	
	@And("^I click on edit button$")
	public void clickOnEditButton() {
		companyProfilePage.clickOnEditButton(driver);
	}
	
	@And("^I see add plus button$")
	public void verifyAddPlusButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyAddPlusButton(driver));
	}
	
	@And("^I click on add plus button$")
	public void clickOnAddPlusButton() {
		companyProfilePage.clickOnAddPlusButton(driver);
	}
	
	@And("^I click on owner tab$")
	public void clickOnSubTabOwner() {
		companyProfilePage.clickOnSubTabOwner(driver);
	}
	
	@Then("^I select owner type$")
	public void selectOwnerTypeDropDown() {
		companyProfilePage.selectOwnerTypeDropDown(driver);
	}
	
	@Then("^I select owner status$")
	public void selectOwnerStatusDropDown() {
		companyProfilePage.selectOwnerStatusDropDown(driver);
	}
	
	@And("^I enter owner name$")
	public void enterOwnerName() {
		companyProfilePage.enterOwnerName(driver);	
	}
	
	@And("^I see owner save success popup and click on ok button$")
	public void verifyOwnerSaveSuccessPopupAndClickOnOkButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyOwnerSaveSuccessPopupAndClickOnOkButton(driver));
	}
	
	@And("^I see newly added owner saved successfully$")
	public void verifyOwnerSavedSuccessfully() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyOwnerNameSavedSuccessfully(driver));
	}
	
	@Then("^I click on owner save button$")
	public void clickOnownerSaveButton() {
		companyProfilePage.clickOnContactSaveButton(driver);
	}
	
	@Then("^I select vendor type$")
	public void selectVendorTypeDropDown() {
		companyProfilePage.selectVendorTypeDropDown(driver);
	}
	
	@Then("^I select vendor status$")
	public void selectVendorStatusDropDown() {
		companyProfilePage.selectVendorStatusDropDown(driver);
	}
	
	@And("^I enter vendor name$")
	public void enterVendorName() {
		companyProfilePage.enterVendorName(driver);	
	}
	
	@And("^I see vendor save success popup and click on ok button$")
	public void verifyVendorSaveSuccessPopupAndClickOnOkButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyVendorSaveSuccessPopupAndClickOnOkButton(driver));
	}
	
	@And("^I see newly added vendor saved successfully$")
	public void verifyVendorNameSavedSuccessfully() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyVendorNameSavedSuccessfully(driver));
	}
	
	@And("^I click on vendor tab$")
	public void clickOnSubTabVendor() {
		companyProfilePage.clickOnSubTabVendor(driver);
	}
	
	@Then("^I click on vendor save button$")
	public void clickOnVendorSaveButton() {
		companyProfilePage.clickOnContactSaveButton(driver);
	}
	
	@And("^I enter facility name$")
	public void enterFacilityName() {
		companyProfilePage.enterFacilityName(driver);	
	}
	
	@Then("^I select facility status$")
	public void selectFacilityStatusDropDown() {
		companyProfilePage.selectFacilityStatusDropDown(driver);
	}
	
	@Then("^I click on facility save button$")
	public void clickOnFacilitySaveButton() {
		companyProfilePage.clickOnContactSaveButton(driver);
	}
	
	@And("^I see facility save success popup and click on ok button$")
	public void verifyFacilitySaveSuccessPopupAndClickOnOkButton() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyFacilitySaveSuccessPopupAndClickOnOkButton(driver));
	}
	
	@And("^I see newly added facility saved successfully$")
	public void verifyFacilitySavedSuccessfully() throws InterruptedException {
		Assert.assertTrue(companyProfilePage.verifyFacilitySavedSuccessfully(driver));
	}
	
	@And("^I click on facility add plus button$")
	public void clickOnFacilityAddButton() {
		companyProfilePage.clickOnFacilityAddButton(driver);
	}
	
	@And("^I click on project add plus button$")
	public void clickOnProjectAddButton() {
		companyProfilePage.clickOProjectAddButton(driver);
	}
	
	@And("^I click on facility view detail button$")
	public void clickOnFacilityViewDetailButton() {
		companyProfilePage.clickOnFacilityViewDetailButton(driver);
	}
	
	
	
}
