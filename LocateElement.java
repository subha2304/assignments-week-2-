package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	 
     driver.findElement(By.id("password")).sendKeys("crmsfa");

	driver.findElement(By.className("decorativeSubmit")).click();
	
	 driver.findElement(By.linkText("CRM/SFA")).click();

	
	driver.findElement(By.linkText("Leads")).click();
	
	 driver.findElement(By.linkText("Create Lead")).click();

	
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("subha");
	
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ranjani ");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("subha ");
	 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("ms ");
	 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ranjani");
	 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/23/01");
	 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("student");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("physics");
	 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("0");
	 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("0");
	 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0987");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("test");
	 driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("text");
	 driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ASSR");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0451");
	 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("234");
	 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567899");
	 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("subha");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subharanjanias23@gmail.com");
	 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://subha.com");
	 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("subha ranjani");
	 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("sekar");
	 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("nethaji street");
	 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("nethaji street");
	 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("dindigul ");
	 driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamil Nadu");
	 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys(" 624");
	 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys(" 006");
	 driver.findElement(By.className("smallSubmit")).click();
	 String title = driver.getTitle();
	 System.out.println(title);
	 String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	 System.out.println(text);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	

	
	
	
	
	
	
	
	}

	
}
