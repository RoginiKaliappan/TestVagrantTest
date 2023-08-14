import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FaceScript {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rogini\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions ac =new Actions(driver);
        WebElement username =driver.findElement(By.xpath("//input[@id='email']"));		
        JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].setAttribute('value','ererer1895@gmail.com')", username);
	Object obj=js.executeScript("return arguments[0].getAttribute('value')", username);
	String s=(String)obj;
	System.out.println(s);
	WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
	js.executeScript("arguments[0].setAttribute('value','90000')", pwd);
	Object obj1=js.executeScript("return arguments[0].getAttribute('value')", pwd);
	String s1=(String)obj1;
	System.out.println(s1);
	WebElement login=driver.findElement(By.xpath("//button[text()='Log in']"));
	js.executeScript("arguments[0].click()", login);
}
}
