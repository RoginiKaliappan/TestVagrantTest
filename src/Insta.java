import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Insta {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	WebElement userName=driver.findElement(By.name("username"));
    userName.sendKeys("wewe@gmail.com");
    WebElement pwd=driver.findElement(By.name("password"));
    pwd.sendKeys("Ter@343");
    WebElement button=driver.findElement(By.className("_acan _acap _acas _aj1-"));
    button.click();
	}
}
