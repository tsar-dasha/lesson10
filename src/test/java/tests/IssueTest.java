package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static com.codeborne.selenide.Selenide.open;

public class IssueTest {
    @Test
    @DisplayName("Проверка названия Issue в репозитории через Web-интерфейс")
    void findIssueRepositoryTest(){
        open("https://github.com/tsar-dasha/lesson9");

    }
}
