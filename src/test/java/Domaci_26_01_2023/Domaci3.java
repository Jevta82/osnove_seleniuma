package Domaci_26_01_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci3 {
    public static void main(String[] args) throws InterruptedException {

        //Napisati program koji ucitava stranicu https://geodata.solutions/
        //Bira Country, State i City po vasoj zelji
        //Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
        //I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
        //Izabrerit Country, State i City tako da imate podatke da selektujete!

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://geodata.solutions/");

        WebElement country = driver.findElement(By.id("countryId"));
        country.click();
        Thread.sleep(2000);
        country.findElement(By.xpath("//*[@id='countryId']/option[3]")).click();

        Thread.sleep(2000);
        WebElement state = driver.findElement(By.id("stateId"));
        state.click();
        Thread.sleep(2000);
        state.findElement(By.xpath("//*[@id='stateId']/option[5]")).click();
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.id("cityId"));
        city.click();
        Thread.sleep(2000);
        city.findElement(By.xpath("//*[@id='cityId']/option[20]")).click();









        Thread.sleep(5000);
        driver.quit();
    }
}
