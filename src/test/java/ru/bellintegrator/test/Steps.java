package ru.bellintegrator.test;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver chromeDriver;

    @Step
    public void открытьХром(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
    }

    @Step
    public void закрытьХром() {
        chromeDriver.quit();
    }

}
