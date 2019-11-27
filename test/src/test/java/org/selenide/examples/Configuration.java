package org.selenide.examples;

import static com.codeborne.selenide.Selenide.open;

public class Configuration {
    public void openLink(String link){
        open(link);
    }
}
