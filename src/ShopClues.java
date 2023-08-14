import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Actions b=new Actions(driver);
		
		WebElement mobile=driver.findElement(By.xpath("//li[@id='nav_45']"));
		b.moveToElement(mobile).perform();
		
		WebElement gain=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		gain.click();
		
		

	}

}
