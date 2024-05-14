package com.ts.day13052024;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeMethodExplnation {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		//maximize -is method of Window Interface,to Maximizes the current window if it is not already maximized
		//As Window is Interface we cant create the object of it,so we have to use window method of Option Interface,which returns Window
		//As Option is Interface we cant create the object of it,so we have to use manage method of Webdriver Interface which returns options
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Duration is class
		//implicitlyWait -is method of Timeouts Interface,Specifies the amount of time the driver should wait when searching for an element if it isnot immediately present.
		//As Timeouts is Interface we cant create the object of it,so we have to use timeouts method of Option Interface,which returns Options
		//As Option is Interface we cant create the object of it,so we have to use manage method of Webdriver Interface which returns options
		
	}

}
