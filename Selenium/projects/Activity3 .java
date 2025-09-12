
package lms_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://alchemy.hguy.co/lms");

			WebElement firstInfoBox = driver
					.findElement(By.xpath("//*[@id=\"uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810\"]//h3"));
			String actualTitle = firstInfoBox.getText();
			System.out.println("First Info Box Title: " + actualTitle);

			String expectedTitle = "Actionable Training";
			if (actualTitle.equals(expectedTitle)) {
				System.out.println(" Title matched successfully!");
			} else {
				System.out.println(" Title did not match. Expected: " + expectedTitle);
			}

		} finally {
			driver.quit();
		}
	}
}
