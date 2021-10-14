package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().back();
		WebElement element = driver.findElement(By.xpath("//button[@id='position']"));
		Point point = element.getLocation();
		int xcord = point.getX();
		System.out.println("position of the web element from left" +xcord+"pixels");
		int ycord = point.getY();
		System.out.println("position of the web element from right" +ycord+"pixels");
	    String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("color");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println(size);
		}
	

}
