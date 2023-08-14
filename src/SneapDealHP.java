import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SneapDealHP {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement box=driver.findElement(By.name("keyword"));
		box.sendKeys("hp Laptop");
		WebElement w=driver.findElement(By.xpath("//span[text()='Search']"));
        w.click();
        TakesScreenshot tk=(TakesScreenshot)driver;
 		File src=tk.getScreenshotAs(OutputType.FILE);
 		File des=new File("D:\\Rogini\\snapdeal.png");
        FileUtils.copyFile(src, des);
	}
}
