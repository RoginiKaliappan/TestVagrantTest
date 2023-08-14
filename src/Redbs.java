import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbs {
	

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.redbus.in/");
WebElement From=driver.findElement(By.id("src"));
From.sendKeys("vellore");
WebElement To=driver.findElement(By.id("dest"));
To.sendKeys("pondy");


}
}