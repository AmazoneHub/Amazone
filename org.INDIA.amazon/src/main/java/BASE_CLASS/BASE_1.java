package BASE_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BASE_1
{
	public WebDriver driver ;

	public void initialize () {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		
		driver.get("");
		
		
	}
	
}
