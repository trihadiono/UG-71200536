package com.ug13.sakitrumah;

public class Perawat {
    private String nama;

    public Perawat(String nama) {
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Jadwal jadwal) {
        if (!jadwal.getStatusDaftar() || pengunjung.getLevelPenyakit()==0){
            System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
        }else{
            jadwal.setStatusScreening(true);
            System.out.println("PROSES SCREENING SUSTER BERHASIL");
        }
    }
}
