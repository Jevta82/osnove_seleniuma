package Domaci_27_01_2023;

import Helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://mdbootstrap.com/docs/standard/components/toasts/#section-basic-example");
        Helper helper = new Helper();

        List<WebElement> niz = driver.findElements(By.xpath("//*[@id='section-basic-example']/section[1]/div/section/div"));

        for (int i = 0; i < niz.size(); i++) {
            niz.get(i).click();
            Thread.sleep(1000);

            if (helper.ElementExist(driver,By.className("show"))){
                System.out.println("Pojavio se");
            }
        }




        Thread.sleep(4000);
        driver.quit();

    }
}
