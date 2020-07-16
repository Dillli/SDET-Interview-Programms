package JavaInterviewPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/handling-iframes-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		String ParentWindow=driver.getWindowHandle();
		//System.out.println(ParentWindow);
		
		WebElement fb=driver.findElement(By.xpath("(//a[@href='https://www.facebook.com/tools.qa'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", fb);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		
		
		
		Set<String> windows=driver.getWindowHandles();
		//System.out.println(windows);
		System.out.println(windows);
		
		//for(String s:windows){
			//System.out.println(s);
			driver.switchTo().window("www.facebook.com");
			System.out.println(driver.getTitle());
			Thread.sleep(4000);
			driver.findElement(By.name("email")).sendKeys("fjdsgkj");
			//driver.close();
			//Thread.sleep(4000);
		//}
		/*Iterator it=windows.iterator();
		while(it.hasNext())
		{
			String childWindow= (String) it.next();
			String childWindow1= (String) it.next();
			if(!ParentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				Thread.sleep(4000);
				driver.close();
				Thread.sleep(4000);
				driver.switchTo().window(ParentWindow);
				driver.close();
			}*/
			
		
		
	}

}
