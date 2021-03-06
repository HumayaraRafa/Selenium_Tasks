package Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//URL visit
		   driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		//Click on the "Make Appointment" button
		   driver.findElement(By.id("btn-make-appointment")).click();
		
		//field fill_up
		   driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		   driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		   
	   //Click on the "Login" button
		   driver.findElement(By.id("btn-login")).click();
	   
	   //2sec delay 
		   Thread.sleep(2000);
	   
	   //WebPage off
		   driver.quit();
		
		
	}
}
