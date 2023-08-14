import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SneapDeal {

	public static void main(String[] args) throws AWTException, InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/?utm_source=admitad_846&utm_campaign=b7811b1d417b5058de260871e0a0d4f5&utm_content=admitad_846&publisher_id=586854");
		Thread.sleep(5000);
		Actions as=new Actions(driver);
		WebElement womens=driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		as.moveToElement(womens).perform();
		WebElement beauty=driver.findElement(By.xpath("//span[@class='linkTest']"));
        as.contextClick().perform();
	Robot b=new Robot();
	b.keyPress(KeyEvent.VK_DOWN);
	b.keyRelease(KeyEvent.VK_DOWN);
	b.keyPress(KeyEvent.VK_ENTER);
	b.keyRelease(KeyEvent.VK_ENTER);
}
}
