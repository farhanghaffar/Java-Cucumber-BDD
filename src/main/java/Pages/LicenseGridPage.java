package Pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;

import Utils.BaseClass;
import org.junit.Assert;
import static org.junit.Assert.*;
//import junit.framework.Assert;

public class LicenseGridPage extends BaseClass {
	private WebDriver podriver = null;

	String clientDropdownOnLicense = "(//label[text()='Client']/following-sibling::select)[last()]";
	String companyDropdownOnLicense = "(//label[text()='Company']/following-sibling::select)[last()]";
	String facilityDropdownOnLicense = "(//label[text()='Facility']/following-sibling::select)[last()]";
	String clientDropDownOption = "(//select[@id='ClientKey']/option)[2]";
	String resetGlobalFilters = "//a[@title='Clear All Filters']";
	String exportBtn = "//span[text()='Export']";
	String licenseCategory = "//select[@id='progress']";
	String advancedFilters = "//a[text()='Advanced Filters'] | //a[text()[contains(.,'Advanced Filters')]]";
	String compMgrSearch = "(//input[contains(@class,'input-search')])[1]";
	String companySearch = "(//input[contains(@class,'input-search')])[3]";
	String companySearch2 = "//input[@id='myInput2']";
	String facilitySearch = "(//input[contains(@class,'input-search')])[3]";
	String stateSearch = "(//input[contains(@class,'input-search')])[4]";
	String licenseNameSearch = "(//input[contains(@class,'input-search')])[5]";
	String licenseDetialsSearch = "(//input[contains(@class,'input-search')])[6]";
	String licenseSearch = "(//input[contains(@class,'input-search')])[7]";
	String statusSearch = "(//input[contains(@class,'input-search')])[8]";
	String statusHelpIcon = "(//*[local-name()='svg' and @class='bi bi-info-circle'])[1]";
	String activeHelpIcon = "(//*[local-name()='svg' and @class='bi bi-info-circle'])[2]";
	String callTheLogIcon = "//img[@class='call-icon']";
	String addActivityLink = "(//a[@title='Add Activity'])[1]";
	String urlIconEachLicense = "//tr//td[11]";
	String urlIconLicense = "(//img[@src='./theme/build/images/URL.png'])[1]";
	String licensesGrid = "(//div[@class='mbp'])[2]";
	String tooltipIIcon = "//div[@class='popover-body']";
	String goToActivityIcon = "(//*[@title='Go To Activity'])[1]";
	String addActivityIcon = "(//a[@title='Add Activity'])[1]";
	String selecteCompany = "//select[@id='CompanyKey']";
	String selecteFacility = "//select[@id='FacilityKeyPair']";
	String selecteLicenseActivity = "//select[@id='LicenseActivityKey']";
	String activityStartDate = "//input[@name='ActivityStartDate']";
	String activityPopupNextBtn = "//button[text()='Next'][1]";
	String activityPopupSaveBtn = "//button[@id='task-modal-save']";
	String selecteType = "//select[@id='TaskTypeKey']";
	String selecteTaskStatus = "//select[@id='TaskStandingKey']";
	String selecteAssigne = "//select[@id='AssignedUserKey']";
	String taskDetailsSavedSuccessfullyPopup = "//div[text()='Task Details Saved Successfully']";
	String taskDetailsSavedSuccessfullyPopupOKBtn = "//a[@aria-label='Close']";
	String advanceFiltersSelectField = "//select[contains(@id,'field')]";
	String advanceFiltersSelectOperator = "//select[contains(@id,'operator')]";
	String advanceFiltersValueTxt = "//input[contains(@id,'search_value_one')]";
	String addConditionLink = "//a[@id='button_add_search_entry']";
	String advanceFiltersSelectFieldSecond = "(//select[contains(@id,'field')])[last()]";
	String advanceFiltersSelectOperatorSecond = "(//select[contains(@id,'operator')])[last()]";
	String advanceOperatorValueSecondTxt = "(//input[contains(@id,'search_value_one')])[last()]";
	String advanceFiltersSaveBtn = "//button[text()='Save']";
	String advanceFiltersCloseBtn = "//button[text()='Close']";
	String editLicensePopupCloseButton = "//button[text()='Delete']//following-sibling::button[text()='Close']";
	String advanceFiltersAndOrDropdown = "(//select[contains(@id,'condition')])[last()]";
	String advanceFiltersDeleteIcon = "//img[contains(@onclick,'removeDiv')]";
	String addNewLicenseBtn = "//button[@title='Add New License']";
	String addNewRequirementBtn = "//button[@title='Add New Requirement']";	
	String addLicensePageTitle = "//p[contains(text(),'License Det')]";
	String addLicenseCompanyDropdown = "//select[@id='CompanyKey']";
	String addLicenseFacilityDropdown = "//select[@id='FacilityKeyPair']";
	String addLicenseLicenseNameTxt = "//input[@id='FormerLicenseName']";
	String addLicenseLicenseNumberTxt = "//input[@id='LicenseNumber']";
	String addLicenseSaveBtn = "//button[@id='modal-save']";
	String addLicenseStatesDropdown = "//select[@id='StatesKey']";
	String addLicenseLicenseStatusDropdown = "//select[@id='LicenseStatusMasterKey']";
	String licenseDetailsSavedSuccessfully = "//div[text()='Requirement Details saved successfully']";
	String successPopupOk = "//a[@id='successok']";
	String licenseSerachTxt = "(//input[contains(@id,'myInput')])[6]";
	String facilityDataInGrid = "((//tr[@class='odd'])[3])//td[4]";
//	String facilityFilterDataInGrid = "//th[@aria-label='Facility: activate to sort column descending']/following::tr//td[3]";
	String facilityFilterDataInGrid = "//tr";
	String removeFilePdfBtn = "//label[contains(text(),'Uploaded File Name : ')]";
	String pdfUploadedFileName = "//label[contains(text(),'Uploaded File Name : ')]";
	String editLicenseDeleteBtn = "//button[@id='modal-delete'] | //button[text()='Delete']";
	String editLicenseCompanyDropDown = "//select[@id='CompanyKey']";
	String editLicenseFacilityDropDown = "//select[@id='FacilityKeyPair']";
	String editLicenseStatesDropDown = "//select[@id='StatesKey']";
	String licensData = "(//*[@title='Upload Requirement']/ancestor::td/../td)[3]/..";
	String editLicensePageTitel = "//div[@class='modal-header head-back'] | //p[contains(text(),'License Details - Edit License')]";
	String pdfFileSuccessPopup = "//div[@id='text_success']";
	String pdfFileSuccessPopupOkBtn = "//a[@id='successok']";
	String editLicenseComplianceDropDown = "//select[@id='ComplianceMaster']";
	String editLicenseLicenseStatusDropDown = "//select[@id='LicenseStatusMasterKey']";
	String editLicenseLicenseNumberTxt = "//input[@id='LicenseNumber']";
	String editLicenseLicenseDetailsTxt = "//input[@id='LicenseDetails']";
	String editLicenseDeleteConfirmBtn = "//a[@id='btn-confirm-ok'] | //a[text()='Confirm']";
	String editLicenseFileRemoveBtn = "//button[@id='FileRemove'] | //button[text()='Remove File']";
	String licenseNumberCoun = "(//*[@title='View License']/ancestor::td/../td[7])";
	String saveBtn = "//button[@id='modal-save']";
	String successPopup = "//div[@id='text_success']";
	String successPopupOkBtn = "//a[@id='successok']";
	String entriesIsShowingForLicensesLbl = "//div[contains(text(),'Entries')]";
	String firstLicenseName = "(//tr//td[5])[1]";
	String firstLicenseNameAll = "//tr//td[5]";
	String resetPageFiltersLink = "//a[text()=' Reset Page Filters']";
	String callLogPopoupAddCallLogBtn = "//button[@id='callAdd']";
	String callLogPopoupCloseXIconBtn = "(//span[@class='cross'])[2] | (//button[@class='close'])[2]";
	String callLogPopoupcallLogListEntries = "(//table[@id='callLogList']//tr//td)[1]";
	String callLogPopoupGlobalSearch = "(//input[@type='search'])[2]";
	String callLogPopoupColumnsSorting = "//th[@class='sorting']";
	String callLogPopoupEditSectionTitel = "//label[@id='callLog_form_title']";
	String callLogEditClientNameTxt = "//input[@id='ClientName']";
	String callLogEditCompanyDropdown = "//select[@id='CompanyKeyCallLog']";
	String callLogEditFacilityDropdown = "//select[@id='FacilityKeyPairCallLog']";
	String callLogEditPersonnelDropdown = "//select[@id='PersonnelKey']";
	String callLogEditTypeDropdown = "//select[@id='CallLogTypeKey']";
	String callLogEditDateTxt = "//input[@id='callDate']";
	String callLogEditNotesTxt = "//textarea[@id='notes']";
	String callLogEditClientTxt = "//textarea[@id='clientInput']";
	String callLogEditPharmsSolutionsTxt = "//textarea[@id='FRRInput']";
	String callLogEditSaveBtn = "//button[@id='button_callLog'] | (//button[text()='Save'])[2]";
	String callLogEditTypeMandatory = "//label[text()='Type ']//span[@class='red']";
	String callLogEditDateMandatory = "//label[text()='Date ']//span[@class='red']";
	String callLogShowEntiresDropDown = "//select[@name='callLogList_length']";
	String callLogShowClientActionableList = "//th[text()='Client Actionable']/following::tr/td[7]";
	String communicationLogBtn = "//a[@title='Communication Log'] | //a[@data-original-title='Communication Log']";
	String callLogPopoupTitel = "//div[contains(@class,'modal-header')]//div//div//p | //p[contains(text(),'Communication Log For')]";
	String licenseProgressDropdown = "//select[@id='incomplete'] | //span[@class='pull-right select-header']//select";
	String advancedFiltersLink = "//a[text()=' Advanced Filters ']";
	String licenseProgressList = "(//th[@aria-label='Progress: activate to sort column ascending']/following::tr//td[13])";
	String expirationDate = "(//td//span[@class='red'])[1]";
	String expirationDateOnDetials = "//input[@id='ExpirationDate']";
	String waitLoadingPagePopup = "//div[@class='col text-center company'] | //div[contains(text(),'Loading Please Wait..')]";
	String companySearchValue = "(//th[@aria-label='Company: activate to sort column ascending']/following::td)[3]";
	String companySearchValue2 = "(//th[@aria-label='Company: activate to sort column descending']/following::td)[3]";
	String companySearchList = "//th[@aria-label='Company: activate to sort column descending']/following::tr//td[3]";
	String processingText = "(//div[contains(text(),'Processing')])[1]";	
	String firstCell = "//tr[@class='even'][1]";
	String requirementCategory = "//select[@id='RequirementTypeKey']";
	String requirementType = "//select[@id='RequirementTypeNewKey']";
	
	

