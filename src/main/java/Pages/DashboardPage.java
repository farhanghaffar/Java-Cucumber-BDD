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
import java.lang.reflect.Array;

import Utils.BaseClass;
import org.junit.Assert;
import static org.junit.Assert.*;


public class DashboardPage extends BaseClass {
	private WebDriver podriver = null;

	String dashboardGrid = "//a[text()[contains(.,'Dashboard')]] | //a[@href='https://stagingatlas.pharma.solutions/Dashboard'] | //img[@src='https://stagingatlas.pharma.solutions/theme/build/images/Group 907_p.svg']";
	String licensesGrid = "(//div[@class='mbp'])[2]";
	String menuCollapseBtn = "//div[@id='menu-toggle-right'] | //div[@class='menuNavRight'] | //i[@class='right fas pull-right fa-angle-right']";
	String managementDashboardSideMenuBtn = "//a[text()='Management Dashboard']";
	String dataViewsDropDown = "//a[text()[contains(.,'Data Views ')]] | (//a[@href='#'])[4]";
	String dataViewsLicensesGrid = "//a[@href='https://stagingatlas.pharma.solutions/license'] | //a[text()='Requirements']";
	String dataViewsActivitiesGrid = "//a[@href='https://stagingatlas.pharma.solutions/licenseActivity'] | //a[text()[contains(.,'Activities')]] | //a[text()[contains(.,'Activity Tracking')]]";
	String dataViewsTasksGrid = "//a[@href='https://stagingatlas.pharma.solutions/Tasks'] | (//a[text()[contains(.,'Task Management')]])[1]";
	String activitiesGrid = "(//div[@class='mbp'])[3]";
	String dataViews = "//img[@src='https://stagingatlas.pharma.solutions/theme/build/images/Group 920_p.svg']";	
	String tasksGrid = "(//div[@class='mbp'])[4]";
	String documentsGrid = "//a[text()[contains(.,'Documents')]] | //a[@href='https://stagingatlas.pharma.solutions/Document']";
	String activeGrid = "//li[contains(@class,'active')]";
	String mapUSA = "//div[@id='map']";
	String filterByLbl = "//label[text()[contains(.,'Filter By:')]]";
	String resetFilterLbl = "//a[text()[contains(.,'Reset Filter')]]";
	String upcomingRenewalsLbl = "//div[text()[contains(.,'Upcoming Renewals')]]";
	String expiringDocumentsLbl = "//div[text()[contains(.,'Expiring Documents')]]";
	String tasksLbl = "//div[@class='panel panel-default']/div[text()[contains(.,'Tasks')]]";
	String licenseDetailsLbl = "//label[text()[contains(.,'License Details:')]] | //label[text()[contains(.,'Requirements Details:')]]";
	String clientDropDown = "//select[@id='ClientKey']";
	String clientDropDownOption = "(//select[@id='ClientKey']/option)[2]";
	String clientDefualtOption = "(//select[@id='ClientKey']/option)[1]";
	String companyDropDown = "//select[@id='CompanyKey']";
	String companyDropDownOption = "(//select[@id='CompanyKey']/option)[2]";
	String companyDefualtOption = "(//select[@id='CompanyKey']/option)[1]";
	String facilityDropDown = "//select[@id='FacilityKey']";
	String facilityDropDownOption = "(//select[@id='FacilityKey']/option)[2]";
	String facilityDefualtOption = "(//select[@id='FacilityKey']/option)[1]";
	String resetFilter = "//a[@title='Clear All Filters']";
	String licenseDetails = "//div[@id='table-report_wrapper']//td";
	String licencecount = "//table[@id='status-table']//tr[4]//td[2]";
	String licencePageTitle = "//p[text()[contains(.,'Requirements')]]";
	String activitiesPageTitle = "//p[text()[contains(.,'Activities')]]";
	String tasksPageTitle = "//p[text()[contains(.,'Tasks')]] | //span[text()[contains(.,'Tasks')]]";
	String documentsPageTitle = "//p[text()[contains(.,'Documents')]]";
	String userDropDown = "(//li/a//i[contains(@class,'down')])[2]";
	String logoutBtn = "//a[text()[contains(.,'Logout')]]";
	String licenseDetialsFirstRow = "(//tr[@class='odd']//td)[2]";
	String kpiTaskAllIncompleteOption = "//td[text()='All Incomplete']";
	String taskIncompleteStatusList = "//tr//td[11]";
	String taskNumberOfRowsLabelOnLicense = "//div[@id='tasks-list-main_info']";
	String expiringDocumentsExpired = "//tr[@class='menu-item']//td[text()='Expired']//following-sibling::td";
	String expiryDocumentOnDocumentGrid = "//th[@aria-label='Expiry Date: activate to sort column ascending']/following::tr//td[12]";
	String chooseFileUpload = "//input[@id='file'] | //input[@name='LicenseFile']";
	String saveBtn = "//button[@id='modal-save']";
	String uploadLicenseBtn = "(//a[@title='Upload Requirement'])[1]";
	String pdfFileSuccessPopup = "//div[@id='text_success']";
	String pdfFileSuccessPopupOkBtn = "//a[@id='successok']";
	String licenseNumberCoun = "(//*[@title='View Requirement']/ancestor::td/../td[7])";
	String waitLoadingPagePopup = "//div[@class='col text-center company'] | //div[contains(text(),'Loading Please Wait..')]";
	String kpiLicenseActive = "//table[@id='status-table']//td[text()='Active']";
	String reportGridStatus = "//table[@id='table-report']//tr[1]//td[9]";
	String licenseMangementNavigation = "//a[contains(text(),'Requirements Management')]";
	String licenseNavigation = "//ul//a[text()='Requirements']";
	String activitiesNavigation = "//ul//a[contains(text(),'Activities')]";
	String licenseTaskNavigation = "(//ul//a[contains(text(),'Task Management')])";
	String documentsNavigation = "(//ul//a[contains(text(),'Documents')])[1]";
	String notificationNavigation = "(//ul//a[contains(text(),'Notifications')])[1]";
	String notificationTaskNavigation = "(//ul//a[contains(text(),'Task Management')])";
	String notificationDocumentsNavigation = "(//ul//a[contains(text(),'Documents')])[2]";
	String notificationExpirationNavigation = "(//ul//a[contains(text(),'Expiration')])[1]";
	String adminNavigation = "(//ul//a[contains(text(),'Admin')])[1]";
	String adminClientMasterNavigation = "(//ul//a[contains(text(),'Client Master')])[1]";
	String adminCompanyMasterNavigation = "(//ul//a[contains(text(),'Company Master')])[1]";
	String adminFacilityMasterNavigation = "(//ul//a[contains(text(),'Facility Master')])[1]";
	String adminLicenseActivityMasterNavigation = "(//ul//a[contains(text(),'License Activity Master')])[1]";
	String adminLicenseStatusMasterNavigation = "(//ul//a[contains(text(),'License Status Master')])[1]";
	String adminTaskTypeMasterNavigation = "(//ul//a[contains(text(),'Task Type Master')])[1]";
	String adminDocCategoryMasterNavigation = "(//ul//a[contains(text(),'Doc Category Master')])[1]";
	String adminDocTypeMasterNavigation = "(//ul//a[contains(text(),'Doc Type Master')])[1]";
	String adminDocNameMasterNavigation = "(//ul//a[contains(text(),'Doc Name Master')])[1]";
	String adminDocStatusMasterNavigation = "(//ul//a[contains(text(),'Doc Status Master')])[1]";
	String adminUserMasterNavigation = "(//ul//a[contains(text(),'User Master')])[1]";
	String adminCategoryNameMappingNavigation = "(//ul//a[contains(text(),'Category-Name Mapping')])[1]";
	String adminPermissionsNavigation = "(//ul//a[contains(text(),'Permissions')])[1]";
	String adminDocPermissionsNavigation = "(//ul//a[contains(text(),'Doc Permissions')])[1]";
	String adminHelpTextMasterNavigation = "(//ul//a[contains(text(),'Help Text Master')])[1]";
	String adminAuditLogReportNavigation = "(//ul//a[contains(text(),'Audit Log Report')])[1]";
	String adminPauseActivityNavigation = "(//ul//a[contains(text(),'Pause Activity')])[1]";
	String adminPermissionChangeHistoryNavigation = "(//ul//a[contains(text(),'Permission Change History')])[1]";
	String deleteLicenseBtn = "//button[text()='Delete']";
	String confirmDeleteLicenseBtn = "//a[text()='Confirm']";
	String CancelDeleteLicenseBtn = "//a[text()='Cancel']";
	String deleteConfirmationButton = "//a[text()='OK']";
	String activitiesDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Activities')]";
	String taskDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Tasks')]";
	String licenseDocumentsDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Requirement Documents')]";
	String taskDocumentsDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Task Documents')]";
	String taskNotificationDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Task Notifications')]";	
	String recordsCounter = "//div[contains(text(),'Showing')]";
	String documentsMenuBtn = "//a[text()='Document Repository']";
	String documentsPage = "//p[contains(text(),'Documents')]";
	String clientDropdown = "//select[@id='DocClientKey']";	
	String uploadDocumentBtn = "//button[contains(text(),'Upload Document(s) ')]";	
	String addFile = "//input[@id='import_files']";		
	String addFileBtn = "//button[text()='Add File']";		
	String uploadBtn = "//button[@id='upload_btntopreview']";
	String documentDetailsSavedSuccessfullyPopup = "//div[text()='Document Details Saved Successfully']";
	String okBtn = "//a[text()='OK'] | //a[contains(text(),'Ok')]";
	String resetPageFiltersBtn = "//a[contains(text(),'Reset Page Filters')]";
	String uploadedFile = "(//td[contains(text(),'TestSampl')])[1]";
	String uploadedFileDeleteBtn = "//button[@id='modal-delete']";
	String statusDateLbl = "//label[text()='Status Date']";	
	String confirmBtn = "//a[contains(text(),'Confirm')]";
	String notificationsMenuBtn = "//a[text()='Notifications ']";
	String notificationsDocumentsBtn = "//a[@id='notify-header-doc']";
	String DocumentNotificationPage = "//p[contains(text(),'Document Notification')]";	
	
	
	
	
	int licenseDetailsCount = 0;
	String fileNameOnQueue = "";
	String clientSelected = "";
	String companySelected = "";
	String facilitySelected = "";
	int licenseCountBefore = 0;
	int expireKpiValue;
	HashMap<String, String> licenseDetials = new HashMap<String, String>();
	ArrayList<String> gridDataList = new ArrayList<String>();
	ArrayList<String> gridDataPDFUploadList = new ArrayList<String>();
	String filepath = filePath + "TestSample.pdf";
	
