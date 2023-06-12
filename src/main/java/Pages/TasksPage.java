package Pages;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import Utils.BaseClass;
import org.junit.Assert;
import static org.junit.Assert.*;

public class TasksPage extends BaseClass {
	private WebDriver podriver = null;

	String goToTasks = "(//span[@title='Go To Tasks'])[2]";
	String goToTaskLicenseActivitiesBtn = "//img[@id='activity-view-btn']";
	String taskSubpanel = "(//button[@type='submit'])[2] | //button[contains(@class,'editcenter')]";
	String backToTasksBtn = "//img[@data-original-title='Back to Tasks']";
	String addTaskBtn = "(//button[@type='submit'])[last()] | //div[@class='nav-item ']/button";
	String addTaskTitle = "//p[text()[contains(.,'Add Task')]]";
	String dateMandatory = "//input[@id='TaskAuthor']";
	String dateTxt = "//input[@id='CreationDate']";
	String createdByMandatory = "//label[text()='Created By ']/span[@class='red']";
	String creatByTxt = "//input[@id='TaskAuthor']";
	String typeMandatory = "//label[text()='Type ']/span[@class='red']";
	String typeDropDown = "//select[@id='TaskTypeKey']";
	String taskStatusMandatory = "//label[text()='Task Status ']/span[@class='red']";
	String taskStatusDropDown = "//select[@id='TaskStandingKey']";
	String assigneeMandatory = "//label[text()='Assignee ']/span[@class='red']";
	String assigneeDropDown = "//select[@id='AssignedUserKey']";
	String dueDateMandatory = "//label[text()='Due Date ']/span[@class='red']";
	String dueDateDropDown = "//input[@id='ExpCompletionDate']";
	String saveBtn = "//button[@id='task-save']";
	String assigneeValueTaskAdd = "(//p[contains(text(),'Assignee')])[1]/following-sibling::p";
	String dateValueTaskAdd = "(//p[contains(text(),'Due')])[1]/following-sibling::p";
	String clientFilter = "//select[@id='GlobalClientKey']";
	String companyFilter = "//select[@id='GlobalCompanyKey']";
	String facilityFilter = "//select[@id='GlobalFacilityKey']";
	String resetGlobalFilter = "//a[text()='Reset Global Filters']";
	String exportButton = "(//span[text()='Export'])";
	String exportNotesButton = "(//span[text()='Export with Notes'])";
	String incompleteSelect = "(//select[@id='incomplete'])";
	String UserTypeSelect = "(//select[@id='UserType'])";
	String allTaskOption = "//option[text()=' All Tasks']";
	String myTaskOption = "//option[text()=' My Tasks '] | //option[text()=' Tasks Created by me ']";
	String assignedTaskOption = "//option[text()=' Assigned Tasks'] | //option[text()=' Tasks Assigned to me']";
	String advanceFilterIcon = "//a[text()=' Advanced Filters ']";
	String globalSearch = "//input[@type='search']";
	String showEntriesSelect = "//label//select";
	String editTaskTitle = "//p[contains(text(),'Edit Task')]";
	String creatdBy = "//tr[@class='odd']//td[10]";
	String currentUserName = "((//li[contains(@class,'profile-name')])[2]//a)[1]";
	String noDataTxt = "//td[text()='No data available in table']";
	String recordsCounter = "//div[contains(text(),'Showing')]";
	String showEntries = "//select[@name='license_activity-list-main_length']  | //select[@name='tasks-list-main_length']";
	String fieldOptionCompany = "(//option[text()='Company'])[last()]";
	String fieldOptionCompManager = "//option[text()='Compliance Manager'] | //option[text()='Manager']";
	String fieldOptionClientCode = "//option[text()='Client Code']";
	String fieldOptionFacility = "//option[text()='Facility']";
	String fieldOptionLicenseName = "//option[text()='Requirement Name']";
	String fieldOptionLicenseNumber = "//option[text()='Requirement Number']";
	String fieldOptionState = "//option[text()='State']";
	String fieldOptionActivity = "//option[text()='Activity']";
	String fieldOptionTaskStartDate = "//option[text()='Task StartDate']";
	String fieldOptionCreatedBy = "//option[text()='Created By']";
	String fieldOptionTaskType = "//option[text()='Task Type']";
	String fieldOptionTaskStanding = "//option[text()='Task Standing']";
	String fieldOptionTaskDueDate = "//option[text()='Task Due Date']";
	String fieldOptionAssignedTo = "//option[text()='Assigned To']";
	String operatorOptionEquals = "//option[text()='equals']";
	String operatorOptionContains = "//option[text()='contains']";
	String operatorOptionLessThan = "//option[text()='is less than']";
	String operatorOptionGreaterThan = "//option[text()='is greater than']";
	String operatorOptionLessThanEqual = "//option[text()='is less than or equals']";
	String operatorOptionGreaterThanEqual = "//option[text()='is greater than or equals ']";
	String conditionOptoinAnd = "(//option[contains(text(),'AND')])[2]";
	String conditionOptoinOR = "(//option[text()='OR'])[last()]";
	String advanceFilterField = "//select[contains(@id,'field')]";
	String advanceFilterOpterator = "//select[contains(@id,'operator0')]";
	String advanceFilterValue = "//input[contains(@id,'search_value_one0')]";
	String conditionDropDown = "//select[@id='condition1']";
	String advanceFilterField1 = "//select[contains(@id,'field1')]";
	String advanceFilterOpterator1 = "//select[contains(@id,'operator1')]";
	String advanceFilterValu1 = "//input[contains(@id,'search_value_one1')]";
	String addConditionButton = "//a[text()='Add Condition']";
	String conditionDeleteIcon = "//img[contains(@src,'delete')]";
	String advanceFilterCloseButton = "//button[text()='Close']";
	String advanceFilterSaveButton = "//button[text()='Save']";
	String taskDetialsFirstRow = "(//tr[@class='odd']//td)[2]";
	String companyNameEditTask = "//div[@class='modal-content'] //p[contains(text(),'Company')]//following-sibling::p";
	String facilityNameEditTask = "//div[@class='modal-content'] //p[contains(text(),'Facility')]//following-sibling::p";
	String stateNameEditTask = "//div[@class='modal-content'] //p[contains(text(),'State')]//following-sibling::p";
	String LicenseNameEditTask = "//div[@class='modal-content'] //p[contains(text(),'Requirement Name')]//following-sibling::p | //div[@class='modal-content'] //p[contains(text(),'Requirement #')]//following-sibling::p";
	String ActivityEditTask = "//div[@class='modal-content'] //p[contains(text(),'Activity')]//following-sibling::p";
	String progressEditTask = "//div[@class='modal-content'] //p[contains(text(),'Progress')]//following-sibling::p";
	String deleteTaskBtn = "//button[text()='Delete']";
	String taskSection = "//section[@id='task']";
	String addNotesButton = "//button[text()='Add Note']";
	String notesField = "//textarea[@id='TaskNote'] | //textarea[@id='Notes'] | //textarea[@id='ActivityNote']";
	String saveNotesButton = "//button[@id='saveNote']";

