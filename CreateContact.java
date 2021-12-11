package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	    String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anu");
		driver.findElement(By.id("lastNameField")).sendKeys("Baala");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Bala");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("xxx");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("anub@newmail.com");
		
		
		WebElement elementdropdown3=(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));		
		Select ff =new Select(elementdropdown3);
		ff.selectByVisibleText("California");	
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_description")).sendKeys("yyy");
		driver.findElement(By.xpath("//input [@value='Update']")).click();
		
		String title2=driver.getTitle();
		System.out.println(title2);
	}

}
