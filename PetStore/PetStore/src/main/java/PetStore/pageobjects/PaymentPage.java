package PetStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PetStore.actiondriver.Action;
import PetStore.base.BaseClass;

public class PaymentPage  extends BaseClass{
	Action act=new Action();
	
	@FindBy(xpath="//input[@name='newOrder']")
	WebElement continueToCheckOut;
	
	@FindBy(xpath="//*[@id=\"Catalog\"]/a")
	WebElement confirmToCheckOut;
	
	public PaymentPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clcikOnCheckOut()  {
		act.click(getDriver(),continueToCheckOut);
		
	}
	public OrderConfirmationPage clcikOnCheckOut1()  {
		act.click(getDriver(),confirmToCheckOut);
		return new OrderConfirmationPage();
		
	}
}

	

