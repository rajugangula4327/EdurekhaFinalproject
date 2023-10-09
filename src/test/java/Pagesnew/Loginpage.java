package Pagesnew;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Loginpage {
	RemoteWebDriver pdriver;
	
	public Loginpage(RemoteWebDriver driver) {
		this.pdriver=driver;
	}
	By inputUser=By.name("username");
	By inputPassword=By.name("password");
	By buttonLogin=By.xpath("//button");
	By messageLoginError=By.xpath("//p[text()='Invalid credentials']");
	
	public void login(String username, String password) {
		pdriver.findElement(inputUser).sendKeys(username);
		pdriver.findElement(inputPassword).sendKeys(password);
	}
	public void clickOnLoginButton() {
		pdriver.findElement(buttonLogin).click();
	}
	public boolean isLoginErrorMessageDisplayed() {
		return pdriver.findElement(messageLoginError).isDisplayed();
	}
}
