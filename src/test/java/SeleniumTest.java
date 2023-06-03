import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void openGooglePage() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        Dimension widnowsSize = new Dimension(500,500);
        driver.manage().window().setSize(widnowsSize);
        driver.get("https://github.com/adrianstarzynski");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.open('https://github.com/', 'blank', 'height=500,width=500')");
        driver.close();
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