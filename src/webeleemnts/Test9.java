package webeleemnts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
	if(btn.isEnabled()) {
		System.out.println("pass:element is enabled");
		btn.click();
		Thread.sleep(3000);
	}
	else
	{
		System.out.println("fail:element is not enebaled");
	}
	
	driver.close();
	}

}
