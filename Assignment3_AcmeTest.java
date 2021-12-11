package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_AcmeTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[@href='https://acme-test.uipath.com/logout']")).click();

	}

}
