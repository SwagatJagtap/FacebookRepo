package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Browser;
import pomClasses.LoginOrSignUp_Page;
import pomClasses.SignUpForm;

public class TestNgFormClass extends Browser {
    WebDriver driver;
	
    @Parameters("browser")
	
	@BeforeTest
	public void openBrowser(String browserName){
		if(browserName.equals("Chrome")) {
			driver=openChromeBrowser();
		}
		
		if(browserName.equals("Firefox")) {
			driver=openFirefoxBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void openSignUpPage() {
		System.out.println(" Before Method");
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUp_Page loginOrSignUp_Page=new LoginOrSignUp_Page(driver);
		loginOrSignUp_Page.clickCreatenewacc();
	}
	
	@Test
	public void verifyFirstName() {
		System.out.println("Test-1");
		SignUpForm signUpForm=new SignUpForm(driver);
		signUpForm.sendfirstname();
	}
		
		
		@Test
		public void verifyLastName() {
			System.out.println("Test-2");
			SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.sendlastname();
		}
		
		@Test
		public void verifyMoblieNo(){
			System.out.println("Test-3");
			SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.sendMobileNo();
		}
		
		@Test
		public void verifypassword(){
			System.out.println("Test-4");
			SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.sendPassword();
		}
		@Test
		public void verifymaleRadioButton(){
			System.out.println("Test-5");
			SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.clickmaleRadioButton();
		}
		
		@Test
		public void verifydaydropdown() {
			System.out.println("Test-6");
		   SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.dayDropDown();
			
		}
		
		@Test
		public void verifymonthdropdown() {
			System.out.println("Test-7");
		   SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.monthDropDown();
			
		}
		
		@Test
		public void verifyyeardropdown() {
			System.out.println("Test-8");
		   SignUpForm signUpForm=new SignUpForm(driver);
			signUpForm.yearDropDown();
			
		}

		
		@AfterMethod
		public void closedCurrentTab(){
			System.out.println("After method");
			 
		}
		
	   @AfterClass
		public void afterClass() {
			System.out.println("After Class");
			
		}
		
	

}

