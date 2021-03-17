package com.SeleniumTopics.TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterTest;

public class TestNgTeadfromProperties {
	@Test
  public void f() {
  }

	@BeforeTest
	public void beforeTest() {
		try{
			FileInputStream File= new FileInputStream(new File(".//src//test//resources//data.properties"));
			Properties property = new Properties();
			property.load(File);
			
			property.getProperty("username");
			System.out.println(property.getProperty("username"));
			}catch(Exception e){
				e.printStackTrace();
			}
	}

	@AfterTest
	public void afterTest() {
	}

}
