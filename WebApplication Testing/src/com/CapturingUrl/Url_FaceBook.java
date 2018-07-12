package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		driver.close();
		
		
				

	}

}
