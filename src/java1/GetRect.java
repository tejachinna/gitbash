package java1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement seleniumWebdriver=driver.findElement(By.cssSelector("svg#selenium_webdriver"));
		Rectangle Rectangle = seleniumWebdriver.getRect();
		System.out.println("X: " +Rectangle.getX() + "\tY: " + Rectangle.getY());
		System.out.println("Height: " + Rectangle.getHeight() + "\tWidth: "+ Rectangle.getWidth());
		driver.quit();
		
		

	}

}
