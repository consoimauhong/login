package com.codegym.model;

public class Login {
    private String account;
    private String email;
    private String password;

    public Login() {
    }

    public Login(String account,String email, String password) {
        this.account = account;
        this.email = email;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}