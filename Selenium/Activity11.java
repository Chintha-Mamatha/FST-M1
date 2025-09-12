package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/dynamic-controls");

		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);

		WebElement checkbox = driver.findElement(By.id("dynamicCheckbox"));

		WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));

		toggleButton.click();

		wait.until(ExpectedConditions.invisibilityOf(checkbox));

		toggleButton.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));

		WebElement newCheckbox = driver.findElement(By.id("dynamicCheckbox"));
		if (!newCheckbox.isSelected()) {
			newCheckbox.click();
		}

		driver.quit();
	}
}
