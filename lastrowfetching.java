package code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.qdox.parser.ParseException;

public class lastrowfetching {
    public static void main(String[] args) throws ParseException {
        WebDriver driver;
 
        System.setProperty("webdriver.chrome.driver","d://seleniu/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");         
        //No.of rows 
        
        List  rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        //int lastRowcount=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/")).findElements(By.tagName("tr")).size();
        System.out.println("No of rows are : " + rows.size());
        int lastRow = rows.size();
      
        WebElement lastRowFetch =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[last()]/td[1])"));
        System.out.println(lastRowFetch.getText());
        driver.close();
    }
}