package com.hillel.startPage.abs;

public abstract class aFieldsCreds {
    public static String login;
    public static String password;
    public static String confirPassword;

    public aFieldsCreds(String login) {

        this.login = login;
    }

    public aFieldsCreds(String password, String confirPassword) {
        this.password = password;
        this.confirPassword = confirPassword;
    }

    public aFieldsCreds(String login, String password, String confirPassword) {
        this.login = login;
        this.password = password;
        this.confirPassword = confirPassword;
    }

    public aFieldsCreds() {
    }
}
