package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepsTest {
    //     Шаги с аннотацией @Step
    @Test
    @DisplayName("Проверка названия Issue в репозитории через Web-интерфейс со степами")
    void findIssueRepositoryStepTest() {
        open("https://github.com/tsar-dasha/lesson10");
        $("#issues-tab").click();
    }
}
