import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript1 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Actions c =new Actions(driver);
		        WebElement search =driver.findElement(By.name("field-keywords"));		
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','iphone')", search);
        WebElement search1=driver.findElement(By.id("nav-search-submit-button"));		
         js.executeScript("arguments[0].click()",search1);

		
		

	}

}
