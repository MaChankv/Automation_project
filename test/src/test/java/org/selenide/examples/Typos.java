package org.selenide.examples;

import static com.codeborne.selenide.Selenide.$;

public class Typos {

    String correctText = "Sometimes you'll see a typo, other times you won't.";
    String typoTextItem = $(".example").text();

    public boolean CheckTyposText() {
        if (correctText == typoTextItem) {
            return true;
        } else {
            return false;
        }
    }
}
