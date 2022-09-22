package com.ug4.soal1;

import java.util.Scanner;

public class Main {
    static final Scanner scanner;

    public Main() {
    }

    public static void main(String[] args) {
        initiateMenu();
    }

    private static void initiateMenu() {
        Passenger adit = new Passenger("Adit", "adit@gmail.com", 100000.0);
        Passenger surya = new Passenger("Surya", "surya@gmail.com", 20000.0);
        Passenger krismon = new Passenger("Krismon", "krismon@gmail.com", 10000.0);
        Driver pakTole = new Driver("Pak Tole", "pria", 35);
        Bus dutaBus = new Bus("Duta Bus", pakTole);
        System.out.println("Duta Bus");
        menu(adit, dutaBus);
        menu(surya, dutaBus);
        menu(krismon, dutaBus);
        System.out.println("Pemberhentian pertama telah sampai pada Kampus Universitas Kristen Duta Wacana");
        dutaBus.dropPassengers(dutaBus.getRoute()[0], adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[0], surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[0], krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();
        System.out.println("Pemberhentian kedua telah sampai pada Asrama Omah Babadan");
        dutaBus.dropPassengers(dutaBus.getRoute()[1], adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[1], surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[1], krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();
        System.out.println("Pemberhentian ketiga telah sampai pada Asrama Teologi");
        dutaBus.dropPassengers(dutaBus.getRoute()[2], adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[2], surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[2], krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();
        System.out.println("Keuntungan hari ini");
        System.out.println("Keuntungan sebesar : Rp " + dutaBus.getProfit() + "0;-");
    }

    private static void menu(Passenger passenger, Bus bus) {
        System.out.println("Selamat Datang Kak " + passenger.getName());
        if (bus.checkPassengersBalance(passenger)) {
            showDestination(bus, passenger);
        } else {
            topUpMenu(bus, passenger);
        }

        System.out.println("============================================\n\n\n");
    }

    private static void showDestination(Bus bus, Passenger passenger) {
        int i = 0;
        System.out.println("Pilihan rute perjalanan");
        String[] var4 = bus.getRoute();
        int var5 = var4.length;

        int var6;
        String route;
        for(var6 = 0; var6 < var5; ++var6) {
            route = var4[var6];
            ++i;
            System.out.print(i + ". " + route + "\n");
        }

        System.out.print("masukan destinasi perjalanan anda : ");
        String destiny = scanner.nextLine();
        scanner.reset();
        if (destiny.isEmpty()) {
            System.out.println("\nAnda belum memasukan tujuan");
            showDestination(bus, passenger);
        } else {
            var4 = bus.getRoute();
            var5 = var4.length;

            for(var6 = 0; var6 < var5; ++var6) {
                route = var4[var6];
                if (route.equalsIgnoreCase(destiny)) {
                    bus.proceedOrder(destiny, passenger);
                    System.out.flush();
                } else {
                    System.out.println("Maaf tujuan yang anda masukan tidak sesuai");
                    showDestination(bus, passenger);
                }
            }
        }

    }

    private static void topUpMenu(Bus bus, Passenger passenger) {
        System.out.println("Anda ingin top up ?");
        System.out.print("jawaban anda (ya/tidak): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("ya")) {
            System.out.print("Masukan nominal top up : ");
            double balance = scanner.nextDouble();
            if ((balance + "").isEmpty()) {
                System.out.println("Kamu belum memasukan nominal top up");
                System.out.println("\n\n");
                topUpMenu(bus, passenger);
            } else {
                bus.topUpBalance(balance, passenger);
                scanner.nextLine();
                System.out.flush();
                showDestination(bus, passenger);
            }
        } else if (choice.equalsIgnoreCase("tidak")) {
            bus.cancelOrder(passenger);
        } else {
            System.out.println("Input yang anda masukan salah");
            System.out.println("\n\n");
            topUpMenu(bus, passenger);
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}
