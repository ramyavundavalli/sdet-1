/*5. Getting colors
Goal: Get the color of the navigation menu
a. Open a browser.
b. Navigate to ‘http://alchemy.hguy.co/crm’ and login using the credentials
provided.
c. Get the color of the navigation menu and print it to the console.
d. Close the browser.*/





package SeleniumProjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity5 {
	
WebDriver driver;
	
	@Test
    public void TestCase1() {
    	
    	driver = new FirefoxDriver();
    	
    	//driver.get("http://alchemy.hguy.co/crm");

}
	
	@Test
	 public void TestCase5() {
		
		//driver = new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co/crm");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		driver.findElement(By.name("username_password")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.name("Login")).click();			
		
		String bgcolor = driver.findElement(By.xpath("//*[@id=\"recentlyViewedSidebar\"]/ul/div[1]/li/a[1]")).getCssValue("background-color");
		
		System.out.println(bgcolor);
		
		driver.close();	
}
}
