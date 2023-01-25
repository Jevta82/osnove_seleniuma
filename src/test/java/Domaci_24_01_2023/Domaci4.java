package Domaci_24_01_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//button[@type='button']")).click();
            driver.findElement(By.id("name")).sendKeys("Aleksandar");
            driver.findElement(By.id("department")).sendKeys("ITBootcamp");
            driver.findElement(By.id("phone")).sendKeys("062303087");
            Thread.sleep(1000);
          //  driver.findElement(By.xpath("//i[contains(@class,'material-icons')][last()]")).click();
            driver.findElement(By.xpath("(//a[@class='add'])[last()]")).click();
        }

        driver.quit();
    }
}
