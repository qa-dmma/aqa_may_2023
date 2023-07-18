package com.hillel.startPage.core.credentials;

import com.hillel.startPage.abs.aFieldsCreds;
import com.hillel.startPage.exception.WrongPasswordException;


public class Password extends aFieldsCreds {
    public Password(String password, String confirPassword) {
        super(password, confirPassword);
    }

    public static void passVerification() {
        if (!Password.password.contains("_") || !Password.password.contains("!") || Password.password.length() > 20) {
            System.out.println(WrongPasswordException.passMessageChars());
        } else if (Password.password != Password.confirPassword) {
            System.out.println(WrongPasswordException.passMessageMatch());
        }
    }
}
