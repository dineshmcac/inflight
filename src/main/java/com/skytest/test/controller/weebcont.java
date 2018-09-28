package com.skytest.test.controller;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weebcont {

	@PostMapping("/testing")
	public String check(@RequestParam String id) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com");
		String suceess = "Inflight test is complete for ";
		System.out.println(suceess +id);
		return suceess +id;
		
		
		
	}
	
	@GetMapping("/hi")
	public String get() {
		return "Success";
	}
}
