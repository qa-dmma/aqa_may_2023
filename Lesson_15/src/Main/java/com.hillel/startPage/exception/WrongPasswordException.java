package com.hillel.startPage.exception;

public class WrongPasswordException extends Throwable {
    public static void throwPassExp() throws WrongPasswordException {
        throw new WrongPasswordException();
    }

    public static String passMessageChars() {
        System.out.println("WrongPasswordException");
        return "Your password has more than 20 chars or don't contain '_' and '!' symbols";
    }

    public static String passMessageMatch() {
        System.out.println("WrongPasswordException");
        return "Your password does not match the verification password";
    }

}
