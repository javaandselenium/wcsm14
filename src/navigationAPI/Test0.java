package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");

driver.navigate().to("https://www.facebook.com/");

//back
Thread.sleep(3000);
driver.navigate().back();

//forwaord
Thread.sleep(3000);
driver.navigate().forward();

//refresh
Thread.sleep(3000);
driver.navigate().refresh();
driver.close();



	}

}
