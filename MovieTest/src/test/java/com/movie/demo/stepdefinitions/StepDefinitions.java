package com.movie.demo.stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;


public class StepDefinitions {

	WebDriver driver;
	String c1,c2,r1,r2;

	@Before
	public void initialSetup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Given("^I want to launch both the websites$")
	public void i_want_to_launch_both_the_websites() throws Throwable {
		System.out.println("Launching url and collecting data...");
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		WebElement country1 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td"));
		c1 = country1.getText();
		WebElement releaseDate1 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li"));
		r1 = releaseDate1.getText();
	    Thread.sleep(3000);
	    driver.get("https://www.imdb.com/title/tt9389998/");
	    WebElement country2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[2]/div/ul/li/a"));
	    c2 = country2.getText();
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[1]/a[2]")).click();
	    WebElement releaseDate2 = driver.findElement(By.xpath("//*[@id=\"releaseinfo_content\"]/table[1]/tbody/tr[6]/td[2]"));
	    r2 = releaseDate2.getText();
	  
	    
	}

	@When("^I extract country name and release date$")
	public void i_extract_country_name_and_release_date() throws Throwable {
		System.out.println("Extracting data...");
		System.out.println(c1);
		r1 = r1.substring(0, 16);
		System.out.println(r1);
	    System.out.println(c2);
	    System.out.println(r2);
	}

	@Then("^I validate the country name and result date$")
	public void i_validate_the_country_name_and_result_date() throws Throwable {
		System.out.println("Validation begins..");
	    try {
	    	Assert.assertEquals(c1, c2);
	    	Assert.assertEquals(r1, r2);
	    }catch(AssertionError e) {
	    	System.out.println("Not equal");
	    	throw e;
	    }
	    System.out.println("Equal values");
	}
	
	@After
	public void closing() {
		driver.quit();
	}

}
