import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsTest {
    @Test
    public void findElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


        //1) Search for CSS Id
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);
        //2) Search for CSS Class
        By cssClass = By.cssSelector(".topSecret");
        driver.findElements(cssClass);
        //3) Search for CSS Tag
        By cssTag  = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("First");
        //4) Seach for CSS Name
        By cssName = By.cssSelector("[name='fname']");
        driver.findElements(cssName);

        By cssClass2 = By.cssSelector("[class='topSecret']");
        driver.findElement(cssClass2);



    }
}
