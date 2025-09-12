package lms_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) {
             WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://alchemy.hguy.co/lms");

            String actualTitle = driver.getTitle();
            System.out.println("Website Title: " + actualTitle);

            String expectedTitle = "Alchemy LMS – An LMS Application";
            if (actualTitle.equals(expectedTitle)) {
                System.out.println(" Title matched successfully!");
            } else {
                System.out.println("Title did not match. Expected: " + expectedTitle);
            }

        } finally {
            driver.quit();
        }
    }
}
