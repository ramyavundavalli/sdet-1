/*9. Traversing tables 2
Goal: Open the leads page and print the usernames and full names from the table.
a. Open the browser to the Alchemy CRM site and login.
b. Navigate to the Sales -> Leads.
c. Find the table on the page and print the first 10 values in the Name column and
the User column of the table to the console.
d. Close the browser.*/




package SeleniumProjectTestNG;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity9 {
	
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
		
				
		for (int i = 1; i <=10; i ++) {
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[" + i + "]/td[@field='name']")));

			WebElement name = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[" + i +"]/td[@field='name']"));
			WebElement username = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[" + i +"]/td[@field='assigned_user_name']"));
			System.out.println("name: " + name.getText());
			System.out.println("username: " + username.getText());
			
			}
		
	}
	
}
		
		

