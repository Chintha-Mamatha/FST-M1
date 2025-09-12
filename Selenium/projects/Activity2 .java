package lms_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://alchemy.hguy.co/lms");

			WebElement headingElement = driver.findElement(By.tagName("h1"));
			String actualHeading = headingElement.getText();
			System.out.println("Website Heading: " + actualHeading);

			String expectedHeading = "Learn from Industry Experts";
			if (actualHeading.equals(expectedHeading)) {
				System.out.println(" Heading matched successfully!");
			} else {
				System.out.println("Heading did not match. Expected: " + expectedHeading);
			}

		} finally {
			driver.quit();
		}
	}
}
