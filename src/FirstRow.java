import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstRow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		WebElement tableElement=driver.findElement(By.xpath("//table[@id='countries']"));
	    WebElement tBodyElement=tableElement.findElement(By.tagName("tbody"));
	   List<WebElement> tRow=tBodyElement.findElements(By.tagName("tr"));
	   for(int i=0;i<tRow.size();i++) {
		   String text=tRow.get(i).getText();
		   System.out.println(text);
	   }
		   List<WebElement> tData=tBodyElement.findElements(By.tagName("td"));
		   for(int j=0;j<tData.size();j++) {
			   String text1=tData.get(j).getText();
			   System.out.println(text1);   
	   }    
		}
	}
