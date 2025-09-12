package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
      
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/tables");

        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + allRows.size());

        List<WebElement> allColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        System.out.println("Number of columns: " + allColumns.size());

        System.out.println("Values in 3rd row:");
        List<WebElement> thirdRowCells = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        for (WebElement cell : thirdRowCells) {
            System.out.println(cell.getText());
        }
        
        WebElement cell2_2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Value at 2nd row, 2nd column: " + cell2_2.getText());

        driver.quit();
    }
}
