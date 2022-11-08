package com.telran.pages;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    public BasePage() {
        open("https://contacts-app.tobbymarshall815.vercel.app");
    }
}
