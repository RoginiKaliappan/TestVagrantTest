import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	List<WebElement> data=driver.findElements(By.tagName("td"));
	for(int i=0;i<data.size();i++) {
		String text=data.get(i).getText();
		System.out.println(text);
		
	}
		}

}
