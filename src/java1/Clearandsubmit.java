package java1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearandsubmit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Searchtf=driver.findElement(By.id("twotabsearchtextbox"));
		Searchtf.sendKeys("headset");
		Thread.sleep(2000);
		Searchtf.clear();
		Thread.sleep(2000);
		Searchtf.sendKeys("cricket kit");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
