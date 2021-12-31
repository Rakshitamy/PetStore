package PetStore;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PetStore.base.BaseClass;
import PetStore.pageobjects.IndexPage;
import PetStore.pageobjects.SearchResultPage;


public class SearchResultPageTest extends BaseClass {
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void productAvailability() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		indexPage.searchProduct("Male Adult Bulldog");
	}

}
