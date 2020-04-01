package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedList;
import java.util.List;


public class SearchPage extends BasePage {
    @FindAll({@FindBy(css = "#rso > div > div")})
    private List<WebElement> searchItemWrap;

    SearchPage(WebDriver driver, String browser) {
        super(driver, browser);
    }

    public List<SearchItemComponent> getSearchItemComponent() {
        List<SearchItemComponent> searchItemComponents = new LinkedList<>();
        for (WebElement element : searchItemWrap) {
            System.out.println(element);
            SearchItemComponent searchItemComponent = new SearchItemComponent();
            searchItemComponent.setDescription(element.findElement(By.cssSelector("div.s > div > span")));
            searchItemComponent.setTitle(element.findElement(By.cssSelector("a > h3")));
            searchItemComponents.add(searchItemComponent);
        }
        return searchItemComponents;
    }
}
