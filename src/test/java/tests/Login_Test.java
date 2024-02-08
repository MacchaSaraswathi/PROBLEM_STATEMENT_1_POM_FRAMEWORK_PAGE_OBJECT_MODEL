package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Login_Page;

public class Login_Test extends Login_Page {
	 public static void main(String[] args) {
		 
	        // Set the path to your ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create an instance of WebDriver (ChromeDriver)
	        WebDriver driver = new ChromeDriver();

	        // Open the login page
	        driver.get("www.google.com");

	        // Find the username and password fields and the login button
	        WebElement usernameField = driver.findElement(By.id("siri"));
	        WebElement passwordField = driver.findElement(By.id("siri12345"));
	        WebElement loginButton = driver.findElement(By.id("login-btn"));

	        // Enter the username and password
	        usernameField.sendKeys("siri");
	        passwordField.sendKeys("siri12345");

	        // Click the login button
	        loginButton.click();

	        // Wait for the page to load
	        try {
	            Thread.sleep(2000); // Wait for 2 seconds (you can adjust this time as needed)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Check if login was successful
	        String currentUrl = driver.getCurrentUrl();
	        if (currentUrl.equals("http://www.google.com/dashboard")) {
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Login failed!");
	        }

	        // Close the browser
	        driver.quit();
	 }
}




