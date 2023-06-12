package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import Constants.Constants;
import Pages.EmailVerificationPage;
import Pages.LoginPage;
import Utils.BaseClass;
import Utils.ReportUtils;
import Utils.SendEmail;
import Utils.ZipUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static org.junit.Assert.*;
import io.qameta.allure.Allure;

import org.apache.commons.compress.archivers.zip.ZipUtil;
import org.apache.commons.io.FileUtils;

public class LoginSteps extends BaseClass {

	LoginPage loginPage = new LoginPage(driver);
	EmailVerificationPage emailVerificationPage = new EmailVerificationPage(driver);

	public Constants loginconstant;

	@Given("^Visit the app url$")
	public void user_is_on_login_page() throws InterruptedException {
		driver = initConfiguration();
		loginPage.navigateToUrl(driver, loginconstant.url);
		System.out.println("Welcome To Login Page");
	}

	@Given("^Visit the app url and login$")
	public void user_is_login_to_app() throws InterruptedException {
		driver = initConfiguration();
		loginPage.navigateToUrl(driver, loginconstant.url);

		waitTime(3000);

		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);

		loginPage.clickOnLoginButton(driver);
		if (emailVerificationPage.verifyNotRecognizedPopOkButton(driver) == true) {
			emailVerificationPage.clickOnNotRecognizedPopOkButton(driver);
			emailVerificationPage.openUrlInNewTab(driver, loginconstant.outlookUrl);
			emailVerificationPage.clickOnSigninButton(driver);
			emailVerificationPage.enterUserNameAndPassword(driver, loginconstant.outlookUsername,
					loginconstant.outlookPassword);
			emailVerificationPage.clickOnInboxFirstEmail(driver);
			driver.close();
			shiftWindowHandle(0);
			emailVerificationPage.enterValidationCode(driver);
			emailVerificationPage.clickOnValidationSubmitButton(driver);
		}

