package ru.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MySteps extends Base {
    @Given("перейти на сайт '(.*)'")
    public void перейти_на_сайт(String url) {
        открытьХром();
        chromeDriver.get(url);
    }

    @Then("тайтл содержит текст '(.*)'")
    public void тайтл_содержит_текст(String title) {
        String titleURL = chromeDriver.getTitle();
        Assert.assertTrue(titleURL.contains(title));
    }

    @Then("закончить работу")
    public void закончить_работу() {
        закрытьХром();
    }


    @Given("перейти на '(.*)'")
    public void перейти(String url) {
        открытьХром();
        chromeDriver.get(url);
    }

    @When("ищем меню '(.*)', кликаем")
    public void ищем_меню(String nameButton) {
        SberbankPO sberbankPO = new SberbankPO(chromeDriver);
        sberbankPO.clickMainMenuButton(nameButton);
    }

    @Then("закончить работу сайта")
    public void закончить_работу_сайта() {
        закрытьХром();
    }

    @Given("открыть сайт '(.*)'")
    public void открыть(String url) {открытьХром();
        chromeDriver.get(url);
    }

    @Then("кликаем меню '(.*)' и '(.*)'")
    public void кликаемМенюГлавнаяИподменю(String nameButton, String popupButton){
        SberbankPO sberbankPO = new SberbankPO(chromeDriver);
        sberbankPO.clickPopupMenu(nameButton,popupButton);

    }

}

