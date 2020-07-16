package JavaInterviewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//options.addArguments("disable-infobars");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://allselenium.info/handling-iframes-using-selenium-webdriver/");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.id("author"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", name);
		js.executeScript("arguments[0].value='(222)222-2222';", name);
		
		//name.sendKeys("naveen");

	}

}