	String taskNotesSaveSuccessfully = "//div[text()='Task Note saved successfully.'] | //div[text()='Requirement Note saved Successfully.'] | //div[text()='Activity Note saved successfully.']";

	String showRequirementNotes = "//div[text()='Show Requirement Notes']";
	String showActivityNotes = "//div[text()='Show Activity Notes']";
	String showTaskNotes = "//div[text()='Show Task Notes']";

	String closePopUpIcon = "(//img[contains(@src,'close')])[2]";

	String columnDate = "//th[text()='Date']";
	String columnUserName = "//th[text()='Username']";
	String columnNote = "//th[text()='Username']//following-sibling::th";

	String latestNotes = "(//div[@class='modal-content']//tr[1]//td[3])";
	String latestNotesDate = "//div[@class='modal-content']//tr//td[1]";
	


	String secondLatestNotes = "//div[@class='modal-content']//tr[2]//td[3]";


	String processingText = "(//div[contains(text(),'Processing')])[1]";

	String notesPopup = "//p[contains(text(),'Task Notes')] | //p[contains(text(),'Requirement Notes')]";

	String notesPopUpCloseButton = "(//button[@id='cancelbtn'])";

	String notesPopUpCloseIcon = "//button[@aria-label='Close']//img[contains(@src,'.png')]";
	
