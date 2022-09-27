package com.testautomasi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.testautomasi.common.Constants;

public class ProfilePage extends BasePage {

	// profile page elements

	public ProfilePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	String var = null;
	String profileXpath = "//strong[normalize-space()='%s']";
	// String profileXpath = "//strong[normalize-space()='"+user+"']";

	By profileNameElement = By.xpath(String.format(profileXpath, Constants.user));
	By logoutElement = By.xpath("//a[normalize-space()='Sign out']");

	public String getProfileUserName() {
		return getText(profileNameElement);

	}

	public void clickSignOutLink() {
		clickElement(logoutElement);
	}

}
