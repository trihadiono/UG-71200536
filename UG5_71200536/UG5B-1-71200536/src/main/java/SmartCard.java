import static java.lang.Long.parseLong;

public class SmartCard {
    private String nama;
    private Long saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public  void setSaldo(long saldo){
        this.saldo =saldo;
    }

    public long getSaldo(){
        return saldo;
    }

    public void topUp(Voucher vch){
        if (vch.getVoucher().equals("VC")){
            System.out.println("Kode Voucher: " +vch.getVoucher()+ "|| Top up gagal! Kode voucher tidak valid.");
        }else{
            String [] separated = vch.getVoucher().split("C", 2);
            Long l = Long.parseLong(separated[1]);
            saldo+=1;
            System.out.println("Kode Voucher: " +vch.getVoucher()+ "Top up sukses!" );
        }
    }
}
