package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele);
		s.selectByIndex(13);
		s.selectByValue("267");
		s.selectByVisibleText("Computers/Tablets & Networking");
		
		
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement b:allOptions) {
			System.out.println(b.getText());
		}
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
