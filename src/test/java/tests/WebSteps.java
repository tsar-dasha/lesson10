package tests;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {
    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Находим нужный репозиторий в поиске")
    public void searchForRepository(String repo) {
        $(".search-input").click();
        $("#query-builder-test").setValue(repo).pressEnter();
    }

    @Step("В списке нажимаем на ссылку с репозиторием")
    public void clickOnRepositoryLink(String repo) {
        $(linkText(repo)).click();
    }

    @Step("Открываем таб Issues")
    public void openIssuesTab() {
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие Issue с номером")
    public void shouldSeeIssueWithNumber() {
        $("#repository-container-header").shouldHave(text("Issues 64"));
    }
}
