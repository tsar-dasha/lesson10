package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StepsTest {
    //     Шаги с аннотацией @Step
    private static final String REPOSITORY = "eroshenkoam/allure-example";

    @Test
    @DisplayName("Проверка названия Issue в репозитории через Web-интерфейс со степами")
    public void findIssueRepositoryStepTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssueWithNumber();
    }
}
