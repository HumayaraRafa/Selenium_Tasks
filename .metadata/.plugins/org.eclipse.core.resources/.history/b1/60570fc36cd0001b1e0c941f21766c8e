package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne {
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver= new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		//URL Visit
		driver.get("http://automationpractice.com/index.php");
		
		//Page title capture
		System.out.println("Title of the page:  "+driver.getTitle());
		
        //Current URL capture
		System.out.println("Current URL of the page: "+driver.getCurrentUrl());
		
        //Capturing page source code
		//System.out.println("Page source code: "+driver.getPageSource()); 
		
		//Navigate
		driver.navigate().to("https://nexchar.com/");
				
	    //BackNavigate
	    driver.navigate().back();
				
		//ForwardNavigate
		driver.navigate().forward();
				
	    Thread.sleep(5000);
				
		//Page Refresh
		driver.navigate().refresh();
			
	}

}
