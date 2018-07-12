package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Facebook_loginTest {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		//<input type="email" data-testid="royal_email" tabindex="1" id="email" name="email" class="inputtext">
		driver.findElement(By.id("email")).sendKeys("madhu");
		
		//<input id="pass" class="inputtext" type="password" data-testid="royal_pass" tabindex="2" name="pass">
		
		driver.findElementById("pass").sendKeys("kragen");
		
		//<label id="loginbutton" class="uiButton
		
		driver.findElementById("loginbutton").click();
		
		
	}

}
