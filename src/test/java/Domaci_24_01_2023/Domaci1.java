package Domaci_24_01_2023;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Domaci1 {
    public static void main(String[] args) throws InterruptedException {

        //Maksimizirati prozor
        //Ucitati stranicu https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        //Prijavite se na sistem
        //Username: Admin
        //Password: admin123
        //Cekanje od 5s
        //U input za pretragu iz navigacije unesite tekst Me
        //Kliknite na prvi rezultat pretrage (to ce biti Time)
        //Cekanje od 1s
        //Kliknite u headeru na svog avatara (to ce biti na ime: Paul Collings)
        //Klinkite na logout
        //Cekanje od 5s
        //Zatvorite pretrazivac
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//input[(@placeholder='Username')]"));
        username.sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(@class,'oxd-userdropdown-img')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@class,'oxd-dropdown-menu')]/li[4]/a")).click();


        Thread.sleep(5000);
        driver.quit();
    }
}
