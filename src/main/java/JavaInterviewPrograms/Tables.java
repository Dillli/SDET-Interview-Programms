package JavaInterviewPrograms;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tables {

	public static void main(String[] args)  throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--disable-notifications");
			//options.addArguments("disable-infobars");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize();
			driver.navigate().refresh();
			Thread.sleep(3000);
			/*List<WebElement> columns=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
			System.out.println(columns.size());
			List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
			System.out.println(rows.size());
			
			String tableRow=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[1]")).getText();
			String cellINeed=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[3]")).getText();
			System.out.println("Table Row is " + tableRow +" Cell I need is " + cellINeed);*/
			WebElement tdata=driver.findElement(By.xpath("(//table[@class='dataTable']/tbody/tr/td[2])[3]"));
			String KD=tdata.getText();
			System.out.println("Known data :"+ KD);
			if(KD.equals("A"))
			{
				WebElement UD=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
				System.out.println("Unknown data is "+UD.getText());
			}
			
	}

}
