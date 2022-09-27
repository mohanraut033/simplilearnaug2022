package com.amazon.webtests;

abstract class BaseTest {

	String driver;
	boolean testResult;

	protected String getDriver() {

		return driver;

	}

	protected void openBrowser(Enum BrowserType) {

		switch (BrowserType.toString()) {
		case "CHROME":
			System.out.println("browser is chrome");
			break;
		case "FIREFOX":
			System.out.println("browser is firefox");
			break;
		default:
			break;
		}
	}

	protected void closeBrowser(boolean result) {

		if (result == false) {
			// take screnshot
			System.out.println("test has failed");
		}

	}
}
