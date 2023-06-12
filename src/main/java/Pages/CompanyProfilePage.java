package Pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import Utils.BaseClass;
import org.junit.Assert;
import static org.junit.Assert.*;

public class CompanyProfilePage extends BaseClass {
	private WebDriver podriver = null;

	String companyProfileMenu = "//a[text()='Company Profile']";
	String companyProfilePageTitle = "//p[contains(text(),'Company Profile')]";
	String resetPageFiltersBtn = "//a[contains(text(),' Reset Page Filters')]";
	String clientTitle = "//div[contains(text(),'Client')]";
	String searchTxt = "//input[@type='search']";
	String searchLbl = "//label[contains(text(),'Search')]";
	String plusIconOnRightSide = "(//i[@class='fa-solid fa-plus'])[1]";
	String columnSearch = "(//input[@type='text'])[1]";
	String columnWiseSort = "(//th[@class='header-text sorting'])[1]";
	String viewDetailsBtn = "(//span[@title='View Details'])[1]";
	String clientNameTxt = "//input[@id='ClientName']";
	String clientCodeTxt = "//input[@id='ClientCode']";
	String clientCategoryDropDown = "//select[@id='ClientCategoryKey']";
	String clientStatusDropDown = "//select[@id='ClientStatus']";
	String saveEntityBtn = "//img[@onclick=\"saveEntityDetails('Save')\"]";
	String clientSaveSuccessPopup = "//div[@id='text_success']";
	String clientSaveSuccessPopupOkBtn = "(//a[contains(text(),'Ok')])[1]";	
	String companyNameTitle = "//p[@class='nav-head-2 mb-1']";
	String subTabClient = "//span[contains(text(),'Client')]";
	String subTabProjects = "//span[contains(text(),'Projects')]";
	String subTabContacts = "//span[contains(text(),'Contacts')]";
	String subTabDisciplines = "//span[contains(text(),'Disciplines')]";
	String companyResetPageFiltersBtn = "(//a[contains(text(),' Reset Page Filters')])[2]";
	String companyTitle = "//div[text()='Company']";
	String companySearchTxt = "(//input[@type='search'])[2]";
	String addCompanyBtn = "(//i[@class=\"fa-solid fa-plus\"])[last()]";
	String addedFirstClient = "(//td[@class='client_td sorting_2'])[1]";
	String addedFirstCompany = "(//td[@class=\"company_td\"])[1]";	
	String companyNameTxt = "//input[@id='CompanyName']";
	String companyStatusDropDown = "//select[@id='CompanyStatus']";
	String saveBtn = "//img[@onclick=\"saveEntityDetails('Save')\"]";	
	String clientColumnSearch = "(//input[@type='text'])[2]";
	String addBtn = "//span[@id='add-btn']";
	String facilityAddBtn = "(//i[@class='fa-solid fa-plus'])[3]";
	String projectAddBtn = "//*[@id='add-btn']";
	String projectNumberTxt = "//input[@name='ProjectNumber']";
	String projectStatusDropDown = "//select[@name='ProjectStatusKey']";
	String projectDescriptionTxt = "//textarea[@name='ProjectDescription']";
	String contactNameFirstTxt = "//input[@name='ContactNameFirst']";
	String contactNameLastTxt = "//input[@name='ContactNameLast']";
	String contactStatusDropDown = "//select[@name='ContactStatus']";
	String disciplineLevelDropDown = "//select[@id='DisciplineLevel']";
	String disciplineIssuedToDropDown = "//select[@id='DisciplineIssuedTo']";
	String editBtn = "//span[@id='edit-btn']";
	String subTabOwner = "//span[@id='owner-li-span']";
	String ownerTypeDropDown = "//select[@id='OwnerType']";
	String ownerStatusDropDown = "//select[@id='OwnershipStatus']";
	String ownerNameTxt = "//input[@id='OwnerEntityName']";
	String subTabVendor = "//span[@id='vendor-li-span']";
	String vendorTypeDropDown = "//select[@id='VendorTypeKey']";
	String vendorStatusDropDown = "//select[@id='VendorStatus']";
	String vendorNameTxt = "//input[@id='VendorName']";
	String facilityNameTxt = "//input[@id='FacilityName']";
	String facilityStatusDropDown = "//select[@id='FacilityStatus']";
	String atlasManagementCheckbox = "//label[@for='AtlasManagement']";
	
	
	String facilityViewDetailBtn = "//*[contains(@title,'View Facility Details')]";
	
	

