//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ug4.soal1;

import java.util.ArrayList;
import java.util.Iterator;

public class Bus {
    private String name;
    private Driver driver;
    private int usedCapacity = 0;
    private final ArrayList<Passenger> passengers = new ArrayList();
    private double profit = 0.0;
    private final String[] route = new String[]{"Kampus UKDW", "Asrama Omah Babadan", "Asrama Teologi"};

    public Bus(String name, Driver driver) {
        this.setName(name);
        this.setDriver(driver);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getCapacity() {
        int capacity = 25;
        return capacity;
    }

    public int getUsedCapacity() {
        return this.usedCapacity;
    }

    private void setUsedCapacity(int additional) {
        this.usedCapacity += additional;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public double getFares() {
        double fares = 15000.0;
        return fares;
    }

    public double getProfit() {
        return this.profit;
    }

    public void setProfit(double profit) {
        this.profit += profit;
    }

    public String[] getRoute() {
        return this.route;
    }

    public void topUpBalance(double balance, Passenger passenger) {
        passenger.setBalance(balance);
    }

    public boolean checkPassengersBalance(Passenger passenger) {
        return passenger.getBalance() >= this.getFares();
    }

    public void proceedOrder(String destiny, Passenger passenger) {
        if (this.getCapacity() > this.usedCapacity) {
            this.setProfit(this.getFares());
            passenger.setDestiny(destiny);
            passenger.setBalance(-this.getFares());
            this.takePassengers(passenger);
        } else {
            System.out.println("Tidak dapat menaikan penumpang lagi");
            System.out.println(this.cancelOrder(passenger));
        }

    }

    public String cancelOrder(Passenger passenger) {
        return "Order dibatalkan untuk Kak " + passenger.getName();
    }

    private void takePassengers(Passenger passenger) {
        this.passengers.add(passenger);
        this.setUsedCapacity(1);
        System.out.println("Menambahkan penumpang atas nama " + passenger.getName());
    }

    public void dropPassengers(String destiny, Passenger passenger) {
        Iterator<Passenger> itr = this.passengers.iterator();

        for(int i = 0; i < this.getPassengers().size(); ++i) {
            if (((Passenger)this.getPassengers().get(i)).getDestiny().equalsIgnoreCase(destiny) && ((Passenger)this.getPassengers().get(i)).getName().equalsIgnoreCase(passenger.getName())) {
                this.passengers.remove(i);
                this.setUsedCapacity(-1);
                System.out.println("Perjalanan telah sampai di tujuan, mohon Kak " + passenger.getName() + " untuk turun");
            }
        }

    }
}
