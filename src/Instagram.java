import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
	    WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
	    userName.sendKeys("gdfdf@gmail.com");
	    WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
	    pwd.sendKeys("gdfd6");
	    WebElement button=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	    button.click();
	       	}
}
