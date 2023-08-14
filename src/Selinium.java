import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	    WebElement Name=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	     Name.sendKeys("Selenium");
        WebElement button=driver.findElement(By.xpath("//input[@name='btnk']"));
        button.click();
	
	}
}

