/*3. Get the copyright text
Goal: Print the first copyright text in the footer to the console
a. Open a browser.
b. Navigate to ‘http://alchemy.hguy.co/crm’.
c. Get the first copyright text in the footer.
d. Print the text to the console.
e. Close the browser.*/


package SeleniumProjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;

	
	@Test
    public void TestCase3() {
		
		driver = new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co/crm");
		
		System.out.println(driver.findElement(By.id("admin_options")).getText());
		
		System.out.println(driver.findElement(By.id("powered_by")).getText());
		
		driver.close();	
		
		}
}
