package com.ug5b.soal1;

public class SmartCard {
    private String nama;
    private Long saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo() {
        return saldo;
    }

    public void topUp(Voucher vch){
        if (vch.getKode().equals("VC")){
            System.out.println("Kode Voucher: "+vch.getKode()+" || Top up gagal! Kode voucher tidak valid.");
        }else{
            String [] separated = vch.getKode().split("C",2);
            Long l=Long.parseLong(separated[1]);
            saldo+=l;
            System.out.println("Kode Voucher: "+vch.getKode()+" || Top up sukses!");
        }
    }
}