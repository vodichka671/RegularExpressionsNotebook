package com.company.model;

public class Model {
    private String name;
    private String login;
    private String phone;


    public Model() {
        this.name = null;
        this.login = null;
        this.phone = null;
    }

    public Model(String name, String login, String phone) {
        this.name = name;
        this.login = login;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return "Name : " +this.getName()+"\n"+"Login : "+this.getLogin()+"\n"+"Phone : "+this.getPhone();
    }
}