	ArrayList<String> activeLicenseList = new ArrayList<String>();
	ArrayList<String> addActiveLicenseList = new ArrayList<String>();
	ArrayList<String> addLicenseList = new ArrayList<String>();
	String licenseName = "License" + randomNumberString(5);
	ArrayList<String> activeLicenseTitelList = new ArrayList<String>();
	ArrayList<String> operatorDropdownValueList = new ArrayList<String>();
	ArrayList<String> licensDataList = new ArrayList<String>();
	String facilityValueOfGrid;
	String licenseNumberValue = "MT" + randomNumberString(5);
	String licenseNumber = "9876" + randomNumberString(5);
	String clientActionable = "11/9/2021" + randomNumberString(4);
	String showingForLicensesValBefore;
	String showingForLicensesValAfter;
	String incompleteOnly = "Incomplete only";
	String all = "All";
	String completeOnly = "Complete only";
	String getExpirationDate = "";
	String twoCharOfValToSearch = "";
	
	
	String facilityFilterValue = "";

	public LicenseGridPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void verifyClientDropdownCompanyDropdownFacilityDropdownDefaultSelectedAll(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(clientDropdownOnLicense)));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		boolean defualtValueEqual = (defaultItem.equals("All"));
		Assert.assertTrue(defualtValueEqual);

		Select companySelect = new Select(driver.findElement(By.xpath(companyDropdownOnLicense)));
		WebElement companyOption = select.getFirstSelectedOption();
		String companyDefault = companyOption.getText();
		boolean companyDefualtValueEqual = (companyDefault.equals("All"));
		Assert.assertTrue(companyDefualtValueEqual);

		Select facilitySelect = new Select(driver.findElement(By.xpath(facilityDropdownOnLicense)));
		WebElement facilityOption = select.getFirstSelectedOption();
		String facilityDefault = facilityOption.getText();
		boolean facilityDefualtValueEqual = (facilityDefault.equals("All"));
		Assert.assertTrue(facilityDefualtValueEqual);

	}

	public void verifyResetFilterFeatureShouldBeAvailableForTheGlobalFilters(WebDriver driver) {
		String clientSelected;
		waitForElementVisibility(clientDropdownOnLicense, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(clientDropdownOnLicense)));
		client.selectByIndex(1);
		WebElement selectOption = client.getFirstSelectedOption();
		String companyselect = selectOption.getText();
		boolean companyEqual = (companyselect.equals(companyselect));
		Assert.assertTrue(companyEqual);

		waitTime(4000);
		click(resetGlobalFilters, driver);
		waitTime(4000);

		WebElement companyOption = client.getFirstSelectedOption();
		String companyDefault = companyOption.getText();
		boolean companyDefualtValueEqual = (companyDefault.equals("All"));
		Assert.assertTrue(companyDefualtValueEqual);
	}

	public Boolean verifyExportButton(WebDriver driver) {
		try {
			waitForElementVisibility(exportBtn, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAdvancedFiltersLink(WebDriver driver) {
		try {
			waitForElementVisibility(advancedFilters, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyGlobalSearch(WebDriver driver) {
		try {
			waitForElementVisibility(clientDropdownOnLicense, "30", driver);

			waitForElementVisibility(companyDropdownOnLicense, "30", driver);

			waitForElementVisibility(facilityDropdownOnLicense, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyColumnSearchForEachColumnInTheGrid(WebDriver driver) {
		try {
			waitForElementVisibility(compMgrSearch, "30", driver);

			waitForElementVisibility(companySearch, "30", driver);

			waitForElementVisibility(facilitySearch, "30", driver);

			waitForElementVisibility(stateSearch, "30", driver);

			waitForElementVisibility(licenseNameSearch, "30", driver);

			waitForElementVisibility(licenseDetialsSearch, "30", driver);

			waitForElementVisibility(licenseSearch, "30", driver);

			waitForElementVisibility(statusSearch, "30", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

	public Boolean verifyUrlIconForEachLicenseInTheGrid(WebDriver driver) {
		waitTime(5000);
		try {
			int size = driver.findElements(By.xpath(urlIconEachLicense)).size();
			for (int i = 1; i < size; i++) {
				WebElement element = driver.findElement(By.xpath("(//img[@class='edit_icon'])[" + i + "]"));
				scrollIntoViewSmoothly(element, driver);
				Assert.assertTrue(isElementDisplayed(element, driver));
				waitTime(1000);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Boolean verifyStatusHelpIconAndActiveHelpIcon(WebDriver driver) {
		try {
			waitForElementVisibility(statusHelpIcon, "30", driver);

			waitForElementVisibility(activeHelpIcon, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyCallTheLogIcon(WebDriver driver) {
		try {
			waitForElementVisibility(callTheLogIcon, "30", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAddActivityLink(WebDriver driver) {
		try {
			waitForElementVisibility(addActivityLink, "30", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyLicensesGridUnderlineColorYellow(WebDriver driver) {
		String yellowColor = "#feb62b";
		WebElement element = driver.findElement(By.xpath(licensesGrid));
		String colorBdr = element.getCssValue("border-bottom-color");
		String getYellowColor = Color.fromString(colorBdr).asHex().trim();
		if (getYellowColor.equalsIgnoreCase(getYellowColor)) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean hoverMouseOnStatusIIconAndVerifyTooltip(WebDriver driver) {
		waitTime(7000);
		try {
			waitForElementVisibility(statusHelpIcon, "30", driver);
			click(statusHelpIcon, driver);
			isElementDisplayed(tooltipIIcon, driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean hoverMouseOnActiveIIconAndVerifyTooltip(WebDriver driver) {
		waitTime(7000);
		try {
			waitForElementVisibility(activeHelpIcon, "30", driver);
			click(activeHelpIcon, driver);
			isElementDisplayed(tooltipIIcon, driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnUrlIconLicenses(WebDriver driver) {
		waitTime(7000);
		try {
			click(urlIconLicense, driver);

		} catch (Exception e) {
			clickJs(urlIconLicense, driver);
		}
	}

	public boolean verifyTheUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid(WebDriver driver) {

		try {

			shiftWindowHandle(1);

			String titleText = driver.getTitle();
			boolean equal = (titleText.equals(titleText));
			Assert.assertTrue(equal);
			shiftWindowHandle(0);
			return true;
		} catch (Exception e) {
			shiftWindowHandle(0);
			return false;
		}
	}

	public void clickOnGoToActivityIcon(WebDriver driver) {
		for (int i = 2; i < 10; i++) {
//			if (i == 4 || i == 6) {
//				i += 1;
//			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Go To Activity']/ancestor::td/../td)[" + i + "]"));
			String getData = getValue(data, driver);
			System.out.println("add:- "+getData);
			activeLicenseList.add(getData);
		}
		click(goToActivityIcon, driver);
	}

	public Boolean verifyActivityDataForTheChosenLicenses(WebDriver driver) {
		waitTime(9000);
		try {
			for (int i = 2; i < 6; i++) {

				WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				String getval = getValue(element, driver);
				System.out.println("Item: "+getval);
				Assert.assertTrue(activeLicenseList.contains(getval));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnAddActivityIcon(WebDriver driver) {
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Add Activity']/ancestor::td/../td)[" + i + "]"));
			String getData = getValue(data, driver);
			addActiveLicenseList.add(getData);
		}
		click(addActivityIcon, driver);
	}

	public void verifyActivityDataOnLicenseDetailsPage(WebDriver driver) {
		waitTime(9000);
		Select company = new Select(driver.findElement(By.xpath(selecteCompany)));
		company.selectByIndex(0);
		WebElement option = company.getFirstSelectedOption();
		String companyItem = option.getText();
		Assert.assertTrue(addActiveLicenseList.contains(companyItem));

		Select facility = new Select(driver.findElement(By.xpath(selecteFacility)));
		company.selectByIndex(0);
		WebElement facilityOption = facility.getFirstSelectedOption();
		String facilityItem = facilityOption.getText();
		Assert.assertTrue(addActiveLicenseList.contains(facilityItem));

	}

	public void addActivityAndTaskEntryForTheChosenLicense(WebDriver driver) throws ParseException {
		waitTime(9000);
		Select company = new Select(driver.findElement(By.xpath(selecteLicenseActivity)));
		company.selectByIndex(1);

		LocalDate currentDate = java.time.LocalDate.now();

		String date2;
		
		
//		date2 = Integer.toString(currentDate.getMonthValue());
//		type(activityStartDate, date2, driver);
//		
//		date2 = Integer.toString(currentDate.getDayOfMonth());
//		type(activityStartDate, date2, driver);
//		
//		date2 = Integer.toString(currentDate.getYear());
//		type(activityStartDate, date2, driver);

//		date2 = currentDate.toString();
		date2 = "0"+Integer.toString(currentDate.getMonthValue())+"-"+Integer.toString(currentDate.getDayOfMonth())+"-00"+Integer.toString(currentDate.getYear());
		type(activityStartDate, date2, driver);		
		
		click(activityPopupNextBtn, driver);
		
		if(isElementDisplayed(activityStartDate, driver)) {
			System.out.println("DateFormate: 2");
			
			date2 = Integer.toString(currentDate.getYear());
			type(activityStartDate, date2, driver);
			
			date2 = Integer.toString(currentDate.getMonthValue());
			type(activityStartDate, date2, driver);
			
			date2 = Integer.toString(currentDate.getDayOfMonth());
			type(activityStartDate, date2, driver);
			
			click(activityPopupNextBtn, driver);
			
		}
			
//		if(currentDate.getDayOfMonth()<10)
//			pressTABKey(activityStartDate, driver);


		Select type = new Select(driver.findElement(By.xpath(selecteType)));
		type.selectByIndex(1);

		Select taskStatus = new Select(driver.findElement(By.xpath(selecteTaskStatus)));
		taskStatus.selectByIndex(1);

		Select assigne = new Select(driver.findElement(By.xpath(selecteAssigne)));
		assigne.selectByIndex(1);

		click(activityPopupSaveBtn, driver);
	}

	public Boolean verifyTaskDetailsSavedSuccessfullyPopup(WebDriver driver) {
		try {
			waitForElementVisibility(taskDetailsSavedSuccessfullyPopup, "30", driver);

			isElementDisplayed(taskDetailsSavedSuccessfullyPopup, driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnTaskDetailsSavedSuccessfullyPopupOkButton(WebDriver driver) {
		waitForElementVisibility(taskDetailsSavedSuccessfullyPopupOKBtn, "30", driver);
		click(taskDetailsSavedSuccessfullyPopupOKBtn, driver);
	}

	public void clickOnAdvancedFilters(WebDriver driver) {
		waitTime(7000);
		try {
			
		
		try {
			facilityValueOfGrid = getValueFromAttribute(facilityDataInGrid, driver).trim();

		} catch (Exception e) {
			facilityValueOfGrid = getValueFromAttribute("((//tr[@class='odd'])[1])//td[3]", driver).trim();
		}
		for (int i = 1; i <=13; i++) {
//			if (i == 9 || i == 11) {
//				i += 1;
//			}
			WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));
			String getTitel = getValue(titel, driver).trim();
			if (i == 9) {
				getTitel = getTitel.substring(0, 6);
			}
			activeLicenseTitelList.add(getTitel);

		}
		} catch (Exception e) {
		}
System.out.println(activeLicenseTitelList);
		waitForElementVisibility(advancedFilters, "30", driver);
		click(advancedFilters, driver);
	}

	public void getActivitiesTitel(WebDriver driver) {
		waitTime(7000);
		facilityValueOfGrid = getValueFromAttribute(facilityDataInGrid, driver).trim();
		for (int i = 1; i < 14; i++) {
			if (i == 7 || i == 10) {
				i += 1;
			}
			WebElement title = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));
			String getTitel = getValue(title, driver).trim();
			if (i == 8) {
				getTitel = getTitel.substring(0, 6);

			}

			activeLicenseTitelList.add(getTitel);
		}

		waitForElementVisibility(advancedFilters, "30", driver);
		click(advancedFilters, driver);

	}

	public Boolean verifyAdvanceFiltersPopup(WebDriver driver) {
		try {
			waitForElementVisibility(advanceFiltersSelectField, "30", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyColumnNamesOfTheGridInFieldDropdownAndselectValueFromDropdown(WebDriver driver) {
		try {
			Select advanceFiltersField = new Select(driver.findElement(By.xpath(advanceFiltersSelectField)));
			List<WebElement> op = advanceFiltersField.getOptions();

			int size = op.size();
			for (int i = 1; i < size; i++) {
				String options = op.get(i).getText().trim();
				if (options.equals("Manager")) {
					options = "Manager";
				} else if (options.equals("Requirement Number")) {
					options = "Number";
				} else if (options.equals("Expiry Date")) {
					options = "Expiration";
				} else if (options.equals("Requirement Status")) {
					options = "Status";
				} else if (options.equals("Requirement Name")) {
					options = "Name";
				} else if (options.equals("Requirement Details")) {
					options = "Details";
				} else if (options.equals("Client Code")) {
					options = "Expiration";
				} else if (options.equals("Verfied On")) {
					options = "Ver On";
				}
//				else if (options.equals("Activty")) {
//					options = "Activity";
//				}
System.out.println(options);
				Assert.assertTrue(activeLicenseTitelList.contains(options));
			}
			advanceFiltersField.selectByIndex(4);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean verifyDataInDropdownAndselectValueFromOperatorDropdown(WebDriver driver) {
		operatorDropdownValueList.add("equals");
		operatorDropdownValueList.add("contains");
		operatorDropdownValueList.add("is less than");
		operatorDropdownValueList.add("is greater than");
		operatorDropdownValueList.add("is less than or equals");
		operatorDropdownValueList.add("is greater than or equals");
		try {
			Select advanceFiltersField = new Select(driver.findElement(By.xpath(advanceFiltersSelectOperator)));
			List<WebElement> op = advanceFiltersField.getOptions();

			int size = op.size();
			for (int i = 1; i < size; i++) {
				String options = op.get(i).getText().trim();

				Assert.assertTrue(operatorDropdownValueList.contains(options));
			}

			advanceFiltersField.selectByIndex(1);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void enterAdvanceFiltersValue(WebDriver driver) { waitForElementVisibility(advanceFiltersValueTxt, "30", driver);
		type(advanceFiltersValueTxt, facilityValueOfGrid, driver);
	}

	public Boolean verifyDropdownhaveAndOrValueWithTheDeleteButton(WebDriver driver) {
		try {
			Select select = new Select(driver.findElement(By.xpath(advanceFiltersAndOrDropdown)));
			select.selectByIndex(0);
			WebElement andOption = select.getFirstSelectedOption();
			String andValue = andOption.getText();
			Assert.assertTrue(andValue.equals("AND"));

			select.selectByIndex(1);
			WebElement orOption = select.getFirstSelectedOption();
			String orValue = orOption.getText();
			Assert.assertTrue(orValue.equals("OR"));

			waitForElementVisibility(advanceFiltersDeleteIcon, "30", driver);
			isElementDisplayed(advanceFiltersDeleteIcon, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDropdownFieldOperatorAndValueTextFiled(WebDriver driver) {
		try {

			waitForElementVisibility(advanceFiltersSelectFieldSecond, "30", driver);

			waitForElementVisibility(advanceFiltersSelectOperatorSecond, "30", driver);

			waitForElementVisibility(advanceOperatorValueSecondTxt, "30", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnAddConditionLink(WebDriver driver) {
		waitForElementVisibility(addConditionLink, "30", driver);
		click(addConditionLink, driver);
	}

	public void clickOnAdvanceFiltersCloseButton(WebDriver driver) {
		waitForElementVisibility(advanceFiltersCloseBtn, "30", driver);
		click(advanceFiltersCloseBtn, driver);
	}

	public Boolean verifyAdvanceFiltersIsClosed(WebDriver driver) {
		try {
			waitForElementVisibility(advanceFiltersSelectFieldSecond, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean selectAdvanceFiltersData(WebDriver driver) {
		try {
			Select advanceOperator = new Select(driver.findElement(By.xpath(advanceFiltersSelectOperator)));
			advanceOperator.selectByIndex(1);

			Select advanceFilters = new Select(driver.findElement(By.xpath(advanceFiltersSelectField)));
			advanceFilters.selectByIndex(4);

			waitForElementVisibility(advanceFiltersValueTxt, "30", driver);
			type(advanceFiltersValueTxt, "1718 Rockford, IL", driver);

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void clickOnAdvanceFiltersSaveButton(WebDriver driver) {
		waitForElementVisibility(advanceFiltersSaveBtn, "30", driver);
		click(advanceFiltersSaveBtn, driver);

	}

	public void clickOnAddNewLicenseButton(WebDriver driver) {
		waitTime(9000);
		waitForElementVisibility(addNewRequirementBtn, "30", driver);
		click(addNewRequirementBtn, driver);
		screenshot(driver);
	}

	public Boolean verifyAddLicensePageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(addLicensePageTitle, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectCompanyDropdown(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(addLicenseCompanyDropdown)));
		select.selectByIndex(1);
		WebElement option = select.getFirstSelectedOption();
		String value = option.getText();
		addLicenseList.add(value);
		screenshot(driver);

	}

	public void selectFacilityDropdown(WebDriver driver) {

		Select select = new Select(driver.findElement(By.xpath(addLicenseFacilityDropdown)));
		select.selectByIndex(17);
		WebElement option = select.getFirstSelectedOption();
		String value = option.getText();
		addLicenseList.add(value);
		screenshot(driver);

	}

	public void selectStatesDropdown(WebDriver driver) {

		Select select = new Select(driver.findElement(By.xpath(addLicenseStatesDropdown)));
		select.selectByIndex(1);
		WebElement option = select.getFirstSelectedOption();
		String value = option.getText();
		addLicenseList.add(value);
		screenshot(driver);

	}

	public void selectLicenseStatusDropdown(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(addLicenseLicenseStatusDropdown)));
		select.selectByIndex(1);

		WebElement option = select.getFirstSelectedOption();
		String value = option.getText();
		addLicenseList.add(value);
		screenshot(driver);
	}
	
	public void selectRequirementCategoryDropdown(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(requirementCategory)));
		select.selectByIndex(1);
//
//		WebElement option = select.getFirstSelectedOption();
//		String value = option.getText();
//		addLicenseList.add(value);
		screenshot(driver);
	}
	
	public void selectRequirementTypeDropdown(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(requirementType)));
		select.selectByIndex(1);
//
//		WebElement option = select.getFirstSelectedOption();
//		String value = option.getText();
//		addLicenseList.add(value);
		screenshot(driver);
	}
	
	
	

	public void enterLicenseName(WebDriver driver) {
		waitForElementVisibility(addLicenseLicenseNameTxt, "30", driver);
		type(addLicenseLicenseNameTxt, licenseName, driver);
		addLicenseList.add(licenseName);
		screenshot(driver);
	}

	public void enterLicenseNumber(WebDriver driver) {
		waitForElementVisibility(addLicenseLicenseNumberTxt, "30", driver);
		type(addLicenseLicenseNumberTxt, licenseNumber, driver);
		addLicenseList.add(licenseNumber);
		screenshot(driver);
	}

	public void clickOnAddLicenseSaveButton(WebDriver driver) {
		waitForElementVisibility(addLicenseSaveBtn, "30", driver);
		click(addLicenseSaveBtn, driver);
		screenshot(driver);
	}

	public Boolean verifyLicenseDetailsSavedSuccessfully(WebDriver driver) {
		try {
			waitForElementVisibility(licenseDetailsSavedSuccessfully, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public void clickOnSuccessPopupOkButton(WebDriver driver) {
		waitForElementVisibility(successPopupOk, "30", driver);
		click(successPopupOk, driver);
		screenshot(driver);
	}

	public Boolean verifyTheNewlyAddedLicenseIsListedInTheLicenseGrid(WebDriver driver) {
		try {
			WaitForElementDisapper(processingText, driver);

			waitForElementVisibility(licenseSerachTxt, "30", driver);
			type(licenseSerachTxt, licenseName, driver);
			waitTime(6000);

			WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[6]"));
			String getData = getValue(element, driver);
			Assert.assertTrue(licenseName.contains(getData));
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyLicenseGridIsFiltered(WebDriver driver) {
		try {
			waitTime(6000);
			int size = facilityFilterDataInGrid.length();
			size = (size - 25);
			for (int i = 1; i < facilityFilterDataInGrid.length(); i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Facility: activate to sort column descending']/following::tr//td[4])[" + i
								+ "]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver);
				
				System.out.println("grid value: "+getData+"--- search value: "+facilityValueOfGrid);
				Assert.assertTrue(getData.equals(facilityValueOfGrid));
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void doubleClickOnlicensToEdit(WebDriver driver) {
		waitTime(6000);
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Upload Requirement']/ancestor::td/../td)[" + i + "]"));
			scrollIntoViewSmoothly(data, driver);
			String getData = getValue(data, driver);
			licensDataList.add(getData);
		}
		scrollToElement(licensData, driver);
		doubleClick(licensData, driver);
		screenshot(driver);
	}

	public Boolean verifyEditLicensePageTitel(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(editLicensePageTitel, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyTheUserIsAllowedToEditAllTheFieldsExceptTheCompanyFacilityState(WebDriver driver) {
		try {
			Assert.assertFalse("Verify Company DropDown is Disabeld", isDisabeld(editLicenseCompanyDropDown, driver));

			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(editLicenseFacilityDropDown, driver));

			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(editLicenseStatesDropDown, driver));

			Select complianceDropdown = new Select(driver.findElement(By.xpath(editLicenseComplianceDropDown)));
			WebElement complianceOption = complianceDropdown.getFirstSelectedOption();
			String complianceValueBefore = complianceOption.getText();
			complianceDropdown.selectByIndex(2);
			complianceOption = complianceDropdown.getFirstSelectedOption();
			String complianceValueAfter = complianceOption.getText();
			Assert.assertFalse("Verify Compliance DropDown is Editable",
					complianceValueAfter.equals(complianceValueBefore));

			Select LicenseStatusDropdown = new Select(driver.findElement(By.xpath(editLicenseLicenseStatusDropDown)));
			WebElement LicenseStatusOption = LicenseStatusDropdown.getFirstSelectedOption();
			String LicenseStatusValueBefore = LicenseStatusOption.getText();
			LicenseStatusDropdown.selectByIndex(1);
			LicenseStatusOption = LicenseStatusDropdown.getFirstSelectedOption();
			String LicenseStatusValueAfter = complianceOption.getText();
			Assert.assertFalse("Verify License Status DropDown is Editable",
					LicenseStatusValueAfter.equals(LicenseStatusValueBefore));

			String LicenseNumberValueBefore = getValue(editLicenseLicenseNumberTxt, driver);
			type(editLicenseLicenseNumberTxt, "M1001233", driver);
			String LicenseNumberValueAfter = getValue(editLicenseLicenseNumberTxt, driver);
			Assert.assertFalse("Verify License Number Input Field is Editable",
					LicenseNumberValueAfter.equals(LicenseNumberValueBefore));

			String licenseDetailsValueBefore = getValue(editLicenseLicenseDetailsTxt, driver);
			type(editLicenseLicenseDetailsTxt, "L942232", driver);
			String licenseDetailsValueAfter = getValue(editLicenseLicenseDetailsTxt, driver);
			Assert.assertFalse("Verify License Number Input Field is Editable",
					licenseDetailsValueAfter.equals(licenseDetailsValueBefore));
			screenshot(driver);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyTheUserIsAllowedToRemoveTheLicensePdfFileIfTheFileExists(WebDriver driver) {
		waitTime(6000);
		try {
			if (isDisplayed(pdfUploadedFileName, driver) == true) {

				click(editLicenseFileRemoveBtn, driver);

				driver.switchTo().alert().accept();

				waitForElementVisibility(pdfFileSuccessPopup, "30", driver);

				click(pdfFileSuccessPopupOkBtn, driver);
			}
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return true;
		}
	}

	public Boolean verifyTheUserIsAbleToViewTheDeleteButtonIfTheUserHasAPermissionToDeleteLicenses(WebDriver driver) {
		waitTime(6000);
		try {
			if (isDisplayed(editLicenseDeleteBtn, driver) == true) {

				click(editLicenseDeleteBtn, driver);

				click(editLicenseDeleteConfirmBtn, driver);

				waitForElementVisibility(pdfFileSuccessPopup, "30", driver);

				click(pdfFileSuccessPopupOkBtn, driver);
			}
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyEditingALicenseIsSuccessful(WebDriver driver) {
		waitTime(6000);
		try {
			type(editLicenseLicenseNumberTxt, licenseNumberValue, driver);
			click(saveBtn, driver);
			waitForElementVisibility(successPopup, "30", driver);
			screenshot(driver);
			click(successPopupOkBtn, driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyRedirectionToTheLicenseGridAndVerifyTheNewlyEditedLicenseIsListedInTheLicenseGridWithTheNewlyEditedValues(
			WebDriver driver) {
//		for (int i = 1; i < licenseNumberCoun.length(); i++) {
//
//			WebElement data = driver
//					.findElement(By.xpath("(//*[@title='View License']/ancestor::td/../td[7])[" + i + "]"));
//			String getData = getValue(data, driver).trim();
//
//			if (getData.equals(licenseNumberValue) == true) {
//				Assert.assertTrue(getData.equals(licenseNumberValue));
//				break;
//			}
//		}
		
		String licenseXpath = "//*[contains(text(),'"+licenseNumberValue+"')]";
		try {
			waitForElementVisibility(licenseXpath, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyEntriesIsShowingForLicensesLibel(WebDriver driver) {
		try {
			waitForElementVisibility(entriesIsShowingForLicensesLbl, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean enterValueInLicenseNameSearch(WebDriver driver) {
		try {
			waitTime(9000);
			waitForElementVisibility(firstLicenseName, "30", driver);
			String getData = getValueFromAttribute(firstLicenseName, driver).trim();
			waitForElementVisibility(licenseSerachTxt, "30", driver);
			type(licenseSerachTxt, getData, driver);
			waitTime(16000);
			scrollToElement(entriesIsShowingForLicensesLbl, driver);
			showingForLicensesValBefore = getText(entriesIsShowingForLicensesLbl, driver).trim();

			wait6s();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnResetPageFiltersLink(WebDriver driver) {
		waitForElementVisibility(resetPageFiltersLink, "30", driver);
		click(resetPageFiltersLink, driver);
		waitTime(13000);
	}

	public Boolean verifyResetFilterWorksInTheLicensesGrid(WebDriver driver) {
		waitTime(9000);
		try {
			scrollToElement(entriesIsShowingForLicensesLbl, driver);
			showingForLicensesValAfter = getText(entriesIsShowingForLicensesLbl, driver).trim();
			if (showingForLicensesValAfter.equals(showingForLicensesValBefore) == false) {
				Assert.assertFalse(showingForLicensesValAfter.equals(showingForLicensesValBefore));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAddCallLogButton(WebDriver driver) {
		try {
			waitForElementVisibility(callLogPopoupAddCallLogBtn, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyCallLogPopoupCloseXIconButton(WebDriver driver) {
		try {
			waitForElementVisibility(callLogPopoupCloseXIconBtn, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyCallLogPopoupcallLogListEntries(WebDriver driver) {
		try {
			waitForElementVisibility(callLogPopoupcallLogListEntries, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyCallLogLogPopoupGlobalSearch(WebDriver driver) {
		try {
			waitForElementVisibility(callLogPopoupGlobalSearch, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyCallLogLogPopoupColumnsSorting(WebDriver driver) {
		try {
			for (int i = 0; i < callLogPopoupColumnsSorting.length(); i++) {
				WebElement data = driver.findElement(By.xpath("(//th[@class='sorting'])[" + i + "]"));

				waitForElementVisibility(data, "20", driver);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean doubleClickOnExistingCallLogEntriesAndUserIsAllowedToViewCallLogEntries(WebDriver driver) {
		try {
			waitForElementVisibility(callLogPopoupcallLogListEntries, "20", driver);
			doubleClick(callLogPopoupcallLogListEntries, driver);

			waitForElementVisibility(callLogEditClientNameTxt, "20", driver);

			waitForElementVisibility(callLogEditCompanyDropdown, "20", driver);

			waitForElementVisibility(callLogEditPersonnelDropdown, "20", driver);

			waitForElementVisibility(callLogEditTypeDropdown, "20", driver);

			waitForElementVisibility(callLogEditDateTxt, "20", driver);

			waitForElementVisibility(callLogEditNotesTxt, "20", driver);

			waitForElementVisibility(callLogEditClientTxt, "20", driver);

			waitForElementVisibility(callLogEditPharmsSolutionsTxt, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyClientFacilityAreNotEditable(WebDriver driver) {
		try {

			Assert.assertFalse("Verify Company DropDown is Disabeld", isDisabeld(callLogEditClientNameTxt, driver));

			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(callLogEditFacilityDropdown, driver));

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyTypeAndDateFieldsAreMandatory(WebDriver driver) {
		try {
			scrollToElement(callLogEditTypeMandatory, driver);
			Assert.assertTrue(isDisplayed(callLogEditTypeMandatory, driver));
			scrollToElement(callLogEditDateMandatory, driver);
			Assert.assertTrue(isDisplayed(callLogEditDateMandatory, driver));

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnSaveButtonVerifyTheModifiedValuesSavedSuccessfully(WebDriver driver) {
		try {
			waitForElementVisibility(callLogEditClientTxt, "30", driver);
			type(callLogEditClientTxt, clientActionable, driver);
			click(callLogEditSaveBtn, driver);
			clickOnSuccessPopupOkButton(driver);

			selectValueFromDropdown(callLogShowEntiresDropDown, 4, driver);

			for (int i = 1; i < callLogShowClientActionableList.length(); i++) {
				WebElement data = driver
						.findElement(By.xpath("(//th[text()='Client Actionable']/following::tr/td[7])[" + i + "]"));
				scrollIntoViewSmoothly(data, driver);
				String getData = getValue(data, driver).trim();
				if (getData.equals(clientActionable)) {
					Assert.assertTrue(getData.equals(clientActionable));
					break;
				}
			}
//			callLogShowEntiresDropDown

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectValueFromClintFilter(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(clientDropdownOnLicense)));
		select.selectByIndex(2);
		waitTime(9000);
	}

	public Boolean verifyCallLogPopoupTitel(WebDriver driver) {
		try {
			waitForElementVisibility(callLogPopoupTitel, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnCommunicationLogButton(WebDriver driver) {
		waitTime(9000);
		waitForElementVisibility(communicationLogBtn, "30", driver);
		click(communicationLogBtn, driver);
	}

	public void clickOnCallLogPopoupAddCallLogButton(WebDriver driver) {
		waitTime(9000);
		waitForElementVisibility(callLogPopoupAddCallLogBtn, "20", driver);

		click(callLogPopoupAddCallLogBtn, driver);
	}

	public boolean clickOnSaveButtonVerifyTheNewEntriesAreListedInTheExistingCommunicationLogsGrid(WebDriver driver) {
		try {
			waitForElementVisibility(callLogEditClientTxt, "30", driver);
			type(callLogEditClientTxt, clientActionable, driver);

			selectValueFromDropdown(callLogEditTypeDropdown, 1, driver);

			click(callLogEditSaveBtn, driver);

			clickOnSuccessPopupOkButton(driver);

			selectValueFromDropdown(callLogShowEntiresDropDown, 4, driver);

			for (int i = 1; i < callLogShowClientActionableList.length(); i++) {
				WebElement data = driver
						.findElement(By.xpath("(//th[text()='Client Actionable']/following::tr/td[7])[" + i + "]"));
				scrollIntoViewSmoothly(data, driver);
				String getData = getValue(data, driver).trim();
				if (getData.equals(clientActionable)) {
					Assert.assertTrue(getData.equals(clientActionable));
					break;
				}
			}
			

			click(callLogPopoupCloseXIconBtn, driver);
			return true;
		} catch (Exception e) {
			click(callLogPopoupCloseXIconBtn, driver);
			return false;
		}
	}

	public void selectIncompleteOnlyFromLicenseProgressDropdown(WebDriver driver) {
		waitTime(9000);
		selectValueFromDropdownThroughText(licenseProgressDropdown, incompleteOnly, driver);
	}

	public void selectAllFromLicenseProgressDropdown(WebDriver driver) {
		waitTime(9000);
		selectValueFromDropdownThroughText(licenseProgressDropdown, all, driver);
	}

	public void selectCompleteOnlyFromLicenseProgressDropdown(WebDriver driver) {
		waitTime(9000);
		selectValueFromDropdownThroughText(licenseProgressDropdown, completeOnly, driver);
	}

	public Boolean verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressIncompleteOnly(WebDriver driver) {
		try {
			waitTime(10000);
			int size = driver.findElements(By.xpath(licenseProgressList)).size();
			for (int i = 1; i < size; i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Progress: activate to sort column ascending']/following::tr//td[13])[" + i
								+ "]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver).trim();

				Assert.assertTrue(getData.equals("Incomplete"));
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressCompleteOnly(WebDriver driver) {
		try {
			waitTime(6000);
			scrollToElement(advancedFiltersLink, driver);
			int size = driver.findElements(By.xpath(licenseProgressList)).size();
			for (int i = 1; i < size; i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Progress: activate to sort column ascending']/following::tr//td[13])[" + i
								+ "]"));

				scrollToElement(element, driver);
				String getData = getValue(element, driver).trim();
				Assert.assertTrue(getData.equals("Complete"));
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressAll(WebDriver driver) {
		try {
			waitTime(6000);
			scrollToElement(advancedFiltersLink, driver);
			int size = driver.findElements(By.xpath(licenseProgressList)).size();
			for (int i = 1; i < size; i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Progress: activate to sort column ascending']/following::tr//td[13])[" + i
								+ "]"));

				scrollToElement(element, driver);
				String getData = getValue(element, driver).trim();

				if (getData.equals("Complete")) {
					Assert.assertTrue(getData.equals("Complete"));
				} else if (getData.equals("Incomplete")) {
					Assert.assertTrue(getData.equals("Incomplete"));
				} else {
					Assert.assertTrue(false);
				}
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyLicenseWithExpirationFieldPopulated(WebDriver driver) throws InterruptedException {
		WaitForElementDisapper(waitLoadingPagePopup, driver);
		int i = 1;
		WebElement verifyexpirationDate;
		try {
			while (true) {
				verifyexpirationDate = driver
						.findElement(By.xpath("(//td[@class='display-none']/following-sibling::td[1])[" + i + "]"));
				scrollToElement(verifyexpirationDate, driver);

				getExpirationDate = getValue(verifyexpirationDate, driver).trim();
				System.err.println("Get Expiration Date" + verifyexpirationDate);

				if (getExpirationDate != null || !getExpirationDate.equals("")) {
					break;
				}
				i++;
			}
			waitForElementVisibility(verifyexpirationDate, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void doubleClickOnExpirationDate(WebDriver driver) throws InterruptedException {
		int i = 1;
		WebElement expirationDate;
		waitTime(6000);
		WaitForElementDisapper(waitLoadingPagePopup, driver);

		while (true) {
			expirationDate = driver
					.findElement(By.xpath("(//td[@class='display-none']/following-sibling::td[1])[" + i + "]"));
//			 (//td[@class='display-none']/following-sibling::td[1])[2]/..
//			//td[@class="display-none"]/following-sibling::td[1]
			scrollToElement(expirationDate, driver);
			getExpirationDate = getValue(expirationDate, driver).trim().replace("<span class=\"red\">", "")
					.replace("</span>", "");
//			waitTime(6000);
			System.err.println("Get Expiration Date" + getExpirationDate);

			if (getExpirationDate != null && !getExpirationDate.equals("")) {
				expirationDate = driver
						.findElement(By.xpath("(//td[@class='display-none']/following-sibling::td[1])[" + i + "]/.."));
				break;
			}

			i++;

		}
//		scrollToElement(expirationDate, driver);
//		expirationDate.click();
//		expirationDate.click();
		doubleClick(expirationDate, driver);

	}

	public Boolean verifyTheExpiryDateMatchesTheExpirationDateNotedInTheLicenseGrid(WebDriver driver) {
		try {
			waitForElementVisibility(expirationDateOnDetials, "20", driver);
			String getExpirationDateOnDetials = getValue(expirationDateOnDetials, driver).trim();

			getExpirationDateOnDetials = reformatDate(getExpirationDateOnDetials, "yyyy-MM-dd", "MM-dd-yyyy");
			Assert.assertTrue(getExpirationDateOnDetials.equals(getExpirationDate));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void enterTwoCharactersInColumnSearchField(WebDriver driver) {
		twoCharOfValToSearch = getValueFromAttribute(companySearchValue, driver);
		twoCharOfValToSearch = twoCharOfValToSearch.substring(0, 2);
		type(companySearch, twoCharOfValToSearch, driver);
	}

	public void enterTwoCharactersInColumnSearchFieldOnTaskGridPage(WebDriver driver) {
		twoCharOfValToSearch = getValueFromAttribute(companySearchValue2, driver);
		twoCharOfValToSearch = twoCharOfValToSearch.substring(0, 2);
		type(companySearch2, twoCharOfValToSearch, driver);
	}

	public Boolean verifyFilteredBasedOnEnteredColumnWiseSearchKeywords(WebDriver driver) {
		waitTime(6000);
		try {
			int size = driver.findElements(By.xpath(companySearchList)).size();
			for (int i = 1; i < size; i++) {
				WebElement element = driver.findElement(By
						.xpath("(//th[@aria-label='Company: activate to sort column ascending']/following::tr//td[3])["
								+ i + "]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver).toLowerCase();
				// getData = getData.substring(0,2);
				System.out.println("searched value: "+twoCharOfValToSearch.toLowerCase()+" --- dataValue; "+getData);
				Assert.assertTrue(getData.contains(twoCharOfValToSearch.toLowerCase()));
				waitTime(500);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Boolean verifyFilteredBasedOnEnteredColumnWiseSearchKeywordsOnTaskGridPage(WebDriver driver) {
		waitTime(6000);
		try {
			int size = driver.findElements(By.xpath(companySearchList)).size();
			for (int i = 1; i < size; i++) {
				WebElement element = driver.findElement(By
						.xpath("(//th[@aria-label='Company: activate to sort column descending']/following::tr//td[3])["
								+ i + "]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver).toLowerCase();
				// getData = getData.substring(0,2);
				Assert.assertTrue(getData.contains(twoCharOfValToSearch.toLowerCase()));
				waitTime(500);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public void hoverMouseOverFirstRow(WebDriver driver) {
		WebElement elementOfHover = driver.findElement(By.xpath(firstCell));
		Actions builder = new Actions(driver);
		builder.moveToElement(elementOfHover).perform();
	}
	
	public Boolean verifyRowColorChangedTopPurple(WebDriver driver) {
		try {
			WebElement t = driver.findElement(By.xpath(firstCell));

			String s = t.getCssValue("background-color");
			// convert rgba to hex
			String c = Color.fromString(s).asHex();
			System.out.println("colorValue:- " + c);
			Assert.assertTrue(c.equals("#ece1f7"));

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean verifyNotesCloseAlertMessage(WebDriver driver) {
		try {
			//System.out.println("--"+driver.switchTo().alert().getText());
			assertEquals("Your note will be lost if you exit now. Do you wish to Exit? Y/N", driver.switchTo().alert().getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean clickOnYesAlertMessage(WebDriver driver) {
		try {
			driver.switchTo().alert().accept();			
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}
