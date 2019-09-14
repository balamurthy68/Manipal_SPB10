package code;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewToursLoginPage {
 WebDriver driver;
 @FindBy(name = "userName") WebElement username;
 @FindBy(how = How.NAME, using = "password") WebElement password;
 @FindBy(how = How.XPATH, using = "//input[@value='Login']") WebElement signin;
 @FindBy(linkText = "REGISTER") WebElement register;
 public NewToursLoginPage(WebDriver driver) {
  super();
  this.driver = driver;
 }
 public String clickLogin() {
  username.sendKeys("askmail29");
  password.sendKeys("askmail29");
  signin.click();
  return driver.getTitle();
 }
 public void clickRegister() {
  register.click();
 }
 public void loadWebPage(String url) {
  driver.get(url);
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 }
}
