package Screen_Shot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot 
{
	public  void ScrrenShot(WebDriver driver, String name1) throws IOException 
	{
		Date todayDate = new Date();
		String correctDate = todayDate.toString().replace("","_").replace(";", "_");
		System.out.println(todayDate);
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File file = tc.getScreenshotAs(OutputType.FILE);
		//String name1 = "src-png";
		String location = "C:/Users/HP/Desktop/SQL/" + name1  + ".png";
		FileHandler.copy(file, new File (location));
		
	}

	
}
