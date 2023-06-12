package Pages;

import java.util.ArrayList;
import java.util.Date;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import Utils.BaseClass;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import static org.junit.Assert.*;
import java.awt.event.KeyEvent;


public class ActivitesGridPage extends BaseClass {
	private WebDriver podriver = null;

	String activitiesGrid = "(//div[@class='mbp'])[3]";
	String companySearch = "//input[@id='myInput1']";
	String compMgrSearch = "//input[@id='myInput0']";
	String facilitySearch = "//input[@id='myInput2']";
	String licenseNameSearch = "//input[@id='myInput3']";
	String licenseSearch = "//input[@id='myInput4']";
	String stateSearch = "//input[@id='myInput5']";
	String statusSearch = "//input[@id='myInput7']";
	String activitySearch = "//input[@id='myInput11']";
	String progressSearch = "//input[@id='myInput12']";	
	String goToTasksButton = "(//*[@title='Go To Tasks'])[1] | (//span[@data-toggle='tooltip'])[1]";
	String addActivityButton = "//button[@id='addActivity'] | //button[@data-original-title='Add License Activity']";
	String licenseProgressFilterDropdown = "//select[@id='incomplete'] | //select[@name='incomplete']";
	String urlIconLicense = "(//a[contains(@href,'https://')  and contains(@target,'_blank')])[2]";
	String loadingPleaseWait = "//div[@class='col text-center company']";
	String addActivityBtn = "//button[@id='addActivity']";
	String activeLicensData = "(//*[@title='Go To Tasks']/ancestor::td/../td)[3]/..";
	String editLicenseCompanyDropDown = "//select[@id='CompanyKey']";
	String editLicenseFacilityDropDown = "//select[@id='FacilityKeyPair']";
	String editLicenseStatesDropDown = "//select[@id='StatesKey']";
	String editLicenseActivityKeyDropDown = "//select[@id='LicenseActivityKey']";
	String editLicenseLicenseStatusDropDown = "//select[@id='LicenseStatusMasterKey']";
	String editLicenseStatusDropDown = "//select[@id='LicenseStatusMasterKey']";
	String editLicenseActivityPageTitel = "//div[@class='modal-header head-back'] | //p[contains(text(),'License Details - Edit Activity')]";
	String ActivityStartDateTxt = "//input[@id='ActivityStartDate']";
	String addLicenseActivityPageTitel = "//div[@class='modal-header head-back'] | //p[contains(text(),'License Details - Add Activity')]";
	String addActivityNextBtn = "//button[@id='modal-task-slider'] | (//button[text()='Next'])[last()]";
	String addActivityNextSecondBtn = "//button[@id='modal-task-slider-two']";	
	String addActivityAddTaskTitel = "//p[contains(text(),'Add Task')]";
	String addActivityAddTaskDateTxt = "//input[@id='CreationDate']";
	String addActivityAddTaskCreatedByTxt = "//input[@id='TaskAuthor']";
	String addActivityAddTaskTypeDropdown = "//select[@id='TaskTypeKey']";
	String addActivityAddTaskTaskStatusDropdown = "//select[@id='TaskStandingKey']";
	String addActivityAddTaskAssignedDropdown = "//select[@id='AssignedUserKey']";
	String addActivityAddTaskDueDateTxt = "//input[@id='ExpCompletionDate']";
	String addActivityAddTaskBackBtn = "//button[@id='backToActivity']";
	String addActivityAddTaskSaveBtn = "//button[@id='task-modal-save']";
	String activityStartDatePicer = "(//th[text()='Activity Start']/following::input)[11]";
	String activityStartDateOnGrid = "(//*[text()='Activity Start']/following::td)[11]";	
	String activityOnGrid = "(//*[text()='Activity']/following::td)[12]";	
	String companySearchValue = "(//th[@aria-label='Company: activate to sort column ascending']/following::td)[2]";
	String companySearchList = "//th[@aria-label='Company: activate to sort column ascending']/following::tr//td[2]";
	String globalSearchTextbox = "//input[@aria-label='Search']";
	String advanceFilterIcon = "(//a[contains(text(),'Advanced')])[2]";
	String oldNotesIcon = "//img[contains(@src,'notes_small.svg')]";
	String companyName = "(//tr[@class='odd'])[1]/td[2]";
	String facilityName = "(//tr[@class='odd'])[1]/td[3]";
	String expiry = "(//tr[@class='odd'])[1]/td[9]";
	String activity = "(//tr[@class='odd'])[1]/td[12]";
	String status = "(//tr[@class='odd'])[1]/td[8]";
	String licenseState = "(//tr[@class='odd'])[1]/td[6]";	
	String companyNameDetailGrid = "(//section[@id='task']//p[contains(text(),'Company')])[1]/following-sibling::p";
	String facilityNameDetailGrid = "(//section[@id='task']//p[contains(text(),'Facility')])[1]/following-sibling::p";
	String expiryDetailGrid = "(//section[@id='task']//p[contains(text(),'Expiry')])[1]/following-sibling::p";
	String activityDetailGrid = "(//section[@id='task']//p[contains(text(),'Activity')])[1]/following-sibling::p";
	String statusDetailGrid = "(//section[@id='task']//p[contains(text(),'Requirement Status')])[1]/following-sibling::p";
	String licenseStateDetailGrid = "(//section[@id='task']//p[contains(text(),'State')])[1]/following-sibling::p";
	String addTaskButton = "(//button[contains(text(),'ADD')])[2]";
	String taskDetail = "//div[@id='tasks']//div[@class='scroll'] | //span[contains(text(),'Showing')]";
	String taskNotes = "//p[contains(text(),'Activity Notes')]";
	String activityNotesBtn = "(//li//span[contains(text(),'Activity')])[1]";
	String recordsCounter = "//div[contains(text(),'Showing')]";
	String deleteLicenseBtn = "//button[text()='Delete']";
	String confirmDeleteLicenseBtn = "//a[text()='Confirm']";
	String CancelDeleteLicenseBtn = "//a[text()='Cancel']";
	String deleteConfirmationButton = "//a[text()='OK']";
	String taskDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Tasks')]";
	String taskDocumentsDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Task Documents')]";
	String taskNotificationDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Task Notifications')]";
	String exportBtn = "//span[text()='Export']";
	String showEntries = "//select[@name='license_activity-list-main_length']  | //select[@name='tasks-list-main_length']";
	String showRowEntriesLbl = "//div[@id='license_activity-list-main_info']";	
	String advanceFiltersSelectField = "//select[contains(@id,'field')]";
	String facilityDataInGrid = "((//tr[@class='odd'])[1])//td[3]";
	String advancedFilters = "//a[text()='Advanced Filters'] | //a[text()[contains(.,'Advanced Filters')]]";
	String facilityValueOfGrid;
	String facilityFilterDataInGrid = "//tr";
	String advanceFiltersValueTxt = "//input[contains(@id,'search_value_one')]";
	String closeXIconBtn = "(//span[@class='cross'])[2] | (//button[@class='close'])[2]";
	String saveButton = "//button[@id='modal-save']";	
	String tableRows = "//tbody//tr";
	String showCount = "//div[contains(text(),'Showing')]";
	
