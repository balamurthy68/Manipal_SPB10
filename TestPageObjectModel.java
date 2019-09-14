package code;
import code.NewToursLoginPage;
import code.NewToursRegisterPage;
import org.openqa.selenium.support.PageFactory;
public class PageObjectModelTest extends MyListener {
 MercuryToursLoginPage mlp;
 MercuryToursRegisterPage mrp;
 @BeforeTest
 public void beforeTest(String browserName) {
  mlp = PageFactory.initElements(driver, MercuryToursLoginPage.class);
  mrp = PageFactory.initElements(driver, MercuryToursRegisterPage.class);
 }
 @AfterTest
 public void afterTest() {
  System.out.println("in after test");
  mlp = null;
  mrp = null;
 }
 @Test
 public void testNewTours() {
  System.out.println("in test method");
  mlp.loadWebPage("http://newtours.demoaut.com");
  mlp.clickRegister();
  mrp.clickUserInfo();
  mrp.clickSignOff();
  String title = mlp.clickLogin();
  Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
  test.log(LogStatus.INFO, "the test tours is passed");
 }
}
