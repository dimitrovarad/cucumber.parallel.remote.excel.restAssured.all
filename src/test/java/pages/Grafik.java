package pages;

import glue.steps.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Grafik {
    Browsers browsers = new Browsers();

    public void GrafikPage(){
        WebElement grafik = browsers.driver().findElement(By.cssSelector("#menu-item-5471 > a"));
        grafik.click();;

        WebElement grafikTxt = browsers.driver().findElement(By.cssSelector("#page-title > span"));
        grafikTxt.getText();

        Assert.assertTrue(grafikTxt.isDisplayed());
    }


}
