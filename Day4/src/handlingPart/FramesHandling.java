package handlingPart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
	WebDriver d;  
	String url="http://10.82.181.42/Automation/DemoApps/FrameExample.aspx";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		d=new ChromeDriver(); // Creating object for the chrome driver class
		d.get(url);  // Launch the application
		d.manage().window().maximize(); // Maximizing the browser
	}

	@After
	public void tearDown() throws Exception {
		d.close();
	}

	@Test
	public void test() {
		
		d.switchTo().frame("left");
		String message1=d.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[2]/div/span")).getText();
		System.out.println(message1);
		
		d.switchTo().parentFrame();
		
		d.switchTo().frame(2);
		String message2=d.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[2]/div/span")).getText();
		System.out.println(message2);
		
		
	}

}
