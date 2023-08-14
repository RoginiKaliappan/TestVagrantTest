import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    WebElement userName=driver.findElement(By.xpath("//input[@name='email']"));
	    userName.sendKeys("gdfdf@gmail.com");
	   WebElement pwd=driver.findElement(By.xpath("//input[@name='pass']"));
	   pwd.sendKeys("Test@343");
	    WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	    login.click();
	    

	}

}
