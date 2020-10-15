package ru.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SberbankPO {
    private WebDriver chromeDriver;


    public SberbankPO(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    private List<WebElement> mainMenuButtons() {
        return chromeDriver.findElements((By.xpath("//*[@class='master_open_menu']//li//span")));
    }

    public void clickMainMenuButton(String nameButton) {
        mainMenuButtons().stream().filter(x-> x.getText().equals(nameButton)).findFirst().get().click();
    }

    private List<WebElement> popupMenuMain() {
        return chromeDriver.findElements(By.xpath("//*[@class='submenu menuWidth2Col']//a"));
    }
    public void clickPopupMenu(String nameButton, String popupButton) {
        mainMenuButtons().stream().filter(x-> x.getText().equals(nameButton)).findFirst().get().click();
        popupMenuMain().stream().filter(x-> x.getText().equals(popupButton)).findFirst().get().click();
    }
}
