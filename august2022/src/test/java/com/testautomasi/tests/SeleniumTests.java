package com.testautomasi.tests;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.testautomasi.common.TestUtils;

public class SeleniumTests extends BaseWebGUITest {

	@Test
	public void jsTests() {
//tab0
		String alertScript = "alert(\"this is a alert\")";
		globalPage.runJSScript(alertScript);
		TestUtils.hardWait(5);
		globalPage.acceptDeclineAlert(true);
		TestUtils.hardWait(5);

		String newTabScript = "window.open();";
		globalPage.runJSScript(newTabScript);

		// tab1

		TestUtils.hardWait(5);

		// switch to tab1

		globalPage.switchToWindow(1);

		globalPage.openUrl("https://testautomasi.com/blog/");

		TestUtils.hardWait(10);

		assertEquals(globalPage.getCurrentPageUrl().contains("blog"), true);

	}
}
