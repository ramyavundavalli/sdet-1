/*4. Logging into the site
Goal: Open the site and login with the credentials provided
a. Open the browser
b. Navigate to ‘https://alchemy.hguy.co/crm’. .
c. Find and select the username and password fields
d. Enter login credentials into the respective fields
e. Click login
f. Verify that the homepage has opened.
g. Close the browser*/




package SeleniumProjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity4 {
	
WebDriver driver;
	
	@Test
    public void TestCase1() {
    	
    	driver = new FirefoxDriver();
    	
    	//driver.get("http://alchemy.hguy.co/crm");
    	
    }
	
	 @Test
	    public void loginTest() {
		 
		   driver.get("http://alchemy.hguy.co/crm");
	        //Find the username and password fields
	       
		    driver.findElement(By.name("user_name")).sendKeys("admin");
			
			driver.findElement(By.name("username_password")).sendKeys("pa$$w0rd");
			
			driver.findElement(By.name("Login")).click();	
			
			if(driver.findElement(By.xpath("//*[@id=\"tab0\"]")).isDisplayed())
			
			{
				
			System.out.println(" You are in home page");
			
			} 
			
			else {
				
				System.out.println("You are not in home page");
				
			}
			
			
			
			}
	
	
	/*@Test
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
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/ul/li[1]/a/div[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("last_name")).sendKeys("test4");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("6699999944");
		
		driver.findElement(By.id("Leads0emailAddress0")).sendKeys("eeyyydx@yyy.com");
		
		driver.findElement(By.id("SAVE")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/ul/li[3]/a/div[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")).click();
				
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span")).getText());
		
		}*/
	

}
