package PetStore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PetStore.actiondriver.Action;
import PetStore.base.BaseClass;

public class HomePage extends BaseClass {
	Action act=new Action();
	
	@FindBy(xpath="//*[@id=\"SidebarContent\"]/a[1]/img")
	WebElement  myFish;
	
	@FindBy(xpath="//*[@id=\"SidebarContent\"]/a[2]/img")
	WebElement  myDogs;
	
	@FindBy(xpath="//*[@id=\"SidebarContent\"]/a[3]/img")
	WebElement  myCats;
	
	@FindBy(xpath="//*[@id=\"SidebarContent\"]/a[4]/img")
	WebElement  myReptiles;
	
	@FindBy(xpath="//*[@id=\"SidebarContent\"]/a[5]/img")
	WebElement myBirds;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateMyFish() {
		return act.isDisplayed(getDriver(),myFish);
	}
	
	public boolean validateMyDogs() {
		return 	act.isDisplayed(getDriver(),myDogs);
	}
	
	public boolean validateMyCats() {
		return 	act.isDisplayed(getDriver(),myCats);
	}
	
	public boolean validateMyReptiles() {
		return 	act.isDisplayed(getDriver(),myReptiles);
	}
	
	public boolean validateMyBirds() {
		return 	act.isDisplayed(getDriver(),myBirds);
	}
	
	public String getCurrentURL() {
		String loginPageURL=getDriver().getCurrentUrl();
		return loginPageURL;
	}
	
	
}

