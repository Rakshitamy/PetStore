package PetStore;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PetStore.base.BaseClass;
import PetStore.pageobjects.IndexPage;



public class IndexPageTest extends BaseClass {

IndexPage indexPage;
	
	@BeforeTest
	public void setup() {
		launchApp();
	}
	
	@AfterTest
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void verifyLogo() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		boolean result = indexPage.validateLogo();
		Assert.assertTrue(result);

	}
}


