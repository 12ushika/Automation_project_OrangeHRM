package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HR_module 
{
   WebDriver driver;
   
   public HR_module (WebDriver driver) 
   {
	 this.driver = driver;
	 
	 PageFactory.initElements(driver, this);
   }
   
   
   @FindBy (xpath= "(//a[@class = 'oxd-topbar-body-nav-tab-link'])[5]")
   WebElement module;
   
   @FindBy (xpath = "//p [text() = 'Recruitment Module']")
   WebElement button;
   
   @FindBy (xpath = "//button [text() = ' Save ']")
   WebElement save;
   
   public void module() 
   {
	   module.click();
   }
   
   public boolean  isButtonSelected() 
   {
	  return  button.isSelected();
   }
   
   public void save() 
   {
	   save.click();
   }
   

   
  
	
}
