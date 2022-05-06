package handlingPart;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	WebDriver d; // Driver Object for Interface
	String url = "http://10.82.180.36/Common/Login.aspx";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe"); // Setting the browser name,Setting the path of the webdriver
		d = new ChromeDriver(); // Creating object for the chrome driver class
		d.get(url); // Launch the application
		d.manage().window().maximize(); // Maximizing the browser
	}

	@After
	public void tearDown() throws Exception {
		// d.close(); // Closing the currently focused window

		d.quit(); // Close the browser
	}

	@Test
	public void test() throws InterruptedException {
		d.findElement(By.xpath("//a[@href='/Common/ContactUs.aspx']")).click();
		String contact = d.getWindowHandle();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[@href='/Common/AboutUs.aspx']")).click();
		String about = d.getWindowHandle();
		Thread.sleep(3000);
	/*	Set<String> windowids = d.getWindowHandles();

		for (String id : windowids) {
			Thread.sleep(3000);
			System.out.println(id); // print id
			d.switchTo().window(id); // switching to each window
			String url = d.getCurrentUrl();
			if (url.equals("http://10.82.180.36/Common/ContactUs.aspx")) {
				String data = d.findElement(By.xpath("//*[@id=\"templatemo_footer\"]/span/div")).getText();
				assertEquals("Copyright (c) 2013", data);
				System.out.println("yes,it matched");
				break;
			}

		}
		// Jump to contact us window and extract copyright
		d.switchTo().window(about);
		String msg1 = d.findElement(By.xpath("//*[@id=\"templatemo_footer\"]/span/div")).getText();
		// JuMP TO ABOUT US window and extract copyright
		Thread.sleep(3000);
		d.switchTo().window(contact);
		String msg2 = d.findElement(By.xpath("//*[@id=\"templatemo_footer\"]/span/div")).getText();
		// validate whether both the data is matching
		Thread.sleep(3000);
		assertEquals(msg1, msg2);
		System.out.println("yes,it matched");*/

	}
}
