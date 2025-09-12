package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Activity22 {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the page
        driver.get("https://training-support.net/webelements/tabs");

        // Get and print the title
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        // Store the main window handle
        String mainWindow = driver.getWindowHandle();

        // Find and click the button to open a new tab
        driver.findElement(By.id("newTab")).click();

        // Wait for the new tab to open
        Thread.sleep(2000);

        // Get all window handles and print them
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("Window handles after first click: " + allHandles);

        // Switch to the new tab (other than main window)
        for (String handle : allHandles) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Print new tab's title and message
        System.out.println("New tab title: " + driver.getTitle());
        String newTabMessage = driver.findElement(By.id("message")).getText();
        System.out.println("New tab message: " + newTabMessage);

        // Click button in the new tab to open another tab
        driver.findElement(By.id("newTab")).click();

        // Wait for the next tab to open
        Thread.sleep(2000);

        // Get updated window handles and print them
        allHandles = driver.getWindowHandles();
        System.out.println("Window handles after second click: " + allHandles);

        // Switch to the latest opened tab
        for (String handle : allHandles) {
            if (!handle.equals(mainWindow) && !handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Print latest tab's title and message
        System.out.println("Latest tab title: " + driver.getTitle());
        String latestTabMessage = driver.findElement(By.id("message")).getText();
        System.out.println("Latest tab message: " + latestTabMessage);

        // Close all tabs
        driver.quit();
    }
}
