package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CostStepDefinition {
/*
	 WebDriver driver;

	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https:ce.scipioerp.com/manufacturing/");
	 }
	 
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 org.junit.Assert.assertEquals("SCIPIO - Manufacturing Manager: Login", title);
	 }
	 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials){
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("USERNAME")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("PASSWORD")).sendKeys(data.get(0).get(1));
	 }
	
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	 }
	 
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 org.junit.Assert.assertEquals("SCIPIO - Manufacturing Manager: Find Production Run", title);
	 }
	 
	 
	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_contact_page() {
				driver.findElement(By.xpath("//*[@id=\"menu_1\"]/li[5]/a")).click();
		
		}
	 
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		 List<List<String>> dealValues =  dealData.raw();
		 driver.findElement(By.name("description")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.name("fixedCost")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.name("variableCost")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.name("perMilliSecond")).sendKeys(dealValues.get(0).get(3));
		 driver.findElement(By.id("EditCostComponentCalc_submitAction")).click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }*/
}
