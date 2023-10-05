package week4.day1HomeAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

         ChromeDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("http://leaftaps.com/opentaps/control/login");
         driver.manage().window().maximize();
         
         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         driver.findElement(By.id("label")).click();
         driver.findElement(By.linkText("Contacts")).click();
         driver.findElement(By.linkText("Merge Contacts")).click();
         driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
         Set<String> windowHandles = driver.getWindowHandles();
         List<String> window = new ArrayList<String>(windowHandles);
         driver.switchTo().window(window.get(1));
         driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
         driver.switchTo().window(window.get(0));
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
         windowHandles = driver.getWindowHandles();
         window = new ArrayList<String>(windowHandles);
         driver.switchTo().window(window.get(1));
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
         driver.switchTo().window(window.get(0));
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
         Alert alert = driver.switchTo().alert();
         alert.accept();
         String title = driver.getTitle();
         System.out.println(title);
         
         
        

	}

}
