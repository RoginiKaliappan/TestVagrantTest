import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipKartIpone {
		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			WebElement text=driver.findElement(By.xpath("//input[@class='_3704LK']"));
			text.sendKeys("iphone");
			WebElement search=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
			search.click();
		
			TakesScreenshot tk=(TakesScreenshot)driver;
			File src=tk.getScreenshotAs(OutputType.FILE);
			File des=new File("D:\\Rogini\\flipkartip.png");
			FileUtils.copyFile(src, des);
		}
	

	}


