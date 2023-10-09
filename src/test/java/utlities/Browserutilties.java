package utlities;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserutilties {

	public static RemoteWebDriver getdriver() {
		String browser="chrome";
		RemoteWebDriver driver;
			
			if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}
			else {
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			
		return driver;
		
	}
}
