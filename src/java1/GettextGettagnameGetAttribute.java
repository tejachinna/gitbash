package java1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextGettagnameGetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Signinbtn=driver.findElement(By.xpath("//button[text()='Sign in']"));
		System.out.println(Signinbtn.getText());
		System.out.println(Signinbtn.getTagName());
		System.out.println(Signinbtn.getAttribute("aria-label"));
		driver.quit();
		
	}

}
