package prjct;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background {
	WebDriver driver;
	@Given("Display Welcome message")
	public void display_Welcome_message() {
	   System.out.println("Welcome Lav");
	}

	@When("user opens chrome browser and opens the application")
	public void user_opens_chrome_browser_and_opens_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\New_NextGen_Testing_Software\\Selenium Drivers\\Selenium Drivers\\chromedriver.exe");

		driver= new ChromeDriver();

		driver.get("http://newtours.demoaut.com");
	}

	@When("user enters username as {string} and password in field")
	public void user_enters_username_as_and_password_in_field(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);

		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("user clicks on signin buttoon")
	public void user_clicks_on_signin_buttoon() {
		driver.findElement(By.name("login")).click();
	}

	@Then("verify the login functionality")
	public void verify_the_login_functionality() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		driver.close();
	}
}
