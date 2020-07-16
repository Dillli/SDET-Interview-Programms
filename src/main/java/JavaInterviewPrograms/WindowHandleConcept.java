package JavaInterviewPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleConcept {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("http://www.popuptest.com/goodpopups.html");
		 * 
		 * driver.findElement(By.linkText("Good PopUp #2")).click();
		 * 
		 * Set<String> handles = driver.getWindowHandles();
		 * 
		 * Iterator<String> it = handles.iterator();
		 * 
		 * String parentWindowId = it.next();
		 * System.out.println("parent widnow id is: "+ parentWindowId );
		 * 
		 * 
		 * 
		 * String childWindowId = it.next(); System.out.println("child window id is: "+
		 * childWindowId );
		 * 
		 * driver.switchTo().window(childWindowId);
		 * 
		 * System.out.println("child window title is: "+ driver.getTitle());
		 * 
		 * driver.close();
		 * 
		 * driver.switchTo().window(parentWindowId);
		 * 
		 * System.out.println("parent window title is: "+ driver.getTitle());
		 * 
		 * driver.quit();
		 */

		driver.get("https://p.facebook.com/javatpoint/");

		WebElement contacus = driver.findElement(By.className("_2thz"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", contacus);

		Set<String> handles1 = driver.getWindowHandles();

		Iterator<String> iterator = handles1.iterator();

		String Parent = iterator.next();
		System.out.println("  Parent window code is" + Parent);

		String Child = iterator.next();

		System.out.println("Child window code is " + Child);

		driver.switchTo().window(Child);
		System.out.println("Child window tite is : " + driver.getTitle());
		driver.close();

		driver.switchTo().window(Parent);
		System.out.println("parent  window tite is " + driver.getTitle());

		driver.close();

	}

}
