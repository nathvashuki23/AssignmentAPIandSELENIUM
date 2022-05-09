package excelSheetAssignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebTableIteration {

	WebDriver d; // Driver Object for Interface
	String url = "https://demo.guru99.com/test/web-table-element.php#";

	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe"); // Setting the brows name,Setting path of the webdriver
		d = new ChromeDriver(); // Creating object for the chrome driver class
		d.get(url); // Launch the application
		d.manage().window().maximize(); // Maximizing the browser

	}

	@AfterTest
	public void At() throws Exception {
		d.close();

	}

	@Test(priority = 1)
	public void test1() {

		// COUNT NUMBER OF ROWS
		List<WebElement> rows = d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

		System.out.println(rows.size());
	}

	@Test(priority = 2)
	public void test2() {

		// LOCATING THE SECOND COLUMN DATA IN THIRD ROW
		List<WebElement> THRDRW_THRDCLM = d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[3]"));
		for (int i = 0; i < THRDRW_THRDCLM.size(); i++) {
			System.out.println(THRDRW_THRDCLM.get(i).getText());
		}
	}

	@Test(priority = 3)
	public void test3() {

		// FOR TABLE DATA IN FIRST ROW
		List<WebElement> frstrw = d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]"));
		for (int i = 0; i < frstrw.size(); i++) {
			System.out.println(frstrw.get(i).getText());
		}
	}

	@Test(priority = 4)
	public void test4() {

		// FOR ALL THE DATA IN THE TABLE
		List<WebElement> datas = d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i).getText());
		}
	}

	@Test(priority = 5)
	public void test5() {

		// FOR PRINTING TABLE HEADINGS
		List<WebElement> headings = d.findElements(By.xpath("//table[@class='dataTable']//th"));
		for (WebElement heading : headings) {
			System.out.println(heading.getText());
		}
	}
			
			@Test(priority = 6)
			public void test6() {

				// FOR WHOLE TABLE (CONTAINS HEADINGS AND BODY)
				List<WebElement> whole = d.findElements(By.xpath("//table[@class='dataTable']//tr/th | //table[@class='dataTable']//tr/td"));
			    System.out.println(whole.size());

		}
	}


