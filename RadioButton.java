package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/radio.html");
		Thread.sleep(2000);
		driver.findElement(By.id("yes")).click();
		WebElement selection  = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		boolean isSelected = selection.isSelected();
		if(isSelected==true) {
			System.out.println("it is confirmed");
		}
		driver.findElement(By.xpath("(//input[@name='age'])[1]")).click();
		
		
		
		
		
		
	}

}
