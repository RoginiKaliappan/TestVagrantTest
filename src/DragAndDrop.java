import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions ac =new Actions(driver);
	
		WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement source1=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement des1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		
		ac.dragAndDrop(source, des).perform();
		ac.dragAndDrop(source1, des1).perform();
		
	}

}
