package lms_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://alchemy.hguy.co/lms");

            WebElement allCoursesLink = driver.findElement(By.linkText("All Courses"));
            allCoursesLink.click();

            List<WebElement> courses = driver.findElements(By.xpath("//h3[@class='entry-title']"));

            System.out.println("Total number of courses: " + courses.size());

            for (WebElement course : courses) {
                System.out.println("Course: " + course.getText());
            }

        } finally {
            driver.quit();
        }
    }
}