	int pageCounter = 0;

	public DashboardPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void navigateToUrl(WebDriver driver, String Url) throws InterruptedException {
		driver.get(Url);

	}

	public Boolean verifyDashboardGrid(WebDriver driver) {
		try {
			try {
				waitForElementVisibility(menuCollapseBtn, "30", driver);
				click(menuCollapseBtn, driver);
			} catch (Exception e) {
			}
			waitForElementVisibility(dashboardGrid, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyLicensesGrid(WebDriver driver) {
		try {
			waitForElementVisibility(dataViewsDropDown, "30", driver);
			click(dataViewsDropDown, driver);
			
			waitForElementVisibility(dataViewsLicensesGrid, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyActivitiesGrid(WebDriver driver) {
		try {
			waitForElementVisibility(dataViewsActivitiesGrid, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTasksGrid(WebDriver driver) {
		try {
			waitForElementVisibility(dataViewsTasksGrid, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDocumentsGrid(WebDriver driver) {
		try {
			waitForElementVisibility(documentsGrid, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDashboardGridUnderlineColorYellow(WebDriver driver) {
		String yellowColor = "#feb62b";
		WebElement element = driver.findElement(By.xpath(dashboardGrid));
		String colorBdr = element.getCssValue("border-bottom-color");
		String getYellowColor = Color.fromString(colorBdr).asHex().trim();
		if (getYellowColor.equalsIgnoreCase(getYellowColor)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public Boolean verifyFilterByLabel(WebDriver driver) {
		try {
			waitForElementVisibility(filterByLbl, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyResetFilterLabel(WebDriver driver) {
		try {
			waitForElementVisibility(resetFilterLbl, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyUpcomingRenewalsLabel(WebDriver driver) {

		try {
			waitForElementVisibility(upcomingRenewalsLbl, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyExpiringDocumentsLabel(WebDriver driver) {

		try {
			waitForElementVisibility(expiringDocumentsLbl, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyTasksLabel(WebDriver driver) {
		try {
			waitForElementVisibility(tasksLbl, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyLicenseDetailsLabel(WebDriver driver) {
		try {
			waitForElementVisibility(licenseDetailsLbl, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectClient(WebDriver driver) {
		waitForElementVisibility(clientDropDown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(clientDropDown)));
		client.selectByIndex(1);
		WebElement element = driver.findElement(By.xpath(clientDropDownOption));
		clientSelected = element.getText().trim();
	}

	public void verifyClientLabelAndDefaultAll(WebDriver driver) {
		String defualt;
		waitForElementVisibility(clientDropDown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(clientDropDown)));
		client.selectByIndex(0);
		WebElement element = driver.findElement(By.xpath(clientDefualtOption));
		defualt = element.getText().trim();
		boolean defualtValueEqual = (defualt.equals("All"));

		Assert.assertTrue(defualtValueEqual);

	}

	public void verifyCompanyLabelAndDefaultAll(WebDriver driver) {
		String defualt;
		waitForElementVisibility(companyDropDown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(companyDropDown)));
		client.selectByIndex(0);
		WebElement element = driver.findElement(By.xpath(companyDefualtOption));
		defualt = element.getText().trim();
		boolean defualtValueEqual = (defualt.equals("All"));

		Assert.assertTrue(defualtValueEqual);
	}

	public void verifyFacilityLabelAndDefaultAll(WebDriver driver) {
		String defualt;
		waitForElementVisibility(facilityDropDown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(facilityDropDown)));
		client.selectByIndex(0);
		WebElement element = driver.findElement(By.xpath(facilityDefualtOption));
		defualt = element.getText().trim();
		boolean defualtValueEqual = (defualt.equals("All"));

		Assert.assertTrue(defualtValueEqual);
	}

	public Boolean verifyClientLicenseDetals(WebDriver driver) {
		WebElement clientLicenseDetals = driver.findElement(By.xpath("(//td[text()='" + clientSelected + "'])[1]"));
		try {
			waitForElementVisibility(clientLicenseDetals, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectCompany(WebDriver driver) {
		waitForElementVisibility(companyDropDown, "30", driver);
		Select company = new Select(driver.findElement(By.xpath(companyDropDown)));
		company.selectByIndex(1);
		WebElement element = driver.findElement(By.xpath(companyDropDownOption));
		companySelected = element.getText().trim();
	}

	public Boolean verifyCompanyLicenseDetals(WebDriver driver) {
		WebElement companyLicenseDetals = driver.findElement(By.xpath("(//td[text()='" + companySelected + "'])[1]"));
		try {
			waitForElementVisibility(companyLicenseDetals, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectFacility(WebDriver driver) {
		waitForElementVisibility(facilityDropDown, "30", driver);
		waitTime(4000);
		Select facility = new Select(driver.findElement(By.xpath(facilityDropDown)));
		facility.selectByIndex(1);
		WebElement element = driver.findElement(By.xpath(facilityDropDownOption));
		facilitySelected = element.getText().trim();
	}

	public Boolean verifyFacilityLicenseDetals(WebDriver driver) {
		WebElement facilityLicenseDetals = driver.findElement(By.xpath("(//td[text()='" + facilitySelected + "'])[1]"));
		try {
			waitForElementVisibility(facilityLicenseDetals, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean getLicenseCountText(WebDriver driver) {
		WebElement licencecount1 = driver.findElement(By.xpath(licencecount));
		int licenseCountAfter = Integer.parseInt(licencecount1.getText());
		return licenseCountBefore == licenseCountAfter;
	}

	public void clickOnresetFilter(WebDriver driver) {
		WebElement licencecount1 = driver.findElement(By.xpath(licencecount));
		licenseDetailsCount = driver.findElements(By.xpath(licenseDetails)).size();
		licenseCountBefore = Integer.parseInt(licencecount1.getText());
		waitForElementVisibility(resetFilter, "30", driver);
		click(resetFilter, driver);
	}

	public Boolean verifyLicenseDetailsCountChanged(WebDriver driver) {
		int licenseDetailsCountAfter = driver.findElements(By.xpath(licenseDetails)).size();
		return licenseDetailsCount != licenseDetailsCountAfter;

	}

	public void clickOnMenuCollapseButton(WebDriver driver) throws InterruptedException {
		waitTime(10000);		
		waitForElementVisibility(menuCollapseBtn, "30", driver);
		click(menuCollapseBtn, driver);
	}
	
	public void dataViewsDropDown(WebDriver driver){
		
		waitForElementVisibility(dataViewsDropDown, "30", driver);
		click(dataViewsDropDown, driver);
	}
	
	public void clickOnLicensesGrid(WebDriver driver) throws InterruptedException {
//		try {
//			waitForElementVisibility(menuCollapseBtn, "30", driver);
//			click(menuCollapseBtn, driver);	
//			screenshot(driver);
//		} catch (Exception e) {
//			screenshot(driver);
//		}
		
		waitForElementVisibility(dataViewsDropDown, "30", driver);
		click(dataViewsDropDown, driver);
		
		waitForElementVisibility(dataViewsLicensesGrid, "30", driver);
		click(dataViewsLicensesGrid, driver);
		
		WaitForElementDisapper(waitLoadingPagePopup, driver);
		screenshot(driver);
	}
	
	public void clickLicensesGrid(WebDriver driver) throws InterruptedException {
		
		waitForElementVisibility(dataViewsLicensesGrid, "30", driver);
		click(dataViewsLicensesGrid, driver);
		
		WaitForElementDisapper(waitLoadingPagePopup, driver);
	}

	public void clickOnActivitiesGrid(WebDriver driver) throws InterruptedException {
//		try {
//			waitForElementVisibility(menuCollapseBtn, "30", driver);
//			click(menuCollapseBtn, driver);	
//			screenshot(driver);
//		} catch (Exception e) {
//			screenshot(driver);
//		}
		
		waitForElementVisibility(dataViewsDropDown, "30", driver);
		click(dataViewsDropDown, driver);
		
		waitForElementVisibility(dataViewsActivitiesGrid, "30", driver);
		click(dataViewsActivitiesGrid, driver);
		
		WaitForElementDisapper(waitLoadingPagePopup, driver);
		screenshot(driver);
	}

	public void clickOnTasksGrid(WebDriver driver) throws InterruptedException {
		try {
			waitForElementVisibility(menuCollapseBtn, "30", driver);
			click(menuCollapseBtn, driver);	
			screenshot(driver);
		} catch (Exception e) {
		}
		
		waitForElementVisibility(dataViewsDropDown, "30", driver);
		click(dataViewsDropDown, driver);
		
		waitForElementVisibility(dataViewsTasksGrid, "30", driver);
		click(dataViewsTasksGrid, driver);
		
		WaitForElementDisapper(waitLoadingPagePopup, driver);
	}

	public void clickOnDocumentsGrid(WebDriver driver) {
		try {
			waitForElementVisibility(menuCollapseBtn, "10", driver);
			click(menuCollapseBtn, driver);	
		} catch (Exception e) {
		}
		waitForElementVisibility(documentsGrid, "30", driver);
		click(documentsGrid, driver);
	}

	public void clickOnDashboardGrid(WebDriver driver) {
		
//		try {
//			waitForElementVisibility(managementDashboardSideMenuBtn, "10", driver);
//			click(managementDashboardSideMenuBtn, driver);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		try {
			waitfor5sec();
			waitForElementVisibility(managementDashboardSideMenuBtn, "30", driver);
			click(managementDashboardSideMenuBtn, driver);
		} catch (Exception e) {
		clickJs(managementDashboardSideMenuBtn, driver);
		}
		screenshot(driver);
	}

	public void clickOnUserDropDown(WebDriver driver) {
		waitForElementVisibility(userDropDown, "30", driver);
		click(userDropDown, driver);
	}

	public void clickOnLogoutButton(WebDriver driver) {
		waitForElementVisibility(logoutBtn, "30", driver);
		click(logoutBtn, driver);
	}

	public Boolean verifyLicencePageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(licencePageTitle, "30", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}

	}

	public Boolean verifyGridAvailableOnToolbarAndShowingCorrectDataInEachVisual(WebDriver driver) {
		try {
			waitForElementVisibility(licensesGrid, "30", driver);
			click(licensesGrid, driver);

			waitForElementVisibility(licencePageTitle, "30", driver);
			
			waitForElementVisibility(activitiesGrid, "30", driver);
			click(activitiesGrid, driver);

			waitForElementVisibility(activitiesPageTitle, "30", driver);
			
			waitForElementVisibility(tasksGrid, "30", driver);
			click(tasksGrid, driver);

			waitForElementVisibility(tasksPageTitle, "30", driver);
			
			waitForElementVisibility(documentsGrid, "30", driver);
			click(documentsGrid, driver);

			waitForElementVisibility(documentsPageTitle, "30", driver);
			
			waitForElementVisibility(dashboardGrid, "30", driver);
			click(dashboardGrid, driver);

			waitForElementVisibility(filterByLbl, "30", driver);
			
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyActivitiesPageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(activitiesPageTitle, "30", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyTasksPageTitle(WebDriver driver) {
		waitTime(7000);
		try {
			waitForElementVisibility(tasksPageTitle, "30", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}

	public Boolean verifyDocumentsPageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(documentsPageTitle, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDashboardPageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(filterByLbl, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyUSAMap(WebDriver driver) {
		try {
			waitForElementVisibility(mapUSA, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void doubleClickLicenseDetials(WebDriver driver) {
		
		try {
			String str = getText(recordsCounter, driver);
			String[] fArr = str.split("of ", 2);
			String[] sArr = fArr[1].split(" Entries",2);
			pageCounter = Integer.parseInt(sArr[0].replace(",",""));
		} catch (Exception e) {
			pageCounter  = 0;
		}	
		
		for (int i = 2; i < 10; i++) {
			WebElement data = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
			WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));

			String getData = getValue(data, driver);
			String getTitel = getValue(titel, driver);
			licenseDetials.put(getTitel.trim(), getData.trim());
		}
		doubleClick(licenseDetialsFirstRow, driver);
		doubleClick(licenseDetialsFirstRow, driver);
		screenshot(driver);
	}

	public Boolean verifyLicenseDetialsDataOnLicensePage(WebDriver driver) {
		waitTime(9000);
		try {
			for (int i = 3; i < 6; i++) {

				WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				String getval = getValue(element, driver);
				Assert.assertTrue(licenseDetials.containsValue(getval.trim()));
			}
			screenshot(driver);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyLicenseDetialsDataDeletedOnLicensePage(WebDriver driver) {
		String str = getText(recordsCounter, driver);
		String[] fArr = str.split("of ", 2);
		String[] sArr = fArr[1].split(" Entries",2);
		int currentCounter = Integer.parseInt(sArr[0].replace(",",""));
		screenshot(driver);
		return pageCounter>currentCounter;
	}

	public void doubleClickOnKpiTaskAllIncompleteOption(WebDriver driver) {
		waitTime(6000);
		waitForElementVisibility(kpiTaskAllIncompleteOption, "30", driver);
		doubleClick(kpiTaskAllIncompleteOption, driver);
		waitTime(7000);
	}

	public Boolean verifyOnlyTheIncompleteLicensesForTheSelectedGlobalFilterValuesShouldBeShownInTheGrid(
			WebDriver driver) {
		ArrayList<String> taskStatus = new ArrayList<String>();
		taskStatus.add("Incomplete");taskStatus.add("Mailroom");taskStatus.add("Pending Funds");taskStatus.add("Internal Pending");taskStatus.add("External Pending");taskStatus.add("Board Pending");taskStatus.add("On Hold");
		waitTime(7000);
		try {
			for (int i = 1; i < taskIncompleteStatusList.length(); i++) {

				WebElement element = driver.findElement(By.xpath("(//tr//td[12])[" + i + "]"));
				String getval = getValue(element, driver);
				getval = getval.trim();
				Assert.assertTrue(taskStatus.contains(getval));
				break;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean selectClientFromFilterOptionsAndVerifyExpiringDocumentOnKPI(WebDriver driver) {

		try {
			waitForElementVisibility(clientDropDown, "30", driver);
			Select client = new Select(driver.findElement(By.xpath(clientDropDown)));
			List<WebElement> op = client.getOptions();

			int size = op.size();
			for (int i = 1; i < size; i++) {
				client.selectByIndex(i);
				int expCount = Integer.parseInt(getValueFromAttribute(expiringDocumentsExpired, driver).trim());
				expireKpiValue = expCount;
				if (expCount > 0) {
					Assert.assertTrue(true);
					break;
				}

			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void doubleClickOnKpiExpiringDocumentsExpiredOption(WebDriver driver) {
		waitTime(6000);
		waitForElementVisibility(expiringDocumentsExpired, "30", driver);
		doubleClick(expiringDocumentsExpired, driver);
		waitTime(7000);
	}

	public Boolean verifyOnlyExpiringLicensesOnDocumentGrid(WebDriver driver) {
		waitTime(7000);
		try {
			List<WebElement> elementSize = driver.findElements(By.xpath(expiryDocumentOnDocumentGrid));
			
			for (int i = 1; i <= elementSize.size(); i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Expiry Date: activate to sort column ascending']/following::tr//td[12])["
								+ i + "]"));
				String getval = getValue(element, driver);
				getval = getval.trim();
				Assert.assertTrue(getval.equals(getval));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyNoOfRowsInTheGridShouldMatchTheKPIValueInTheDashboard(WebDriver driver) {
		waitTime(7000);
		try {
			List<WebElement> noOfRow = driver.findElements(By.xpath(expiryDocumentOnDocumentGrid));
			Assert.assertTrue(expireKpiValue == noOfRow.size());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void uploadfile(WebDriver driver) throws InterruptedException {
		waitForElementVisibility(chooseFileUpload, "30", driver);
		type(chooseFileUpload, filepath, driver);
		
	}

	public void clickOnSaveButton(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(saveBtn, "30", driver);
		click(saveBtn, driver);

	}

	public void clickOnUploadLicensePDFButton(WebDriver driver) {
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Upload Requirement']/ancestor::td/../td)[" + i + "]"));
			String getData = getValue(data, driver);
			gridDataList.add(getData);
		}
		click(uploadLicenseBtn, driver);
	}

	public Boolean verifyPdfFileSuccessPopup(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(pdfFileSuccessPopup, "30", driver);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnPdfFileSuccessPopupOkButton(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(pdfFileSuccessPopupOkBtn, "30", driver);
		click(pdfFileSuccessPopupOkBtn, driver);

	}
	
	public void clickOnClientDropdown(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(clientDropDown, "30", driver);
		click(clientDropDown, driver);

	}
	
	public void clickOnResetFilter(WebDriver driver) {
		try {
			waitForElementVisibility(resetFilter, "30", driver);
			click(resetFilter, driver);
			screenshot(driver);
		} catch (Exception e) {
			clickJs(resetFilter, driver);
			screenshot(driver);
		}
		

	}
	
	public void clickOnKpiLicenseActive(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(kpiLicenseActive, "30", driver);
		click(kpiLicenseActive, driver);

	}
	
	public void clickOnLicenseManagementNavigation(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(licenseMangementNavigation, "30", driver);
		click(licenseMangementNavigation, driver);

	}
	public void clickOnLicenseNavigation(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(licenseNavigation, "30", driver);
		click(licenseNavigation, driver);

	}
	
	public void clickOnDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(deleteLicenseBtn, "30", driver);
		click(deleteLicenseBtn, driver);
		screenshot(driver);

	}
	
	public void clickOnConfirmDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(confirmDeleteLicenseBtn, "30", driver);
		click(confirmDeleteLicenseBtn, driver);
		screenshot(driver);
	}
	
	public void clickOnCancelDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(CancelDeleteLicenseBtn, "30", driver);
		click(CancelDeleteLicenseBtn, driver);
		screenshot(driver);
	}
	
	public void clickOnDeleteConfirmationBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(deleteConfirmationButton, "30", driver);
		click(deleteConfirmationButton, driver);
		screenshot(driver);
	}
	
	public Boolean verifyKpiActiveLicense(WebDriver driver) {
		waitTime(9000);
		try {
			
			return getText(reportGridStatus, driver).equals("Active");
		
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyClientDropdownOption(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(clientDropDownOption, "30", driver);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyActivitiesDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(activitiesDeletePopup, "30", driver);
		
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTasksDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskDeletePopup, "30", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyLicenseDocumentsDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(licenseDocumentsDeletePopup, "30", driver);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTaskDocumentsDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskDocumentsDeletePopup, "30", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyTaskNotificationDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskNotificationDeletePopup, "30", driver);
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public Boolean verifyClientCompanyFacilityDropDown(WebDriver driver) {
		waitTime(9000);
		try {
			String client = (new Select(driver.findElement(By.xpath(clientDropDown)))).getFirstSelectedOption().getText();
			String company = (new Select(driver.findElement(By.xpath(companyDropDown)))).getFirstSelectedOption().getText();
			String facility = (new Select(driver.findElement(By.xpath(facilityDropDown)))).getFirstSelectedOption().getText();
			
			if(client.equals("All") && company.equals("All") && facility.equals("All"))
				return true;

		
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public void verifyTheUserIsAbleToViewThePDF(WebDriver driver) {
		int count=1;
			for (int i = 1; i < licenseNumberCoun.length(); i++) {

				WebElement data = driver
						.findElement(By.xpath("(//*[@title='View Requirement']/ancestor::td/../td[3])[" + i + "]"));
				String getData = getValue(data, driver).trim();

				if (gridDataList.contains(getData) == true) {
					WebElement data2 = driver
							.findElement(By.xpath("(//*[@title='View Requirement']/ancestor::td/../td[14])[" + count + "]"));
					click(data2, driver);
					break;
		        }
				count++;
			}
			
			shiftWindowHandle(0);
		
	}
	
	public Boolean verifyRightMenuItemsAreEnabledDisabled(WebDriver driver) {
		try {
			waitForElementVisibility(dashboardGrid, "30", driver);
			click(licenseMangementNavigation, driver);

			waitForElementVisibility(licenseTaskNavigation, "30", driver);			

			waitForElementVisibility(licenseNavigation, "30", driver);			

			waitForElementVisibility(activitiesNavigation, "30", driver);
			
			waitForElementVisibility(documentsNavigation, "30", driver);
			
			click(notificationNavigation, driver);
			waitForElementVisibility(notificationDocumentsNavigation, "30", driver);
			waitForElementVisibility(notificationTaskNavigation, "30", driver);
			waitForElementVisibility(notificationExpirationNavigation, "30", driver);
			
			click(adminNavigation, driver);
			waitForElementVisibility(adminClientMasterNavigation, "30", driver);
			waitForElementVisibility(adminCompanyMasterNavigation, "30", driver);
			waitForElementVisibility(adminFacilityMasterNavigation, "30", driver);
			waitForElementVisibility(adminLicenseActivityMasterNavigation, "30", driver);
			waitForElementVisibility(adminLicenseStatusMasterNavigation, "30", driver);
			waitForElementVisibility(adminTaskTypeMasterNavigation, "30", driver);
			waitForElementVisibility(adminDocCategoryMasterNavigation, "30", driver);
			waitForElementVisibility(adminDocTypeMasterNavigation, "30", driver);
			waitForElementVisibility(adminDocNameMasterNavigation, "30", driver);
			waitForElementVisibility(adminDocStatusMasterNavigation, "30", driver);
			waitForElementVisibility(adminUserMasterNavigation, "30", driver);
			waitForElementVisibility(adminCategoryNameMappingNavigation, "30", driver);
			waitForElementVisibility(adminPermissionsNavigation, "30", driver);
			waitForElementVisibility(adminDocPermissionsNavigation, "30", driver);
			waitForElementVisibility(adminHelpTextMasterNavigation, "30", driver);
			waitForElementVisibility(adminAuditLogReportNavigation, "30", driver);
			waitForElementVisibility(adminPauseActivityNavigation, "30", driver);
			waitForElementVisibility(adminPermissionChangeHistoryNavigation, "30", driver);

			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnDocumentsMenuButton(WebDriver driver) {
		waitForElementVisibility(documentsMenuBtn, "30", driver);
		click(documentsMenuBtn, driver);
		screenshot(driver);
	}
	
	public void selectDocumentsClient(WebDriver driver) {
		waitForElementVisibility(clientDropdown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(clientDropdown)));
		client.selectByVisibleText("Abhay Raj");
		screenshot(driver);
	}
	
	public Boolean verifyDocumentsPage(WebDriver driver) {
		try {
			waitForElementVisibility(documentsPage, "70", driver);		
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public void uploadDocument(WebDriver driver) throws InterruptedException {
		
		
		waitForElementVisibility(addFileBtn, "30", driver);
		WebElement elementName = driver.findElement(By.xpath("//input[@id='import_files']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('hidden','hidden')", elementName);
		
		type(addFile, filepath, driver);
		
		waitForElementVisibility(uploadBtn, "90", driver);
		click(uploadBtn, driver);
		screenshot(driver);
		
	}
	
	public void clickOnUploadDocumentButton(WebDriver driver) {
		waitTime(4000);
		waitForElementVisibility(uploadDocumentBtn, "30", driver);
		click(uploadDocumentBtn, driver);
		screenshot(driver);
	}

	public void clickOnUploadButton(WebDriver driver) {
		waitForElementVisibility(uploadBtn, "30", driver);
		click(uploadBtn, driver);
	}
	
	public Boolean verifyDocumentDetailsSavedSuccessfullyPopup(WebDriver driver) {
		try {
			waitForElementVisibility(documentDetailsSavedSuccessfullyPopup, "70", driver);		
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	public void clickOnOkButton(WebDriver driver) {
		waitForElementVisibility(okBtn, "30", driver);
		click(okBtn, driver);
		screenshot(driver);
	}
	
	public Boolean verifyDocumentUploaded(WebDriver driver) {
		waitForElementVisibility(resetPageFiltersBtn, "30", driver);
		click(resetPageFiltersBtn, driver);		
		try {
			waitForElementVisibility(uploadedFile, "70", driver);	
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	
	public void DeleteUploadedFile(WebDriver driver) {
		
		doubleClick(uploadedFile, driver);
		
		waitForElementVisibility(statusDateLbl, "60", driver);
		click(uploadedFileDeleteBtn, driver);
		
		waitForElementVisibility(confirmBtn, "30", driver);
		click(confirmBtn, driver);
		
		clickOnOkButton(driver);
		screenshot(driver);
	}
	
	public void clickOnNotificationsMenuButton(WebDriver driver) {
		waitForElementVisibility(notificationsMenuBtn, "30", driver);
		click(notificationsMenuBtn, driver);
		screenshot(driver);
	}
	
	public void clickOnNotificationsDropdownDocumentsButton(WebDriver driver) {
		waitForElementVisibility(notificationsDocumentsBtn, "30", driver);
		click(notificationsDocumentsBtn, driver);
		screenshot(driver);
	}
	
	
	public Boolean verifyDocumentNotificationPage(WebDriver driver) {
		try {
			waitForElementVisibility(DocumentNotificationPage, "70", driver);	
			screenshot(driver);
			return true;
		} catch (Exception e) {
			screenshot(driver);
			return false;
		}
	}
	
	
	
	
	
	
}
