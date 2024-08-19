package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static io.qameta.allure.Allure.step;

public class LambdaTest {
    //    Лямбда шаги через step (name, () -> {})
    private static final String REPOSITORY = "eroshenkoam/allure-example";

    @Test
    @DisplayName("Проверка названия Issue в репозитории через Web-интерфейс c лямбда")
    void findIssueRepositoryLambdaTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу", () -> {
            open("https://github.com/");
        });
        step("Ищем репозиторий " + REPOSITORY, () -> {
            $(".search-input").click();
            $("#query-builder-test").setValue(REPOSITORY);
            $("#query-builder-test").pressEnter();
        });
        step("Кликаем по ссылке репозитория " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Открываем таб Issues", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем наличие Issue с номером", () -> {
            $("#repository-container-header").shouldHave(text("Issues 64"));
        });
    }
}
