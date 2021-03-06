package stepDefinition;

import java.awt.List;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GroupID.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;
import pageObjects.AddtoCart;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.SignUp;

public class StepDefinition {
	public WebDriver driver;
	LoginPage L;
	AddtoCart A;
	HomePage H;
	
	@Given("^User is on SauceDemo home Page$")
	    public void user_is_on_saucedemo_home_page() throws Throwable {
		driver=Base.getDriver();
		
		 String ExpectedTitle="Swag Labs";
	    	String ActualTitle=driver.getTitle();
	    	if(ActualTitle.contentEquals(ExpectedTitle))
	    	{
	    		System.out.println("Actual Title of the Page is: "+ ActualTitle);
	    	}
	    	else
	    		System.out.println("Expected and Actual Titles are different : Test Case Failed!!");
      
	    }
	 @When("^User login into Application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
		
		 L=new LoginPage(driver);
		  L.getLoginID().sendKeys(strArg1);
			L.GetPW().sendKeys(strArg2);
		   L.Submit().click();
		      System.out.println("Logging in using "+strArg1+ " & "+strArg2);
		  	 
	    }

	 @Then("^Products Home Page displayed is \"([^\"]*)\"$")
	    public void products_home_page_is_displayed_is_something(String strArg1) throws IOException  {
		H=new HomePage(driver);
		Boolean S =	H.AppLogo().isDisplayed();
	    		    	
		      if (S)
		    	 System.out.println("Successful Login");
		      
	    }

	    @And("User is able to add {string} to Cart")
	    public void user_is_able_to_add_to_Cart(String string) throws InterruptedException, IOException  {
	    	A=new AddtoCart(driver);
	    	
	    	if (string.contentEquals("Sauce Labs Backpack"))
	    	{
	    		A.Backpack().click();
	    	 System.out.println(" Backpack added to Cart");
	    	 
	       	}
	    	 	else
	    	{
	    		A.Bikelight().click();
	    		System.out.println(" Bike Light added to Cart");
	    		 
	       	}
	    	    	     
	    }
	    @And("^Logsout$")
	    public void logsout() throws InterruptedException, IOException  {
	    	
	    	Logout L=new Logout(driver);
	    	L.menubutton().click();
	    	L.logout().click();
	    	
	    	 Thread.sleep(5000);
	    	 	System.out.println("Logged out");
	    	 
	        
	    }

	       
}
