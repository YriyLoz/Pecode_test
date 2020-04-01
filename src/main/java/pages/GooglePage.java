package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {
    @FindBy(css = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")
    private WebElement searchField;
    @FindBy(css = "div.tfB0Bf:nth-child(7) > center:nth-child(2) > input:nth-child(1)")
    private WebElement searchButton;
    @FindBy(css = "div.tfB0Bf:nth-child(7) > center:nth-child(2) > input:nth-child(2)")
    private WebElement imFeelingLuckyButton;

    public GooglePage(WebDriver driver, String browser) {
        super(driver, browser);
        driver.get("https://www.google.com.ua/");
    }

    @Step("Fill search field with value {0}")
    public void fillSearchField(String value) {
        searchField.sendKeys(value);
        if (getBrowser().equals("firefox"))
            searchField.click();
    }

    @Step("Click \"Google Search\" button")
    public void clickSearchButton() {
        searchButton.click();
    }

    @Step("Search")
    public SearchPage search(String value) {
        fillSearchField(value);
        clickSearchButton();
        return new SearchPage(getDriver(), getBrowser());
    }
}
