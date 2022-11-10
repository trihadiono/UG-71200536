package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    private long danaFeeTransferBank;

    public Dana(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
        danaFeeTransferBank=1000;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.setFeeTransferBank(danaFeeTransferBank);
        if (dp instanceof Ovo){
            System.out.println("Transfer gagal, akun DANA tidak valid");
        }else{
            super.transfer(dp, nominal);
        }
    }
}