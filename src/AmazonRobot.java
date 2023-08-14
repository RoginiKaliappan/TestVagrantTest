import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonRobot {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Actions a=new Actions(driver);
		
		
		WebElement signin=driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])"));
		
		WebElement sn=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[2]"));
		sn.click();
		WebElement e=driver.findElement(By.name("email"));
		e.sendKeys("eere@gmail.com");
		a.doubleClick(e).perform();
		a.contextClick(e).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
