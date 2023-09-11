package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.LoginPageBase;
import com.zebrunner.agent.core.annotation.Maintainer;
import com.zebrunner.agent.core.annotation.TestCaseKey;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationExerciseTest implements IAbstractTest {

    @Test
    @Maintainer("Gmamaldze")
    @TestCaseKey("DEF-1081")
    public void testLogin() {
        HomePageBase homepage  = initPage(getDriver(), HomePageBase.class);
        homepage.open();
        Assert.assertTrue(homepage.isPageOpened(), "Page is opened");
        LoginPageBase loginPage = homepage.clickLogInButton();
        loginPage.typeEmail("Test@mail.com");
        loginPage.typePassword("Test123");
        homepage = loginPage.clickLogin();
        Assert.assertTrue(homepage.isUserLoggedIn("Test"), "User is not logged in");
    }

    @Test
    @Maintainer("Gmamaldze")
    public void failedTest() {
        HomePageBase homepage  = initPage(getDriver(), HomePageBase.class);
        homepage.open();
        Assert.assertTrue(homepage.isPageOpened(), "Page is opened");
        LoginPageBase loginPage = homepage.clickLogInButton();
        loginPage.typeEmail("Test@mail.com");
        loginPage.typePassword("Test12333");
        homepage = loginPage.clickLogin();
        Assert.assertTrue(homepage.isUserLoggedIn("Test"), "User is not logged in");
    }
}
