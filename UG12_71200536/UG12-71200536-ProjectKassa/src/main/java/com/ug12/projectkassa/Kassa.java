package com.ug12.projectkassa;
import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    private HashMap<Produk,Integer> pesanan = new HashMap<Produk,Integer>();
    private ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();
    private Kasir kasir;

    public Kassa(){};

    public void login(String username, String password){
        boolean check = false;
        for (Kasir kasir: arrKasir){
            if(kasir.getUsername().equals(username) && kasir.getPassword().equals(password)){
                check = true;
                this.kasir = kasir;
                break;
            }
        }
        if (check){
            System.out.println("Login Berhasil!");
        } else {
            System.out.println("Username/password Anda Salah!");
        }
    }

    public void register(Kasir kasir){
        arrKasir.add(kasir);
        System.out.println("Kasir " + kasir.getNama() + " berhasil ditambahkan ke dalam sistem.");
    }

    public void tambahPesanan(Produk produk, int jumlah){
        pesanan.put(produk,jumlah);
    }

    public void printNota(){
        System.out.println("=========Nota=========");
        System.out.println("Kasir: " + kasir.getNama());
        System.out.println("No. Nama Barang     Jumlah  Harga      Sub Total");
        int c = 1;
        int total = 0;
        for (Produk produk: pesanan.keySet()){
            long subtotal = produk.getHarga() * pesanan.get(produk);
            total += subtotal;
            System.out.println(c + ".  " + produk.getNama() + " ".repeat(16-produk.getNama().length()) + pesanan.get(produk) + "x" + " ".repeat(7-String.valueOf(pesanan.get(produk)).length()) + produk.getHarga() + "    " +  subtotal);
            c += 1;
        }
        System.out.println("Total: Rp" + total);
        kasir.setTotalPenjualan(kasir.getTotalPenjualan()+total);
        pesanan.clear();
    }

    public void printPenjualanKasir(){
        System.out.println("Daftar Kasir:");
        System.out.println("No.  Nama               Total Penjualan");
        int c = 1;
        for (Kasir kasir: arrKasir){
            System.out.println(c + ".   " + kasir.getNama() + " ".repeat(19-kasir.getNama().length()) + "Rp" + kasir.getTotalPenjualan());
            c += 1;
        }
    }
}

