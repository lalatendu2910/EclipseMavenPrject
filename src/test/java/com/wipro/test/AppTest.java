package com.wipro.test;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
	
	App appObj = new App();

	@Test
	public void testPrintDescriptioon() {
		String actualValue = appObj.printDescriptioon();
		Assert.assertEquals("hello world", actualValue);
	}

}
