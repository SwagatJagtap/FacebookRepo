package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.LoginOrSignUp_Page;

public class TestClass1 {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\locators\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/");
        
        LoginOrSignUp_Page  loginOrSignUp_Page=new LoginOrSignUp_Page(driver);
        
        loginOrSignUp_Page.sendUserName();
        
        loginOrSignUp_Page.sendPassword();
        
        loginOrSignUp_Page.clickCreatenewacc();

	}

}
