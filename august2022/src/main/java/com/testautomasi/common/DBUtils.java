package com.testautomasi.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

	static Connection mysqlConn;

	public static void createDBConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			mysqlConn = DriverManager.getConnection(Constants.dbHost, Constants.dbUserName, Constants.dbPassword);
			System.out.println("mysql connection was successfull.s");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
