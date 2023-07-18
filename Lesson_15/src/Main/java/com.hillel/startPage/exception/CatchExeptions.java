package com.hillel.startPage.exception;

import com.hillel.startPage.core.credentials.Authorization;

public class CatchExeptions {

    public static boolean catchLoginExeption() {
        try {
            Authorization.authLoginVerification();
        } catch (WrongLoginException e) {
            return false;
        }
        return true;
    }

    public static boolean catchPassExeption() {
        try {
            Authorization.authPassVerification();
        } catch (WrongPasswordException e) {
            return false;
        }
        return true;
    }
}
