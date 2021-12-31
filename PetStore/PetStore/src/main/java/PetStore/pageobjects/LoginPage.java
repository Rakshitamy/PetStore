package PetStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PetStore.actiondriver.Action;
import PetStore.base.BaseClass;

public class LoginPage extends BaseClass {
	Action act=new Action();
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username ;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='signon']")
	WebElement signInBtn;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String uname,String pswd) {
		act.type(username,uname);
		act.type(password,pswd);
		act.click(getDriver(),signInBtn);
		return new HomePage();
	}
	


}
