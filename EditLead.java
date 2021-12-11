package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		driver.findElement(By.xpath("//input [@id='ext-gen248']")).sendKeys("Yashvandhiny");
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10244'][text()='10244'])")).click();
		String title1 = driver.getTitle();
		System.out.println("The Current Window's Title is " +title1);
		String updateCompanyname = "CTS";
		driver.findElement(By.xpath("(//a[@href='updateLeadForm?partyId=10244'][text()='Edit'])")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(updateCompanyname);
		driver.findElement(By.xpath("(//input[@name='submitButton'][@value='Update'])")).click();
		String Text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The Updated Company Name is " +Text1);
		if(Text1.contains(updateCompanyname))
		{
			System.out.println("Updated successfully");
		}
		else
		{
			System.out.println("Not Updated");
		}
		driver.close();
		
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/

	}

}
