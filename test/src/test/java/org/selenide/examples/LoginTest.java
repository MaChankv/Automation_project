package org.selenide.examples;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;

public class LoginTest {
    private SelenideElement usernameItem=$(byName("username"));
    private SelenideElement passwordItem=$(byName("password"));
    private SelenideElement verificationItem=$("#flash");

    @Test
    public void Login(){
        LoginPage loginPage=new LoginPage();
        new Configuration().openLink("http://the-internet.herokuapp.com/login");
        loginPage.Login("tomsmith","Super");
        loginPage.CheckLoginResult("Your password is invalid!");
        loginPage.Login("tomsmith","SuperSecretPassword!");
        loginPage.CheckLoginResult("You logged into a secure area!");
    }
}
