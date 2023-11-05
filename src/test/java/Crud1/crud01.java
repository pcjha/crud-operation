package Crud1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class crud01 {
			
			@Test
			public void CreateUser() throws InterruptedException {
			
			// Drive obeject create
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			// Url launch
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\r\n");
			
			// Aply implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			// maximize window
			driver.manage().window().maximize();
			
			// find web element user name and pass the value
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			
			//find web element password and pass the value
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			
			// find web element login button and click on it
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			
			// click on Admin tile
			driver.findElement(By.xpath("(//a)[2]")).click();
			
			// click on add button 
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
			
			// select user role
			driver.findElement(By.xpath("//*[contains(text(),'User Role')]//following::div[4]")).sendKeys(Keys.DOWN,Keys.ENTER);
			
			// Entr user name 
			driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]//following::input")).sendKeys("paul");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]//following::input")).sendKeys(Keys.DOWN, Keys.ENTER);
			
			// select Status
			driver.findElement(By.xpath("//*[contains(text(), 'Status')]//following::div[4]")).sendKeys(Keys.DOWN,Keys.ENTER);
			
			
			// passing the user name
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Atul051236");
			

			// passing paseword
			driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")).sendKeys("Password5");
			
			// Confirm  paseword
			driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")).sendKeys("Password5");
			
			// Save the user
			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			Thread.sleep(5000);
			// deleting the user
			
			driver.findElement(By.xpath("//*[contains(text(), 'Atul051236')]//following::div//i[@class='oxd-icon bi-trash']")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
		
			
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			WebElement	log_out = driver.findElement(By.linkText("Logout"));
			log_out.click();
			
			
			driver.quit();

}
}
