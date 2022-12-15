package com.ug14.rumahsakit;

import java.sql.SQLException;

public class Dokter {
    private static int id=0;
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public Dokter(int idDokter, String nama, String spesialis, String ruangan) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa (Pasien pasien, Jadwal jadwal) throws SQLException, ClassNotFoundException {
        if (!jadwal.getStatusScreening()){
            System.out.println("ANDA HARUS MELAKUKAN SCREENING TERLEBIH DAHULU OLEH SUSTER");
        }else{
            if (pasien.getLevelPenyakit()!=0){
                pasien.setLevelPenyakit(pasien.getLevelPenyakit()-1);
            }else{
                pasien.setStatus(true);
            }
        }
    }
    public void cekStatus(Pasien pasien, Jadwal jadwal) throws SQLException, ClassNotFoundException {
        if (pasien.getStatus()){
            System.out.println("PASIEN ANDA SUDAH SEMBUH DAN SEHAT");
            DAO.updateStatusPasien(jadwal.getIdPemeriksaan());
        }else{
            System.out.println("PASIEN ANDA MASIH SAKIT");
        }
    }

    public int getIdDokter() {
        return idDokter;
    }
}
