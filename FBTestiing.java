import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class FBTestiing {
	
	@DataProvider(name="mydataprovider")
	public Object[][] excelDataProvider() throws Exception{
		ExcelReader excelReader = new ExcelReader();
		Object array[][]=excelReader.readExcelFile();
		return array;
	}

	@Test(dataProvider="mydataprovider")
	void testFB(String uid , String password){
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userid = driver.findElement(By.id("email"));
		userid.sendKeys(uid);
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys(password);
		WebElement loginBt = driver.findElement(By.id("u_0_v"));
		loginBt.click();
		WebElement msg = driver.findElement(By.cssSelector(".fsl.fwb.fcb"));
		Assert.assertEquals(msg.getText(), "Please re-enter your password");
		driver.close();
	}
}
