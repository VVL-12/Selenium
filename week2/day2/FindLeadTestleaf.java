package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeadTestleaf {
	

		public static void main(String[] args) {
			
			//Launch the Driver
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Load the url
			driver.get("http://leaftaps.com/opentaps");
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Enter the username
			//Find the Element - findElement
			//Entering the text-sendKeys
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			
			//Entering the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			//Click on the login button
			driver.findElement(By.className("decorativeSubmit")).click();
			
			//Click on the "CRM/SFA" link
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			//Click on Leads tab
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			driver.findElement(By.id("firstName")).sendKeys("Vybhavi");
			
			driver.findElement(By.id("firstName")).sendKeys("VL");
			
			driver.findElement(By.id("companyName")).sendKeys("Testleaf");
			
			driver.findElement(By.className("smallSubmit")).click();
		}

	}