	String dateRows = "//div[@class='modal-content']//tr//td[1]";

	
	String editTaskType = "";
	String editTaskStatus = "";
	String editTaskAssignee = "";
	String assigneeValueAfter = "";
	String taskDateSelect = "";
	int pageCounter = 0;
	HashMap<String, String> taskDetails = new HashMap<String, String>();

	String notesTitle = "pharma";
	String notesTitleLong = "wholesalepharmadistributer.wholesalepharmadistributer.wholesalepharmadistributer.wholesalepharmadistributer";

	public TasksPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void clickOnGoToTasksButton(WebDriver driver) {
		waitForElementVisibility(goToTasks, "20", driver);
		click(goToTasks, driver);
		screenshot(driver);
	}

	public void clickOnGoToTaskLicenseActivitiesButton(WebDriver driver) {
		waitForElementVisibility(goToTaskLicenseActivitiesBtn, "20", driver);
		click(goToTaskLicenseActivitiesBtn, driver);
	}

	public void clickOnBackToTasksButton(WebDriver driver) {
		waitForElementVisibility(backToTasksBtn, "20", driver);
		click(backToTasksBtn, driver);
	}

	public void clickOnUserSelect(WebDriver driver) {
		click(UserTypeSelect, driver);
	}

	public void doubleClickOnTask(WebDriver driver) {

		try {
			String str = getText(recordsCounter, driver);
			String[] fArr = str.split("of ", 2);
			String[] sArr = fArr[1].split(" Entries", 2);
			pageCounter = Integer.parseInt(sArr[0].replace(",", ""));
		} catch (Exception e) {
			pageCounter = 0;
		}

		for (int i = 2; i < 15; i++) {
			WebElement data = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
			WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));

