package com.org.my;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	void test1()
	{
		
		
		System.out.println("Test 1");
		Assert.assertEquals(10, 11,"Verification fail");
	
	
	}
	
	@Test
	void test2()
	{
		System.out.println("Test 1");
		Assert.assertEquals(10, 10,"Verification pass");
	
	}
	
	
	
}
