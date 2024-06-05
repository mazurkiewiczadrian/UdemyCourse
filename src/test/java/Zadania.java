import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
}


