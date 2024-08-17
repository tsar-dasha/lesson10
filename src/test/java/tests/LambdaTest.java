package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LambdaTest {
    //    Лямбда шаги через step (name, () -> {})
    @Test
    @DisplayName("Проверка названия Issue в репозитории через Web-интерфейс c лямбда")
    void findIssueRepositoryLambdaTest() {
        open("https://github.com/tsar-dasha/lesson10");
        $("#issues-tab").click();
    }
}
