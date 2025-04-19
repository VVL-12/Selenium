package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		
		//Launch the Driver
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Selenium TestVL");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//handling dropdown..1)finding element2)create object for the select class
		//3)use the method to handle
		
		WebElement industryElement = driver.findElement(By.name("industryEnumId"));
		//the return type of the above element is stored in the webelement
		//stored the value of webelemtn in variable source element
		
		Select dropdown=new Select(industryElement); //step2
		dropdown.selectByIndex(3);
		
		WebElement ownerElement = driver.findElement(By.name("ownershipEnumId"));
		Select dropdownOwner=new Select(ownerElement);
		dropdownOwner.selectByVisibleText("S-Corporation");
		
		WebElement dataElement = driver.findElement(By.id("dataSourceId"));
		Select dropdownData=new Select(dataElement);
		dropdownData.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingElement = driver.findElement(By.id("marketingCampaignId"));
		Select dropdownMarketing=new Select(marketingElement);
		dropdownMarketing.selectByIndex(6);
		
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdownState=new Select(stateElement);
		dropdownState.selectByValue("TX");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//tagName[@attribute='attributeValue']  relative xpath
		
		
		
		
		
		
		
		
		
		
		
	}

}
