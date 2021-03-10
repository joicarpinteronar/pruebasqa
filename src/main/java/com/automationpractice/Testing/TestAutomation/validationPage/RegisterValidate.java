package com.automationpractice.Testing.TestAutomation.validationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.Testing.TestAutomation.pages.BasePage;

public class RegisterValidate extends BasePage {

	@FindBy(xpath = "//span")
	private WebElement loginUser;
	
	@FindBy(xpath = "//p/strong")
	private WebElement orderComplete;
	
	
	public RegisterValidate(WebDriver driver) {
		super(driver);
	}

	public String validateLogin() {
		return exists(loginUser);
	}
	
	public String validateOrder() {
		return exists(orderComplete);
	}

}
