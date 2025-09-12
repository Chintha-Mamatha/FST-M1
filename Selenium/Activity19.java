package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity19 {
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		// Open the page
		driver.get("https://training-support.net/webelements/alerts");

		// Get and print the title
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);

		// Find and click the button to open a CONFIRM alert
		driver.findElement(By.id("confirm")).click();

		// Switch to alert
		Alert confirmAlert = driver.switchTo().alert();

		// Get and print alert text
		String alertText = confirmAlert.getText();
		System.out.println("Alert text is: " + alertText);

		// Accept the alert (OK)
		confirmAlert.accept();
		System.out.println("Alert accepted.");

		// Click again to open the confirm alert
		driver.findElement(By.id("confirm")).click();

		// Switch to alert
		confirmAlert = driver.switchTo().alert();

		// Dismiss the alert (Cancel)
		confirmAlert.dismiss();
		System.out.println("Alert dismissed.");

		// Close the browser
		driver.quit();
	}
}
