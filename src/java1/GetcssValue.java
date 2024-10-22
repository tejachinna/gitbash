package java1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcssValue {

	public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement creteaccount =driver.findElement(By.xpath("//a[text()='Create new account']"));
System.out.println(creteaccount.getCssValue("background-color"));
System.out.println(creteaccount.getCssValue("color"));
System.out.println(creteaccount.getCssValue("font"));
driver.quit();

	}

}
