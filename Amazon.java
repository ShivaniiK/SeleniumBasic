package com.selenium;      AmazonURLAndTitleDisplay

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
        String set = driver.getCurrentUrl();
        System.out.println(set);
        String met = driver.getTitle();
        System.out.println(met);
	}

}