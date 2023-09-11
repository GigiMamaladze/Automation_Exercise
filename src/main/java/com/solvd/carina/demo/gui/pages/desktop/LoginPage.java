package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//*[text() = 'Login to your account']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//*[@data-qa = 'login-email']")
    private ExtendedWebElement emailTextField;

    @FindBy(xpath = "//*[@data-qa = 'login-password']")
    private ExtendedWebElement passwordTextField;

    @FindBy(xpath = "//*[@data-qa = 'login-button']")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
    }

    @Override
    public void typeEmail(String email) {
        emailTextField.type(email);
    }

    @Override
    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    @Override
    public HomePageBase clickLogin() {
        loginButton.click();
        return initPage(getDriver(), HomePageBase.class);
    }
}
