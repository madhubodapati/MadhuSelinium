package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://google.com");
String expected_Title = "Hello";

String actual_title = driver.getTitle();

System.out.println(expected_Title+" - Client Expected Title");
System.out.println(actual_title+" - Client actual Title");

if(actual_title.equals(expected_Title))
{System.out.println("Title Matched --- PASS");
}
else
{
	System.out.println("Title Not Matched --- Fail");
	}
driver.close();
	}

}
