package com.ug10.register;

public class EmailException extends Exception {
    private int erorCode;
    private String erorMessage;

    public EmailException(int erorCode) {
        super();
        this.erorCode = erorCode;
        if (this.erorCode==21){
            erorMessage="Email harus diisi!!";
        }else if(this.erorCode==22){
            erorMessage="Format email tidak valid (cth : email@ukdw.com)";
        }
    }

    public String getErorMessage() {

        return erorMessage;
    }

    public int getErorCode() {

        return erorCode;
    }
}
