package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	WebDriver driver;

	public	SignUp(WebDriver driver)
		{
			this.driver=driver;
		}
	By FirstName=By.xpath("//input[@id='first-name']");
	By LastName=(By.id("last-name"));
	By PostalCode=By.xpath("//input[@id='postal-code']");
	By CartLink=By.xpath("//a[@class='shopping_cart_link']");
	By CheckOut=By.xpath("//button[@id='checkout']");
	By Continue=By.xpath("//button[@id='continue']");
	By Finish=By.xpath("//input[@id='finish']");
	
	public WebElement Checkout()
	{
	return	driver.findElement(CheckOut);
	}
	
	public WebElement CartLink()
	{
	return	driver.findElement(CartLink);
	}

	public WebElement FirstName()
	{
	return	driver.findElement(FirstName);
	}

	public WebElement LastName()
	{
	return	driver.findElement(LastName);
	}
	public WebElement PostalCode()
	{
	return	driver.findElement(PostalCode);
	}
	public WebElement Continue()
	{
	return	driver.findElement(Continue);
	}
	public WebElement Finish()
	{
	return	driver.findElement(Finish);
	}
	
}
