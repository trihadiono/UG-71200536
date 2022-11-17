package com.ug10.register;

public class UsernameException extends Exception {
    private int erorCode;
    private String erorMessage;

    public UsernameException(int erorCode) {
        super();
        this.erorCode = erorCode;
        if (this.erorCode==11){
            erorMessage="Username tidak boleh kosong!!";
        }else if(this.erorCode==12){
            erorMessage="Username minimal terdiri 6 karakter!!";
        }
    }

    public String getErorMessage() {

        return erorMessage;
    }

    public int getErorCode() {

        return erorCode;
    }
}
