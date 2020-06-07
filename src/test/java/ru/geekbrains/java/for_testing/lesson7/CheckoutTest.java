package ru.geekbrains.java.for_testing.lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.geekbrains.java.for_testing.lesson5.BaseUITest;
import ru.geekbrains.java.for_testing.lesson5.Header;

import static java.lang.Thread.sleep;

public class CheckoutTest extends BaseUITest {

    @Test
    public void proceedToPaymentByBankTest() throws InterruptedException {
        mainPage.home();
        mainPage.home();
        header.goToSignIn();
        signInPage.authentication("12345@123.ru", "пароль");
//        accountPage.checkAccountPage();
        Assert.assertTrue(accountPage.checkAccountPage(), "Найдена ошибка в отображении элементов на AccountPage");
        header.clickButtonTopMenu(Header.СheckButton.dresses);
        sleep(1000);
        catalogPage.clickRandomElement();
        sleep(1000);
        itemPage.addToCard(1);
        sleep(1000);
        popUpAfterAddToCart.checkPopUp();
        sleep(1000);
        popUpAfterAddToCart.closePopUp();
        header.goToCart();
        sleep(3000);
//        cartPage.proceedToCheckoutAllTheWay(1);
//        sleep(3000);
        cartPage.checkoutInCart();
        cartPage.checkoutInAddress();
        cartPage.checkboxInShipping();
        cartPage.checkoutInShipping();
        cartPage.typeOfPayment(1);
        cartPage.confirmOder();
        cartPage.backToOrders();
        sleep(3000);
    }

    @Test
    public void proceedToPaymentByCheckTest() throws InterruptedException {
        mainPage.home();
        mainPage.home();
        header.goToSignIn();
        signInPage.authentication("12345@123.ru", "пароль");
//        accountPage.checkAccountPage();
        Assert.assertTrue(accountPage.checkAccountPage(), "Найдена ошибка в отображении элементов на AccountPage");
        header.clickButtonTopMenu(Header.СheckButton.dresses);
        sleep(1000);
        catalogPage.clickRandomElement();
        sleep(1000);
        itemPage.addToCard(1);
        sleep(1000);
        popUpAfterAddToCart.checkPopUp();
        sleep(1000);
        popUpAfterAddToCart.closePopUp();
        header.goToCart();
        sleep(3000);
//        cartPage.proceedToCheckoutAllTheWay(2);
//        sleep(3000);
        cartPage.checkoutInCart();
        cartPage.checkoutInAddress();
        cartPage.checkboxInShipping();
        cartPage.checkoutInShipping();
        cartPage.typeOfPayment(2);
        cartPage.confirmOder();
        cartPage.backToOrders();
        sleep(3000);
    }

}