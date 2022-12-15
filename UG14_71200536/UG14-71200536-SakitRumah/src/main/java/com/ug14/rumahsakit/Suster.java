package com.ug14.rumahsakit;

public class Suster {
    private static int id=0;
    private int idSuster;
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
        this.idSuster = idSuster;
    }
    public Suster(int idSuster, String nama) {
        this.idSuster = idSuster;
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal) {
            if (pasien.getPenyakit()==null){
                System.out.println("ANDA HARUS MELALUI PROSES PELAYANAN TERLEBIH DAHULU");
            }else {
                jadwal.setStatusScreening(true);
            }
    }

    public int getIdSuster() {
        return idSuster;
    }
}
