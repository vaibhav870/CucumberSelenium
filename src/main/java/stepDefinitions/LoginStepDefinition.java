/*package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:ce.scipioerp.com/manufacturing/");
	}

	@Then("^title of login page is WordPRess Login$")
	public void title_of_login_Page_wordpress_login() {
		String title = driver.getTitle();
		org.junit.Assert.assertEquals(title, "SCIPIO - Manufacturing Manager: Login");
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("USERNAME")).sendKeys(username);
		driver.findElement(By.name("PASSWORD")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("input[@value='Login']")).click();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String homeTitle = driver.getTitle();
		org.junit.Assert.assertEquals(homeTitle, "SCIPIO - Manufacturing Manager: Find Production Run");
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
	    driver.close(); 
	}
}*/