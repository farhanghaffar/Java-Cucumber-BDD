package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import Constants.Constants;
import Pages.ChangePasswordPage;
import Pages.LoginPage;
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

public class ChangePasswordSteps extends BaseClass {

	LoginPage loginPage = new LoginPage(driver);
	ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
	public Constants loginconstant;
	@Then("^I click on dropdown change password button$")
	public void clickOnDropdownChangePasswordButton() {
		changePasswordPage.clickOnDropdownChangePasswordButton(driver);
	}

	@And("^I see change password button$")
	public void verifyChangeButton() {
		Assert.assertTrue(changePasswordPage.verifyChangeButton(driver));
	}
	
	@And("^I see enter new password text field$")
	public void verifyEnterNewPasswordTextField() {
		Assert.assertTrue(changePasswordPage.verifyEnterNewPasswordTextField(driver));
	}
	
	@And("^I see enter confirm Password text field$")
	public void verifyEnterConfirmPasswordTextField() {
		Assert.assertTrue(changePasswordPage.verifyEnterConfirmPasswordTextField(driver));
	}
	
	@And("^I see help dropdown$")
	public void verifyHelpDropdown() {
		Assert.assertTrue(changePasswordPage.verifyHelpDropdown(driver));
	}
	
	@And("^I see bell icon$")
	public void verifyBellIcon() {
		Assert.assertTrue(changePasswordPage.verifyBellIcon(driver));
	}
	
	@And("^I see bell Icon unread count$")
	public void verifyBellIconUnreadCount() {
		Assert.assertTrue(changePasswordPage.verifyBellIconUnreadCount(driver));
	}
	
	@And("^I see copyright label$")
	public void verifyCopyrightLabel() {
		Assert.assertTrue(changePasswordPage.verifyCopyrightLabel(driver));
	}
	
	@Then("^I enter values in change password input fields buttons link are clickable$")
	public void enterValuesInChangePasswordInputFieldsbuttonsLinkAreClickable() {
		changePasswordPage.enterValuesInChangePasswordInputFieldsbuttonsLinkAreClickable(driver);
	}
	
	@Then("^I see browser tab name pharma solution atlas$")
	public void browserTabNameShouldDisplayedWithTheTabNamePharmaSolutionAtlas() {
		changePasswordPage.browserTabNameShouldDisplayedWithTheTabNamePharmaSolutionAtlas(driver);
	}
	
	@And("^I see logo on change password page$")
	public void verifyLogoOnChangePasswordPage() {
		Assert.assertTrue(changePasswordPage.verifyLogoOnChangePasswordPage(driver));
	}
	
	@And("^I see change password input fields should have a proper placeholder name$")
	public void changePasswordinputFieldsShouldHaveAProperPlaceHolderName() {
		changePasswordPage.changePasswordinputFieldsShouldHaveAProperPlaceHolderName(driver);
	}
	
	
	
}
