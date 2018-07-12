package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1 
{
@Test
public void BrowserLaunch()

{
	System.out.println("FireFox Browser Launch");
}

@Test(priority = 1)
public void LogIn()
{
System.out.println("Testing LogIn Functionality");
}
@Test(priority = 2)
public void Inbox()
{
System.out.println("Testing Inbox Functionality");
}
@Test(priority = 3)
public void ComposeMail()
{
System.out.println("Testing ComposeMail Functionality");
}
@Test(priority = 4)
public void stepFunction()
{
System.out.println("Testing stepFunction Functionality");
}


}
