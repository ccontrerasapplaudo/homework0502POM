package com.selenium.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQAPage {
    protected WebDriver driver;

    private By formsButton = By.cssSelector("div.card.mt-4.top-card:nth-child(2)");

    public DemoQAPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }
    public void clickOnFormsButton(){
        driver.findElement(formsButton).click();
    }
}
