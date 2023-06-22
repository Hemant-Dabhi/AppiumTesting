package com.appiumtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecommerce_TestCase1 extends BaseTest 

{
@Test
public void FormFillUp() throws InterruptedException
		{
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hemant Dabhi");
		driver.hideKeyboard(); /*optional*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()),scrollIntoView(\"India\"));"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(5000);
		}
}