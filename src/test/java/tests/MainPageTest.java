package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("web")
public class MainPageTest extends TestBase {

    @Test
    @DisplayName("Page should have text \"Случись что, ваши расходы оплатим мы\"")
    void testMainPage() {
        open("https://mango.rocks");

        $("#allrecords").shouldHave(text("Случись что, ваши расходы оплатим мы"));
    }

    @Test
    @DisplayName("Page should click button")
    void testClickButton() {
        open("https://mango.rocks");

        $("#petsPageLink").click();

        $("body").shouldHave(text("Безусловная любовь"));
    }

    @Test
    @DisplayName("click button about us")
    void testClickAboutUs() {
        open("https://mango.rocks");

        $(byText("О НАС"), 0).click();

        $("body").shouldHave(text("Как мы работаем"));
    }
}