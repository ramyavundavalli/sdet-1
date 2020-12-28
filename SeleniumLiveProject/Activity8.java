/*8. Traversing tables
Goal: Open the accounts page and print the contents of the table.
a. Open the browser to the Alchemy CRM site and login.
b. Navigate to the Sales -> Accounts page.
c. Find the table on the page and print the names of the first 5 odd-numbered rows
of the table to the console.
d. Close the browser.*/



package SeleniumProjectTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
	
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
		
		action.moveToElement(driver.findElement(By.id("moduleTab_9_Accounts"))).click();
		
		
		driver.findElement(By.id("moduleTab_9_Accounts")).click();
		
		Thread.sleep(5000);

         
        
		for (int i = 1; i <=10; i += 2) {
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[" + i + "]/td[@field='name']")));

			WebElement name = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[" + i +"]/td[@field='name']"));
			
			System.out.println("name: " + name.getText());
		}
             
	}
}
	
	