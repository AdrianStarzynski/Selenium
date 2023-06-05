import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.BreakIterator;

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
        //5) Search all tags on webside - in console $$("*")
        By all = By.cssSelector("*");
        driver.findElement(all);
        //6) Search ul inside Div, tr in table, tr in table body;
        // in devtools console - $$("div ul")
        // in devtools console - $$("table tr")
        // in devtools console - $$("tbody tr")

        By ulInsideDiv = By.cssSelector("div ul");
        By trInTable = By.cssSelector("table tr");
        By trBody = By.cssSelector("tbody tr");

        driver.findElement(ulInsideDiv);
        driver.findElement(trInTable);
        driver.findElement(trBody);

        //7) Seach only first elelment on (selector) - in console $$("div >tbody")
        By firstChildUlInDiv = By.cssSelector("div > ul");
        By firstChildTrInTbody = By.cssSelector("tbody > tr");

        driver.findElement(firstChildTrInTbody);
        driver.findElement(firstChildUlInDiv);

        //8) Seach only first elelment after label - in console $$(label + from)
        By firstFromAfterLabel = By.cssSelector("label + form");
        driver.findElement(firstFromAfterLabel);
        //8.1) Search all elemets after label - in console $$(label ~ from)
        By aLlFromAfterLabel = By.cssSelector("label ~ form");
        driver.findElement(aLlFromAfterLabel);

        //9) Search only part of elements

        By attrTag = By.cssSelector("input[name= 'fname']");
        By attrContains = By.cssSelector("[name*='name']");
        By attrStarts = By.cssSelector("[name^='f']");
        By attrEnds = By.cssSelector("[name$='name']");

        driver.findElement(attrTag);
        driver.findElement(attrContains);
        driver.findElement(attrStarts);
        driver.findElement(attrEnds);

    }
}
