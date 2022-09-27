package com.testautomasi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	// login page elements
	By usernameElement = By.id("username");
	By passwordElement = By.id("password");

	By loginBtnElement = By.xpath("//button[normalize-space()='Login']");

	public void login(String username, String password) {
		setText(usernameElement, username);
		setText(passwordElement, password);
		clickElement(loginBtnElement);

	}
}