			String getData = getValue(data, driver);
			String getTitel = getValue(titel, driver);
			taskDetails.put(getTitel.trim(), getData.trim());
		}
		doubleClick(taskDetialsFirstRow, driver);
		screenshot(driver);
	}

	public Boolean verifyTaskSubpanel(WebDriver driver) {
		try {
			waitForElementVisibility(taskSubpanel, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyAddTaskTitle(WebDriver driver) {
		try {
			waitForElementVisibility(addTaskTitle, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public void clickOnAddTaskButton(WebDriver driver) {
		waitForElementVisibility(addTaskBtn, "20", driver);
		click(addTaskBtn, driver);
		screenshot(driver);
	}

	public void clickOnSaveButton(WebDriver driver) {
		waitForElementVisibility(saveBtn, "20", driver);
		click(saveBtn, driver);
		screenshot(driver);
	}

	public void clickOnUserTypeAllTask(WebDriver driver) {
		click(UserTypeSelect, driver);
		click(allTaskOption, driver);
	}

	public void clickOnUserTypeMyTask(WebDriver driver) {
		click(UserTypeSelect, driver);
		click(myTaskOption, driver);
	}

	public void clickOnUserTypeAssignedTask(WebDriver driver) {
		click(UserTypeSelect, driver);
		click(assignedTaskOption, driver);
	}

	public Boolean verifyAllTaskAreShowing(WebDriver driver) {

		waitTime(5000);
		WebElement item = driver.findElement(By.xpath(creatdBy));

		if (item.getText().isEmpty())
			return false;

		return true;
	}

	public Boolean verifyMyTaskAreShowing(WebDriver driver) {
try {
	String currentUserNameTxt = getText(currentUserName, driver);

	Assert.assertEquals(getValue(creatByTxt, driver),currentUserNameTxt);

	return true;
} catch (Exception e) {
	return false;
}
		
	}

	public Boolean verifyAssignedTaskAreShowing(WebDriver driver) {
		try {
			waitForElementVisibility(noDataTxt, "20", driver);

		} catch (Exception e) {

		}
		return true;
	}

	public Boolean verifyFollowingFieldsAreMandatoryAndNonEditableDateAndCreatedBy(WebDriver driver) {
		try {
			
			waitForElementVisibility(dateMandatory, "20", driver);
			Assert.assertTrue("Verify Facility DropDown is Disabeld", isDisabeldCheckAttribute(dateMandatory, driver));
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyFollowingFieldsAreMandatoryAndEditableTypeTaskStatusAssigneeAndDueDate(WebDriver driver) {
		try {
			waitForElementVisibility(typeMandatory, "20", driver);
			Select typeValDropDown = new Select(driver.findElement(By.xpath(typeDropDown)));
			WebElement typeOption = typeValDropDown.getFirstSelectedOption();
			String typeValueBefore = typeOption.getText();
			typeValDropDown.selectByIndex(2);
			waitTime(3000);
			typeOption = typeValDropDown.getFirstSelectedOption();
			String typeValueAfter = typeOption.getText();
			if (!typeValueAfter.equals(typeValueBefore)) {

				Assert.assertFalse("Verify type DropDown is Editable", typeValueAfter.equals(typeValueBefore));

			} else {
				typeValDropDown.selectByIndex(4);
				typeOption = typeValDropDown.getFirstSelectedOption();
				typeValueAfter = typeOption.getText();
				Assert.assertFalse("Verify type DropDown is Editable", typeValueAfter.equals(typeValueBefore));

			}
			editTaskType = typeValueAfter;

			waitForElementVisibility(taskStatusMandatory, "20", driver);
			Select taskStatusValDropDown = new Select(driver.findElement(By.xpath(taskStatusDropDown)));
			WebElement taskStatusOption = taskStatusValDropDown.getFirstSelectedOption();
			String taskStatusValueBefore = taskStatusOption.getText();
			taskStatusValDropDown.selectByIndex(2);
			waitTime(3000);
			taskStatusOption = taskStatusValDropDown.getFirstSelectedOption();
			String taskStatusValueAfter = taskStatusOption.getText();

			if (!taskStatusValueAfter.equals(taskStatusValueBefore)) {
				Assert.assertFalse("Verify Task Status DropDown is Editable",
						taskStatusValueAfter.equals(taskStatusValueBefore));
			} else {

				taskStatusValDropDown.selectByIndex(4);
				taskStatusOption = taskStatusValDropDown.getFirstSelectedOption();
				taskStatusValueAfter = taskStatusOption.getText();
				Assert.assertFalse("Verify Task Status DropDown is Editable",
						taskStatusValueAfter.equals(taskStatusValueBefore));
			}

			editTaskStatus = taskStatusValueAfter;

			waitForElementVisibility(assigneeMandatory, "20", driver);
			Select assigneeValDropDown = new Select(driver.findElement(By.xpath(assigneeDropDown)));
			WebElement assigneeOption = assigneeValDropDown.getFirstSelectedOption();
			String assigneeValueBefore = assigneeOption.getText();
			assigneeValDropDown.selectByIndex(2);
			waitTime(3000);
			assigneeOption = assigneeValDropDown.getFirstSelectedOption();
			assigneeValueAfter = assigneeOption.getText();

			if (!assigneeValueAfter.equals(assigneeValueBefore)) {
				Assert.assertFalse("Verify type DropDown is Editable", assigneeValueAfter.equals(assigneeValueBefore));

			} else {
				assigneeValDropDown.selectByIndex(4);
				assigneeOption = assigneeValDropDown.getFirstSelectedOption();
				assigneeValueAfter = assigneeOption.getText();
				Assert.assertFalse("Verify type DropDown is Editable", assigneeValueAfter.equals(assigneeValueBefore));

			}

			editTaskAssignee = assigneeValueAfter;

			waitForElementVisibility(dueDateMandatory, "20", driver);

			taskDateSelect = getValue(dueDateDropDown, driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyTheModifiedLicenseActivityIsListedInTheLicenseActivityGrid(WebDriver driver) {
		try {
			waitForElementVisibility(addTaskBtn, "20", driver);
			String assigneeValue = getText(assigneeValueTaskAdd, driver);
			Assert.assertTrue("Verify Value of assign are equal", assigneeValue.equals(assigneeValueAfter));

			String dateValue = getText(dateValueTaskAdd, driver);
			dateValue = reformatDate(dateValue, "MM-dd-yyyy", "yyyy-MM-dd");
			Assert.assertTrue("Verify Value of date are equal", dateValue.equals(taskDateSelect));
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyGlobalClientCompanyFacilityAndResetFilters(WebDriver driver) {
		try {
			waitForElementVisibility(clientFilter, "20", driver);
			waitForElementVisibility(companyFilter, "20", driver);
			waitForElementVisibility(facilityFilter, "20", driver);
			waitForElementVisibility(resetGlobalFilter, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyExportButton(WebDriver driver) {
		try {
			waitForElementVisibility(exportButton, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyExportWithNotes(WebDriver driver) {
		try {
			waitForElementVisibility(exportNotesButton, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAllTaskMyTaskAssignedTaskDropDown(WebDriver driver) {
		waitTime(9000);
		try {
			String client = (new Select(driver.findElement(By.xpath(UserTypeSelect)))).getFirstSelectedOption()
					.getText().trim();

			if (client.equals("All Tasks"))
				return true;

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTaskStandingDropDown(WebDriver driver) {
		waitTime(9000);
		try {
			String client = (new Select(driver.findElement(By.xpath(incompleteSelect)))).getFirstSelectedOption()
					.getText().trim();

			if (client.equals("Incomplete only"))
				return true;

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyShowAllEntriesDropdown(WebDriver driver) {
		waitTime(9000);
		try {
			String client = (new Select(driver.findElement(By.xpath(showEntriesSelect)))).getFirstSelectedOption()
					.getText().trim();

			if (client.equals("All"))
				return true;

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAdvanceFilterIcon(WebDriver driver) {
		try {
			waitForElementVisibility(advanceFilterIcon, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyGlobalSearch(WebDriver driver) {
		try {
			waitForElementVisibility(globalSearch, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyEditTaskTitle(WebDriver driver) {
		try {
			waitForElementVisibility(editTaskTitle, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyColumnSearch(WebDriver driver) {
		try {
			for (int i = 1; i <= 13; i++) {
				WebElement element = driver.findElement(By.xpath("//input[@id='myInput" + i + "']"));
				waitForElementVisibility(element, "20", driver);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyColumnWiseSort(WebDriver driver) {
		try {
			for (int i = 2; i <= 13; i++) {
				WebElement element = driver.findElement(By.xpath("//thead//tr[1]//th[" + i + "]"));
				waitForElementVisibility(element, "20", driver);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnAdvanceFilterIcon(WebDriver driver) {
		click(advanceFilterIcon, driver);
	}

	public void clickOnAddConditionIcon(WebDriver driver) {
		click(addConditionButton, driver);
	}

	public Boolean verifyFieldDropDownHaveAllColumnValues(WebDriver driver) {
		try {
			click(advanceFilterField, driver);
			waitForElementVisibility(fieldOptionCompManager, "20", driver);
			waitForElementVisibility(fieldOptionCompany, "20", driver);
			waitForElementVisibility(fieldOptionFacility, "20", driver);
			waitForElementVisibility(fieldOptionLicenseName, "20", driver);
			waitForElementVisibility(fieldOptionLicenseNumber, "20", driver);
			waitForElementVisibility(fieldOptionState, "20", driver);
			waitForElementVisibility(fieldOptionActivity, "20", driver);
			waitForElementVisibility(fieldOptionTaskStartDate, "20", driver);
			waitForElementVisibility(fieldOptionTaskType, "20", driver);
			waitForElementVisibility(fieldOptionTaskDueDate, "20", driver);
			waitForElementVisibility(fieldOptionAssignedTo, "20", driver);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Boolean verifyOperatorDropDownHasFollowingValues(WebDriver driver) {
		try {
			click(advanceFilterOpterator, driver);
			waitForElementVisibility(operatorOptionEquals, "20", driver);
			waitForElementVisibility(operatorOptionContains, "20", driver);
			waitForElementVisibility(operatorOptionLessThan, "20", driver);
			waitForElementVisibility(operatorOptionGreaterThan, "20", driver);
			waitForElementVisibility(operatorOptionLessThanEqual, "20", driver);
			waitForElementVisibility(operatorOptionGreaterThanEqual, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTextBoxAllowedEnterText(WebDriver driver) {
		try {
			type(advanceFilterValue, "pharma", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyUserCanSeeAndOrDropDown(WebDriver driver) {
		try {
			click(conditionDropDown, driver);
			waitForElementVisibility(conditionOptoinAnd, "20", driver);
			waitForElementVisibility(conditionOptoinOR, "20", driver);
			waitForElementVisibility(conditionDeleteIcon, "20", driver);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Boolean verifyUserCanSeeOneOrMoreSetOfField(WebDriver driver) {
		try {
			waitForElementVisibility(advanceFilterField1, "20", driver);
			waitForElementVisibility(advanceFilterOpterator1, "20", driver);
			waitForElementVisibility(advanceFilterValu1, "20", driver);

			click(conditionDeleteIcon, driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyOnClickOfCloseButtonPopShouldClosed(WebDriver driver) {
		try {
			click(advanceFilterCloseButton, driver);
			if (isElementDisplayed(advanceFilterField, driver))
				return false;

			return true;

		} catch (Exception e) {
			return true;
		}
	}

	public Boolean verifyOnClickOfSaveButtonTaskGridIsFiltered(WebDriver driver) {
		try {

			String str = getText(recordsCounter, driver);
			String[] fArr = str.split("of ", 2);
			String[] sArr = fArr[1].split(" Entries", 2);
			int beforeCounter = Integer.parseInt(sArr[0].replace(",", ""));

			click(advanceFilterIcon, driver);

			click(advanceFilterField, driver);
			click(fieldOptionCompany, driver);

			click(advanceFilterOpterator, driver);
			click(operatorOptionContains, driver);

			type(advanceFilterValue, "pharma", driver);

			click(advanceFilterSaveButton, driver);

			WaitForElementDisapper(processingText, driver);

			str = getText(recordsCounter, driver);
			fArr = str.split("of ", 2);
			sArr = fArr[1].split(" Entries", 2);
			int afterCounter = Integer.parseInt(sArr[0].replace(",", ""));

			return beforeCounter > afterCounter;

		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTaskActivityDetailOnEditPopup(WebDriver driver) {
		waitTime(9000);
		try {

			String getval = getText(companyNameEditTask, driver);
			Assert.assertTrue(taskDetails.containsValue(getval.trim()));

			getval = getText(facilityNameEditTask, driver);
			Assert.assertTrue(taskDetails.containsValue(getval.trim()));

			getval = getText(stateNameEditTask, driver);
			Assert.assertTrue(taskDetails.containsValue(getval.trim()));

			getval = getText(LicenseNameEditTask, driver);
			Assert.assertTrue(taskDetails.containsValue(getval.trim()));

			getval = getText(ActivityEditTask, driver);
			Assert.assertTrue(taskDetails.containsValue(getval.trim()));

			getval = getText(progressEditTask, driver).trim();
			if (!taskDetails.containsValue(getval))
				Assert.assertTrue(getval.equals("Incomplete"));
			else
				Assert.assertTrue(taskDetails.containsValue(getval));
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyDeleteTaskButton(WebDriver driver) {
		try {
			waitForElementVisibility(deleteTaskBtn, "20", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyUserRedirectToTaskSubpanel(WebDriver driver) {
		try {
			waitForElementVisibility(taskSection, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTaskEditedSuccessfully(WebDriver driver) {
		waitTime(5000);
		try {

			for (int i = 2; i < 15; i++) {
				WebElement data = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));

				String getData = getValue(data, driver);
				String getTitel = getValue(titel, driver);
				taskDetails.put(getTitel.trim(), getData.trim());

			}
			taskDetails.containsValue(editTaskType);
			taskDetails.containsValue(editTaskStatus);
			taskDetails.containsValue(editTaskAssignee);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public void verifyFieldsInSpreadsheetMatchesOnTheTaskGrid(WebDriver driver) throws IOException {
		int countOfTite = 1;
		int countOfExelSheetTitle = 0;
		String sheetValue = "";
		String dirPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "data" + File.separator + "ExcelFile";
		File dir = new File(dirPath);
		File[] dir_contents = dir.listFiles();
		String fileName = dir_contents[0].getName();
		Object[][] data = getData(fileName, "Sheet1");
		for (countOfTite = 2; countOfTite < 14; countOfTite++) {

			WebElement title = driver.findElement(By.xpath("//tr[@role='row']//th[" + countOfTite + "]"));
			String getTitle = getValue(title, driver).trim();
			sheetValue = data[0][countOfExelSheetTitle].toString().trim();

			if (sheetValue.equals("License Number")) {
				sheetValue = "License #";
			}
			Assert.assertTrue(sheetValue.equals(getTitle));
			countOfExelSheetTitle++;
		}
		// Delete the Excel file from the directory
		File path = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "data" + File.separator + "ExcelFile");
		File[] files = path.listFiles();
		for (File file : files) {
			file.delete();
		}
	}

	public void verifyFieldsInSpreadsheetMatchesOnTheTaskGridNotes(WebDriver driver) throws IOException {
		int countOfTite = 1;
		int countOfExelSheetTitle = 0;
		String sheetValue = "";
		String dirPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "data" + File.separator + "ExcelFile";
		File dir = new File(dirPath);
		File[] dir_contents = dir.listFiles();
		String fileName = dir_contents[0].getName();
		Object[][] data = getData(fileName, "Sheet1");
		for (countOfTite = 2; countOfTite < 14; countOfTite++) {

			WebElement title = driver.findElement(By.xpath("//tr[@role='row']//th[" + countOfTite + "]"));
			String getTitle = getValue(title, driver).trim();

			sheetValue = data[0][countOfExelSheetTitle].toString().trim();

			if (sheetValue.equals("License Number")) {
				sheetValue = "License #";
			}
			Assert.assertTrue(sheetValue.equals(getTitle));
			countOfExelSheetTitle++;
		}

		countOfExelSheetTitle += 2;
		sheetValue = data[0][countOfExelSheetTitle].toString().trim();

		Assert.assertTrue(sheetValue.equals("Task Notes"));

		// Delete the Excel file from the directory
		File path = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "data" + File.separator + "ExcelFile");
		File[] files = path.listFiles();
		for (File file : files) {
			file.delete();
		}
	}

	public void clickOnExportWithNotesButton(WebDriver driver) {
		waitForElementVisibility(exportNotesButton, "30", driver);
		Select selectShowEntries = new Select(driver.findElement(By.xpath(showEntries)));
		selectShowEntries.selectByIndex(1);
		waitTime(6000);
		click(exportNotesButton, driver);
	}

	public void rightClickOnTask(WebDriver driver) {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath(taskDetialsFirstRow));
		actions.contextClick(elementLocator).perform();

	}

	public Boolean verifyCustomeMenuOption(WebDriver driver) {
		try {
			waitForElementVisibility(showActivityNotes, "20", driver);
			waitForElementVisibility(showRequirementNotes, "20", driver);
			waitForElementVisibility(showTaskNotes, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyShowTaskNotesIsActive(WebDriver driver) {
		try {
			waitForElementClickable(showTaskNotes, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyShowRequirementNotesIsActive(WebDriver driver) {
		try {
			waitForElementClickable(showRequirementNotes, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyShowRequirementIsGrayedOut(WebDriver driver) {
		try {
			WebElement t = driver.findElement(By.xpath(showRequirementNotes));

			String s = t.getCssValue("color");
			// convert rgba to hex
			String c = Color.fromString(s).asHex();
			System.out.println("colorValue:- " + c);
			Assert.assertTrue(c.equals("#a6a4a4"));

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyShowTaskActivityNotesIsGrayedOut(WebDriver driver) {
		try {
			WebElement t = driver.findElement(By.xpath(showTaskNotes));

			String s = t.getCssValue("color");
			// convert rgba to hex
			String c = Color.fromString(s).asHex();
			System.out.println("colorValue:- " + c);
			Assert.assertTrue(c.equals("#a6a4a4"));

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTaskNotesPopUp(WebDriver driver) {
		try {
			waitForElementVisibility(notesPopup, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTaskNotesPopUpClose(WebDriver driver) {
		try {
			waitForElementVisibility(notesPopup, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDetailOnTaskNotesPopUp(WebDriver driver) {
		try {
			waitForElementVisibility(companyNameEditTask, "20", driver);
			waitForElementVisibility(facilityNameEditTask, "20", driver);
			waitForElementVisibility(LicenseNameEditTask, "20", driver);
			waitForElementVisibility(progressEditTask, "20", driver);
			waitForElementVisibility(ActivityEditTask, "20", driver);
			waitForElementVisibility(stateNameEditTask, "20", driver);

			waitForElementVisibility(columnDate, "20", driver);
			waitForElementVisibility(columnUserName, "20", driver);
			waitForElementVisibility(columnNote, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDetailOnRequirementNotesPopUp(WebDriver driver) {
		try {
			waitForElementVisibility(companyNameEditTask, "20", driver);
			waitForElementVisibility(facilityNameEditTask, "20", driver);
			waitForElementVisibility(LicenseNameEditTask, "20", driver);
			waitForElementVisibility(stateNameEditTask, "20", driver);

			waitForElementVisibility(columnDate, "20", driver);
			waitForElementVisibility(columnUserName, "20", driver);
			waitForElementVisibility(columnNote, "20", driver);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void clickOnTaskNotes(WebDriver driver) {
		click(showTaskNotes, driver);

	}

	public void clickOnRequirementNotes(WebDriver driver) {
		click(showRequirementNotes, driver);

	}
	
	public void clickOnActivityNotes(WebDriver driver) {
		click(showActivityNotes, driver);

	}

	public void clickOnCloseButton(WebDriver driver) {
		click(closePopUpIcon, driver);

	}

	public void clickOnAddNotesButton(WebDriver driver) {
		click(addNotesButton, driver);

	}

	public void clickOnSaveNotes(WebDriver driver) {
		click(saveNotesButton, driver);

	}

	public void typeNotes() {

		type(notesField, notesTitle, driver);

	}

	public void typeNotesLong() {

		type(notesField, notesTitleLong, driver);

	}

	public Boolean verifyTaskNotesSaveSuccessfully(WebDriver driver) {
		waitTime(3000);
		try {
			waitForElementVisibility(taskNotesSaveSuccessfully, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAddNotesTextField(WebDriver driver) {
		waitTime(3000);
		try {
			waitForElementVisibility(notesField, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyLatestNotesDisplayingAtTop(WebDriver driver) {
		waitTime(3000);
		WebElement p = driver.findElement(By.xpath("(//div[@class='modal-content']//tr[1]//td[3])//p"));//.findElement(By.xpath("//p"));

		try {
			System.out.println("--"+p.getText());
			if(notesTitleLong.equals(p.getText()))
				return true;
			
			assertTrue(notesTitle.equals(p.getText()));
			
			return true;
		} catch (Exception e) {
		
			return false;
		}
	}

	public void clickOnNote(WebDriver driver) {
		click(latestNotes, driver);

	}
	public void doubleClickOnFirstNote(WebDriver driver) {
		doubleClick(latestNotes, driver);

	}
	public void doubleClickOnSecondNote(WebDriver driver) {
		doubleClick(secondLatestNotes, driver);

	}
	public void clickOnNoteClose(WebDriver driver) {
		try {
			click(notesPopUpCloseButton, driver);

		} catch (Exception e) {
			clickJs(notesPopUpCloseButton, driver);
		}

	}
	public void clickOnNoteCloseIcon(WebDriver driver) {
		try {
			click(notesPopUpCloseIcon, driver);

		} catch (Exception e) {
			clickJs(notesPopUpCloseIcon, driver);
		}

	}
	public Boolean verifyNoteColorIntoGold(WebDriver driver) {
		try {
			WebElement t = driver.findElement(By.xpath(latestNotes));

			String s = t.getCssValue("background-color");
			// convert rgba to hex
			String c = Color.fromString(s).asHex();
			System.out.println("colorValue:- " + c);
			Assert.assertTrue(c.equals("#eddca9"));

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean verifySecondNoteColorIntoGold(WebDriver driver) {
		try {
			WebElement t = driver.findElement(By.xpath(secondLatestNotes));

			String s = t.getCssValue("background-color");
			// convert rgba to hex
			String c = Color.fromString(s).asHex();
			System.out.println("colorValue:- " + c);
			Assert.assertFalse(c.equals("#eddca9"));

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean verifyLatestNotesDisplayingAccordingToFormat(WebDriver driver) {
		waitTime(3000);
		try {
			
		    new SimpleDateFormat("MM-dd-yyyy").parse(getText(latestNotesDate, driver));  

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Boolean verifyNotesDisplayingAccordingToDecendingOrder(WebDriver driver) {
		waitTime(3000);
		List<WebElement> rows  = driver.findElements(By.xpath(dateRows));
		if(rows.size()==0)
			return true;
		try {
			Date latestDate = new SimpleDateFormat("MM-dd-yyyy").parse(rows.get(0).getText());
			for(WebElement item : rows) {
				Date  date = new SimpleDateFormat("MM-dd-yyyy").parse(item.getText());
				assertTrue(date.compareTo(latestDate)<=0);
			}
		      

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
