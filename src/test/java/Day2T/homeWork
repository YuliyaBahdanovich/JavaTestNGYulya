package Day2T;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Day2HomeWork {

    WebDriver driver;


    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/Users/yuliyabahdanovich/IdeaProjects/JavaTestNGYulya/src/test/resources/drivers/geckodriver");

        driver = new FirefoxDriver ();
        
    }

    @Test
    public void testYahooSearch() {
        String queryString = "learn Selenium webdriver";


        openMainPage();
        typeQuery(queryString);
        submitSearch();
        waitForResultPage();
        assertResultPage();


    }

    private void assertResultPage() {
        WebElement resultsStats = driver.findElement(By.id("results"));
        boolean isResultsDisplayed = resultsStats.isDisplayed();

        assertTrue(isResultsDisplayed);
    }

    private void waitForResultPage() {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
    }

    private void submitSearch() {
        WebElement inputTextField = driver.findElement(By.cssSelector("#uh-search-box"));
        inputTextField.submit();
    }

    private void typeQuery(String textToType) {
        WebElement inputTextField = driver.findElement(By.cssSelector("#uh-search-box"));
        inputTextField.sendKeys(textToType);
    }

    private void openMainPage() {
        String url = "https://www.yahoo.com";
        driver.get(url);
    }


}
