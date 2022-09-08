public class TabunganKonvensional {
    private String pemilik;

    private Double saldo;

    public void penarikan(double jumlah) {
        if ((saldo >= jumlah)) {
            saldo = saldo - jumlah;
        }
    }

    public void getSaldo() {
        System.out.println(saldo);
    }

    public void penyetoran(double jumlah) {
        saldo =saldo+jumlah;
        System.out.println("--------Tabungan Konvensional--------\n");
        System.out.println("Penyetoran Rp." + jumlah);
    }
}