	String taskDateSelect = "";
	String clientName = "Test"+randomNumberString(3);
	String clientCode = randomNumberString(4);
	String companyName = "company test"+randomNumberString(5);
	String projectNumber = randomNumberString(4);
	String projectDescription = "Demo"+randomNumberString(3);
	String contactLastName = "User"+randomNumberString(3);
	String ownerName = "User"+randomNumberString(3);
	String facilityName = "User"+randomNumberString(3);
	String vendorName = "User"+randomNumberString(3);
	
	
	String disciplineIssuedToVal = "";
	
	String searchDate="";
	int pageCounter = 0;	
	HashMap<String, String> taskDetails = new HashMap<String, String>();


	public CompanyProfilePage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void clickOnCompanyProfileMenu(WebDriver driver) {
		waitForElementVisibility(companyProfileMenu, "20", driver);
		click(companyProfileMenu, driver);
	}

	public Boolean verifyCompanyProfilePageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(companyProfilePageTitle, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyResetPageFiltersButton(WebDriver driver) {
		try {
			waitForElementVisibility(resetPageFiltersBtn, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyClientTitle(WebDriver driver) {
		try {
			waitForElementVisibility(clientTitle, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifySearchTextField(WebDriver driver) {
		try {
			waitForElementVisibility(searchTxt, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifySearchLabel(WebDriver driver) {
		try {
			waitForElementVisibility(searchLbl, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyPlusIconOnRightSide(WebDriver driver) {
		try {
			waitForElementVisibility(plusIconOnRightSide, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyColumnSearch(WebDriver driver) {
		try {
			waitForElementVisibility(columnSearch, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyColumnWiseSort(WebDriver driver) {
		try {
			waitForElementVisibility(columnWiseSort, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyViewDetailsButton(WebDriver driver) {
		try {
			waitForElementVisibility(viewDetailsBtn, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyClientNameTextField(WebDriver driver) {
		try {
			waitForElementVisibility(clientNameTxt, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyClientCodeTextField(WebDriver driver) {
		try {
			waitForElementVisibility(clientCodeTxt, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyClientCategoryDropDown(WebDriver driver) {
		try {
			waitForElementVisibility(clientCategoryDropDown, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyClientStatusDropDown(WebDriver driver) {
		try {
			waitForElementVisibility(clientStatusDropDown, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void enterClientName(WebDriver driver) {
		waitForElementVisibility(clientNameTxt, "30", driver);
		scrollToElement(clientNameTxt, driver);
		type(clientNameTxt, clientName, driver);
	}
	
	public void enterClientCode(WebDriver driver) {
		waitForElementVisibility(clientCodeTxt, "30", driver);
		scrollToElement(clientCodeTxt, driver);
		type(clientCodeTxt, clientCode, driver);
	}
	
	public void selectClientCategory(WebDriver driver) {
		waitForElementVisibility(clientCategoryDropDown, "30", driver);
		Select selectClientCategory = new Select(driver.findElement(By.xpath(clientCategoryDropDown)));
		selectClientCategory.selectByIndex(1);
//		WebElement option = selectClientCategory.getFirstSelectedOption();
	}
	
	public void selectClientStatus(WebDriver driver) {
		waitForElementVisibility(clientStatusDropDown, "30", driver);
		Select selectClientStatus = new Select(driver.findElement(By.xpath(clientStatusDropDown)));
		WebElement option = selectClientStatus.getFirstSelectedOption();
	}
	
	public void CheckAtlasManagementCheckbox(WebDriver driver) {
		click(atlasManagementCheckbox, driver);
	}
	
	
	public void clickOnSaveEntityButton(WebDriver driver) {
		waitForElementVisibility(saveEntityBtn, "20", driver);
		click(saveEntityBtn, driver);
	}
	
	public Boolean verifyClientSaveSuccessPopupAndClickOnOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(clientSaveSuccessPopup, "30", driver);
			click(clientSaveSuccessPopupOkBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyCompanySaveSuccessPopupAndClickOnOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(clientSaveSuccessPopup, "30", driver);
			click(clientSaveSuccessPopupOkBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTheNewlyAddedClientIsListedInTheGrid(WebDriver driver) {
		try {
					WebElement saveClientName = driver.findElement(By.xpath("//td[text()='" + clientName + "']"));
					scrollToElement(saveClientName, driver);
					waitForElementVisibility(saveClientName, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnPlusIconOnRightSide(WebDriver driver) {
		waitForElementVisibility(plusIconOnRightSide, "20", driver);
		click(plusIconOnRightSide, driver);
	}
	
	public void clickOnViewDetailsButton(WebDriver driver) {
		waitForElementVisibility(viewDetailsBtn, "20", driver);
		click(viewDetailsBtn, driver);
	}
	
	public Boolean verifySubTabsWithTheTitleClientProjectsContactsAndDisciplines(WebDriver driver) {
		try {
			waitForElementVisibility(subTabClient, "30", driver);
			waitForElementVisibility(subTabProjects, "30", driver);
			waitForElementVisibility(subTabContacts, "30", driver);
			waitForElementVisibility(subTabDisciplines, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyClientTabShouldBeOpenedByDefault(WebDriver driver) {
		try {
			waitForElementVisibility(subTabClient, "30", driver);
			waitForElementVisibility(clientNameTxt, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void doubleClickOnAddedFirstClient(WebDriver driver) {
		waitForElementVisibility(addedFirstClient, "20", driver);
		doubleClick(addedFirstClient, driver);
		
	}
	
	public void doubleClickOnAddedFirstCompany(WebDriver driver) {
		waitForElementVisibility(addedFirstCompany, "20", driver);
		doubleClick(addedFirstCompany, driver);
		
	}
	
	
	
	public Boolean verifyCompanyResetPageFiltersButton(WebDriver driver) {
		try {
			waitForElementVisibility(companyResetPageFiltersBtn, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyCompanyTitle(WebDriver driver) {
		try {
			waitForElementVisibility(companyTitle, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyCompanySearchTextField(WebDriver driver) {
		try {
			waitForElementVisibility(companySearchTxt, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyAddCompanyButton(WebDriver driver) {
		try {
			waitForElementVisibility(addCompanyBtn, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void enterCompanyName(WebDriver driver) {
		waitForElementVisibility(companyNameTxt, "30", driver);
		scrollToElement(companyNameTxt, driver);
		type(companyNameTxt, companyName, driver);
	}
	
	public void selectCompanyStatus(WebDriver driver) {
		waitForElementVisibility(companyStatusDropDown, "30", driver);
		Select selectCompanyStatus= new Select(driver.findElement(By.xpath(companyStatusDropDown)));
		selectCompanyStatus.selectByIndex(1);
	
	}
	
	public void clickOnAddCompanyButton(WebDriver driver) {
		waitForElementVisibility(addCompanyBtn, "20", driver);
		click(addCompanyBtn, driver);
	}
	
	public Boolean verifyTheNewlyAddedCompanyIsReflectedUnderTheCompanyDropdownSection(WebDriver driver) {
		try {
					WebElement saveClientName = driver.findElement(By.xpath("//td[text()='" + companyName + "']"));
					scrollToElement(saveClientName, driver);
					waitForElementVisibility(saveClientName, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnCompanySaveButton(WebDriver driver) {
		waitForElementVisibility(saveBtn, "20", driver);
		click(saveBtn, driver);
	}
	
	public void clickOnContactSaveButton(WebDriver driver) {
		waitForElementVisibility(saveBtn, "20", driver);
		click(saveBtn, driver);
	}
	
	public void enterClientNameInSearch(WebDriver driver) {
		waitForElementVisibility(addedFirstClient, "30", driver);
		scrollToElement(addedFirstClient, driver);
		searchDate = getValueFromAttribute(addedFirstClient, driver).trim();
		type(searchTxt, searchDate, driver);
	}
	
	
	public Boolean verifyCompanyProfilesAreFilteredBasedOnTheEnteredInGlobalSearchKeywords(WebDriver driver) {
		try {
					WebElement searchClientName = driver.findElement(By.xpath("//td[text()='" + searchDate + "']"));
					scrollToElement(searchClientName, driver);
					waitForElementVisibility(searchClientName, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void enterClientNameInColumnSearch(WebDriver driver) {
		waitForElementVisibility(clientColumnSearch, "30", driver);
		scrollToElement(clientColumnSearch, driver);
		searchDate = getValueFromAttribute(addedFirstClient, driver).trim();
		type(clientColumnSearch, searchDate, driver);
	}
	
	public void enterProjectNumber(WebDriver driver) {
		waitForElementVisibility(projectNumberTxt, "30", driver);
		scrollToElement(projectNumberTxt, driver);
		type(projectNumberTxt, projectNumber, driver);
	}
	
	public void enterProjectDescription(WebDriver driver) {
		waitForElementVisibility(projectDescriptionTxt, "30", driver);
		scrollToElement(projectDescriptionTxt, driver);
		type(projectDescriptionTxt, projectDescription, driver);
	}
	
	public void selectProjectStatusDropDown(WebDriver driver) {
		waitForElementVisibility(projectStatusDropDown, "30", driver);
		Select selectCompanyStatus= new Select(driver.findElement(By.xpath(projectStatusDropDown)));
		selectCompanyStatus.selectByIndex(1);
	}
	
	public void clickOnSubTabProjects(WebDriver driver) {
		waitForElementVisibility(subTabProjects, "20", driver);
		try {
			click(subTabProjects, driver);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickOnAddProjectButton(WebDriver driver) {
		waitForElementVisibility(addBtn, "20", driver);
		click(addBtn, driver);
	}
	
	public Boolean verifyProjectNumberSavedSuccessfully(WebDriver driver) {
		try {
					WebElement searchClientName = driver.findElement(By.xpath("//span[text()='" + projectNumber + "']"));
					scrollToElement(searchClientName, driver);
					waitForElementVisibility(searchClientName, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyProjectSaveSuccessPopupAndClickOnOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(clientSaveSuccessPopup, "30", driver);
			click(clientSaveSuccessPopupOkBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnSubTabContacts(WebDriver driver) {
		waitForElementVisibility(subTabContacts, "20", driver);
		try {
			click(subTabContacts, driver);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickOnAddContactsButton(WebDriver driver) {
		waitForElementVisibility(addBtn, "20", driver);
		click(addBtn, driver);
	}
	
	public void enterContactFirstName(WebDriver driver) {
		waitForElementVisibility(contactNameFirstTxt, "30", driver);
		scrollToElement(contactNameFirstTxt, driver);
		type(contactNameFirstTxt, "Demo", driver);
	}
	
	public void enterContactLastName(WebDriver driver) {
		waitForElementVisibility(contactNameLastTxt, "30", driver);
		scrollToElement(contactNameLastTxt, driver);
		type(contactNameLastTxt, contactLastName, driver);
	}
	
	public void selectContactStatusDropDown(WebDriver driver) {
		waitForElementVisibility(contactStatusDropDown, "30", driver);
		Select selectCompanyStatus= new Select(driver.findElement(By.xpath(contactStatusDropDown)));
		selectCompanyStatus.selectByIndex(1);
	}
	
	public Boolean verifyContactSaveSuccessPopupAndClickOnOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(clientSaveSuccessPopup, "30", driver);
			click(clientSaveSuccessPopupOkBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyContactSavedSuccessfully(WebDriver driver) {
		wait3s();
		try {

					WebElement lastName = driver.findElement(By.xpath("//span[contains(text(),'" + contactLastName + "')]"));
					scrollToElement(lastName, driver);
					waitForElementVisibility(lastName, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void selectDisciplineLevelDropDown(WebDriver driver) {
		waitForElementVisibility(disciplineLevelDropDown, "30", driver);
		Select selectDisciplineLevel = new Select(driver.findElement(By.xpath(disciplineLevelDropDown)));
		selectDisciplineLevel.selectByIndex(1);
	}
	
	public void selectDisciplineIssuedToDropDown(WebDriver driver) {
		try {
			waitfor3sec();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		waitForElementVisibility(disciplineIssuedToDropDown, "30", driver);
		Select selectDisciplineIssuedTo = new Select(driver.findElement(By.xpath(disciplineIssuedToDropDown)));
		wait6s();
		selectDisciplineIssuedTo.selectByIndex(2);
		WebElement disciplineIssuedTo = selectDisciplineIssuedTo.getFirstSelectedOption();
		disciplineIssuedToVal = disciplineIssuedTo.getText();
	}
	
	public void clickOnAddDisciplineButton(WebDriver driver) {
		waitForElementVisibility(addBtn, "20", driver);
		click(addBtn, driver);
	}
	
	public Boolean verifyDisciplineSaveSuccessPopupAndClickOnOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(clientSaveSuccessPopup, "30", driver);
			click(clientSaveSuccessPopupOkBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyDisciplineSavedSuccessfully(WebDriver driver) {
		try {
					WebElement discipline = driver.findElement(By.xpath("//span[contains(text(),'" + disciplineIssuedToVal + "')]"));
					scrollToElement(discipline, driver);
					waitForElementVisibility(discipline, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnDisciplineSaveButton(WebDriver driver) {
		waitForElementVisibility(saveBtn, "20", driver);
		click(saveBtn, driver);
	}
	
	public void clickOnSubTabDisciplines(WebDriver driver) {
		waitForElementVisibility(subTabDisciplines, "20", driver);
		try {
			click(subTabDisciplines, driver);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickOnEditButton(WebDriver driver) {
		waitForElementVisibility(editBtn, "20", driver);
		click(editBtn, driver);
	}
	
	public Boolean verifyAddPlusButton(WebDriver driver) {
		try {
			waitForElementVisibility(addBtn, "30", driver);
			click(addBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnSubTabOwner(WebDriver driver) {
		waitForElementVisibility(subTabOwner, "20", driver);
		click(subTabOwner, driver);
	}
	
	public void clickOnAddPlusButton(WebDriver driver) {
		waitForElementVisibility(addBtn, "20", driver);
		click(addBtn, driver);
	}
	
	
	public void selectOwnerTypeDropDown(WebDriver driver) {
		waitForElementVisibility(ownerTypeDropDown, "30", driver);
		Select selectOwnerType = new Select(driver.findElement(By.xpath(ownerTypeDropDown)));
		selectOwnerType.selectByIndex(1);
	}
	
	public void selectOwnerStatusDropDown(WebDriver driver) {
		waitForElementVisibility(ownerStatusDropDown, "30", driver);
		Select selectOwnerStatus = new Select(driver.findElement(By.xpath(ownerStatusDropDown)));
		wait6s();
		selectOwnerStatus.selectByIndex(1);
	}
	
	public void enterOwnerName(WebDriver driver) {
		waitForElementVisibility(ownerNameTxt, "30", driver);
		scrollToElement(ownerNameTxt, driver);
		type(ownerNameTxt, ownerName, driver);
	}
	
	public Boolean verifyOwnerSaveSuccessPopupAndClickOnOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(clientSaveSuccessPopup, "30", driver);
			click(clientSaveSuccessPopupOkBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyOwnerNameSavedSuccessfully(WebDriver driver) {
		try {
					WebElement discipline = driver.findElement(By.xpath("//span[contains(text(),'" + ownerName + "')]"));
					scrollToElement(discipline, driver);
					waitForElementVisibility(discipline, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void selectVendorTypeDropDown(WebDriver driver) {
		waitForElementVisibility(vendorTypeDropDown, "30", driver);
		Select selectVendorType = new Select(driver.findElement(By.xpath(vendorTypeDropDown)));
		selectVendorType.selectByIndex(1);
	}
	
	public void selectVendorStatusDropDown(WebDriver driver) {
		waitForElementVisibility(vendorStatusDropDown, "30", driver);
		Select selectVendorStatus = new Select(driver.findElement(By.xpath(vendorStatusDropDown)));
		wait6s();
		selectVendorStatus.selectByIndex(1);
	}
	
	public void enterVendorName(WebDriver driver) {
		waitForElementVisibility(vendorNameTxt, "30", driver);
		scrollToElement(vendorNameTxt, driver);
		type(vendorNameTxt, vendorName, driver);
	}
	
	public Boolean verifyVendorSaveSuccessPopupAndClickOnOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(clientSaveSuccessPopup, "30", driver);
			click(clientSaveSuccessPopupOkBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyVendorNameSavedSuccessfully(WebDriver driver) {
		try {
					WebElement discipline = driver.findElement(By.xpath("//span[contains(text(),'" + vendorName + "')]"));
					scrollToElement(discipline, driver);
					waitForElementVisibility(discipline, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnSubTabVendor(WebDriver driver) {
		waitForElementVisibility(subTabVendor, "20", driver);
		click(subTabVendor, driver);
	}
	
	public void enterFacilityName(WebDriver driver) {
		waitForElementVisibility(facilityNameTxt, "30", driver);
		scrollToElement(facilityNameTxt, driver);
		type(facilityNameTxt,facilityName, driver);
	}	
	
	public void selectFacilityStatusDropDown(WebDriver driver) {
		waitForElementVisibility(facilityStatusDropDown, "30", driver);
		Select selectVendorStatus = new Select(driver.findElement(By.xpath(facilityStatusDropDown)));
		wait6s();
		selectVendorStatus.selectByIndex(1);
	}
	
	public Boolean verifyFacilitySaveSuccessPopupAndClickOnOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(clientSaveSuccessPopup, "30", driver);
			click(clientSaveSuccessPopupOkBtn, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyFacilitySavedSuccessfully(WebDriver driver) {
		try {
					WebElement discipline = driver.findElement(By.xpath("//td[text()='" + facilityName + "']"));
					scrollToElement(discipline, driver);
					waitForElementVisibility(discipline, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnFacilityAddButton(WebDriver driver) {
		waitForElementVisibility(facilityAddBtn, "20", driver);
		click(facilityAddBtn, driver);
	}
	
	public void clickOProjectAddButton(WebDriver driver) {
		waitForElementVisibility(projectAddBtn, "20", driver);
		click(projectAddBtn, driver);
	}
	
	
	public void clickOnFacilityViewDetailButton(WebDriver driver) {
		waitForElementVisibility(facilityViewDetailBtn, "20", driver);
		click(facilityViewDetailBtn, driver);
	}
	
}
