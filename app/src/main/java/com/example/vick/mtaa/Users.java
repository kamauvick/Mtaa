package com.example.vick.mtaa;

public class Users {
    public String id_number;
    public String username;
    public String password;
    public String confirm_pass;
    public String email;
    public String phone_number;

    //Constructors

    public Users() {

    }

    public Users(String id_number, String username, String email, String phone_number) {
        this.id_number = id_number;
        this.username = username;
        this.email = email;
        this.phone_number = phone_number;
        this.password = password;
        this.confirm_pass = confirm_pass;

    }

    public Users(String id_number, String username, String password, String email, String phone_number) {
        this.id_number = id_number;
        this.username = username;
        this.password = password;
        this.email = email;

        this.phone_number = phone_number;

    }

    public String getConfirm_pass() {
        return confirm_pass;
    }

    public void setConfirm_pass(String confirm_pass) {
        this.confirm_pass = confirm_pass;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
