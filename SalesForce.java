package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("subha");
		driver.findElement(By.name("UserLastName")).sendKeys("ranjani");
		driver.findElement(By.name("UserEmail")).sendKeys("123qwret@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("testleaf");
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select dropDown = new Select(title);
		dropDown.selectByVisibleText("Sales Manager");
		WebElement employ = driver.findElement(By.name("CompanyEmployees"));
		Select dropDown1 = new Select(employ);
		dropDown1.selectByVisibleText("15 - 100 employees");
		WebElement cont = driver.findElement(By.name("CompanyCountry"));
		Select dropDown2 = new Select(cont);
		dropDown2.selectByVisibleText("India");
	    driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
	    driver.close();
			}

}
