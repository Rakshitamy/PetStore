package PetStore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PetStore.base.BaseClass;
import PetStore.pageobjects.HomePage;
import PetStore.pageobjects.IndexPage;
import PetStore.pageobjects.LoginPage;
import junit.framework.Assert;

public class LoginPageTest extends BaseClass {
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		loginPage=indexPage.clickOnSignIn1();
		Thread.sleep(3000);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		String actURL=homePage.getCurrentURL();
		String expectedURL="https://petstore.octoperf.com/actions/Catalog.action";
		Assert.assertEquals(actURL,expectedURL);
	}
}
