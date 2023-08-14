import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		WebElement w=driver.findElement(By.name("fldLoginUserId"));
		w.sendKeys("fhdfsjf");
		List<WebElement>w1=driver.findElements(By.tagName("frame"));
		int size=w1.size();
		System.out.println(size);
		//back out of frame
		driver.switchTo().defaultContent();
		//current to previous
		driver.switchTo().parentFrame();
	}
}
