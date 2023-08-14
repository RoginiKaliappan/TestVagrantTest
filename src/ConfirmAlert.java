import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		 Thread.sleep(5000);
		Actions ac =new Actions(driver);
        WebElement confirm =driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
        WebElement btn1 =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        confirm.click();
        btn1.click();
        Thread.sleep(5000);
        Alert alert=driver.switchTo().alert();
        alert.dismiss();

	}

}
