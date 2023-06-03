import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void openGooglePage() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        // znalezienie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
// klikniecie przycisku
        agreeButton.click();
        // znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");
        // zasymuluj nacisniecie przycisku Enter
        searchField.sendKeys(Keys.ENTER);
        // znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());
    }

    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                String chromePatch = "C:\\Users\\Adrian\\Documents\\GitHub\\Selenium\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromePatch);
                return new ChromeDriver();
            case "edge":
                String edgePatch = "C:\\Users\\Adrian\\Documents\\GitHub\\Selenium\\msedgedriver.exe";
                System.setProperty("webdriver.edge.driver", edgePatch);
                return new EdgeDriver();
            default:
                throw new InvalidArgumentException("Invalid browser name");
        }}}