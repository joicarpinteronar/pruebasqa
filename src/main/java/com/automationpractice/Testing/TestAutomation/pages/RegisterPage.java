package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.StaticWait;

public class RegisterPage extends BasePage {

	@FindBy(xpath = "//a[contains(.,'Sign in')]")
	private WebElement btnSingIn;
	@FindBy(id = "email")
	private WebElement txtEmail;
	@FindBy(id = "passwd")
	private WebElement txtPassword;
	@FindBy(xpath = "//button[@id='SubmitLogin']/span")
	private WebElement btnLogin;
	
	@FindBy(xpath = "(//a[contains(text(),'T-shirts')])[2]")
	private WebElement btnShirts;
	@FindBy(xpath = "//div[@id='center_column']/ul/li/div/div/div/a/img")
	private WebElement selShort;
	@FindBy(id = "quantity_wanted")
	private WebElement txtQuantity;
	@FindBy(id = "color_14")
	private WebElement selColor;
	@FindBy(xpath = "//span[contains(.,'Add to cart')]")
	private WebElement btnAddCart;
	
	@FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
	private WebElement btnProceedChek;
	@FindBy(xpath = "//div[3]/div/p[2]/a/span")
	private WebElement btnProceedChek2;
	
	@FindBy(name = "message")
	private WebElement txtComentario;
	@FindBy(xpath = "//p/button/span")
	private WebElement btnProceedChek3;
	@FindBy(id = "uniform-cgv")
	private WebElement chkTerminos;
	@FindBy(xpath = "//p/button/span")
	private WebElement btnProceedChek4;
	@FindBy(xpath = "//div[@id='HOOK_PAYMENT']/div/div/p/a")
	private WebElement btnMedioPago;
	@FindBy(xpath = "//span[contains(.,'I confirm my order')]")
	private WebElement btnConfirmarOrden;
	

	public RegisterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void addCredential(String email, String password) {
		waitVisibility(btnSingIn);
		click(btnSingIn);
		StaticWait.WaitForSeconds(2);
		waitVisibility(txtEmail);
		writeText(txtEmail,  email);
		waitVisibility(txtPassword);
		writeText(txtPassword, password);
		
		waitVisibility(btnLogin);
		click(btnLogin);
		StaticWait.WaitForSeconds(2);
		
		
	}
	public void selShirts() {
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnShirts);
		click(btnShirts);
		StaticWait.WaitForSeconds(2);		
	}
	
	public void selShortSleeve() {
		StaticWait.WaitForSeconds(2);
		waitVisibility(selShort);
		click(selShort);
		StaticWait.WaitForSeconds(2);		
	}
	
	public void addProductCart(String cantidad) {
		StaticWait.WaitForSeconds(2);
		driver.switchTo().frame(0);
		waitVisibility(txtQuantity);
		writeText(txtQuantity, cantidad);
		waitVisibility(selColor);
		click(selColor);
		waitVisibility(btnAddCart);
		click(btnAddCart);
		StaticWait.WaitForSeconds(2);		
	}
	
	public void proceedCheckout() {
		StaticWait.WaitForSeconds(2);
		driver.switchTo().parentFrame();
		waitVisibility(btnProceedChek);
		click(btnProceedChek);
		waitVisibility(btnProceedChek2);
		click(btnProceedChek2);
		StaticWait.WaitForSeconds(2);		
	}
	public void addComent(String comentario) {
		StaticWait.WaitForSeconds(2);
		waitVisibility(txtComentario);
		writeText(txtComentario, comentario);
		waitVisibility(btnProceedChek3);
		click(btnProceedChek3);		
		StaticWait.WaitForSeconds(2);		
	}
	
	public void finalizePurchase() {
		StaticWait.WaitForSeconds(2);
		waitVisibility(chkTerminos);
		click(chkTerminos);
		waitVisibility(btnProceedChek4);
		click(btnProceedChek4);
		StaticWait.WaitForSeconds(2);
		waitVisibility(btnMedioPago);
		click(btnMedioPago);
		waitVisibility(btnConfirmarOrden);
		click(btnConfirmarOrden);
		StaticWait.WaitForSeconds(2);		
	}
	
	

}
