package lms_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {
    public static void main(String[] args) {
        String username = "root";
        String password = "pa$$w0rd";

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://alchemy.hguy.co/lms");

            WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
            myAccountLink.click();

            String actualTitle = driver.getTitle();
            String expectedTitle = "My Account – Alchemy LMS";
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Navigated to My Account page.");
            } else {
                System.out.println("Wrong page. Expected: " + expectedTitle);
            }

            WebElement loginTab = driver.findElement(By.xpath("//a[@class=\"ld-login ld-login ld-login-text ld-login-button ld-button\"]"));
            loginTab.click();

            WebElement usernameField = driver.findElement(By.id("user_login"));
            usernameField.sendKeys(username);

            WebElement passwordField = driver.findElement(By.id("user_pass"));
            passwordField.sendKeys(password);

            WebElement loginButton = driver.findElement(By.id("wp-submit"));
            loginButton.click();

            WebElement logoutLink = driver.findElement(By.linkText("Logout"));
            if (logoutLink.isDisplayed()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed.");
            }

        } finally {
            driver.quit();
        }
    }
}
