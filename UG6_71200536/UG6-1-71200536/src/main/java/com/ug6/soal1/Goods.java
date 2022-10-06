package com.ug6.soal1;

public class Goods {
    private int code;
    private String name;
    private int quantity;
    private double price;

    public Goods(){
        return;
    }
    public Goods(int code, String name){
        this.code=code;
        this.name=name;
    }
    public Goods(int code, String name, int quantity, double price){
        this.code=code;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
