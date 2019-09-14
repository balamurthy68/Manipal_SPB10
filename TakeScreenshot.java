package code;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.testng.annotations.Test;

public class TakeScreenshot {

    //@Test

    //public void TakeScreenShot() throws Exception{
     public static void main(String[] args) throws Exception {
     
		WebDriver driver ;
    	System.setProperty("webdriver.gecko.driver","d:\\seleniu\\geckodriver.exe");
    	driver = new FirefoxDriver();

        //goto url

        driver.get("http://demowebshop.tricentis.com/");

        //Call take screenshot function

        //this.takeSnapShot(driver, "d://webshop.png") ;     
          takeSnapShot(driver, "d://webshop.jpg");

          driver.findElement(By.linkText("Log in")).click();
          Thread.sleep(1000);
          takeSnapShot(driver, "d://webshopLogafterlogin.jpg");

          
          driver.close();
    }

    /**

     * This function will take screenshot

     * @param webdriver

     * @param fileWithPath

     * @throws Exception

     */

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}
