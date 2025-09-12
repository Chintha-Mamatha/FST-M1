package lms_project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://alchemy.hguy.co/lms");

            WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
            myAccountLink.click();

            String actualTitle = driver.getTitle();
            System.out.println("Page Title: " + actualTitle);

            String expectedTitle = "My Account – Alchemy LMS";
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Navigation successful Correct page opened!");
            } else {
                System.out.println("Navigation failed Expected: " + expectedTitle);
            }

        } finally {
            driver.quit();
        }
    }
}
