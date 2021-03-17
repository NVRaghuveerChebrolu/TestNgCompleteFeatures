package com.SeleniumTopics.TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestNgFactory {
	private String param = "";

	public TestNgFactory(String param) {
		this.param = param;
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before beforeClass executed.");
	}

	@Test
	public void testMethod() {
		System.out.println("testMethod parameter value is: " + param);
	}

	@Factory
	public Object[] factoryMethod() {
		return new Object[] { new TestNgFactory("hello"), new TestNgFactory("hi") };
	}
}
