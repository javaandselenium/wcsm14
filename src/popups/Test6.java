package popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		//new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("admin");
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		
		
		for(String b:child) {
			driver.switchTo().window(b);
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
		
		
		
	}

}
