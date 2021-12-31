package PetStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PetStore.actiondriver.Action;
import PetStore.base.BaseClass;

public class OrderConfirmationPage extends BaseClass{
	Action act=new Action();
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/a")
	WebElement confirmToCheckOut;
	
	public OrderConfirmationPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clcikOnCheckOut()  {
		act.click(getDriver(),confirmToCheckOut);
		
	}

}