		loginPage.clickOnSessionPopupCancelButton(driver);
	}

	@Then("^Close Browser$")
	public void close_browser() throws InterruptedException {
		CloseBrowser(driver);
	}

	@When("^I see login page title$")
	public void verifyLoginPageTitle() {
		Assert.assertTrue(loginPage.verifyLoginPageTitle(driver));
	}

	@Then("^I see user name text field$")
	public void verifyUserNameTextField() {
		Assert.assertTrue(loginPage.verifyUserNameTextField(driver));
	}

	@Then("^I see password text field$")
	public void verifyPasswordTextField() {
		Assert.assertTrue(loginPage.verifyPasswordTextField(driver));
	}

	@And("^I see login button$")
	public void verifyLoginButton() {
		Assert.assertTrue(loginPage.verifyLoginButton(driver));
	}

	@And("^I see cancel button$")
	public void verifyCancelButton() {
		Assert.assertTrue(loginPage.verifyCancelButton(driver));
	}

	@Then("^I see login assistance link$")
	public void verifyLoginAssistanceLink() {
		Assert.assertTrue(loginPage.verifyLoginAssistanceLink(driver));
	}

	@And("^I enter user name \"([^\"]*)\"$")
	public void enterUserName(String username) {
		loginPage.enterUserName(driver, username);
	}

	@And("^I enter password \"([^\"]*)\"$")
	public void enterPassword(String pass) {
		loginPage.enterPassword(driver, pass);
	}

	@And("^I enter username$")
	public void enterUserName() {
		loginPage.enterUserName(driver);
	}

	@And("^I enter password$")
	public void enterPassword() {
		loginPage.enterPassword(driver);
	}

	@Then("^I click on login button$")
	public void clickOnLoginButton() {
		loginPage.clickOnLoginButton(driver);
		if (emailVerificationPage.verifyNotRecognizedPopOkButton(driver) == true) {
			emailVerificationPage.clickOnNotRecognizedPopOkButton(driver);
			emailVerificationPage.openUrlInNewTab(driver, loginconstant.outlookUrl);
			emailVerificationPage.clickOnSigninButton(driver);
			emailVerificationPage.enterUserNameAndPassword(driver, loginconstant.outlookUsername,
					loginconstant.outlookPassword);
			emailVerificationPage.clickOnInboxFirstEmail(driver);
			driver.close();
			shiftWindowHandle(0);
			emailVerificationPage.enterValidationCode(driver);
			emailVerificationPage.clickOnValidationSubmitButton(driver);
		}
		screenshot(driver);
	}

	@And("^I see atlas main page$")
	public void verifyAtlasMainPage() {
		Assert.assertTrue(loginPage.verifyAtlasMainPage(driver));
	}

	@And("^I see atlas logo$")
	public void verifyAtlasLogo() {
		Assert.assertTrue(loginPage.verifyAtlasMainPage(driver));
	}

	@Then("^I click on profile name drop down$")
	public void clickOnProfileNameDropDown() {
		loginPage.clickOnProfileNameDropDown(driver);
	}

	@Then("^I click on logout option$")
	public void clickOnLogoutOption() {
		loginPage.clickOnLogoutOption(driver);
	}

	@Then("^I click on session popup cancel button$")
	public void clickOnSessionPopupCancelButton() throws InterruptedException {
		loginPage.clickOnSessionPopupCancelButton(driver);
	}

	@Then("^I enter values in input fields and buttons and Link should be clickable$")
	public void enterValuesInInputFieldsbuttonsLinkAreClickable() {
		loginPage.enterValuesInInputFieldsbuttonsLinkAreClickable(driver);
	}

	@Then("^I see logo and background image$")
	public void logoAndBackgroundImageShouldBeVisibleProperly() {
		loginPage.LogoAndBackgroundImageShouldBeVisibleProperly(driver);
	}

	@And("^I see browser tab name should be login$")
	public void browserTabNameShouldDisplayedWithTheTabNameLogin() {
		loginPage.browserTabNameShouldDisplayedWithTheTabNameLogin(driver);
	}

	@And("^I see input fields should have a proper placeholder name$")
	public void inputFieldsShouldHaveAProperPlaceHolderName() {
		loginPage.inputFieldsShouldHaveAProperPlaceHolderName(driver);
	}

	@And("^I see invalid username and password please try again Label$")
	public void verifyinvalidUsernamePasswordPleaseTryAgainLabel() {
		Assert.assertTrue(loginPage.verifyinvalidUsernamePasswordPleaseTryAgainLabel(driver));
	}

	@And("^I see password value displayed dots Or asterisks characters$")
	public void verifyPasswordValuedisplayedDotsOrAsterisksCharacters() {
		Assert.assertTrue(loginPage.verifyPasswordValuedisplayedDotsOrAsterisksCharacters(driver));
	}

	@And("^I see username validation message$")
	public void verifyUsernameValidationMsg() {
		Assert.assertTrue(loginPage.verifyUsernameValidationMsg(driver));
	}

	@And("^I see password validation message$")
	public void verifyPasswordValidationMsg() {
		Assert.assertTrue(loginPage.verifyPasswordValidationMsg(driver));
	}

	@And("^I click on login button without values In both username and password fields$")
	public void clickOnLoginButtonWithoutValuesInUsernameAndPasswordFields() {
		loginPage.clickOnLoginButtonWithoutValuesInUsernameAndPasswordFields(driver);
	}

	@And("^I see profile name dropdown$")
	public void verifyProfileNameDropDown() {
		Assert.assertTrue(loginPage.verifyProfileNameDropDown(driver));
	}

	// hook
	@BeforeAll
	public static void before_all() {
		try {
			FileUtils.deleteDirectory(new File("allure-results"));
			FileUtils.deleteDirectory(new File("allure-report"));
		} catch (IOException e) {

		}
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				String screenShotName = scenario.getName().replaceAll(" ", "_");
				scenario.log("this my failure message : " + screenShotName);
				Allure.addAttachment("Any text",
						new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
//		driver.close();
	}

	@AfterAll
	public static void after_all() {
//		ZipUtils.generateZipFile();
//		waitTime(3000);
//		String Link = ReportUtils.uploadReportToServer();
//		String message = "Report Link : ";
//		SendEmail.SendEmailNow(message,Link);
	}

}
