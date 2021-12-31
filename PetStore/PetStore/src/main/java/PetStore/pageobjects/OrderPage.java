package PetStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PetStore.actiondriver.Action;
import PetStore.base.BaseClass;

public class OrderPage extends BaseClass{

	Action act=new Action();

	
	@FindBy(xpath="//input[@name='newOrder']")
	WebElement proceedToCheckOut;
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public PaymentPage clcikOnCheckOut()  {
		act.click(getDriver(),proceedToCheckOut);
		return new PaymentPage();
	}
}
