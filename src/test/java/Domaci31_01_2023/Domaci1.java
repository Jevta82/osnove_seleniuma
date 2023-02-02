package Domaci31_01_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Domaci1 {
    public static void main(String[] args) throws InterruptedException {

        File uploadImg = new File("test_data/left.png");
        String slika = uploadImg.getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");
        driver.manage().window().maximize();

        driver.findElement(By.className("edit-image")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("image-option-remove")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("edit-image")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("boomf-designs-button")));
        driver.findElement(By.id("imageUpload")).sendKeys(slika);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("image-option-0")));
        driver.findElement(By.id("image-option-0")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='image-crop-done-button']/button")).click();
        Thread.sleep(2000);




        Thread.sleep(5000);
        driver.quit();



    }
}
