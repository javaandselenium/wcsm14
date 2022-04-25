package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));


WebElement user = driver.findElement(By.id("username"));
wait.until(ExpectedConditions.visibilityOf(user)).sendKeys("admin");


driver.findElement(By.name("pwd")).sendKeys("manager");

WebElement button = driver.findElement(By.xpath("//div[text()='Login ']"));
wait.until(ExpectedConditions.elementToBeClickable(button)).click();

String acttitle = driver.getTitle();
wait.until(ExpectedConditions.titleContains("actitime"));

System.out.println(acttitle);

if(acttitle.equals("actiTIME - Enter Time-Track")) {
	System.out.println("Pass:home page is dispalyed");
}
else
{
	System.out.println("ail:home page is not dispalyed");
}

String url = driver.getCurrentUrl();
System.out.println(url);

Thread.sleep(3000);
driver.close();





	}

}
