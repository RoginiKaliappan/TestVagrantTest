import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
    WebElement userName=driver.findElement(By.id("email"));
    userName.sendKeys("gdfdf@gmail.com");
    WebElement pwd=driver.findElement(By.id("pass"));
    pwd.sendKeys("Test@343");
    WebElement button=driver.findElement(By.name("login"));
    button.click();
    
}
}
