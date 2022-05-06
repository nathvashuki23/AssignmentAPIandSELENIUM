package rating3_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_Webpage {
  @Test
  public void scrolltest() {
	  WebDriver d;  // Driver Object for Interface
		String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		d=new ChromeDriver(); // Creating object for the chrome driver class
		d.get(url);  // Launch the application
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		((JavascriptExecutor)d).executeScript("scroll(0,400)");
		d.close();
  }
}
