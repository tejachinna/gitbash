package java1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetlocationGetsize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement seleniumWebdriver=driver.findElement(By.cssSelector("svg#selenium_webdriver"));
		Point Point = seleniumWebdriver.getLocation();
		System.out.println(Point);
		System.out.println("x:" + Point.getX() + "\tY: " +Point.getY());
		
		Dimension dimension=seleniumWebdriver.getSize();
		System.out.println(dimension);
		System.out.println("height:" + dimension.getHeight() + "\tWidth: " + dimension.getWidth());
		
		driver.quit();
		

	}

}
