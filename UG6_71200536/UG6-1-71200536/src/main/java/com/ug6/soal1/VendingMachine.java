package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachine {
    private int code;
    private int capacity;
    private int usedCapacity;
    private ArrayList <Goods> goods;
    private ArrayList <Double> acceptanceBalance;
    private double consumerMoney;

    public VendingMachine(){

    }
    public VendingMachine(int code, int capacity){
        this.code=code;
        this.capacity=capacity;
    }
    public VendingMachine(int code, int capacity, ArrayList <Goods> goods, ArrayList <Double> acceptanceBalance){
        this.code=code;
        this.capacity=capacity;
        this.goods=goods;
        this.acceptanceBalance=acceptanceBalance;
    }
    public void proceedOrder(String goodsCode, int orderQuantity){

    }
    public void takeMoney(double money){

    }
    private void giveGood(double goodsPrice, String goodsName){

    }
    public double withdrawMoney(){

        return consumerMoney;
    }
    public void inputGoods(Goods goods){
        if (goods.getQuantity()<=capacity-usedCapacity){
            usedCapacity+=1;
        }else{
            System.out.println("Jumlah barang telah melampaui kapasitas maximal");
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Goods> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    public ArrayList<Double> getAcceptanceBalance() {
        return acceptanceBalance;
    }

    public void setAcceptanceBalance(ArrayList<Double> acceptanceBalance) {
        this.acceptanceBalance = acceptanceBalance;
    }
}
