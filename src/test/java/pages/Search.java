package pages;

import glue.steps.Browsers;
import helper.WaitTool;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Search {
    Browsers browsers = new Browsers();
    private WebElement search;
    private WebElement searchButton;


    public void searchInStore(String query) {
        WaitTool waitTool = new WaitTool();
        searchButton = waitTool.waitForElement(browsers.driver(), By.className("searchlens"), 10);
        search= waitTool.waitForElement(browsers.driver, By.id("s"), 10);
        searchButton.click();
        JavascriptExecutor executor = (JavascriptExecutor) browsers.driver;
        try {
            executor.executeScript("document.getElementById('s').setAttribute('onfocus', '')");
        } catch (Exception e) {
            System.out.println("Some java script exception");
        }
        try {
            executor.executeScript("document.getElementById('s').setAttribute('value', 'automation')");
        } catch (Exception e) {
            System.out.println("Some java script exception");
        }
        try{
            search.submit();
        }catch (Exception e){

        }
    }
}
