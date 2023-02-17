package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpForm {
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement firstname;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement lastname;
	
	@FindBy (xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobileno;
	
	@FindBy (xpath="(//input[@type='password'])[2]")
	private WebElement password;
	
	@FindBy (xpath="//select[@aria-label='Day']")
	private WebElement day;
	
	@FindBy (xpath="//select[@aria-label='Month']")
	private WebElement month;
	
	@FindBy (xpath="//select[@aria-label='Year']")
	private WebElement year;
	
	@FindBy (xpath="(//input[@type='radio'])[2]")
	private WebElement maleRadioButton ;
	
	public  SignUpForm(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendfirstname()

	{
		firstname.sendKeys("swagat");
	}
	
	public void  sendlastname()
	{
		lastname.sendKeys("jagtap");
	}
	
	public void sendMobileNo() 
	{
		mobileno.sendKeys("9021634315");
	}
	
	public void sendPassword()
	{
		password.sendKeys("1234abc#");
	}
	
	public void clickmaleRadioButton()
	{
		maleRadioButton.click();
	}
	
	public void dayDropDown()
	{
		Select s=new Select(day);
		s.selectByValue("30");
	}
	
	public void monthDropDown()
	{
		Select s=new Select(month);
		s.selectByVisibleText("Dec");
	}
	
	public void yearDropDown()
	{
		Select s=new Select(year);
		s.selectByVisibleText("1994");
	}
	
	
	
}
	


