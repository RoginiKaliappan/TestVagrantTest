import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement From=driver.findElement(By.xpath("//input[@type='text']"));
		From.sendKeys("vellore");
		WebElement To=driver.findElement(By.xpath("//input[@id='dest']"));
		To.sendKeys("pondy");

	}

}
