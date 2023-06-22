package com.appiumtest;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SwipeDemo extends BaseTest 
{
	
	@Test
	
	public void swipetest() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<=4;i++)
		{
			WebElement firstimage=driver.findElement(By.xpath("//android.widget.ImageView["+i+"]"));
			Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView["+i+"]")).getAttribute("focusable"),"true");
			swipeAction(firstimage, "left");
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView["+i+"]")).getAttribute("focusable"),"false");
			
		}
	}

}
