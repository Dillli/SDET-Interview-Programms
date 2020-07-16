package JavaInterviewPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToGetLinksonWebPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);

		List<WebElement> link = driver.findElements(By.tagName("a"));

//		int links = link.size();

		System.out.println(" Page on the links " + link.size());
		
		System.out.println(" ******");

		for (int i = 0; i < link.size(); i++) {
			
			String linknames = link.get(i).getText();

			System.out.println( link.get(i) + "  "+ linknames);

		}
		
		driver.quit();
	}

}
