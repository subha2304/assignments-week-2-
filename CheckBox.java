package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/checkbox.html");
		Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
WebElement selection = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
boolean isSelected = selection.isSelected();
if (isSelected==true) {
	System.out.println("the check box is selected");
}
driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
}

}
