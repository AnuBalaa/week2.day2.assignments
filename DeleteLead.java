package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/");		
		driver.manage().window().maximize();				
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.className("linktext")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys("12115");
		driver.findElement(By.name("Find Leads")).click();

	}

}
