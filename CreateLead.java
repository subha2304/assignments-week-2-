package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 
	     driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("subha");
		driver.findElement(By.id("lastNameField")).sendKeys("ranjani");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("subha");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("ranjani");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("qweru");
		driver.findElement(By.id("createContactForm_description")).sendKeys("hi");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("qwer123@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(state);
		dropDown.selectByVisibleText("Indiana");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("hi");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String title = driver.getTitle();
		 System.out.println(title);
		}

}
