package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Language {
	
WebDriver driver;
	
    public Edit_Language(WebDriver driver) 
	{
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		
	}
	
  
    @FindBy (xpath= "//span[text() = 'Admin']" )
    WebElement AdminTab;
    
     @FindBy (xpath= "//span[text() = 'Configuration ']")
     WebElement Configuration;
    
     @FindBy (xpath ="(//a[@class = 'oxd-topbar-body-nav-tab-link'])[3]")
     WebElement Localization;
    
    
    @FindBy (xpath = "//div [text() = 'English (United States)']")
     WebElement language;
    
     @FindBy (xpath= "//div [text() = 'mm-dd-yyyy ( 08-30-2023 )']")
     WebElement DateFormat;
    
     @FindBy (xpath= "//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
     WebElement SaveButton;


    public void AdminTab() 
	{
    	AdminTab.click();
			
	}
    
    public void Configuration() 
    {
    	Configuration.click();
    }
    
    public void Localization() 
    {
    	Localization.click();
    }
    
    public void language() 
    {
    	language.click();
    }
    
    public void DateFormat() 
    {
    	DateFormat.click();
    }
    
    public void SaveButton() 
    {
    	SaveButton.click();
    }
    
    

}
