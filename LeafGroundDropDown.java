package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(dropdown);
		drop1.selectByIndex(1);
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select drop2 = new Select(dropdown1);
		drop2.selectByVisibleText("Selenium");
		WebElement dropdown2 = driver.findElement(By.id("dropdown3"));
		Select drop3  = new Select(dropdown2);
		drop3.selectByValue("1");
		WebElement dropdown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select drop4 = new Select(dropdown4);
		System.out.println(drop4.getOptions().size());
driver.findElement(By.xpath("(//option[text()='Selenium'])[6]")).click();
		WebElement element = driver.findElement(By.xpath("(//div[@class='example']/select)[5]"));
		element.sendKeys(Keys.ARROW_DOWN);
		 element.sendKeys(Keys.ENTER);
	
}

}
