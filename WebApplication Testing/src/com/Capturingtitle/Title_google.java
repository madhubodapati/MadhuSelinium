package com.Capturingtitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		String title = driver.getTitle();//defining a variable title
		System.out.println(title);
		driver.close(); //to close the browser

	}

}
