import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestProject {
public static void main(String args[]){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://generic-ui.com/demo");
	driver.findElement(By.xpath("//div[@class='gui-select-container']")).click();

	driver.findElement(By.xpath("//div[contains(text(),' 100 Rows ')]")).click();
	//	WebElement Value= driver.findElement(By.xpath("//div[@class='gui-select-value']"));

	//Select sc = new Select(Value);
	//sc.selectByVisibleText(" 100 Rows ");
}
}
