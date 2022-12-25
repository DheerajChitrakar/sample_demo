package Code.Pro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CodeTrello {

	@Test
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"D:\\Files\\dheeraj\\Basic java programs\\Pro\\src\\main\\java\\Code\\Pro\\config.properties");

		prop.load(fs);
		String BrowserName = prop.getProperty("browser");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		System.out.println(BrowserName);

		driver.get("https://trello.com/");
		driver.manage().window().maximize();

		PageObjectFile t = new PageObjectFile(driver);

		t.Email().sendKeys(username);
		t.submit().click();
		Thread.sleep(5000);
		t.alreadyacc().click();
		t.Username().sendKeys(username);
		t.Continue().click();
		Thread.sleep(5000);
		t.Password().sendKeys(password);
		t.Login().click();

		String str = driver.getTitle();
		System.out.println(str);
		Thread.sleep(10000);
		t.demo().click();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.dragAndDrop(t.Testng(), t.b()).perform();

		Point p = t.Cordinates().getLocation();
		int xcord = p.getX();
		int ycord = p.getY();
		System.out.println("x cordinates =" + xcord + " " + "y cordinates =" + ycord);

		t.DC().click();
		Thread.sleep(2000);
		t.Logout().click();
		driver.close();

	}

}
