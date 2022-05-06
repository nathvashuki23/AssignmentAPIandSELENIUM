package rating3_4;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class ParallelTesting {



WebDriver driver;



@BeforeClass
public void BeforeMethod() throws Exception {
//System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\abhishek.tiwari22\\Drivers\\chromedriver_win32\\chromedriver.exe");
// driver = new ChromeDriver();



}



@Test
public void chromeTest() {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.rediff.com");
d.manage().window().maximize();
d.quit();
}



@Test
public void firefoxTest() {
System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.get("https://www.rediff.com/");
d.manage().window().maximize();
d.quit();
}
}