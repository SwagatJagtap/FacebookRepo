package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPopup {
	
	@FindBy (xpath="//a[@id='terms-link']")
	private WebElement termslink;
	
	@FindBy (xpath="//a[@id='privacy-link']")
	private WebElement privacypolicylink ;
	
	@FindBy (xpath="//a[@id='cookie-use-link']")
	private WebElement cookiespolicylink; 
	
	public  SignUpPopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicktermslink() 
	{
		termslink.click();
	}
	
	public void clickprivacypolicylink () 
	{
		privacypolicylink.click();
	}
	
	public void clickcookiespolicylink() 
	{
		cookiespolicylink.click();
	}
	

}
