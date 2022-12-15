package com.ug14.rumahsakit;

import java.sql.SQLException;
import java.util.Scanner;

public class Pelayanan {
    private static int id = 0;
    private int idPelayan;
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
        this.idPelayan = idPelayan;
        this.id = id+1;
    }
    public Pelayanan(int idPelayan, String nama) {
        this.idPelayan = idPelayan;
        this.nama = nama;
    }

    public Pasien registrasi() throws SQLException, ClassNotFoundException {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.print("Masukkan rm baru : ");
        int rm = inputInt.nextInt();
        System.out.print("Masukkan nama anda : ");
        String nama = inputStr.nextLine();
        System.out.print("Masukkan usia anda : ");
        int usia = inputInt.nextInt();
        System.out.print("Masukkan alamat anda : ");
        String alamat = inputStr.nextLine();
        System.out.print("Masukkan penyakit anda : ");
        String penyakit = inputStr.nextLine();
        Pasien pasien = new Pasien(rm, nama, usia, alamat, penyakit);
        DAO.inputPasien(pasien);
        return pasien;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal) throws SQLException, ClassNotFoundException {
        jadwal.setSuster(suster);
        jadwal.setPasien(pasien);
        jadwal.setPelayanan(this);
        jadwal.setDokter(dokter);
        jadwal.setStatusDaftar(true);
        DAO.inputJadwal(jadwal);
    }
    public int getIdPelayan() {
        return idPelayan;
    }
}
