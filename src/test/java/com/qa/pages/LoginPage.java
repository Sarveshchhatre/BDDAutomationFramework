package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;

import cucumber.api.Scenario;

/**
 * @author HP login page factory class with element repository and page
 *         operation method
 *
 */
public class LoginPage {

	WebDriver driver;
	Scenario scenario;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameField;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//span/child::h6[text()='Dashboard']")
	WebElement homepageTitle;

	/**
	 * @param driver
	 * 
	 *            This is constuctor of class which will initialize global
	 *            driver variable
	 */
	public LoginPage(WebDriver driver, Scenario scenario) {

		this.driver = driver;
		this.scenario = scenario;
		PageFactory.initElements(driver, this);
	}

	/**
	 * @param userName
	 * @param password
	 * @param textToType
	 * @return
	 * 
	 * 
	 * 		This method will enter username and password from config file and
	 *         return home page title
	 */
	public String logintoApplication(String userName, String password) {

		ElementActions.sendKeys(driver, userNameField, scenario, userName);
		ElementActions.sendKeys(driver, passwordField, scenario, password);
		ElementActions.clickElement(driver, loginButton, scenario);

		return ElementActions.getText(driver, homepageTitle, scenario);

	}

}
