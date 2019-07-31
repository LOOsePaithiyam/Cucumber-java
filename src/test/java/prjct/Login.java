package prjct;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@When("user opens chrome browser and opens application")
	public void user_opens_chrome_browser_and_opens_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\New_NextGen_Testing_Software\\Selenium Drivers\\Selenium Drivers\\chromedriver.exe");

		driver= new ChromeDriver();

		driver.get("http://newtours.demoaut.com");

	}

	@When("user entering username as {string} And password in the field")
	public void user_entering_username_as_And_password_in_the_field(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);

		driver.findElement(By.name("password")).sendKeys("mercury");

	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		driver.findElement(By.name("login")).click();

	}

	@When("verify the login result")
	public void verify_the_login_result() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));


		driver.close();

	}

	@When("user entering username as {string} And password in field")
	public void user_entering_username_as_And_password_in_field(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);

		driver.findElement(By.name("password")).sendKeys("merry");

	}
	
}
