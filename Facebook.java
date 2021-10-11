package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("subha");
	driver.findElement(By.name("lastname")).sendKeys("ranjani");
	driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	driver.findElement(By.name("password_step_input")).sendKeys("qwerty");	
	WebElement day = driver.findElement(By.id("day"));
	Select dropDown = new Select(day);
	dropDown.selectByVisibleText("23");
	WebElement mon = driver.findElement(By.id("month"));
	Select dropDown1 = new Select(mon);
	dropDown1.selectByValue("4");
	WebElement year = driver.findElement(By.id("year"));
	Select dropDown2 = new Select(year);
	dropDown2.selectByValue("2001");
	driver.findElement(By.linkText("Female")).click();	
	
	
	
	
	
	}

}
