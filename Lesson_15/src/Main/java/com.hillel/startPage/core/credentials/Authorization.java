package com.hillel.startPage.core.credentials;

import com.hillel.startPage.exception.CatchExeptions;
import com.hillel.startPage.exception.WrongLoginException;
import com.hillel.startPage.exception.WrongPasswordException;

public class Authorization {
    public Login login;
    public Password password;

    public Authorization(Login login, Password password) {
        this.login = login;
        this.password = password;
    }

    public static void authLoginVerification() throws WrongLoginException {
        Login.loginVefirication();
        WrongLoginException.throwLoginExp();
        CatchExeptions.catchLoginExeption();
    }

    public static void authPassVerification() throws WrongPasswordException {
        Password.passVerification();
        WrongPasswordException.throwPassExp();
        CatchExeptions.catchPassExeption();
    }
}
