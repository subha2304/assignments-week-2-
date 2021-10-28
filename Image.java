package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
   
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		WebElement image = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
Actions action = new Actions(driver);
action.moveToElement(image).click().build().perform();
driver.navigate().back();
String attribute = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");

driver.navigate().to(attribute);
System.out.println(driver.getTitle());



		}
	}
