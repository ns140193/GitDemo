package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCart {
	WebDriver driver;

public	AddtoCart(WebDriver driver)
	{
		this.driver=driver;
	}
By Backpack=By.name("add-to-cart-sauce-labs-backpack");
By Bikelight=By.name("add-to-cart-sauce-labs-bike-light");

public WebElement Backpack()
{
return	driver.findElement(Backpack);
}

public WebElement Bikelight()
{
return	driver.findElement(Bikelight);
}

}
