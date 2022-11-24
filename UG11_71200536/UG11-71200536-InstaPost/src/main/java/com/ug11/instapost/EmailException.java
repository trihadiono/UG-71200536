package com.ug11.instapost;

public class EmailException extends Exception{
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode) {
        this.errorCode = errorCode;
        if (errorCode==1){
            errorMessage="Email yang anda masukkan tidak valid";
        }else if (errorCode==2){
            errorMessage="Email yang Anda masukkan tidak terdaftar di Google (domain wajib: @gmail.com) .";
        }
    }

    public String getErrorMessage() {

        return errorMessage;
    }
}
