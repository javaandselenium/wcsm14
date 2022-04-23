package loctaors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(3000);
driver.findElement(By.name("username")).sendKeys("admin");
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("manager");
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[3]")).click();
Thread.sleep(3000);

String actualtitle = driver.getTitle();
System.out.println(actualtitle);

if(actualtitle.equals("Instagram")) {
	System.out.println("Pass");
}
else
{
	System.out.println("Fail");
}

String url = driver.getCurrentUrl();
System.out.println(url);

driver.close();




	}

}
