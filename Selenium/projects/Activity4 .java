package lms_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://alchemy.hguy.co/lms");

            WebElement secondCourse = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]"));
            String actualTitle = secondCourse.getText();
            System.out.println("Second Popular Course Title: " + actualTitle);

            String expectedTitle = "Email Marketing Strategies";
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Title matched successfully!");
            } else {
                System.out.println("Title did not match. Expected: " + expectedTitle);
            }

        } finally {
            driver.quit();
        }
    }
}