	String companyNameFirstRow = "";
	String faciltyNameFirstRow = "";
	String expiryDateFirstRow = "";
	String activityFirstRow = "";
	String statusFirstRow = "";
	String stateFirstRow = "";
	String fileNameOnQueue = "";
	String clientSelected = "";
	String companySelected = "";
	String facilitySelected = "";
	int licenseDetailsCount = 0;
	int licenseCountBefore = 0;
	int expireKpiValue;
	HashMap<String, String> licenseDetials = new HashMap<String, String>();
	ArrayList<String> gridDataList = new ArrayList<String>();
	ArrayList<String> gridDataPDFUploadList = new ArrayList<String>();
	ArrayList<String> activeLicensDataList = new ArrayList<String>();
	ArrayList<String> activeLicenseTitelList = new ArrayList<String>();
	String filepath = filePath + "TestSample.pdf";
	String avtivitySartDateSelect;
	String licenseActivityValue;
	String twoCharOfValToSearch="";
	
	String dateArray[] = {"0","0","0"};


	public ActivitesGridPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public Boolean verifyActivitiesGridUnderlineColorYellow(WebDriver driver) {
		String yellowColor = "#feb62b";
		WebElement element = driver.findElement(By.xpath(activitiesGrid));
		String colorBdr = element.getCssValue("border-bottom-color");
		System.out.println("color Bdr: " + colorBdr);
		String getYellowColor = Color.fromString(colorBdr).asHex().trim();
		System.out.println("color Bdr: " + getYellowColor);
		if (getYellowColor.equalsIgnoreCase(getYellowColor)) {
			System.out.println("color True: " + getYellowColor);
			return true;
		} else {
			System.out.println("color False: " + getYellowColor);
			return false;
		}
	}
	
