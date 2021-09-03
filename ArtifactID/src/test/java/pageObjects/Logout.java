package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Logout {
	WebDriver driver;
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	By menubutton=By.id("//a[@id='logout_sidebar_link']");
	By logout=By.xpath("//a[@id='logout_sidebar_link']");

	public WebElement logout()
{
	return driver.findElement(logout);
}
	public WebElement menubutton()
	{
		return driver.findElement(menubutton);
	}



}
