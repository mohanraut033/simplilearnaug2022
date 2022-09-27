package com.amazon.webtests;

import com.testautomasi.common.BrowserType;

public class Executor {

	public static void main(String[] args) {

//		BaseTest object = new BaseTest();

		LoginTests login = new LoginTests(BrowserType.CHROME);

		login.runChromeTest();

		Character[] charArray = { 'a', 'b' };
		Integer[] intArray = { 1, 2 };
		String[] nameArray = { "Chandan", "Mishra" };

		GenericTests.printArrayElements(charArray);
		GenericTests.printArrayElements(intArray);
		GenericTests.printArrayElements(nameArray);
		ExceptionTests.readFile();
		ExceptionTests.showDivideByZeroError();

	}

}
