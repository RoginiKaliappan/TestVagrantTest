import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.instagram.com/");
	
	}
	

}
