import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadania {

    public WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void Zad1_findElementById() {

        WebDriver driver = getDriver();

        /** Twoja ulubiona książka */
        // Zlokalizuj pole Tytuł książki
        WebElement bookTitle = driver.findElement(By.id("book-text"));

        driver.quit();
    }

    @Test
    public void Zad2_findElementByName() {

        WebDriver driver = getDriver();
        /** Twój ulubiony film */
        // Zlokalizuj pole Tytuł filmu
        WebElement movieTitle = driver.findElement(By.name("your-movie"));
        driver.quit();
    }

    @Test
    public void Zad3_findElementByClassName() {

        WebDriver driver = getDriver();
        /** Wybierz liczbę */
        // Zlokalizuj grupę przycisków w sekcji “wybierz liczbę”
        WebElement numbersRadioButtons = driver.findElement(By.className("number"));
        driver.quit();
    }

    @Test
    public void Zad4_findElementByTagName() {

        WebDriver driver = getDriver();
        /** Wybierz stopkę */
        // Zlokalizuj stopkę, która znajduje się na dole strony za pomocą nazwy tagu i przypisz do zmiennej footer”
        WebElement footer = driver.findElement(By.tagName("footer"));
        driver.quit();
    }

    @Test
    public void Zad5_findElementByCssSelector() {

        WebDriver driver = getDriver();
        /** Zlokalizuj pole "Wybierz kolor" */
        //
        WebElement coloursId = driver.findElement(By.cssSelector("#colour-select-multiple"));
        WebElement coloursClassName = driver.findElement(By.cssSelector(".colour"));
        WebElement coloursFullClassName = driver.findElement(By.cssSelector("select[class='wpcf7-form-control wpcf7-select colour']"));
        driver.quit();
    }

    @Test
    public void Zad6_findElementByXPath() {
        WebDriver driver = getDriver();

        WebElement number3 = driver.findElement(By.xpath("//*[contains(@id,'number-radio')]"))
                .findElement(By.xpath("//*[@value='3']"));

        WebElement greenColour = driver.findElement(By.xpath("//*[contains(@id,'colour')]"))
                .findElement(By.xpath("//*[@value='Zielony']"));
        driver.quit();
    }

    @Test
    public void Zad7_findGroupOfElements() {
        WebDriver driver = getDriver();

        List<WebElement> options = driver.findElements(By.tagName("option"));

        driver.quit();
    }
}


