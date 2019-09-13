package com.selenium.tests;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AncestorInXpath{

@Test

    public void testAncestorInXpath(){

        WebDriver driver = new FirefoxDriver();             
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/guru99home/");

        //Search All elements in 'Popular course' section 
		//with the help of ancestor of the anchor whose text is 'SELENIUM'

        List <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='MOBILE TESTING']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));

        
        WebElement myElement = driver.findElement(By.xpath("//div[.//a[text()='MOBILE TESTING']]/ancestor::div[@class='rt-grid-2 rt-omega']/preceding-sibling::div[1]"));
        System.out.println(myElement.getText());
        
        //Print all the which are sibling of the element named as 'SELENIUM' in 'Popular course'
        /*
        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }
     */
        driver.quit();
    }
}