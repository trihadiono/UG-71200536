package com.ug10.register;

public class LoginException extends Exception {
    private int erorCode;
    private String erorMessage;

    public LoginException(int erorCode) {
        super();
        this.erorCode = erorCode;
        if (this.erorCode==111){
            erorMessage="Username tidak boleh kosong!!";
        }else if(this.erorCode==211){
            erorMessage="Password tidak boleh kosong!!";
        }
        else if(this.erorCode==345){
            erorMessage="Username atau Password salah!!";
        }
    }

    public String getErorMessage() {

        return erorMessage;
    }

    public int getErorCode() {

        return erorCode;
    }
}
