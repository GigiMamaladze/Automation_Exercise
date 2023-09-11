package com.solvd.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    protected HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginPageBase clickLogInButton();

    public abstract boolean isUserLoggedIn(String userName);
}
