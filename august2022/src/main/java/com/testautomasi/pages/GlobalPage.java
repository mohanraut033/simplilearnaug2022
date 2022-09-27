package com.testautomasi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GlobalPage extends BasePage {

	public GlobalPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public String getCurrentPageUrl() {

		return getCurrentUrl();
	}

	public void runJSScript(String script) {
		runJavaScript(script);

	}

	public void acceptDeclineAlert(boolean isAccept) {
		handleAlert(isAccept);
	}

	public void openUrl(String url) {
		openWebPage(url);
	}

	public void switchToWindow(int windowIndex) {
		switchWindow(windowIndex);
	}
}
