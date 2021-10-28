package mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
		driver.navigate().back();
		WebElement element = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		element.sendKeys(Keys.ARROW_DOWN);
		 element.sendKeys(Keys.ENTER);
		 driver.navigate().back();
		  String attribute = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		driver.navigate().to(attribute);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		 List<WebElement> findElements = driver.findElements(By.tagName("a"));
		  System.out.println(findElements.size());
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
