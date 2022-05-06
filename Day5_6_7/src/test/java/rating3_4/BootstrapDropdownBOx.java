package rating3_4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class BootstrapDropdownBOx {
  @Test
  public void test() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		WebDriver driver= new ChromeDriver();   //Creating object for the chrome driver class
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");  // Launch the application
		driver.manage().window().maximize(); // Maximizing the browser
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			
			//click on angular checkbox
			if(list.get(i).getText().contains("Angular")) {
				list.get(i).click();
				break;
			}
		}
		driver.close();
  }
}
