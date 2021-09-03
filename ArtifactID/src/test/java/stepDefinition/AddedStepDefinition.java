package stepDefinition;

import GroupID.Base;
import cucumber.api.java.en.And;
import pageObjects.SignUp;

public class AddedStepDefinition extends Base {
	SignUp S;
	 @And("^User Signs up using (.+) and (.+) and (.+)$")
     public void user_signs_up_using_and_and(String firstname, String lastname, String postalcode) throws Throwable {
     	S=new SignUp(driver);
     	S.CartLink().click();
     	
     	S.FirstName().sendKeys(firstname);
     	S.LastName().sendKeys(lastname);
     	S.PostalCode().sendKeys(postalcode);
     	S.Checkout().click();
     		S.Continue().click();
     		S.Finish().click();
     	
     /*	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
     	Thread.sleep(5000);
     	driver.findElement(By.xpath("//button[@id='checkout']")).click();
     	Thread.sleep(5000);
     	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstname);
     	driver.findElement(By.id("last-name")).click();
     	driver.findElement(By.id("last-name")).sendKeys(lastname);
     	Thread.sleep(5000);
     	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(postalcode);
     	Thread.sleep(5000);
     	driver.findElement(By.xpath("//input[@id='continue']")).click();
     	Thread.sleep(5000);
     	driver.findElement(By.xpath("//input[@id='finish']")).click();*/
    
     }


}
