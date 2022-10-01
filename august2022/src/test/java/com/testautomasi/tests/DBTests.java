
package com.testautomasi.tests;

import org.junit.Test;

import com.testautomasi.common.DBUtils;

public class DBTests {

	@Test
	public void testDbTransactionalCommands() {

		DBUtils.createDBConnection();
	}
}