package PetStore;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PetStore.base.BaseClass;
import PetStore.pageobjects.AddToCartPage;
import PetStore.pageobjects.HomePage;
import PetStore.pageobjects.IndexPage;
import PetStore.pageobjects.LoginPage;
import PetStore.pageobjects.OrderConfirmationPage;
import PetStore.pageobjects.OrderPage;
import PetStore.pageobjects.PaymentPage;
import PetStore.pageobjects.SearchResultPage;

public class EndToEndTest extends BaseClass {
	IndexPage indexPage;
	HomePage homePage;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartPage;
	OrderPage orderPage;
	LoginPage loginPage;
	PaymentPage paymentPage;
	OrderConfirmationPage orderConfirmationPage;
	
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void endToEndTest() throws Exception {
		indexPage=new IndexPage();
		Thread.sleep(3000);
		loginPage=indexPage.clickOnSignIn1();
		Thread.sleep(3000);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		searchResultPage=indexPage.searchProduct("Male Adult Bulldog");
		Thread.sleep(3000);
		addToCartPage=searchResultPage.clickOnProduct();
		Thread.sleep(3000);
		addToCartPage.clickOnAddToCart();
		Thread.sleep(3000);
		orderPage=addToCartPage.clickOncheckOut();
		Thread.sleep(3000);
		paymentPage=orderPage.clcikOnCheckOut();
		Thread.sleep(3000);
		orderConfirmationPage=paymentPage.clcikOnCheckOut1();
		Thread.sleep(5000);
	}

}
