package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementDecorative = driver.findElement(By .className("decorativeSubmit"));
		elementDecorative.click();
		String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	WebElement element = driver.findElement(By.linkText("CRM/SFA"));
	element.click();
	WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	elementLeads.click();
	WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
	elementCreateLead.click();
	WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	elementCompanyName.sendKeys("JagathishINC");
	WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
	elementFirstName.sendKeys("JAGATHISH");
	WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
	elementLastName.sendKeys("PONNUSAMY TAMILSELVAN");
	WebElement elementSourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
	elementSourcedd.sendKeys("Existing Customer");
	//driver.close();
		//Demosalesmanager/crmsfa
		
	}

}