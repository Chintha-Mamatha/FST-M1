package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity18 {
	public static void main(String[] args) {

		// Set up ChromeDriver (WebDriver Manager can also be used if configured)
		WebDriver driver = new ChromeDriver();

		// Open the browser to the URL
		driver.get("https://training-support.net/webelements/alerts");

		// Get the title and print it
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);

		// Find the button to open a SIMPLE alert and click it
		driver.findElement(By.id("simple")).click();

		// Switch to the alert
		Alert simpleAlert = driver.switchTo().alert();

		// Get the text in the alert and print it
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is: " + alertText);

		// Close the alert using OK
		simpleAlert.accept();

		// Close the browser
		driver.quit();
	}
}
