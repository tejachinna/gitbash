package java1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean Status=wait.until(ExpectedConditions.titleContains("ShoppersStack"));
		System.out.println(Status);
		driver.quit();

	}

}
