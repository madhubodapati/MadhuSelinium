package com.Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) 
	
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		//<a href="https://mail.google.com/mail/?tab=wm" data-pid="23" class="gb_P">Gmail</a>
		
		driver.findElementByLinkText("Gmail").click();
		
		//driver.findElement(By.name("login")).click();
		//driver.get("https://www.google.com/gmail/about/");
		
		driver.findElement(By.linkText("SIGN IN")).click();
		
				

	}

}
