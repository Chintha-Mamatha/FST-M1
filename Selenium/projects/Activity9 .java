package lms_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://alchemy.hguy.co/lms");

            WebElement allCoursesLink = driver.findElement(By.linkText("All Courses"));
            allCoursesLink.click();

            WebElement firstCourse = driver.findElement(By.xpath("(//h3[@class='entry-title'])[1]/a"));
            String courseName = firstCourse.getText();
            firstCourse.click();

            WebElement firstLesson = driver.findElement(By.xpath("(//div[@class='ld-item-title'])[1]/a"));
            String lessonTitle = firstLesson.getText();
            firstLesson.click();

            WebElement lessonHeading = driver.findElement(By.tagName("h1"));
            String actualLessonHeading = lessonHeading.getText();
            if (actualLessonHeading.equals(lessonTitle)) {
                System.out.println("Lesson title verified: " + actualLessonHeading);
            } else {
                System.out.println("Lsson title mismatch. Expected: " + lessonTitle + " but found: " + actualLessonHeading);
            }

            try {
                WebElement markCompleteButton = driver.findElement(By.xpath("//input[@value='Mark Complete']"));
                if (markCompleteButton.isDisplayed()) {
                    markCompleteButton.click();
                    System.out.println("Lesson marked as complete.");
                }
            } catch (Exception e1) {
                System.out.println(" No 'Mark Complete' button available for this lesson.");
            }

        } finally {
            driver.quit();
        }
    }
}
