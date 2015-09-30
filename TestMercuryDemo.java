import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMercuryDemo {

	@Test
	public void testMercury(){
		// From Where u Will get the Chrome Driver Information
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Step  - 1 Load a FireFox Driver
		//WebDriver driver = new FirefoxDriver();
		// Step -2 Open a URL in FireFox Browser
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		WebElement userid = driver.findElement(By.name("userName"));
		userid.sendKeys("amitsrivastava");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("amit123456");
		WebElement loginBt= driver.findElement(By.name("login"));
		loginBt.click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "find a flight";
		Assert.assertTrue(actualTitle.toUpperCase().contains(expectedTitle.toUpperCase()));
		/*if(actualTitle.toUpperCase().contains(expectedTitle.toUpperCase())){
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}*/
		//Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}

}
