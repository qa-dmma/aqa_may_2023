package com.hillel.startPage.exception;

public class WrongLoginException extends WrongPasswordException {
    public static void throwLoginExp() throws WrongLoginException {
        throw new WrongLoginException();
    }

    public static String loginCheckMessage() {
        System.out.println("WrongLoginExeption");
        return "Your login has more than 20 chars or don't contain '_' symbol";
    }
}

