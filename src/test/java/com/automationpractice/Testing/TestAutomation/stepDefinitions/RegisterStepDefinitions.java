package com.automationpractice.Testing.TestAutomation.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.automationpractice.Testing.TestAutomation.pages.Home;

import com.automationpractice.Testing.TestAutomation.pages.RegisterPage;

import com.automationpractice.Testing.TestAutomation.validationPage.RegisterValidate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.automationpractice.Testing.TestAutomation.pages.Home;
import com.automationpractice.Testing.TestAutomation.pages.RegisterPage;

import com.automationpractice.Testing.TestAutomation.validationPage.RegisterValidate;


import utils.PageGenerator;

public class RegisterStepDefinitions {

	protected WebDriver driver = Hook.getDriver();

	@Given("^That Ivan opens the browser with the url of automation$")
	public void thatIOpenedBrowserAtAutomationpracticePage() throws Throwable {

		PageGenerator.getInstance(Home.class, driver).goToThePage();
	}
	
	@When("^I enter credentialAcces '(.*)' and '(.*)'$")
	public void ienterCredential(String email, String pass) throws Throwable {
		
		PageGenerator.getInstance(RegisterPage.class, driver).addCredential(email, pass);
		
	}
	@When("^I select a garment$")
	public void selectionShirt() throws Throwable {
		
		PageGenerator.getInstance(RegisterPage.class, driver).selShirts();
		PageGenerator.getInstance(RegisterPage.class, driver).selShortSleeve();
		
	}
	
	
	@And("^I add products to the cart '(.*)'$")
	public void addToCart(String quantity) throws Throwable {

		PageGenerator.getInstance(RegisterPage.class, driver).addProductCart(quantity);
		
	}
	@And("^I add a comment on the purchase '(.*)'$")
	public void addComment(String comment) throws Throwable {
		PageGenerator.getInstance(RegisterPage.class, driver).proceedCheckout();
		PageGenerator.getInstance(RegisterPage.class, driver).addComent(comment);
		
	}
	
	@And("^I finalize the purchase of a garment$")
	public void finalizePurchaseShirt() throws Throwable {
		PageGenerator.getInstance(RegisterPage.class, driver).finalizePurchase();
		
	}

	@Then("^Validate that the user is login successfully is not '(.*)'$")
	public void inTheShoppingCartShowTheProductIsNotNullWithQuantityNotNull(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(RegisterValidate.class, driver).validateLogin());
	    
	}
	
	@Then("^Validate that the purchase is successfully is not '(.*)'$")
	public void validatePurchaseSuccessfully(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(RegisterValidate.class, driver).validateOrder());
	    
	}
}