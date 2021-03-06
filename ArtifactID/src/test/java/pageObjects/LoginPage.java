package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
	By loginID=By.xpath("//input[@id=\"user-name\"]");
	By Password=By.xpath("//input[@id=\"password\"]");
	By Submit=By.xpath("//input[@id=\"login-button\"]");
	
			public WebElement getLoginID()
			{
				return driver.findElement(loginID);
			}
			
			public WebElement GetPW()
			{
				return driver.findElement(Password);
			}

			public WebElement Submit()
			{
				return driver.findElement(Submit);
			}
}
