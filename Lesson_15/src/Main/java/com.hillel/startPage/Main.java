package com.hillel.startPage;

import com.hillel.startPage.core.credentials.Authorization;
import com.hillel.startPage.core.credentials.Login;
import com.hillel.startPage.core.credentials.Password;
import com.hillel.startPage.exception.CatchExeptions;


public class Main {
    public static void main(String[] args) {
        Login firstLogin = new Login("12345678901234567890_");
        Password firstPass = new Password("12345678901234567890", "12345678901234567890");
        Authorization auth = new Authorization(firstLogin, firstPass);
        CatchExeptions.catchLoginExeption();
        CatchExeptions.catchPassExeption();

    }
}