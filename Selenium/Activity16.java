package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get(" https://training-support.net/webelements/selects");
		System.out.println("Page title is: " + driver.getTitle());

		WebElement element = driver.findElement(By.cssSelector("select.h-10"));

		Select dropdown = new Select(element);

		dropdown.selectByContainsVisibleText("One");
		System.out.println(dropdown.getOptions());

		dropdown.selectByIndex(2);
		System.err.println(dropdown.getFirstSelectedOption());
		dropdown.selectByValue("three");
		System.err.println(dropdown.getFirstSelectedOption());

		for (WebElement elements : dropdown.getOptions()) {

			System.out.println(elements.getText());
		}

	}

}
