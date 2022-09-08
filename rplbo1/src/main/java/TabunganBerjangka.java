import java.util.Scanner;

public class TabunganBerjangka {
    private String pemilik;

    private Double saldo;

    public void getSaldo() {
        System.out.println(saldo);
    }

    public void penarikan(double jumlah) {
        if (saldo >= jumlah) {
            saldo = saldo - jumlah;
            System.out.println("--------Tabungan Berjangka--------");
            System.out.println("Penarikan Rp." + jumlah);
        }
    }
    public void penyetoran(double jumlah) {
        System.out.println("--------Tabungan Konvensional--------\n");
        System.out.println("Belum jatuh tempo");
    }

}
