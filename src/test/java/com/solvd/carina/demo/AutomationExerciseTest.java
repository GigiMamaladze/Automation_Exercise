package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.LoginPageBase;
import com.solvd.carina.demo.gui.pages.common.ProductsPageBase;
import com.solvd.carina.demo.gui.pages.common.SearchedProductsPageBase;
import com.zebrunner.agent.core.annotation.Maintainer;
import com.zebrunner.agent.core.annotation.TestCaseKey;
import com.zebrunner.agent.core.annotation.XrayTestKey;
import com.zebrunner.agent.core.annotation.ZephyrTestCaseKey;
import com.zebrunner.agent.core.registrar.TestCase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AutomationExerciseTest implements IAbstractTest {

    @BeforeSuite
    public void setup() {
//        TestCase.enableRealTimeSync();
//        TestCase.setTestRunId("2765");
    }

    @Test
    @Maintainer("Gmamaldze")
    @TestCaseKey("DEF-1081")
    @XrayTestKey({"ZEB-17", "ZEB-63"})
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
}
