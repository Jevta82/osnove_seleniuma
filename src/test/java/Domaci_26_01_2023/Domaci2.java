package Domaci_26_01_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Domaci2 {
    public static void main(String[] args) throws InterruptedException {

        //Napisati program koji:
        //Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
        //Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI PETLJOM)
        //POMOC: Brisite elemente odozdo.
        //(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://s.bootsnipp.com/iframe/Dq2X");

        List<WebElement> niz = driver.findElements(By.xpath("//div/div/div/div"));
        int broj = niz.size();

        for (int i = 0; i < niz.size(); i++) {
            driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();
            System.out.println("Obrisan je " + (i+1) + " element");
            Thread.sleep(1000);
            broj = broj-1;

        }
        System.out.println("Niz je prazan, ima " + broj + " elemenata!");



        Thread.sleep(5000);
        driver.quit();
    }
}
