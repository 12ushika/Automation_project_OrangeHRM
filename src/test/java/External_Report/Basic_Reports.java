package External_Report;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Basic_Reports 
{
      ExtentSparkReporter htmlReport;
      ExtentReports reports;
      ExtentTest test;
      
      @BeforeTest
      public void startReport() 
      {
    	  htmlReport = new ExtentSparkReporter("ExtentReport.html");
    	  reports = new ExtentReports();
    	  reports.attachReporter(htmlReport);
    	  
    	  // Add Envrionment detail
    	  reports.setSystemInfo("machine", "ST1");
    	  reports.setSystemInfo("user", "tester");
    	  reports.setSystemInfo("browser", "Firefox");
    	  
    	  // configuration look and feel
    	  htmlReport.config().setDocumentTitle("External report");
    	  htmlReport.config().setReportName("Test Report");
    	  htmlReport.config().setTheme(Theme.STANDARD);
    	  htmlReport.config().setTimeStampFormat("EEEE, MMMM dd , yyyy, hh:mm a '('zzz')'");  
    	  
      }
      
      @AfterMethod
      public void getResult(ITestResult result) 
      {
    	  if(result.getStatus()==ITestResult.FAILURE) 
    	  {
    		  test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Fail", ExtentColor.RED));  
    	  }
    	  else if(result.getStatus()==ITestResult.SUCCESS) 
    	  {
    		  test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Pass", ExtentColor.GREEN));
    	  }
    	  else if(result.getStatus()==ITestResult.SKIP) 
    	  {
    		  test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Skipper", ExtentColor.YELLOW));
    	  }
      }
      
      @AfterTest
      public void tearDowm() 
      {
    	  reports.flush(); 
      }
}
