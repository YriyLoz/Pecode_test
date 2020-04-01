package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class BasePage {
    private WebDriver driver;
    private String browser;

    BasePage(WebDriver driver, String browser) {
        this.driver = driver;
        this.browser = browser;
        PageFactory.initElements(driver, this);
    }

    public String getBrowser() {
        return browser;
    }

    WebDriver getDriver() {
        return driver;
    }
}