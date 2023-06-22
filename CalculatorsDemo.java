package com.appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorsDemo {
	
	static AppiumDriver driver=null;
	public static void main(String[] args) {
		
		try {
			opencalculator();
		} catch (MalformedURLException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void opencalculator() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","Xiaomi Redmi 6A");
		cap.setCapability("udid","518290407d27");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("appPackage","com.miui.calculator");
		cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
		cap.setCapability("automationName","UiAutomator2");
		URL url=new URL("http://127.0.0.1:4723/");
		
		driver=new AppiumDriver(url, cap);
	}
}
