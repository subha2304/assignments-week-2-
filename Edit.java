package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Edit.html");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123@gmail.com");
        driver.findElement(By.xpath("//*[@type='text' and @value='Append ']")).sendKeys("Subha");
WebElement element = driver.findElement(By.xpath("//*[@type='text' and @value='Append ']"));
 Actions ac = new Actions(driver);
 element.sendKeys(Keys.TAB);
 String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
 System.out.println(attribute);
 driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

 boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
 if (!enabled) {
	 System.out.println(" disabled");
 }

 }

}
