package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().window().maximize();

		Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.linkText("Leads")).click();
		Driver.findElement(By.linkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Azentio");
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swapnil");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gore");
		Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shashee");

		Driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Gore");
		Driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("ASD");
		Driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("17/01/1993");
		Driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");

		Driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("42000");
		Driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("120");
		Driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SBI123");
		Driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("***###***");
		Driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead Ceating");
		Driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Fallow Rule");

		Driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		Driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("4");

		Driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("400708");
		Driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9920280346");
		Driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("022");
		Driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Alex");
		Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Swap@gmail.com");
		Driver.findElement(By.id("createLeadForm_primaryWebUrl"))
				.sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");

		Driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Santosh");
		Driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vikas");
		Driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Airoli");
		Driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Panvel");
		Driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Navi Mumbai");
		Driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("400789");
		Driver.findElement(By.className("smallSubmit")).click();

		System.out.println("Title: " + Driver.getTitle());
		
		Driver.close();
	}
}
