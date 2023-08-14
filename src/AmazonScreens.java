import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonScreens {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement simp=driver.findElement(By.name("field-keywords"));
		simp.sendKeys("motroloa");
		WebElement sr=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		sr.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\Rogini\\amazon.png");
        FileUtils.copyFile(src, des);

		

	}

}
