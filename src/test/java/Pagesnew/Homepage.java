package Pagesnew;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Homepage {
	RemoteWebDriver hdriver;
	
	public Homepage(RemoteWebDriver driver) {
		this.hdriver=driver;
	}
	By ProfileIcon=By.xpath("//img[@alt='profile picture']");
	
	public boolean isProfileIconDisplyed() {
		return hdriver.findElement(ProfileIcon).isDisplayed();
	}
}
