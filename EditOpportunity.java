package Assignment1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EditOpportunity {
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
	
	driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Automation by Hari",Keys.ENTER);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(@class,'slds-button--icon-border-filled')]")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[@class='forceActionLink'])[1]")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).clear();
	driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("5/8/2023");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@class='slds-truncate'])[47]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='slds-truncate'])[54]")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@class='slds-truncate'])[60]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='slds-truncate'])[62]")).click();
	
	driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("SalesForce");

	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
    
	WebElement title = driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
    System.out.println(title.getText());
}
}
