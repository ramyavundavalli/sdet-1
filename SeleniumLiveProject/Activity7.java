/*7. Reading additional information
Goal: Reading a popup that contains additional information about the account/lead.
a. Open the browser to the Alchemy CRM site and login.
b. Navigate to Sales -> Leads
c. In the table, find the Additional information icon at the end of the row of your
newly created lead. Click it.
d. Read the popup and print the phone number displayed in it.
e. Close the browser.*/



package SeleniumProjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Activity7 {
	
WebDriver driver;
	
	@Test
    public void TestCase1() {
    	
    	driver = new FirefoxDriver();
    	
    	//driver.get("http://alchemy.hguy.co/crm");
    	
    }
	
	@Test
    public void loginTest() throws InterruptedException {
	 
	   driver.get("http://alchemy.hguy.co/crm");
        //Find the username and password fields
       
	    driver.findElement(By.name("user_name")).sendKeys("admin");
		
		driver.findElement(By.name("username_password")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.name("Login")).click();	
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("grouptab_0"))).perform();
		
		action.moveToElement(driver.findElement(By.id("moduleTab_9_Leads"))).click();
		
		
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("last_name")).sendKeys("New99");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("5789056650");
		
		driver.findElement(By.id("Leads0emailAddress0")).sendKeys("xxeey@gmail.com");
		
		driver.findElement(By.id("SAVE")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/ul/li[3]/a/div[2]")).click();
		Thread.sleep(5000);      
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//span[contains(@class,'phone')]")).getText());
		
		driver.close();
		
				
		}                                                
	
}
