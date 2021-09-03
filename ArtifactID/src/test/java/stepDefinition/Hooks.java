package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import GroupID.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends Base{
	
	@Before("@RegTest,@SmokeTest")

	public void beforevalidation() throws InterruptedException
	{
		System.out.println(" Before Hook");
		/*driver=Base.getDriver(); 
	   driver.get("https://www.saucedemo.com./");
	   Thread.sleep(5000);
  	   System.out.println("Getting the URL...");*/
	}
	@After("@RegTest,@SmokeTest")
	public void aftervalidation()
	{
		System.out.println("After Hook");
		driver.close();
	}

}
