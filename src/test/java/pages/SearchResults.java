package pages;

import glue.steps.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchResults {
    Browsers browsers = new Browsers();

    public void verifyResults() {
        List<WebElement> results = browsers.driver.findElements(By.cssSelector("h1"));
        String foundText = "";
        if (results.size() > 1) {
            foundText = results.get(1).getText().toString();
        } else {
            foundText = results.get(0).getText().toString();
        }
        System.out.println(foundText);
        Assert.assertNotNull(foundText);
    }

    public void close() {
        browsers.quit();
    }

    public Search Search() {
        Search search = new Search();
        return search;
    }
}