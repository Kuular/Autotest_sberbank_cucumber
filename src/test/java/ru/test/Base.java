package ru.test;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver chromeDriver;

    @Step
    public void открытьХром(){
        System.setProperty("webdriver.chrome.driver","/Users/karinaorus-ool/Desktop/Демира/Java/QA/Стажировки/SchoolAT_Demir/chromedriver");
        chromeDriver=new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Step
    public void закрытьХром(){
        chromeDriver.quit();
    }
}


