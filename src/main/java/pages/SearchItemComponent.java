package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class SearchItemComponent {
    private WebElement title;
    private WebElement description;

    void setTitle(WebElement title) {
        this.title = title;
    }

    void setDescription(WebElement description) {
        this.description = description;
    }

    @Step("Print title")
    public void printTitle() {
        System.out.println(title.getText());
    }

    @Step("Print description")
    public void printDescription() {
        System.out.println(description.getText());
    }

    @Override
    public String toString() {
        return "SearchItemComponent{" +
                "title=" + title +
                ", description=" + description +
                '}';
    }
}
