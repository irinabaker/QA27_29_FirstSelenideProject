package com.telran.tests;

import com.telran.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTests {

    LoginPage loginPage;

    @Before
    public void setUp() {
        loginPage = new LoginPage();
    }

    @Test
    public void loginPositiveTest() {
        loginPage.login("kroos@gm.com","Kroos12345~");
        loginPage.validLogin();
    }
}
