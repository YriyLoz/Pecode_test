package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import liseners.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.GooglePage;
import pages.SearchItemComponent;
import pages.SearchPage;

import java.util.List;

@Listeners({TestListener.class})
@Epic("Google test")
public class GooglePageTest extends BaseTest {

    @Test(description = "Print google search item title")
    @Description("Print google search item title")
    public void googlePrintTitleTest() {
        GooglePage googlePage = new GooglePage(getDriver(),getBrowser());
        SearchPage searchPage = googlePage.search("Hello World");
        List<SearchItemComponent> list = searchPage.getSearchItemComponent();
        for (SearchItemComponent searchItem : list) {
            searchItem.printTitle();
        }
    }

    @Test(description = "Print google search item description")
    @Description("Print google search item description")
    public void googlePrintDescriptionTest() {
        GooglePage googlePage = new GooglePage(getDriver(), getBrowser());
        SearchPage searchPage = googlePage.search("Hello World");
        List<SearchItemComponent> list = searchPage.getSearchItemComponent();
        for (SearchItemComponent searchItem : list) {
            searchItem.printDescription();
        }
    }
}
