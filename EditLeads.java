package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

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
	driver.findElement(By.xpath("(//div[@class='x-form-element'])[19]/input")).sendKeys("subha");
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//td[contains(@class,'cell-first')]/div/a")).click();
	 String title = driver.getTitle();
	 System.out.println(title);
	 driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a[3]")).click();
	 driver.findElement(By.id("updateLeadForm_companyName")).clear();
	 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("abcd");
		driver.findElement(By.xpath("(//input[contains(@class,'small')])[1]")).click();
	String attribute = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if(attribute.contains("abcd")) {
		System.out.println("it is replaced");
	}
	driver.close();
	}

}
