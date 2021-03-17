package com.SeleniumTopics.TestNg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotations {

	public WebDriver driver;

	@Test(priority = 1)
	public void verifySearchButton() {
		System.out.println("inside test with p1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		String search_text = "Google Search";
		WebElement search_button = driver.findElement(By.name("btnK"));
		String text = search_button.getAttribute("value");
		Assert.assertEquals(text, search_text, "Text not found!");
	}
	
	@Test(priority=2)
	public void test2(){
		System.out.println("inside test with p2");
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println("inside @Test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("inside beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("inside afterMethod");

	}

	/*@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}*/

	@BeforeClass
	public void beforeClass() {
		System.out.println("inside beforeClass");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("inside afterClass");
		driver.quit();

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("inside beforeTest");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("inside afterTest");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("inside afterSuite");

	}

	@BeforeGroups
	public void beforeGroup() {
		System.out.println("inside BeforeGroups");
	}

	@AfterGroups
	public void afterGroup() {
		System.out.println("inside AfterGroups");

	}
}
