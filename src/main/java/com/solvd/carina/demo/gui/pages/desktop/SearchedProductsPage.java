package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.pages.common.SearchedProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchedProductsPageBase.class)
public class SearchedProductsPage extends SearchedProductsPageBase {

    protected SearchedProductsPage(WebDriver driver) {
        super(driver);
    }
}
