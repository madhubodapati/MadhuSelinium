package com.NavigateToUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facecook.com");
		driver.navigate().to("http://google.com");

	}

}
