package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationPractice_excelReg {

	static String siteURL = "http://automationpractice.com";
	//private static final String FILE_NAME = "D:\\Workspace_For_Selenium_video\\Madam's Classes\\AutomationPractice\\Book1.xlsx";	
	private static final String FILE_NAME = "//Batch3//src//test//resources//Book1.xlsx";
	private static WebDriver driver;
	
	
	String emailID;

	public static void main(String[] args) throws Exception{
		
		driver = new FirefoxDriver();
	    
		launchSite();
		register();		
		//readExcelFile();
		//createAccount();
		driver.quit();
	}
	
	private static void launchSite() throws NoSuchElementException, InterruptedException{
		System.setProperty("webdriver.gecko.driver","d:\\seleniu\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();		
	}
	
	public static void register() throws Exception {
		WebElement btn_signIn;
		btn_signIn = driver.findElement(By.className("login"));
		btn_signIn.click();
		
		
		readExcelFile();
		
	//	createAccount();
	}
	
	public static void readExcelFile() throws InterruptedException {
		String emailID;
		//emailid	title	firstname	lastname	password	day	month	year	company	address	addressline2	city	state	zipcode	mobilephone	submitbutton
		String emailid,title, firstname,lastname,password,day,month,year,company,address,addressline2,city,state,zipcode,mobilephone;
		WebElement  txt_emailAddress, btn_CreateAnAccount,radio_title,txt_firstname,btn_signIn;
		
		
		try {
			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
			Workbook workBook = new XSSFWorkbook(excelFile);
			org.apache.poi.ss.usermodel.Sheet dataTypeSheet = workBook.getSheetAt(0);
			Iterator<Row> rowIterator = dataTypeSheet.iterator();
			
			while(rowIterator.hasNext()) {
				
				Row currentRow = rowIterator.next();
				Iterator<Cell> cellIterator = currentRow.iterator();
				//Each row is a record. Click sign in here
				
				btn_signIn = driver.findElement(By.className("login"));
				btn_signIn.click();
				
			if (currentRow.getRowNum() > 0)
				{
					
					System.out.println(currentRow.getCell(0)); //email id
					System.out.println(currentRow.getCell(1)); //Title
					
				
				
				emailid=currentRow.getCell(0).getStringCellValue();
				txt_emailAddress = driver.findElement(By.id("email_create"));
				
				txt_emailAddress.sendKeys(emailid);	
				
				btn_CreateAnAccount = driver.findElement(By.id("SubmitCreate"));
				btn_CreateAnAccount.click();
				
				driver.navigate().refresh();
				//Title select according to cell at 1
				title = currentRow.getCell(1).getStringCellValue();
				/*/
				if (title.contains("Mr.")) {
				
					radio_title = driver.findElement(By.id("id_gender1"));	
					System.out.println("Mr.");
				}
				else
				{	
					radio_title = driver.findElement(By.id("id_gender2"));	
					System.out.println("Mrs.");
					
				}	
					
				
				radio_title.click();
				*/
				//firstname
				
				firstname = currentRow.getCell(2).getStringCellValue();
				txt_firstname = driver.findElement(By.id("customer_firstname"));
				txt_firstname.sendKeys(firstname);
			}	//skip first row
			} //			row iterator
				driver.navigate().to(siteURL);
				
				System.out.println();			
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createAccount() throws Exception {
		WebElement rdbtn_Title_Mr, rdbtn_Title_Mrs;
		
		rdbtn_Title_Mr = driver.findElement(By.id("id_gender1")); 
		rdbtn_Title_Mrs = driver.findElement(By.id("id_gender2"));
		
		
		
		FileInputStream fis = new FileInputStream(FILE_NAME);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Read data from the (0,0) i.e. 1st row and 1st column.
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String mrString = sheet1.getRow(1).getCell(1).getStringCellValue(); 
		System.out.println("The data from excel is: " + mrString);
		
		if(!mrString.isEmpty() ) {
			driver.findElement(By.id("id_gender1")).click();
		}
		
		wb.close();
	}
	
	

	public static void login() {
		
	}
}
