package com.generic;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.seleniumpagefactory.SeleniumPagefactory;
import com.util.HighLighter;
import com.util.constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin extends constants {
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		SeleniumPagefactory pf =new SeleniumPagefactory(driver);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to(url);
		HighLighter.getColor(driver,pf.getUser(),"red");
		pf.getUser().click();
		pf.getUser().sendKeys(name);
		HighLighter.getColor(driver,pf.getPassword(),"blue");
		pf.getPassword().click();
		pf.getPassword().sendKeys(password);
		HighLighter.getColor(driver,pf.getLoginbtn(),"navy");
		pf.getLoginbtn().click();
		boolean loginStatus =pf.getDashboard().isDisplayed();
		Assert.assertTrue(loginStatus);
		
	}
	
}
