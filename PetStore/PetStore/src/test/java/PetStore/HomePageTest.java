package PetStore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import PetStore.base.BaseClass;
import PetStore.pageobjects.HomePage;
import PetStore.pageobjects.IndexPage;
import PetStore.pageobjects.LoginPage;
import junit.framework.Assert;

public class HomePageTest extends BaseClass {

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
	public void myFishTest() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		loginPage=indexPage.clickOnSignIn1();
		Thread.sleep(3000);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

		boolean result=homePage.validateMyFish();
		Assert.assertTrue(result);
	}
	
	@Test
	public void myDogsTest() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		loginPage=indexPage.clickOnSignIn1();
		Thread.sleep(3000);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		boolean result=homePage.validateMyDogs();
		Assert.assertTrue(result);
	}
	
	@Test
	public void myCatsTest() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		loginPage=indexPage.clickOnSignIn1();
		Thread.sleep(3000);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		boolean result=homePage.validateMyCats();
		Assert.assertTrue(result);
	}
	
	@Test
	public void myReptilesTest() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		loginPage=indexPage.clickOnSignIn1();
		Thread.sleep(3000);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		boolean result=homePage.validateMyReptiles();
		Assert.assertTrue(result);
	}
	
	@Test
	public void myBirdsTest() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		loginPage=indexPage.clickOnSignIn1();
		Thread.sleep(3000);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		boolean result=homePage.validateMyBirds();
		Assert.assertTrue(result);
	}
}

