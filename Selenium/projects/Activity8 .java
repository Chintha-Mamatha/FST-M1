package lms_project;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://alchemy.hguy.co/lms");

            WebElement contactLink = driver.findElement(By.linkText("Contact"));
            contactLink.click();

            WebElement fullName = driver.findElement(By.id("wpforms-8-field_0"));  // Full Name
            WebElement email = driver.findElement(By.id("wpforms-8-field_1"));     // Email
            WebElement subject = driver.findElement(By.id("wpforms-8-field_3"));   // Subject
            WebElement message = driver.findElement(By.id("wpforms-8-field_2"));   // Message

            fullName.sendKeys("Test User");
            email.sendKeys("testuser@example.com");
            subject.sendKeys("Automation Test");
            message.sendKeys("This is a test message submitted via Selenium automation.");

            WebElement submitButton = driver.findElement(By.id("wpforms-submit-8"));
            
            Thread.sleep(5000);
            submitButton.click();

            WebElement confirmation = driver.findElement(By.id("wpforms-confirmation-8"));
            System.out.println("Form Submission Message: " + confirmation.getText());

        } finally {
            driver.quit();
        }
    }
}
