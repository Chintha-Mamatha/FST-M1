package activities;

import java.awt.dnd.DragSourceMotionListener;
import java.time.Duration;
import java.util.List;

import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get(" https://training-support.net/webelements/selects");
		System.out.println("Page title is: " + driver.getTitle());

		WebElement element = driver.findElement(By.cssSelector("select.h-80"));

		Select multiselect = new Select(element);
		
		//Select the "HTML" option using the visible text.

		multiselect.selectByVisibleText("HTML");

		//Select the 4th, 5th and 6th options using the index.
		for (int i = 3; i <= 5; i++) {
			multiselect.selectByIndex(i);
		}

		List<WebElement> selectedOptions = multiselect.getAllSelectedOptions();

		for (WebElement options : selectedOptions) {
			System.out.println(options.getText());
		}
		//Deselect the 5th option using index.

		multiselect.deselectByIndex(4);

		selectedOptions = multiselect.getAllSelectedOptions();

		for (WebElement options : selectedOptions) {
			System.out.println(options.getText());
		}

	}

}
