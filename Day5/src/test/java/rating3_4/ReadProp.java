package rating3_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		 
		 WebDriver d;  // Driver Object for Interface
		// Read properties file
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\vashukinath\\eclipse-workspace\\Day5\\"
				+ "src\\test\\java\\rating3_4\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrom")) {
			
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
				d=new ChromeDriver();
		}
		

	}

}
