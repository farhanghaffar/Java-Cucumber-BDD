package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Constants.Constants;
import java.io.File;
import java.io.IOException;
import Utils.BaseClass;
import Utils.Waits;

import org.junit.Assert;
import static org.junit.Assert.*;

public class EmailVerificationPage extends BaseClass {
	private WebDriver podriver = null;

	String emailTxt = "//input[@name='loginfmt'] | //input[@type='email']";
	String submitBtn = "//input[@type='submit'] | //input[@data-report-value='Submit']";
	String passwordTxt = "//input[@name='passwd'] | //input[@type='password']";
	String signinBtn = "(//a[@data-task='signin'])[1]";
	String inboxFirstEmail = "(//span[text()='ATLAS Support at Pharma Solutions'])[1]";
	String otpCode = "//p/b";
	String notRecognizedPopOkBtn = "//a[@id='modal-danger-ok']";
	String enterValidationCodeTxt = "//input[@id='verificationCode'] | //input[@placeholder='Enter Validation Code']";
	String validationSubmitBtn = "//button[@id='verificationcode__submit']";
	String useADifferentAccountOption = "//a[text()='Use a different account']";
	String pickAnAccount = "(//div[@class='table-row'])[1]";
	String getOtpCode = "";

	public EmailVerificationPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void navigateToUrl(WebDriver driver, String Url) throws InterruptedException {
		driver.get(Url);
	}

	public static void openUrlInNewTab(WebDriver driver, String url) {
		JavascriptExecutor esp = (JavascriptExecutor) driver;
		esp.executeScript("window.open()");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.get(url);
	}

	public void enterUserNameAndPassword(WebDriver driver, String username, String password) {
		waitForElementVisibility(emailTxt, "30", driver);
		type(emailTxt, username, driver);

		click(submitBtn, driver);

		waitForElementVisibility(passwordTxt, "30", driver);
		type(passwordTxt, password, driver);

		click(submitBtn, driver);
		try {
			waitForElementVisibility(useADifferentAccountOption, "30", driver);
			click(useADifferentAccountOption, driver);
			Waits.wait5s();
			click(pickAnAccount, driver);
			click(useADifferentAccountOption, driver);
			try {
				Waits.wait5s();
				click(pickAnAccount, driver);
				click(useADifferentAccountOption, driver);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			waitForElementVisibility(submitBtn, "30", driver);
			click(submitBtn, driver);
		}
	}

	public void clickOnInboxFirstEmail(WebDriver driver) {
		waitForElementVisibility(inboxFirstEmail, "30", driver);
		click(inboxFirstEmail, driver);

		waitForElementVisibility(otpCode, "30", driver);
		getOtpCode = getText(otpCode, driver);
	}

	public void enterValidationCode(WebDriver driver) {
		waitForElementVisibility(enterValidationCodeTxt, "30", driver);
		type(enterValidationCodeTxt, getOtpCode, driver);
	}

	public void clickOnValidationSubmitButton(WebDriver driver) {
		waitForElementVisibility(validationSubmitBtn, "30", driver);
		click(validationSubmitBtn, driver);
	}

	public Boolean verifyNotRecognizedPopOkButton(WebDriver driver) {
		try {
			waitForElementVisibility(notRecognizedPopOkBtn, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnNotRecognizedPopOkButton(WebDriver driver) {
		click(notRecognizedPopOkBtn, driver);
	}

	public void clickOnSigninButton(WebDriver driver) {
		waitForElementVisibility(signinBtn, "30", driver);
		click(signinBtn, driver);
	}

}
