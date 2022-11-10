package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
    private long ovoFeeTransferBank;

    public Ovo(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
        ovoFeeTransferBank=2000;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.setFeeTransferBank(ovoFeeTransferBank);
        if (dp instanceof Dana){
            System.out.println("Transfer gagal, akun OVO tidak valid");
        }else{
            super.transfer(dp, nominal);
        }
    }
}