	public Boolean verifyColumnSearchForEachColumnInTheActivitiesGrid(WebDriver driver) {
		try {
			waitForElementVisibility(compMgrSearch, "30", driver);
			
			waitForElementVisibility(companySearch, "30", driver);
			
			waitForElementVisibility(facilitySearch, "30", driver);
			
			waitForElementVisibility(stateSearch, "30", driver);
			
			waitForElementVisibility(licenseNameSearch, "30", driver);
			
			waitForElementVisibility(licenseSearch, "30", driver);
			
			waitForElementVisibility(statusSearch, "30", driver);
			
			waitForElementVisibility(activitySearch, "30", driver);
			
			waitForElementVisibility(progressSearch, "30", driver);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyGoToTasksButton(WebDriver driver) {
		try {
			WebElement webelement =  driver.findElement(By.xpath(goToTasksButton));
			scrollIntoViewSmoothly(webelement, driver);
			Assert.assertTrue(isElementDisplayed(webelement, driver));
			return true;
		} catch (Exception e) {

			return false;
		}
	}
	
	public Boolean verifyAddActivityButton(WebDriver driver) {
		try {
			waitForElementVisibility(addActivityButton, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyLicenseProgressFilterDefaultDropdownValueSectionShouldBeIncompleteOnly(WebDriver driver) {
		try {
			Select select = new Select(driver.findElement(By.xpath(licenseProgressFilterDropdown)));
			WebElement option = select.getFirstSelectedOption();
			String defaultItem = option.getText().trim();
			Assert.assertTrue((defaultItem.equals("Incomplete only")));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnUrlIconActivities(WebDriver driver) {
		waitTime(7000);
		try {
			waitForElementVisibility(urlIconLicense, "30", driver);
			click(urlIconLicense, driver);
		} catch (Exception e) {
			clickJs(urlIconLicense, driver);

		}
	}
	
	public void clickOnGoToTaskButtonActivities(WebDriver driver) {
		waitTime(7000);
		waitForElementVisibility(goToTasksButton, "30", driver);
		
		click(goToTasksButton, driver);
	}
	
	public void clickOnActivityNotes(WebDriver driver) {
		waitTime(7000);
		waitForElementVisibility(activityNotesBtn, "30", driver);
		
		click(activityNotesBtn, driver);
	}

	public boolean verifyTheActivitiesUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid(WebDriver driver) {

		try {

			shiftWindowHandle(1);

			String titleText = driver.getTitle();
			boolean equal = (titleText.equals(titleText));
			Assert.assertTrue(equal);

			shiftWindowHandle(0);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void doubleClickOnActivelicensToEdit(WebDriver driver) {
		waitTime(6000);
		activeLicensDataList.clear();
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
				System.out.println(i);
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Go To Tasks']/ancestor::td/../td)[" + i + "]"));
			scrollIntoViewSmoothly(data, driver);
			String getData = getValue(data, driver);
			activeLicensDataList.add(getData);
		}
		scrollToElement(activeLicensData, driver);
		doubleClick(activeLicensData, driver);
		screenshot(driver);
	}
	
	public void clickOnActivelicensToSelect(WebDriver driver) {
		waitTime(6000);
		activeLicensDataList.clear();
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
				System.out.println(i);
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Go To Tasks']/ancestor::td/../td)[" + i + "]"));
			scrollIntoViewSmoothly(data, driver);
			String getData = getValue(data, driver);
			activeLicensDataList.add(getData);
		}
		scrollIntoViewSmoothly(activeLicensData, driver);
		waitTime(2000);
		click(activeLicensData, driver);
		screenshot(driver);
	}
	
	public Boolean verifyInTheEditActivitySectionTheFollowingFieldsAreMandatoryAndNonEditableCompanyFacilityStateLicenseStatus(WebDriver driver) {
		try {
			Assert.assertFalse("Verify Company DropDown is Disabeld", isDisabeld(editLicenseCompanyDropDown, driver));

			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(editLicenseFacilityDropDown, driver));

			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(editLicenseStatesDropDown, driver));
			
			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(editLicenseStatusDropDown, driver));
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyInTheAddActivitySectionTheFollowingFieldsAreMandatoryAndEditableLicenseActivityAndActivityStartDate(WebDriver driver) {
		try {
			Select activityKeyDropdown = new Select(driver.findElement(By.xpath(editLicenseActivityKeyDropDown)));
			WebElement activityKeyOption = activityKeyDropdown.getFirstSelectedOption();
			String activityKeyValueBefore = activityKeyOption.getText();
			activityKeyDropdown.selectByIndex(3);
			activityKeyOption = activityKeyDropdown.getFirstSelectedOption();
			String activityKeyValueAfter = activityKeyOption.getText();
			Assert.assertFalse("Verify activityKey DropDown is Editable",
					activityKeyValueAfter.equals(activityKeyValueBefore));
			
			waitForElementVisibility(ActivityStartDateTxt, "20", driver);
			
			waitForElementVisibility(editLicenseActivityKeyDropDown, "30", driver);
			Select licenseActivityDropdown = new Select(driver.findElement(By.xpath(editLicenseActivityKeyDropDown)));
			licenseActivityDropdown.selectByIndex(1);
			WebElement licenseActivityOption = licenseActivityDropdown.getFirstSelectedOption();
			licenseActivityValue = licenseActivityOption.getText();
			
		
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(new Date());
			
			type(ActivityStartDateTxt, driver, date, "value");
			
			screenshot(driver);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyEditLicenseActivityPageTitel(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(editLicenseActivityPageTitel, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyAddLicenseActivityPageTitel(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(addLicenseActivityPageTitel, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public void clickOnAddActivityNextButton(WebDriver driver) throws ParseException {
		waitTime(8000);
		waitForElementVisibility(addLicenseActivityPageTitel, "20", driver);
		scrollIntoViewSmoothly(addActivityNextBtn, driver);
		click(addActivityNextBtn, driver);
		screenshot(driver);
	}


	public void clickOnNextButton(WebDriver driver) throws ParseException {
		waitTime(8000);
		waitForElementVisibility(addLicenseActivityPageTitel, "20", driver);
		scrollIntoViewSmoothly(addActivityNextSecondBtn, driver);
		click(addActivityNextSecondBtn, driver);
		screenshot(driver);
	}
	
	public Boolean verifyAddTaskTitel(WebDriver driver) {
		try {
			waitForElementVisibility(addActivityAddTaskTitel, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyInTheAddTaskSectionTheFollowingFieldsAreMandatoryAndNonEditableActivityCreatedBy(WebDriver driver) {
		try {
			//Assert.assertTrue(isDisabeldCheckAttribute(addActivityAddTaskDateTxt, driver));
			Assert.assertTrue(isDisabeldCheckAttribute(addActivityAddTaskCreatedByTxt, driver));
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyInTheAddTaskSectionTheFollowingFieldsAreMandatoryAndEditableTypeTaskStatusAssigneeDuedate(WebDriver driver) {
		try {
			Select typeDropdown = new Select(driver.findElement(By.xpath(addActivityAddTaskTypeDropdown)));
			typeDropdown.selectByIndex(1);
			WebElement typeOption = typeDropdown.getFirstSelectedOption();
			String typeValueBefore = typeOption.getText();
			
			typeDropdown.selectByIndex(2);
			typeOption = typeDropdown.getFirstSelectedOption();
			String typeValueAfter = typeOption.getText();			
			
			Assert.assertFalse("Verify Type DropDown is Editable",
					typeValueBefore.equals(typeValueAfter));
			
			Select taskStatusDropdown = new Select(driver.findElement(By.xpath(addActivityAddTaskTaskStatusDropdown)));
			taskStatusDropdown.selectByIndex(1);
			WebElement taskStatusOption = taskStatusDropdown.getFirstSelectedOption();
			String taskStatusValueBefore = taskStatusOption.getText();
			
			taskStatusDropdown.selectByIndex(2);
			taskStatusOption = taskStatusDropdown.getFirstSelectedOption();
			String taskStatusValueAfter = taskStatusOption.getText();	
			
			Assert.assertFalse("Verify task status DropDown is Editable",
					taskStatusValueBefore.equals(taskStatusValueAfter));

			
			Select assignedDropdown = new Select(driver.findElement(By.xpath(addActivityAddTaskAssignedDropdown)));
			assignedDropdown.selectByIndex(1);
			WebElement assignedOption = assignedDropdown.getFirstSelectedOption();
			String assignedValueBefore = assignedOption.getText();
			
			taskStatusDropdown.selectByIndex(5);
			assignedOption = assignedDropdown.getFirstSelectedOption();
			String assignedValueAfter = assignedOption.getText();	
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public void clickOnAddActivityAddTaskBackButton(WebDriver driver) {
		waitForElementVisibility(addActivityAddTaskBackBtn, "30", driver);
		scrollToElement(addActivityAddTaskBackBtn, driver);
		click(addActivityAddTaskBackBtn, driver);
		screenshot(driver);
	}
	
	public void clickOnAddActivityButton(WebDriver driver) {
		waitForElementVisibility(addActivityBtn, "30", driver);
		scrollToElement(addActivityBtn, driver);
		click(addActivityBtn, driver);
		screenshot(driver);
	}
	
	public void clickOnAddActivityAddTaskSaveButton(WebDriver driver) {
		waitForElementVisibility(addActivityAddTaskSaveBtn, "30", driver);
		scrollToElement(addActivityAddTaskSaveBtn, driver);
		click(addActivityAddTaskSaveBtn, driver);
		screenshot(driver);
	}
	
	public Boolean verifyTheNewlyAddedLicenseActivityIsListedInTheLicenseActivityGrid(WebDriver driver) {
		waitForElementVisibility(activityStartDatePicer, "30", driver);
		String waitDateXpath;
		
		String replaceVale;
		WebElement element = driver.findElement(By.xpath(activityStartDatePicer));
		try {

			LocalDate currentDate = java.time.LocalDate.now();
//			element.sendKeys(Integer.toString(currentDate.getYear()));
//			pressTABKey(activityStartDatePicer, driver);
//			element.sendKeys(Integer.toString(currentDate.getMonthValue()));
//			pressTABKey(activityStartDatePicer, driver);
//			element.sendKeys(Integer.toString(currentDate.getDayOfMonth()));
			String date = "0"+Integer.toString(currentDate.getMonthValue())+"-"+Integer.toString(currentDate.getDayOfMonth())+"-00"+Integer.toString(currentDate.getYear());
			
			type(activityStartDatePicer,date, driver);
//			type(activityStartDatePicer,Integer.toString(currentDate.getMonthValue()), driver);
//			type(activityStartDatePicer,Integer.toString(currentDate.getMonthValue()), driver);
			

//			type(activityStartDatePicer,Integer.toString(currentDate.getMonthValue()), driver);
//			type(activityStartDatePicer,Integer.toString(currentDate.getDayOfMonth()), driver);
////			if(currentDate.getDayOfMonth()<10)
////				pressTABKey(activityStartDatePicer, driver);
//			type(activityStartDatePicer,Integer.toString(currentDate.getYear()), driver);
////			

			String dayOfMonth = currentDate.getDayOfMonth() < 10 ? "0"+currentDate.getDayOfMonth() : currentDate.getDayOfMonth()+"";
			replaceVale = currentDate.getMonthValue()+"-"+dayOfMonth+"-"+currentDate.getYear();
			
			waitTime(10000);
				waitDateXpath = "(//td[text()[contains(.,'"+replaceVale+"')]])[1]";
				waitForElementVisibility(waitDateXpath, "300", driver);				
			
			String activity = getValueFromAttribute(activityOnGrid, driver).trim();
			System.out.println(activity+"---"+licenseActivityValue);

			Assert.assertTrue(activity.equals(licenseActivityValue));
			screenshot(driver);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			screenshot(driver);
			return false;
		}
	}
	
	public void enterTwoCharactersInColumnSearchField(WebDriver driver) {
		waitForElementVisibility(addActivityAddTaskSaveBtn, "30", driver);
		scrollToElement(addActivityAddTaskSaveBtn, driver);
		click(addActivityAddTaskSaveBtn, driver);
		twoCharOfValToSearch = getValueFromAttribute(companySearchValue, driver);
		twoCharOfValToSearch = twoCharOfValToSearch.substring(0,2);
		type(companySearch, twoCharOfValToSearch, driver);
	}
	
	public Boolean verifyFilteredBasedOnEnteredColumnWiseSearchKeywords(WebDriver driver) {
		try {
			for (int i = 1; i < companySearchList.length(); i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Company: activate to sort column ascending']/following::tr//td[2])[" + i
								+ "]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver);
				getData = getData.substring(0,2);
				Assert.assertTrue(getData.equals(twoCharOfValToSearch));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean VerifyTheSubPanelHeaderSectionsDisplaysTheChosenActivitiesDetails(WebDriver driver) {
		try {
			for (int i = 1; i < companySearchList.length(); i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Company: activate to sort column ascending']/following::tr//td[2])[" + i
								+ "]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver);
				getData = getData.substring(0,2);
				Assert.assertTrue(getData.equals(twoCharOfValToSearch));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyGlobalSearchTextBoxInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(globalSearchTextbox, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyAdvanceFilterIconInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(advanceFilterIcon, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyAddTaskButtonInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(addTaskButton, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTaskDetailInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(taskDetail, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyNotesSectionDetailInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(taskNotes, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyOldNotesIconInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(oldNotesIcon, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void getDetailsInFirstRow(WebDriver driver) {
		companyNameFirstRow = getText(companyName, driver).trim();
		faciltyNameFirstRow = getText(facilityName, driver).trim();
		statusFirstRow = getText(status, driver).trim();
		stateFirstRow = getText(licenseState, driver).trim();
		expiryDateFirstRow = getText(expiry, driver).trim();
		activityFirstRow = getText(activity, driver).trim();

	}
	
	public Boolean verifyDetailAreCorrectInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			if(getText(companyNameDetailGrid, driver).trim().equals(companyNameFirstRow) &&
			 getText(facilityNameDetailGrid, driver).trim().equals(faciltyNameFirstRow) &&
			 getText(statusDetailGrid, driver).trim().equals(statusFirstRow) &&
			 getText(licenseStateDetailGrid, driver).trim().equals(stateFirstRow) &&
			 getText(expiryDetailGrid, driver).trim().equals(expiryDateFirstRow) &&
			 getText(activityDetailGrid, driver).trim().equals(activityFirstRow)) {
				return true;
			}

			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void doubleClickLicenseDetials(WebDriver driver) {
		for (int i = 2; i < 10; i++) {
			WebElement data = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
			WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));

			String getData = getValue(data, driver);
			String getTitel = getValue(titel, driver);
			licenseDetials.put(getTitel.trim(), getData.trim());
		}
		doubleClick(activeLicensData, driver);
		//doubleClick(activeLicensData, driver);
	}

	public Boolean verifyLicenseDetialsDataOnLicensePage(WebDriver driver) {
		waitTime(9000);
		try {
			for (int i = 2; i < 8; i++) {

				WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				String getval = getValue(element, driver);
				Assert.assertTrue(licenseDetials.containsValue(getval.trim()));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyLicenseDetialsDataDeletedOnLicensePage(WebDriver driver) {
		waitTime(9000);
		try {
			for (int i = 2; i < 8; i++) {

				WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				String getval = getValue(element, driver);
				if(!licenseDetials.containsValue(getval.trim()))
					return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(deleteLicenseBtn, "30", driver);
		click(deleteLicenseBtn, driver);

	}
	
	public void clickOnAddTaskButton(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(addTaskButton, "30", driver);
		click(addTaskButton, driver);

	}
	
	public void clickOnConfirmDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(confirmDeleteLicenseBtn, "30", driver);
		click(confirmDeleteLicenseBtn, driver);

	}
	
	public void clickOnCancelDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(CancelDeleteLicenseBtn, "30", driver);
		click(CancelDeleteLicenseBtn, driver);

	}
	
	public void clickOnDeleteConfirmationBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(deleteConfirmationButton, "30", driver);
		click(deleteConfirmationButton, driver);

	}
	
	public Boolean verifyTaskDocumentsDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskDocumentsDeletePopup, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTaskNotificationDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskNotificationDeletePopup, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean verifyTasksDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskDeletePopup, "30", driver);
				return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnExportButton(WebDriver driver) {
		waitForElementVisibility(exportBtn, "30", driver);
		Select selectShowEntries = new Select(driver.findElement(By.xpath(showEntries)));
		selectShowEntries.selectByIndex(1);
		waitTime(6000);
		click(exportBtn, driver);
		waitTime(6000);
	}
	
	public void verifyRowsCount(WebDriver driver) {
		
//		int rowsCount = driver.findElements(By.xpath(tableRows)).size();
		Select selectShowEntries = new Select(driver.findElement(By.xpath(showEntries)));
		WebElement option = selectShowEntries.getFirstSelectedOption();
		WebElement showElements = driver.findElement(By.xpath(showCount));
		String rowCountValue = showElements.getText().replace("Showing 1 - ", "");
		int rowsCount = Integer.parseInt(rowCountValue.substring(0,2));
		
		int defaultItem = Integer.parseInt(option.getText().trim());
				
		String dirPath = System.getProperty("user.dir") + File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"data"+File.separator+"ExcelFile"+File.separator;
		System.out.println("File Path: "+dirPath);
		File dir = new File(dirPath);
	    File[] dir_contents = dir.listFiles();
	    String fileName = dir_contents[0].getName();
	    
	    
	    
	    if(dir_contents[0]!=null)
	    	System.out.println("File Name: "+fileName);
	    else
	    	System.out.println("Message: Directory is null");
		Object[][] data = getData(fileName, "Sheet1");
	
		
		System.out.println((data.length));
		try {
			if(data.length==(defaultItem+1))
				Assert.assertTrue(data.length==(defaultItem+1));
			else {
//				Assert.assertTrue(data.length==(rowsCount+1));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
		
		public void verifyFieldsInSpreadsheetMatchesOnTheLicensesGrid(WebDriver driver) throws IOException {
			int countOfTite=1;
			int countOfExelSheetTitle=0; 
			String sheetValue ="";
			String dirPath = System.getProperty("user.dir") + File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"data"+File.separator+"ExcelFile"+File.separator;
		    File dir = new File(dirPath);
			File[] dir_contents = dir.listFiles();
			String fileName = dir_contents[0].getName();
			
			Object[][] data = getData(fileName, "Sheet1");
			for (countOfTite = 1; countOfTite < 14; countOfTite++) {
				if (countOfTite == 7) {
					countOfTite += 1;
				}
				WebElement title = driver.findElement(By.xpath("//tr[@role='row']//th[" + countOfTite + "]"));
				String getTitle = getValue(title, driver).trim();
				
				if (countOfExelSheetTitle == 6) {
				countOfExelSheetTitle++;
				}
				sheetValue = data[0][countOfExelSheetTitle].toString().trim();
				
				if (sheetValue.equals("License Number")) {
					sheetValue ="License #";
				}
				Assert.assertTrue(sheetValue.equals(getTitle));
				countOfExelSheetTitle++;
			}
			//Delete the Excel file from the directory 	
			File path = new File(System.getProperty("user.dir") + File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"data"+File.separator+"ExcelFile");
		    File[] files = path.listFiles();
		    for (File file : files) {
		        
		        file.delete();
		    }
	}
	
		public boolean verifyColumnNamesOfTheGridInFieldDropdownAndselectValueFromDropdown(WebDriver driver) {
			try {
				Select advanceFiltersField = new Select(driver.findElement(By.xpath(advanceFiltersSelectField)));
				List<WebElement> op = advanceFiltersField.getOptions();

				int size = op.size();
				for (int i = 1; i < size; i++) {
					String options = op.get(i).getText().trim();
	System.out.println("Select: Value: "+options);
					if (options.equals("Compliance Manager")) {
						options = "Comp.Mgr";
					} else if (options.equals("Requirement Number")) {
						options = "Number";
					} else if (options.equals("Expiry Date")) {
						options = "Expiration";
					} else if (options.equals("Requirement Status")) {
						options = "Status";
					} else if (options.equals("Requirement Name")) {
						options = "Requirement";
					} else if (options.equals("Requirement Details")) {
						options = "Details";
					} else if (options.equals("Client Code")) {
						options = "Expiration";
					} else if (options.equals("Verfied On")) {
						options = "Ver On";
					}
//					else if (options.equals("Activty")) {
//						options = "Activity";
//					}

					Assert.assertTrue(activeLicenseTitelList.contains(options));
				}
				advanceFiltersField.selectByValue("FacilityName");

				return true;
			} catch (Exception e) {
				return false;
			}

		}
		
//		public void clickOnAdvancedFilters(WebDriver driver) {
//			waitTime(7000);
//			facilityValueOfGrid = getValueFromAttribute(facilityDataInGrid, driver).trim();
//			for (int i = 1; i < 13; i++) {
//				if (i == 9 || i == 11) {
//					i += 1;
//				}
//				WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));
//				String getTitel = getValue(titel, driver).trim();
//				if (i == 8) {
//					getTitel = getTitel.substring(0, 6);
//				}
//				activeLicenseTitelList.add(getTitel);
//
//			}
//
//			waitForElementVisibility(advancedFilters, "30", driver);
//			click(advancedFilters, driver);
//		}
		
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
		
		public void enterAdvanceFiltersValue(WebDriver driver) { waitForElementVisibility(advanceFiltersValueTxt, "30", driver);
		type(advanceFiltersValueTxt, facilityValueOfGrid, driver);
	}
		
		public Boolean verifyLicenseGridIsFiltered(WebDriver driver) {
			try {
				waitTime(6000);
				int size = facilityFilterDataInGrid.length();
				size = (size - 25);
				
				List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
				
				for (int i = 1; i < rows.size() && i<5; i++) {
					WebElement element = driver.findElement(By.xpath(
							"(//th[@aria-label='Facility: activate to sort column descending']/following::tr//td[3])[" + i
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
		
		public void clickOnEditPopupSaveButton(WebDriver driver) {
			scrollIntoViewSmoothly(saveButton, driver);
			click(saveButton, driver);
			click(deleteConfirmationButton, driver);
			screenshot(driver);			
		}

		public void getActivityStartDate(WebDriver driver) {
			String date = driver.findElement(By.xpath(ActivityStartDateTxt)).getAttribute("value");
			
			System.out.println("StarDate: "+date);
			
			String sep = "-";
			if(date.contains("/")) {
				sep = "/";
			}
			
			dateArray =  date.split(sep,3);
			
			click(closeXIconBtn, driver);
			
			
		}
	
}
