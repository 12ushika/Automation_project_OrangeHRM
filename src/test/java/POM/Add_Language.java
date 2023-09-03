package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Language 
{

	WebDriver driver;
	
	public Add_Language(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 /*  @FindBy (xpath= "//span[text() = 'Admin']" )
	    WebElement AdminTab;
	    
	     @FindBy (xpath= "//span[text() = 'Configuration ']")
	     WebElement Configuration;*/
	
	
	   @FindBy (xpath = "(//a[@class = 'oxd-topbar-body-nav-tab-link'])[4]")
	   WebElement LocalizationPackages;
	     

	   @FindBy (xpath = "//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary']")
	   WebElement Add;
	   
	   @FindBy (xpath = "//div[@class = 'oxd-select-text-input']")
	   WebElement name;
	   
	   @FindBy (xpath = "//button[text() = ' Save ']")
	   WebElement save;
	/*     public void AdminTab() 
	 	{
	     	AdminTab.click();
	 			
	 	}
	     
	     public void Configuration() 
	     {
	     	Configuration.click();
	     }*/
	     
	     public void LocalizationPackages() 
	     {
	    	 LocalizationPackages.click();
	     }
	     
	     public void AddButton() 
	     {
	    	 Add.click();
	     }
	     
	     public void name() 
	     {
	    	 name.sendKeys("English (Austria)");;
	     }
	     
	     public void savebutton() 
	     {
	    	 save.click();
	     }
	

	
	
}
