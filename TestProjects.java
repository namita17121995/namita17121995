import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProjects {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("APPLE iPhone 13 (Starlight, 256 GB)");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);

		String price  = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println(price);
		int flipkartPrice = Integer.parseInt(price);
		driver.navigate().to("https://www.amazon.in/");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("APPLE iPhone 13 (Starlight, 256 GB)");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);

		String amazonName= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(amazonName);
		int amazonPrice = Integer.parseInt(amazonName);

		
		if(flipkartPrice >= amazonPrice )
		{
			System.out.println("Flipakrt price is more");
		}
		
		
//		List<WebElement> items = driver.findElements(By.xpath("//div[@class='_2kHMtA]"));
//		for(WebElement a: items)
//		{
//			String itemName="APPLE iPhone 13 (Starlight, 256 GB)";
//			String Name = driver.findElement(By.xpath("//div[@class='_4rR01T']")).getText();
//			if(Name == itemName)
//			{
//			 System.out.println(driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText());
//			}
//		}
	
		
		 //Price element
		//driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	}

}
