package PetStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import PetStore.actiondriver.Action;
import PetStore.base.BaseClass;

public class IndexPage extends BaseClass{
	Action act=new Action();
	
	@FindBy(xpath="//*[@id=\"MenuContent\"]/a[2]")
	WebElement signInBtn;
	
	@FindBy(xpath="//*[@id=\"LogoContent\"]/a/img")
	WebElement logo;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchProductBox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchButton;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public LoginPage clickOnSignIn1() {
		
	act.click(getDriver(),signInBtn);
		return new LoginPage();
	}
	
	public boolean validateLogo() {
		try {
			return act.isDisplayed(getDriver(),logo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public SearchResultPage searchProduct(String productName) {
		act.type(searchProductBox, productName);
		act.click(getDriver(), searchButton);
		return new SearchResultPage();
	}
	

}
