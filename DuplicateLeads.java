package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeads {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	 
     driver.findElement(By.id("password")).sendKeys("crmsfa");

	driver.findElement(By.className("decorativeSubmit")).click();
	
	 driver.findElement(By.linkText("CRM/SFA")).click();

	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Email']")).click();
driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("asdf13@gmail.com");
//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
WebElement element = driver.findElement(By.xpath("(//a[@class='linktext'])[6]"));
element.getText();
System.out.println(element.getText());
 driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.xpath("//input[@type='submit']")).click();
String attribute = driver.findElement(By.id("viewLead_firstName_sp")).getText();
if(attribute.contains("Siva")) {
	System.out.println("it is same");
}
driver.close();
}








	}


