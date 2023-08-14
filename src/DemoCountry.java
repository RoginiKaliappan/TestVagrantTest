
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoCountry {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement w =driver.findElement(By.name("country"));
	Select s=new Select(w);
	List<WebElement>options=s.getOptions();
	for(WebElement option:options) {
		String text=option.getText();
		System.out.println(text);
	}

}
	
	}



