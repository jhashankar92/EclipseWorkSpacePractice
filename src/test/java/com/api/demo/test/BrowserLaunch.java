package com.api.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.google.com/");		

	}

}
