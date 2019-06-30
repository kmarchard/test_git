package com.krishna;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class start {
@Test
@Parameters({"url","email"})
public void starr(String url,String email){
	System.out.println(url);
	System.out.println("Hello3");
	System.out.println("QAq"+System.getProperty("environment"));
	Properties properties = new Properties();
	System.out.println(properties.getProperty("${project.build.sourceEncoding}"));
	/*Properties properties = new Properties();
	
	System.out.println(properties.getProperty("environment"));*/
	/*
	System.getProperty("webdriver.chrome.driver","C:\\Users\\bhoomi\\workspace\\test\\chromedriver.exe");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("something", true);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-infobars");
	
	//ChromeOptions options = new ChromeOptions();
	WebDriver dr=new ChromeDriver(capabilities);
	dr.get("https://opensource-demo.orangehrmlive.com/");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String title=dr.getTitle();
	System.out.println("The title is "+title);
	dr.close();
	*/
}
}
