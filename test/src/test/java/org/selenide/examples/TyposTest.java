package org.selenide.examples;


import org.junit.Test;



public class TyposTest {


    @Test
    public void CheckTypos(){
        new Configuration().openLink("http://the-internet.herokuapp.com/typos");
        new Typos().CheckTyposText();
    }
}
