package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    //    Чистый Selenide (с Listener)
    @Test
    @DisplayName("Проверка названия Issue в репозитории через Web-интерфейс с Selenide")
    void findIssueRepositorySelenideTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");

        $(".search-input").click();
        $("#query-builder-test").setValue("eroshenkoam/allure-example");
        $("#query-builder-test").pressEnter();

        $(linkText("eroshenkoam/allure-example")).click();
        $("#issues-tab").click();
        $(withText("#64")).should(Condition.exist);
    }
}
