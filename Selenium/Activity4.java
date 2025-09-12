package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Page Title is : "+driver.getTitle());
		
		
		
		
		String heading3= driver.findElement(By.xpath("//h3[@class=\"text-3xl font-bold text-orange-600\"]")).getCssValue("color");
		
		String heading5 = driver.findElement(By.xpath("//h5[@class=\"text-3xl font-bold text-purple-600\"]")).getCssValue("color");
		
		System.out.println("New page Title is : "+driver.getTitle());
		
		System.err.println("Heading 3 color is : "+heading3);
		System.out.println("Heading 5 color is : "+heading5);
		
		driver.quit();
		
		
		
		
		
	}

}
