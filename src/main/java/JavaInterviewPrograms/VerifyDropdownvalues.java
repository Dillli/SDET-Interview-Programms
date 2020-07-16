package JavaInterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdownvalues {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.id("multi-select"));
		/*
		 * Select sel = new Select(dropdown);
		 * 
		 * if(dropdown.isDisplayed()) { System.out.println("displayed"); } else {
		 * System.out.println("not -displayed"); }
		 * 
		 * if(sel.isMultiple()) { System.out.println("multiple"); } else {
		 * System.out.println("single"); }
		 * 
		 * List<WebElement> allElements = sel.getOptions();
		 * 
		 * sel.selectByVisibleText("California");
		 * 
		 * for (WebElement ALLValues : allElements) {
		 * 
		 * System.out.println(ALLValues.getText());
		 * 
		 * if (ALLValues.getText().equals("New York")) {
		 * 
		 * System.out.println("New York is matched ");
		 * 
		 * }
		 * 
		 * if (ALLValues.getText().equals("California")) {
		 * 
		 * System.out.println("California is matched "); }
		 * 
		 * }
		 * 
		 * driver.close();
		 */

		Select option = new Select(dropdown);

		List<WebElement> list = option.getOptions();

		String count = "";
		for (int i = 1; i < list.size(); i++) {
			String text = list.get(i).getText();
			count = count + text + " ";
		}
		System.out.println("dropdown values are"+count);
		String[] str = count.split(" ");
		List<String> listName = Arrays.asList(str);
		Set<String> set = new HashSet<String>(listName);

		System.out.println(" set values are " + set);
		int strArrayLength = str.length;
		int setSize = set.size();
		if (strArrayLength == setSize) {
			System.out.println("No Duplicate");
		} else {
			System.out.println("Duplicate values are " + set);
		}
		
		driver.close();
	}
}
