package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
By AppLogo=By.xpath("//*[@class=\"app_logo\"]");
 public WebElement AppLogo()
{
	return driver.findElement(AppLogo);
}
}
