package code;
//Day 3 Exercise 1


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class tblRows {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String exePath = "d://seleniu/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		//https://html.com/tables/#Table_code_Sample_Simple_Table.html
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open the browser with the url
		driver.get("https://html.com/tables#Table_code_Sample_Simple_Table.html");
		
		//Identify the web table
		int expectedRows = 3;
		int actualRows;
		//driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[3]/table"));
		driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/article/div/div[3]/table"));
			// /html/body/div[1]/div/div/main/div[3]/article/div/div[3]/table
		
			WebElement TogetRows = driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[3]/table"));
			List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
			
			actualRows = TotalRowsList.size();

			if (actualRows == expectedRows)
			{
			   System.out.println("Total number of Rows in the table as expected Passed : "+ TotalRowsList.size());
			}
			else
			{
				System.out.println("Total rows not as per expected rows 3 rows expected");
			}
		
	}

}
