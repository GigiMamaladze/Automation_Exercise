package com.solvd.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductsPageBase extends AbstractPage {

    protected ProductsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeProductOnSearchTextField(String product);

    public abstract SearchedProductsPageBase clickSearchIcon();
}
