package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage {
	private String baseURL = "http://automationpractice.com/";

	@FindBy(xpath = "//li[2]/a")
	private WebElement btnJoin;
	
	public Home(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public Home goToThePage() {
		driver.get(baseURL);
		return this;
	}

	public void regiterJoin() {
		waitVisibility(btnJoin);
		click(btnJoin);
		
	}
}
