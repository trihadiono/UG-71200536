package com.ug10.register;

public class PasswordException extends Exception {
    private int erorCode;
    private String erorMessage;

    public PasswordException(int erorCode) {
        super();
        this.erorCode = erorCode;
        if (this.erorCode==31){
            erorMessage="Password wajib diisi!!";
        }else if(this.erorCode==32){
            erorMessage="Password minimal terdiri dari 7 karakter";
        }else if(this.erorCode==33){
            erorMessage="Password harus mengandung huruf kecil, huruf besar, angka, dan simbol";
        }else if(this.erorCode==34){
            erorMessage="Password tidak boleh sama dengan username!!";
        }else if(this.erorCode==35){
            erorMessage="konfirmasi password tidak sesuai!!";
        }
    }

    public String getErorMessage() {
        return erorMessage;
    }

    public int getErrCode() {
        return erorCode;
    }
}


