import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=d6d709ac-ccea-4f36-ab15-91e376bf87cf");
		Actions ab=new Actions(driver);
		
		WebElement home=driver.findElement(By.xpath("//span[@class='2I9KP'])[6]"));
		ab.moveToElement(home).perform();
		Thread.sleep(5000);
		WebElement home1=driver.findElement(By.xpath("//a[text()='Bath Towels']"));
		home1.click();
	} 

}
