package assignment2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class ReadExcelFile {

	WebDriver d;  // Driver Object for Interface
	String url="http://10.82.180.36/Common/Login.aspx";
	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe"); //Setting the browser name,Setting the path of the webdriver
		d=new ChromeDriver(); // Creating object for the chrome driver class
		d.get(url);  // Launch the application
		d.manage().window().maximize(); 
	}


	@AfterMethod
	public void tearDown() throws Exception {
		d.close();
	}

	@Test
	public void test() throws InterruptedException, IOException {
		String path="D:\\eclipse\\demo.xlsx";
		FileInputStream filestream=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(filestream);
		//HSSFWorkbook -> if excel extension is xls
		XSSFSheet sheet1=workbook.getSheet("Credentials");
		//HSSFSheet -> if excel extension is xls
		//XSSFSheet sheet2=workbook.getSheet("Bus");
		
		//For getting the rowcount
		
		int rowcount=sheet1.getLastRowNum()-sheet1.getFirstRowNum(); //(4-1)  =>3
		
		
		d.findElement(By.id("body_txtUserID")).sendKeys("donhere");
		d.findElement(By.id("body_txtPassword")).sendKeys("don@123");
		d.findElement(By.xpath("//*[@id=\"body_btnLogin\"]")).click();
		d.findElement(By.xpath("//*[@id=\"GeneralTabMenu_Loans_li_Cust\"]/span")).click();
		
		for(int i=1;i<=rowcount;i++) {
			Double loanamount=sheet1.getRow(i).getCell(0).getNumericCellValue(); //getStringCellValue()
			int month=(int) sheet1.getRow(i).getCell(1).getNumericCellValue();			
			//String name=sheet1.getRow(i).getCell(3).getStringCellValue();			
			String loanam=String.valueOf(loanamount);
			String mon=String.valueOf(month);
		
			Thread.sleep(1000);
			WebElement type=d.findElement(By.id("body_cph_Loans_ddlLoanType"));
			Select t=new Select(type);
			t.selectByIndex(1);
			Thread.sleep(1000);
				
			WebElement name=d.findElement(By.id("body_cph_Loans_ddlLoanName"));
			Select n=new Select(name);
			n.selectByIndex(1);
			Thread.sleep(1000);
			
			d.findElement(By.id("body_cph_Loans_txtReqLoanAmount")).sendKeys(loanam);
			d.findElement(By.id("body_cph_Loans_txtNoOfEMI")).sendKeys(mon);
			d.findElement(By.id("body_cph_Loans_btnViewEMI")).click();
			
			Thread.sleep(1000);
			String emi=d.findElement(By.id("body_cph_Loans_lblEMIAmountText")).getText();
			Thread.sleep(1000);
			System.out.println(emi);
			d.findElement(By.id("body_cph_Loans_btnReset")).click();
			
		}
		
	
		
		
		d.findElement(By.id("lbLoginOut")).click();
		
	

}
 }
