package com.amazon.webtests;

import com.testautomasi.common.BrowserType;
import com.testautomasi.common.TestUtils;

public class LoginTests extends BaseTest {

//access variables from child class using this and parent class using super when names are duplicated

	public LoginTests(BrowserType chrome) {
		driver = chrome.toString();

	}

	public void runChromeTest() {

		openBrowser(BrowserType.CHROME);
		// code for test script

		TestUtils.hardWait(1);
		closeBrowser(false);

	}

	public void runFireFoxTest() {
		openBrowser(BrowserType.FIREFOX);
		// code for test script
		closeBrowser(true);

	}
}
