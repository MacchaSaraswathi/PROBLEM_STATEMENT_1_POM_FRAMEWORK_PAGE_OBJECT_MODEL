package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {
	
	
	
public static void main(String[] args)throws InterruptedException {
		

		//step 1 : formulate a test domain url & driver path
		String siteUrl = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiAlJKuBhAdEiwAnZb7lQPX4J_RpeGbTwO3WfukENLMFf9wqHCoGx7BJp_vL10RThm4adsqPRoCr7wQAvD_BwE%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9062131%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D10113394261890883726%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
		
	
	
        String driverPath = "drivers/windows/geckodriver.exe";
		
		//step 2 : set system properties for selenium driver
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		//step 3 : instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		//step 4 : launch browser
		driver.get(siteUrl);
		
		//step 5 : Evaluate the test
		if(siteUrl.equals(driver.getCurrentUrl())) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		
		
		System.out.println("Expected Url :: "+ siteUrl);
		System.out.println("Actual Url :: "+ driver.getCurrentUrl());
		
		Thread.sleep(2000);
		//step 6 : Close browser
		driver.close();
				
				
			}

		}


