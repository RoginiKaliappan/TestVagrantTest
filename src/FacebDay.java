import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebDay {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
	WebElement e =driver.findElement(By.xpath("//a[text()='Create new account']"));
	e.click();
	Thread.sleep(5000);
	WebElement e1 =driver.findElement(By.id("day"));
	Select s=new Select(e1);
	List<WebElement>options=s.getOptions();
int size =options.size();
System.out.println("no of options" +size);
for(int i=1;i<size;i++) {
	if(i%2==0) {//0%2==0--->
		System.out.println(options.get(i).getText());
	}
}
}
}
