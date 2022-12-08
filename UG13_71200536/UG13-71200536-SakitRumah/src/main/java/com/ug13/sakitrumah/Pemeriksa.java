package com.ug13.sakitrumah;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal) {
        if (jadwal.getStatusScreening()){
            if (!pengunjung.getStatus() && pengunjung.getLevelPenyakit()!=0){
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
            }else{
                pengunjung.setStatus(true);
            }
        }else{
            System.out.println("ANDA WAJIB MELAKUKAN SCREENING TERLEBIH DAHULU DI PERAWAT");
        }
    }
    public void cekStatus(Pengunjung pengunjung){
        if (pengunjung.getStatus()){
            System.out.println(" SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT");
        }else{
            System.out.println("PASIEN ANDA MASIH SAKIT");
        }

    }
}
