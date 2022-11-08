package com.telran.tests;

import com.telran.pages.HomePage;
import org.junit.Before;
import org.junit.Test;

public class OpenHomePageTests {

    HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage();
    }

    @Test
    public void openHomePageTest() {
        homePage.isHomeComponentPresent();
    }
}
