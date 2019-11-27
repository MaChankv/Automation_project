package org.selenide.examples;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private SelenideElement usernameItem=$(byName("username"));
    private SelenideElement passwordItem=$(byName("password"));
    private SelenideElement verificationItem=$("#flash");

    public void Login(String userName,String password){
        usernameItem.sendKeys(userName);
        passwordItem.setValue(password).pressEnter();
    }
    public void CheckLoginResult(String message){
        verificationItem.shouldHave(text(message));
    }
}
