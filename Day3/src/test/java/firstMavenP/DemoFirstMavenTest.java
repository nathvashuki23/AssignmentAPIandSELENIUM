package firstMavenP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoFirstMavenTest {

        @Test
        public  void main() throws InterruptedException {
			
			int flag=0;
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
			WebDriver driver= new ChromeDriver();   //Creating object for the chrome driver class
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");  // Launch the application
			driver.manage().window().maximize(); // Maximizing the browser
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String WText=driver.findElement(By.xpath("//h3[@class='post-title entry-title']")).getText();
		
			System.out.println(WText);
			if (WText.equals("Demo Sign-Up Selenium Automation Practice Form")) {
				System.out.println("Testcase got passed");
			}else
			{
				System.out.println("Test case got failed");
			}
			
			driver.findElement(By.name("firstname")).sendKeys("Vashukinath");
			driver.findElement(By.name("lastname")).sendKeys("Gupta");
			//FOR GENDER RADIO BUTTONS
		    WebElement radioMale = driver.findElement(By.id("sex-0"));							
	        WebElement radioFemale = driver.findElement(By.id("sex-1"));									
	        radioMale.click();		 //Radio Button1 is selected			
	        System.out.println("Radio Button Option 1 Selected");	
	        
	        //FOR YEAR OF EXPERIENCE RBUTTONS
	       List<WebElement> RButtons= driver.findElements(By.xpath("//input[@name='exp' and @type='radio']"));
	       for(int i=0;i<RButtons.size();i++)
	       {
	    	   WebElement local_radio=RButtons.get(i);
	    	   
	    	   String Value = local_radio.getAttribute("value");
	    	   String ID= local_radio.getAttribute("id");
	    	   
	    	   
	    	   System.out.println("Values from radio buttons are=======>>>"+Value);
	    	   System.out.println("Id from radio buttons are=======>>>"+ID);
	    	   if(Value.equalsIgnoreCase("7"))
	    	   {
	    		   local_radio.click();
	    		   flag=1;
	    	   }
	    	   else {
	    		   System.out.println("Invalid input");
	    	   }
	       }
	    	   
	    	  //FOR CHOOSE DATE 
	       if(flag==1) {
	    	   driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
	       }
	       
             //FOR PROFESSION CHECKBOX
	    	   WebElement checkBoxMannualTester = driver.findElement(By.id("profession-0"));
	    	   WebElement checkBoxAutomationTester = driver.findElement(By.id("profession-1"));
	    	   checkBoxAutomationTester.click(); //checkbox 2 is selected
	    	   System.out.println("checkbox 2 Selected");
	    	   
	    	   //FOR AUTOMATION TOOL CHECKBOX
	    	   WebElement checkBoxUFT= driver.findElement(By.id("tool-0"));
	    	   WebElement checkBoxProtractor = driver.findElement(By.id("tool-1"));
	    	   WebElement checkBoxSelenium = driver.findElement(By.id("tool-2"));
	    	   checkBoxSelenium.click(); //checkbox 3 is selected
	    	   System.out.println("checkbox 3 Selected");
	    	   
	    	   WebElement d=driver.findElement(By.xpath("//select[@id='continents']"));
	    	   Select dropdownlist=new Select(d);
	    	   dropdownlist.selectByIndex(1);

	    	   
		}
}
	    	   
	     
		    	  
		       
	      
		

	       
	      
	        
			
		
