import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	    WebElement Name=driver.findElement(By.className("gLFyf"));
        Name.sendKeys("Selenium");
        WebElement button=driver.findElement(By.name("btnk"));
        button.click();
		}
}
