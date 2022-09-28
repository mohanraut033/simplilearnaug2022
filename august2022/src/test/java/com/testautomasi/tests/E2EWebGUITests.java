package com.testautomasi.tests;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import com.testautomasi.common.Constants;

public class E2EWebGUITests extends BaseWebGUITest {

	@Test
	public void testEnd2EndFlow() {

		homePage.clickLoginMenu();

		assertEquals(globalPage.getCurrentPageUrl(), Constants.loginUrl);

		loginPage.login(Constants.user, Constants.pass);

		String actualUsername = profilePage.getProfileUserName();

		assertEquals(actualUsername, Constants.user);

		profilePage.clickSignOutLink();

		assertEquals(globalPage.getCurrentPageUrl(), Constants.baseUrl);

	}
}
//test