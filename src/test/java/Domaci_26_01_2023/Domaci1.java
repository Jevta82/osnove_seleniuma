package Domaci_26_01_2023;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Domaci1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.cypress.io/todo");

        ArrayList<String> toDo = new ArrayList<>();
        toDo.add("Visit Paris");
        toDo.add("Visit Prague");
        toDo.add("Visit London");
        toDo.add("Visit New York");
        toDo.add("Visit Belgrade");
        List<WebElement>dugme = driver.findElements(By.xpath("//button[contains(@class,'destroy')]"));
        for (int i = 1; i < dugme.size()-1; i++) {
            dugme.get(i).click();
        }

        for (int i = 0; i < toDo.size(); i++) {
            driver.findElement(By.xpath("//input[(@placeholder='What needs to be done?')]"))
                    .sendKeys(toDo.get(i));
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[(@placeholder='What needs to be done?')]"))
                    .sendKeys(Keys.ENTER);
            Thread.sleep(1000);
            if(toDo.get(i).isEmpty()){
                System.out.println("Nije dodat element");
            } else {
                System.out.println("Element je dodat");
            }
        }
        Thread.sleep(1000);
        int zbir = toDo.size() + dugme.size();

        for (int i = 0; i < toDo.size(); i++) {
            driver.findElement(By.xpath("/html/body/section/div/section/ul/li/div")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[contains(@class,'destroy')]")).click();
            zbir = zbir - 1;
        }
        for (int i = 0; i < dugme.size(); i++) {
            driver.findElement(By.xpath("/html/body/section/div/section/ul/li/div")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[contains(@class,'destroy')]")).click();
            zbir=zbir - 1;
        }
        Thread.sleep(5000);

        if(zbir==0){
            System.out.println("Niz je prazan");
        }

        Thread.sleep(4000);
        driver.quit();
    }
}
