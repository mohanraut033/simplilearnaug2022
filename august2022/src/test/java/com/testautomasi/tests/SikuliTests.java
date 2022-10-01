package com.testautomasi.tests;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.testautomasi.common.Constants;
import com.testautomasi.common.TestUtils;

public class SikuliTests extends BaseWebGUITest {

	@Test
	public void testSikuliCommmands() {

		try {
			Screen sikuliDriver = new Screen();

			Pattern loginLink = new Pattern("/home/jmschandangmail/Downloads/testautomasilogin.png");

			sikuliDriver.wait(loginLink, 10);

			sikuliDriver.click(loginLink);

			assertEquals(globalPage.getCurrentPageUrl(), Constants.loginUrl);

			TestUtils.hardWait(10);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
