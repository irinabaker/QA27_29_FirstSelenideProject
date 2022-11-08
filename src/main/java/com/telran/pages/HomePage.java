package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage{

    private By homeComponent = By.xpath("//h1[.='Home Component']");

    public void isHomeComponentPresent() {
        $(homeComponent).shouldBe(Condition.visible);
    }
}
