package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage{

    private By loginTabLocator = By.xpath("//*[.='LOGIN']");
    private By emailLocator = By.cssSelector("[placeholder='Email']");
    private By passwordLocator = By.cssSelector("[placeholder='Password']");
    private By loginButtonLocator = By.xpath("//button[.=' Login']");
    private By signOutButtonLocator = By.xpath("//button[.='Sign Out']");


    public void login(String email, String password) {
        $(loginTabLocator).click();
        $(emailLocator).val(email);
        $(passwordLocator).val(password);
        $(loginButtonLocator).click();
    }

    public void validLogin() {
        $(signOutButtonLocator).shouldBe(Condition.visible);
    }
}
