package ru.geekbrains.java.for_testing.lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CatalogPage extends BaseActions {

    private static final By ITEM_NAME = By.cssSelector("a.product-name");
    private static final By ITEM_LIST = By.cssSelector("#center_column > ul > li");

    List<WebElement> elements;

//    WebElement element;

    public CatalogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickRandomElement() {
        waitABit(5000);
        elements = findElements(ITEM_NAME);
//        elements = driver.findElements(ITEM_LIST);
        int n = (int) (Math.random() * elements.size());
//        scrollPage();
        new Actions(driver).moveToElement(
                elements.get(1),
                50,
                50)
                .click()
                .perform();
//        Actions actions = new Actions(driver);
//        Dimension size = elements.get(n).getSize();
//        actions.moveToElement(
//                elements.get(n),
//                size.getWidth() % 2,
//                (size.getHeight() % 2 + 50))
//                .doubleClick()
//                .build()
//                .perform();
    }

}