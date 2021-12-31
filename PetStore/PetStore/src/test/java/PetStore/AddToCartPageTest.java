package PetStore;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PetStore.base.BaseClass;
import PetStore.pageobjects.AddToCartPage;
import PetStore.pageobjects.IndexPage;
import PetStore.pageobjects.SearchResultPage;

public class AddToCartPageTest extends BaseClass{
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void addToCartTest() throws InterruptedException {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		searchResultPage=indexPage.searchProduct("Male Adult Bulldog");
		Thread.sleep(3000);
		addToCartPage=searchResultPage.clickOnProduct();
		Thread.sleep(3000);
		addToCartPage.clickOnAddToCart();	
		Thread.sleep(3000);

	}


}

