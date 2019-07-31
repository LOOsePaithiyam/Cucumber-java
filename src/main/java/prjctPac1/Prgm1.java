package prjctPac1;



import java.util.concurrent.TimeUnit;

 
import org.junit.Assert;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;

 
import cucumber.api.java.en.Given;
 
import cucumber.api.java.en.Then;
 
import cucumber.api.java.en.When;

 
public class Prgm1 {
 
WebDriver driver;

 
@Given("user opens login page in newtours application")
 
public void user_opens_login_page_in_newtours_application() {
 
System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\Selenium Drivers\\Selenium Drivers\\chromedriver.exe");
 
driver= new ChromeDriver();
 
driver.get("http://newtours.demoaut.com");


}

 
@When("user enter username as mercury and password as mercury")
 
public void user_enter_username_as_mercury_and_password_as_mercury() {
 
driver.findElement(By.name("userName")).sendKeys("mercury");
 
driver.findElement(By.name("password")).sendKeys("mercury");

}
@When("user enter username as {string} and password as {string}")
public void user_enter_username_as_and_password_as(String string, String string2) {
	driver.findElement(By.name("userName")).sendKeys("mercury");
	 
	driver.findElement(By.name("password")).sendKeys("mercury");

}



 
@When("Click on Submit button")
 
public void click_on_Submit_button() {
 
driver.findElement(By.name("login")).click();

}

 
@Then("verify login result")
 
public void verify_login_result() {
 
Assert.assertTrue(driver.getTitle().contains("Flight"));
 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
driver.close();

}


}
 

