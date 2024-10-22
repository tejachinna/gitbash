package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#gh-ac")).sendKeys("watches");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(3000);
		String header=driver.findElement(By.cssSelector("div.sh-bold")).getText(); 
		Thread.sleep(3000);
		if(header.contains("Sigmatime"))
			System.out.println("test pass");
		else
			System.out.println("test fail");
		driver.quit();


	}

}
 