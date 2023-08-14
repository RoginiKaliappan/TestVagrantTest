import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class FaceOptions {
public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement e =driver.findElement(By.xpath("//a[text()='Create new account']"));
	e.click();
	Thread.sleep(5000);
	WebElement e1 =driver.findElement(By.name("birthday_year"));
	Select s=new Select(e1);
	List<WebElement>options=s.getOptions();
	for(int i=0;i<options.size();i++) {
		String text=options.get(i).getAttribute("value");
		System.out.print(text);
	}
	}
}
