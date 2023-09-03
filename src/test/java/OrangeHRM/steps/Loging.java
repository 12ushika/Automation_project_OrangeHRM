package OrangeHRM.steps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import External_Report.Basic_Reports;
import POM.Add_Language;
import POM.Edit_Language;
import POM.HR_module;
import Screen_Shot.Screen_shot;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Loging {
	
	WebDriver driver;
	String u; 
	String p;
	String f;
	Edit_Language Ed;
	Add_Language Al;
	HR_module Hm;
	
	Screen_shot shot = new Screen_shot();
	Basic_Reports BP = new Basic_Reports();
	
	   @BeforeTest
	    public void setupReport() {
	        BP.startReport(); // Initialize the Extent Report in the @BeforeTest method.
	    }

	    @AfterMethod
	    public void reportResult(ITestResult result) {
	        BP.getResult(result); // Log test results in the @AfterMethod method.
	    }

	    @AfterTest
	    public void tearDownReport() {
	        BP.tearDowm(); // Flush the Extent Report in the @AfterTest method.
	    }
	    
	@Given("open the application {string}")
	public void open_the_application(String url) throws IOException {
	   
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		shot.ScrrenShot(driver, "t1");
	}
	@When("user gives valid cridentials {string} and {string}")
	public void user_gives_valid_cridentials_and(String user, String pass) throws IOException { // parameter set
	    
		  u = user;
		  p = pass;
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(user);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		
		WebElement login = driver.findElement(By.xpath("//button [@type = 'submit']"));
		login.click();
		
		shot.ScrrenShot(driver, "t2");
	
	}
	@Then("validate user is landed on {string} or {string}")
	public void validate_user_is_landed_on(String Text , String ErrorText) throws IOException {
	   
		if(u.equals("Admin") && p.equals("admin123")) { // he only condition check sathi ahe 
		WebElement dashboard = driver.findElement(By.xpath("//h6[text() = 'Dashboard']"));
		Assert.assertEquals(dashboard.getText(), Text);
		}
		else 
		{
			WebElement error = driver.findElement(By.xpath("//p[text() = 'Invalid credentials']"));
			Assert.assertEquals(error.getText(), ErrorText);
		}
		
	   shot.ScrrenShot(driver, "t3");
		driver.quit();
		
	}
	
	///////////////////// forgot password /////////////////////
	
	@When("user click forgot your password button")
	public void user_click_forgot_your_password_button() throws IOException 
	{
		WebElement ForgetPass = driver.findElement(By.xpath("//p[text() ='Forgot your password? ']"));
		ForgetPass.click();
		shot.ScrrenShot(driver, "r1");
		
	  
	}

	@When("user given valid cridentials {string}")
	public void user_given_valid_cridentials(String Rightcode) throws IOException 
	{
		f= Rightcode;
		
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys(Rightcode);
		shot.ScrrenShot(driver, "r2");
	   
	}

	@Then("validate user is landed on {string}")
	public void validate_user_is_landed_on(String test1) throws IOException
	{
	  
		WebElement resent = driver.findElement(By.xpath("//h6 [text() = 'Reset Password']"));
		System.out.println(resent.getText());
		
		shot.ScrrenShot(driver, "r3");
		driver.quit();
		
	}
	
	
	//////////////////// Edit Language Button ////////////////////
	
	@Given("user given valid input {string} and {string}")
	public void user_given_valid_input_and(String us, String pas) throws IOException 
	{
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(us);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pas);
		
		WebElement login = driver.findElement(By.xpath("//button [@type = 'submit']"));
		login.click();
		shot.ScrrenShot(driver, "s3");
	}

	@When("user click Admin tab")
	public void user_click_admin_tab() throws IOException 
	{
		Ed = new Edit_Language(driver);
		Ed.AdminTab();
		shot.ScrrenShot(driver, "s4");
	
	}

	@When("open configuration dropdown function")
	public void open_configuration_dropdown_function() throws IOException 
	{
		Ed = new Edit_Language(driver);
		Ed.Configuration();
		shot.ScrrenShot(driver, "s5");
	}

	@When("Select localization Option")
	public void select_localization_option() throws IOException 
	{
		Ed = new Edit_Language(driver);
		Ed.Localization();
		shot.ScrrenShot(driver, "s6");
	}

	@When("Select language Dropdown option")
	public void select_language_dropdown_option() throws IOException 
	{
		Ed = new Edit_Language(driver);
		Ed.language();
		shot.ScrrenShot(driver, "s7");
	}

	@When("selcte Date Format dropdown Option")
	public void selcte_date_format_dropdown_option() throws IOException
	{
		Ed = new Edit_Language(driver);
		Ed.DateFormat();
		shot.ScrrenShot(driver, "s8");
	}

	@Then("Click Save button")
	public void click_save_button() throws InterruptedException, IOException 
	{
		Thread.sleep(2000);
		Ed = new Edit_Language(driver);
		Ed.SaveButton();
		shot.ScrrenShot(driver, "s9");
		
		driver.quit();
	}
	
	
	/////////////////// Add new language /////////////////////
	
	
	@When("Select Localization Packages Dropdown option")
	public void select_language_package_dropdown_option() 
	{
	    Al = new Add_Language(driver);
	    Al.LocalizationPackages();
	}

	@When("Click Add button")
	public void click_add_button() 
	{
	     Al = new Add_Language(driver);
	     Al.AddButton();
	}

	@When("Select new lanuage package in Dropdown option")
	public void select_lanuage_package_in_dropdown_option() 
	{
		Al = new Add_Language(driver);
	     Al.name();
	}

	
	
	/////////// HR module ////////////////////
	
	
	@When("Select modules dropdown option")
	public void select_modules_dropdown_option() 
	{
	  Hm = new HR_module(driver);
	  Hm.module();
	}

	@When("select Recruitment Module checkbox tab")
	public void select_recruitment_module_checkbox_tab() 
	{
		Hm = new HR_module(driver);
		boolean isButtonSelected = Hm.isButtonSelected();
		
	}
	

	

}
