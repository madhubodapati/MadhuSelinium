package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newtours_loginTest {

	public static void main(String[] args)
	{
	
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get(" http://newtours.demoaut.com/");
		
		//<input type="text" size="10" name="userName">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		//<input type="password" size="10" name="password">
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		//name="login">
		
		driver.findElement(By.name("login")).click();
		
		//String expected_Title = "Find";
		//String actual_Title = driver.getTitle();
		
		String expected_Title = "Find";
		String actual_Title = driver.getTitle();
		
		if (actual_Title.contains(expected_Title))
			
		{
			System.out.println("Login Sucessfull --- PASS");
		}
		else
		{
			System.out.println("Login Failed --- Fail");
			
		}
		driver.close();
		}
		
		
}
		
		
	
		
		



