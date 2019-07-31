package prjct;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example {
	WebDriver driver;
	@When("user opens newtours application in chrome browser")
	public void user_opens_newtours_application_in_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\New_NextGen_Testing_Software\\Selenium Drivers\\Selenium Drivers\\chromedriver.exe");

		driver= new ChromeDriver();

		driver.get("http://newtours.demoaut.com");

	}

	@When("user enters username as {string} And  password as {string}")
	public void user_enters_username_as_And_password_as(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);

		driver.findElement(By.name("password")).sendKeys("mercury");

	}

	@Then("user clicks on signin button And then verify the login functionality")
	public void user_clicks_on_signin_button_And_then_verify_the_login_functionality() {
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		driver.close();
	}


}
