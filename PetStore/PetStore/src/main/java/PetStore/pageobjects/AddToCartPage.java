package PetStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import PetStore.actiondriver.Action;
import PetStore.base.BaseClass;

public class AddToCartPage extends BaseClass{
	private static final OrderPage OrderPage = null;

	Action act=new Action();
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a/img")
	WebElement dogImg ;
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
	WebElement addToCartBtn ;
	
	@FindBy(xpath="//*[@id=\"Cart\"]/a")
	WebElement proceedToCheckOut;
		
	public AddToCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public void selectDogImg() {
		act.click(getDriver(), dogImg);
	}
	
	public OrderPage clickOnAddToCart() {
		act.click(getDriver(),addToCartBtn);
		return new OrderPage() ;
	}

	public OrderPage clickOncheckOut()  {
		act.click(getDriver(),proceedToCheckOut);
		return new OrderPage();
	}

}

