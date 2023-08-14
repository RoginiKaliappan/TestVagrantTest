import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseClick {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Actions sc=new Actions(driver);
		WebElement prime=driver.findElement(By.xpath("(//a[@id='nav-link-amazonprime'])"));
		sc.moveToElement(prime).perform();
		WebElement prime1=driver.findElement(By.xpath("//src[@id='mulitasins-img-link']"));
		prime1.click();
	}
}
