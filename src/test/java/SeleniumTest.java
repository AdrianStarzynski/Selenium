import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
    }
    @Test
    public void openGooglePage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Adrian\\Documents\\GitHub\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/AdrianStarzynski");
    }
}
