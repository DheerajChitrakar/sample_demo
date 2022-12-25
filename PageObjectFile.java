package Code.Pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectFile {

	WebDriver driver;
	public PageObjectFile (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Using find by annotation
	
	@FindBy(xpath="(//input[@name=\"email\"])[1]")
	WebElement  Email;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[1]")
	WebElement  Submit;
	
	@FindBy(xpath="//*[text()='Already have an Atlassian account? Log in']")
	WebElement  Alreadyaccount;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement  username;
	
	@FindBy(xpath="//*[text()='Continue']")
	WebElement  Continue;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement  password;
	
	@FindBy(xpath="//*[text()='Log in']")
	WebElement  login;
	
	@FindBy(xpath="(//*[@class='board-tile-details is-badged'])[1]")
	WebElement Demo;
	
	@FindBy(xpath="(//*[text()='TestNG'])[1]")
	WebElement TestNG;
	
	@FindBy(xpath="(//*[@class=\"list-card-title js-card-name\"])[2]")
	WebElement cordinates;
	
	@FindBy(xpath="(//*[@class='open-card-composer js-open-card-composer'])[2]")
	WebElement B;
	
	@FindBy(xpath="//*[@class=\"p6oJr7SHjK+vLr aqePx81u4BGHTH Glb3QqRGpd64YB\"]")
	WebElement DC;
	
	@FindBy(xpath="//*[text()='Log out']")
	WebElement logout;
	
	
	
	
	
	
	
	
	
	public WebElement Email()
	{
		return Email;
	}
	
	public WebElement submit()
	{
		return Submit;
	}
	
	public WebElement alreadyacc()
	{
		return Alreadyaccount;
	}
	
	public WebElement Username()
	{
		return username;
	}
	
	public WebElement Continue()
	{
		return Continue;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Login()
	{
		return login;
	}
	
	public WebElement demo()
	{
		return Demo;
	}
	
	public WebElement Testng()
	{
		return TestNG;
	}
	
	public WebElement b()
	{
		return B;
	}
	
	public WebElement Cordinates()
	{
		return cordinates;
	}
	
	public WebElement DC()
	{
		return DC;
	}
	
	public WebElement Logout()
	{
		return logout;
	}
	
	
	
	
	
	


}
