package com.seleniumpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPagefactory {
	WebDriver driver;
	public SeleniumPagefactory(WebDriver driver ){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[@name='username']") 
	private WebElement user;
	@FindBy(xpath="//*[@name='password']") 
	private WebElement password;
	@FindBy(xpath="//*[@type='submit']") 
	private WebElement loginbtn;
	@FindBy(xpath="//*[@class='oxd-topbar-header-breadcrumb']") 
	private WebElement dashboard;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getDashboard() {
		return dashboard;
	}

}
