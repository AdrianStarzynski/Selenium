import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {
    @Test
    public void findElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //1) SEARCH FOR ID - ID ITS "clikOnMe"
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);


        // 2) SEARCH FOR NAME - NAME ITS "fname"
        By firstName = By.name("fname");
        //2.1) First metod
        WebElement firstNameInput = driver.findElement(firstName);
        //2.2) Second metod
        WebElement firstNameInput2 = driver.findElement(By.name("fname"));

        //3) SEARCH FOR CLASS - CLASS name "topSecret"
        By paraHidden = By.className("topSecret");
        driver.findElements(paraHidden);

        //4) SEARCH FOR TAG
        // !!! ONLY FIRST TAG ELELMNT WITH TAGNAME "input" ON WEBSIDE AND WHRITE IN FIRST INPUT -"first"
        By inputLocator =By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("first");
        // ALL WEBELEMENT WITH TAGNAME "input" ON WEBSIDE AND PRIT HOW MANY INPUTS IS ON WEBSIDE
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

        //5) SEARCH ROF LINK TEXT
        //5.1) SEARCH FOR FULL TEXTLINK
        By linkText = By.linkText("Visit W3Schools.com!");
        WebElement schoolLink = driver.findElement(linkText);
        //5.2) SEARCH FOR ONLY PARTS OF TEXTLINK
        By partialLink = By.partialLinkText("Visit");
        WebElement schoolPartial = driver.findElement(partialLink);


    }
}
