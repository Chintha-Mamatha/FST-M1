package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		// Open the page
		driver.get("https://training-support.net/webelements/alerts");

		// Get and print the title
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);

		
		driver.findElement(By.id("prompt")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		System.err.println(promptAlert.getText());
		
		
		
		
		
	}

}
