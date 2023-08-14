import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		 Thread.sleep(5000);
		Actions ac =new Actions(driver);
        WebElement pro =driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
        WebElement w  =driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        pro.click();
        w.click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
	}



	}


