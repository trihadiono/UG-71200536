package com.ug14.rumahsakit;

import java.sql.*;

public class DAO {
    public static Dokter getDokterByID(int idDokter) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rumahsakit", "root", "");
        Statement st = con.createStatement();
        String namaTabel = "dokter";
        ResultSet rs = st.executeQuery("select * from " + namaTabel + " where idDokter=" + idDokter + ";");
        Dokter dokter=null;
        while (rs.next()) {
            dokter = new Dokter(
                    Integer.parseInt(rs.getString("idDokter")),
                    rs.getString("nama"),
                    rs.getString("spesialis"),
                    rs.getString("ruangan")
            );
        }
        con.close();
        if (dokter!=null){
            return dokter;
        }else{
            return null;
        }
    }

    public static void inputJadwal(Jadwal jadwal) {
    }

    public static void inputPasien(Pasien pasien) {
    }

    public static void getPasienSembuh() {
    }

    public static void updateStatusPasien(int idPemeriksaan) {
    }
}
