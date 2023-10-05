package week4.day1HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlertInteraction {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Prompt Alert");
		
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[contains(text(),'Hello Prompt Alert')]")).getText();
		System.out.println(text);
	}

}
