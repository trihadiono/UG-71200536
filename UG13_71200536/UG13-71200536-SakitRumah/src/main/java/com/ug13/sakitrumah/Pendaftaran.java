package com.ug13.sakitrumah;

import java.util.Scanner;

public class Pendaftaran {
    private String nama;

    public Pendaftaran(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Jadwal jadwal) {
        jadwal.setPengunjung(pengunjung);
        jadwal.setPemeriksa(pemeriksa);
        jadwal.setPendaftaran(this);
        jadwal.setStatusDaftar(true);
    }

    public Pengunjung registrasi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String nama = input.nextLine();

        Scanner num = new Scanner(System.in);

        System.out.print("Masukkan usia anda : ");
        int usia = num.nextInt();

        System.out.print("Masukkan alamat anda : ");
        String alamat = input.nextLine();

        System.out.print("Masukkan penyakit anda : ");
        String penyakit = input.nextLine();

        return new Pengunjung(nama, usia, alamat, penyakit);
    }
}

