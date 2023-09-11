package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.pages.common.ProductsPageBase;
import com.solvd.carina.demo.gui.pages.common.SearchedProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ProductsPageBase.class)
public class ProductsPage extends ProductsPageBase {

    @FindBy(xpath = "//*[@id = 'search_product']")
    private ExtendedWebElement searchTextField;

    @FindBy(xpath = "Incorrect xpath")
    private ExtendedWebElement searchIcon;

    protected ProductsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(searchTextField);
    }

    @Override
    public void typeProductOnSearchTextField(String product) {
         searchTextField.type(product);
    }

    @Override
    public SearchedProductsPageBase clickSearchIcon() {
        searchIcon.click();
        return initPage(getDriver(), SearchedProductsPageBase.class);
    }
}
