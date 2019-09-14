package code;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class NewToursRegisterPage {
 WebDriver driver;
 @FindBy(xpath = "//input[@name='email']") WebElement email;
 @FindBy(xpath = "//input[@name='password']") WebElement password;
 @FindBy(css = "input[name='confirmPassword']") WebElement confirmPassword;
 @FindBy(name = "register") WebElement register;
 @FindBy(linkText = "SIGN-OFF") WebElement signoff;

 public NewToursRegisterPage(WebDriver driver) {
  super();
  this.driver = driver;
 }
 public String clickUserInfo() {
  email.sendKeys("askmail29");
  password.sendKeys("askmail29");
  confirmPassword.sendKeys("askmail29");
  register.click();
  return driver.getTitle();
 }
 public void clickSignOff() {
  signoff.click();
 }
}