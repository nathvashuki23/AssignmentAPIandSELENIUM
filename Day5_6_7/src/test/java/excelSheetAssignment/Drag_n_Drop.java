package excelSheetAssignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_n_Drop {
  @Test
  public void test() throws InterruptedException {
	  WebDriver d;  // Driver Object for Interface
		String url="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		d=new ChromeDriver(); // Creating object for the chrome driver class
		d.get(url);  // Launch the application
		d.manage().window().maximize(); // Maximizing the browser
		d.switchTo().frame(0);
	
		WebElement from= d.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to= d.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(d);
		action.dragAndDrop(from, to).perform();
		/*action.clickAndHold(d.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(d.findElement(By.xpath("//div[@id='droppable']"))).release()
		.build().perform();*/
		
		/*String message1=d.findElement(By.xpath("//div[@id='droppable']//p")).getText();
		assertEquals("Drop here",message1);
		System.out.println(message1);*/
		d.close();
	  
  }
}
