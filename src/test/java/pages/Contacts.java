package pages;

import glue.steps.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Contacts {
Browsers browsers = new Browsers();


    public void clickContacts(){
        WebElement contacts = browsers.driver().findElement(By.cssSelector("#menu-item-2868 > a"));
        contacts.click();


        WebElement contactsTitle = browsers.driver().findElement(By.cssSelector("#page-title > span"));
        String contactsTitlePage = contactsTitle.getText();
        Assert.assertTrue(contactsTitle.isDisplayed());
        System.out.println(contactsTitlePage);

        Assert.assertTrue(true, "Title is displayed");
        contactsTitle.isDisplayed();
    }


}
