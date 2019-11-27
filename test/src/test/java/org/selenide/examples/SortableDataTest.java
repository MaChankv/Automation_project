package org.selenide.examples;

import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SortableDataTest {
    ElementsCollection lastNameItem = $$(".last-name");
    @Test
    public void userCanSearchKeywordWithGoogle(){
        open("http://the-internet.herokuapp.com/tables");
        $(byText("delete")).click();
        lastNameItem.get(1).shouldHave(text("Smith"));
    }
}
