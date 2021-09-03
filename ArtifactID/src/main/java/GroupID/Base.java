package GroupID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static Properties prop;
	public static WebDriver driver;
	public static WebDriver getDriver() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\494770\\SetUp\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	 prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\494770\\Workspace\\ArtifactID\\src\\main\\java\\GroupID\\global.properties");
	prop.load(fis);
	//driver.get("https://www.saucedemo.com./");
	driver.get(prop.getProperty("url"));
	 driver.manage().window().maximize();
	return driver;
	}
	

}
