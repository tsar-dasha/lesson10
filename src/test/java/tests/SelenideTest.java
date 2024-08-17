package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    //    Чистый Selenide (с Listener)
    @Test
    @DisplayName("Проверка названия Issue в репозитории через Web-интерфейс с Selenide")
    void findIssueRepositorySelenideTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/tsar-dasha/lesson10");
        $("#issues-tab").click();
    }
    }
