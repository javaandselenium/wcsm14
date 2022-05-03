package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Thread.sleep(8000);


String parent = driver.getWindowHandle();
Set<String> child = driver.getWindowHandles();
System.out.println(child.size());

driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();


for(String b:child)
{
	driver.switchTo().window(b);
}

Thread.sleep(3000);
driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();


Thread.sleep(3000);
driver.close();

	}

}
