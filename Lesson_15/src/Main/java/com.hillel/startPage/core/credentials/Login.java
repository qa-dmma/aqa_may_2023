package com.hillel.startPage.core.credentials;

import com.hillel.startPage.abs.aFieldsCreds;
import com.hillel.startPage.exception.WrongLoginException;


public class Login extends aFieldsCreds {
    public Login(String login) {
        super(login);
    }

    public static void loginVefirication() {
        if (Login.login.length() > 20 || !Login.login.contains("_")) {
            System.out.println(WrongLoginException.loginCheckMessage());
        }
    }
}
