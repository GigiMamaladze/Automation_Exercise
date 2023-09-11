package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.LoginPageBase;
import com.solvd.carina.demo.gui.pages.common.ProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//*[@class = 'nav navbar-nav']//*[text() = ' Signup / Login']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//*[@class = 'fa fa-user']/..//*[text() = '%s']")
    private ExtendedWebElement userNameLabel;

    @FindBy(xpath = "//*[@class = 'nav navbar-nav']//*[text() = ' Products']")
    private ExtendedWebElement productsLabel;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickLogInButton() {
        loginButton.click();
        return initPage(getDriver(), LoginPageBase.class);
    }

    @Override
    public boolean isUserLoggedIn(String userName) {
        return userNameLabel.format(userName).isElementPresent();
    }

    @Override
    public ProductsPageBase clickProductsButton() {
        productsLabel.click();
        return initPage(getDriver(), ProductsPageBase.class);
    }
}
