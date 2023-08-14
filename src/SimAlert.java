import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		
        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
        WebElement btn =driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
       
        btn.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
}

}
