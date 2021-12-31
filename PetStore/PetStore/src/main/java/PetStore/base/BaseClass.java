package PetStore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import PetStore.actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static Action act=new Action();
	public static Properties prop;
	//public static WebDriver driver;
	
	public static ThreadLocal<RemoteWebDriver> driver=new ThreadLocal<RemoteWebDriver>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	

	@BeforeTest
	public void loadConfig() {
		try {
			prop=new Properties();
			System.out.println("super constructor invoked");
			FileInputStream ip=new FileInputStream(
			System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);
			System.out.println("driver: " + driver);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void launchApp() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();	
			driver.set(new ChromeDriver());
		}else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			//driver=new FirefoxDriver();
			driver.set(new FirefoxDriver());
		}else if (browserName.contains("IE")) {
			WebDriverManager.edgedriver().setup();
			//driver=new InternetExplorerDriver();
			driver.set(new InternetExplorerDriver());
		}
		getDriver().manage().window().maximize();
		act.implicitWait(getDriver(),10000);
		act.pageLoadTimeOut(getDriver(),10000);
		//Launching the URL
		getDriver().get(prop.getProperty("url"));	
		}		


	}
