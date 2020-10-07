package com.testproject.launchchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\JenkinsAutomation\\drivers\\chromedriver1.exe");
		WebDriver driver =new ChromeDriver();

	}

}
