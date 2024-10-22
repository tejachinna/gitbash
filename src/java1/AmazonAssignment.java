package java1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wallet");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider")).sendKeys(Keys.chord(Keys.ARROW_RIGHT + Keys.ARROW_LEFT));
		

	}

}
