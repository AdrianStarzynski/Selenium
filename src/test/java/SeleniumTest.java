
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void openGooglePage() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Adrian\\Documents\\GitHub\\Selenium\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Adrian\\Documents\\GitHub\\Selenium\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        WebDriver driver2 = new ChromeDriver();

        driver.get("https://github.com/AdrianStarzynski");
        driver2.get("https://github.com/AdrianStarzynski");

    }
    }