import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie_1 {

    public WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void findElementById() {

        WebDriver driver = getDriver();

        /** Twoja ulubiona książka */
        // Zlokalizuj pole Tytuł książki
        WebElement bookTitle = driver.findElement(By.id("book-text"));

        driver.quit();
    }
}


