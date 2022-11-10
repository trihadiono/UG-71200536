package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp) {
        super(nama, saldo);
        this.noHp = noHp;
//        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal<0){
            System.out.println("Nominal yang Anda input tidak valid!");
        }else{

            if (super.getSaldo()>0){
                if (super.getSaldo()>=nominal){
                    if (dp instanceof BNImo || dp instanceof BRImo){
                        super.setSaldo(super.getSaldo()-(nominal + feeTransferBank));
                        dp.setSaldo(dp.getSaldo()+nominal);
                    }else{
                        super.setSaldo(super.getSaldo()- nominal);
                        dp.setSaldo(dp.getSaldo()+nominal);
                    }
                    super.printBuktiTransfer(dp, nominal);
                }else{
                    System.out.println("Transfer gagal saldo anda tidak mencukupi.");
                }
            }else{
                System.out.println("Transfer gagal saldo anda 0");
            }

        }
    }
}

