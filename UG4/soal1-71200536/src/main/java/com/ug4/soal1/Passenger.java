//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ug4.soal1;

public class Passenger {
    private String name;
    private String email;
    private String destiny;
    private double balance;

    public Passenger(String name, String email, double balance) {
        this.setName(name);
        this.setBalance(balance);
        this.setEmail(email);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public String getDestiny() {
        return this.destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }
}

