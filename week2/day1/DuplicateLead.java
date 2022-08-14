package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
        elementPassword.sendKeys("crmsfa");
        WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
        elementLoginButton.click();
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
    	WebElement elemntFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
    	elemntFirstNameLocal.sendKeys("jagathish");
    	WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
    	 elementDepartment.sendKeys("developer");
    	 WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
	     elementDescription.sendKeys("develop the program");
	     WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
	     elementEmail.sendKeys("tamilselvanjagathish@gmail.com");
	    WebElement elementStateDD = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select DD= new Select( elementStateDD);
	    DD.selectByVisibleText("Australia");
	    WebElement elementbutton = driver.findElement(By.className("smallSubmit"));
	    elementbutton .click();
	 String tittle =driver.getTitle();
	    System.out.println(tittle);
	    WebElement duplicatebutton = driver.findElement(By.linkText("Duplicate Lead"));
	    duplicatebutton.click();
	    WebElement duplicateCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	    duplicateCompanyName.clear();
	    duplicateCompanyName.sendKeys("metro");
	    WebElement duplicateFirstname = driver.findElement(By.id("createLeadForm_firstName"));
	    duplicateFirstname.clear();
	    duplicateFirstname.sendKeys("JAGATHISH97");
	    WebElement duplicateCreateLead = driver.findElement(By.className("smallSubmit"));
	    duplicateCreateLead.click();
	    String tittle1 =driver.getTitle();
	    System.out.println(tittle1);
	}

}
