package com.amazon.webtests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTests {

	public static void readFile() {

		try {
			FileReader file = new FileReader("/home/jmschandangmail/gitdemo2/file.java");
			try {
				file.read();
				System.out.println("file opened succesfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("file path is wrong please provide valid filepath");
			e.printStackTrace();
		}

	}

	public static void showDivideByZeroError() {

		System.out.println(8 / 0);

	}

}
