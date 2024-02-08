package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	   private WebDriver driver;

	    // Locators
	    private By usernameField = By.id("siri");
	    private By passwordField = By.id("siri12345");
	    private By loginButton = By.id("login-btn");

	    // Constructor
	    public void LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Methods to interact with the elements on the login page
	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }
}




