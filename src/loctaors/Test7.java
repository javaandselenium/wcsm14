package loctaors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(3000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(3000);
String acttitle = driver.getTitle();
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
