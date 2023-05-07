package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateNewOpportunity {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Actions actions = new Actions(driver);
	
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	driver.findElement(By.xpath("(//p[@class='al-app-tile-description'])[2]")).click();
	
	
	WebElement opp = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
	driver.executeScript("arguments[0].click()", opp);
	
	driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
	driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Salesforce Automation by Hari",Keys.ENTER);
	
	driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
	driver.findElement(By.xpath("//button[@name='today']")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class='slds-truncate'])[58]")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]")).click();
	
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
	
}
}
