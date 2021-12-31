package PetStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PetStore.actiondriver.Action;
import PetStore.base.BaseClass;

public class SearchResultPage extends BaseClass {
	Action act=new Action();
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a/img")
	WebElement productResult;
	
	public SearchResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean isProductAvailable() {
		return act.isDisplayed(getDriver(), productResult);
	}
	
	public AddToCartPage clickOnProduct() {
		act.click(getDriver(),productResult);
		return new AddToCartPage();
	}
}

