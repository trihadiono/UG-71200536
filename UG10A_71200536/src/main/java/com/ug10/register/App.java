package com.ug10.register;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Selamat datang di Toko Tri Hadiono" );
        System.out.println( "Silahkan daftarkan diri kamu untuk dapat mengakses menu di toko Tri Hadiono" );
        Scanner input=new Scanner(System.in);
        String username;
        String email;
        String password;
        String confirmPassword;
        while(true){
            try{
                System.out.print("Username: ");
                username=input.nextLine();
                if (username.equals(" ") || username.equals("")) {
                    throw new UsernameException(11);
                }
                if (username.length()<6){
                    throw new UsernameException(12);
                }
                break;
            }catch (UsernameException ue) {
                System.out.println(ue.getErorMessage());
                continue;
            }
        }
        while (true){
            try{
                System.out.print("Email: ");
                email=input.nextLine();
                if (email.equals(" ") || email.equals("")){
                    throw new EmailException(21);
                }
                if (!validEmail(email)){
                    throw new EmailException(22);
                }
                break;
            }catch (EmailException ue) {
                System.out.println(ue.getErorMessage());
                continue;
            }
        }
        while (true){
            try{
                System.out.print("Password: ");
                password=input.nextLine();
                if (password.equals(" ") || password.equals("")){
                    throw new PasswordException(31);
                }
                if (password.length()<7){
                    throw new PasswordException(32);
                }
                if (!passCheck(password)){
                    throw new PasswordException(33);
                }
                if (password.equals(username)){
                    throw new PasswordException(34);
                }
                break;
            }catch (PasswordException ue) {
                System.out.println(ue.getErorMessage());
                continue;
            }
        }
        while(true){
            try{
                System.out.print("Konfirmasi Password: ");
                confirmPassword=input.nextLine();
                if (!password.equals(confirmPassword)){
                    throw new PasswordException(35);
                }
                break;
            }catch (PasswordException ue) {
                System.out.println(ue.getErorMessage());
                continue;
            }
        }
        User u=new User();
        System.out.println("\nAkun kamu berhasil didaftarkan!\nSilahkan login untuk melanjutkan!\n");

        while (true){
            try{
                System.out.print("Username: ");
                String user=input.nextLine();
                System.out.print("Password: ");
                String pass=input.nextLine();
                if (user.equals("") || user.equals(" ")){
                    throw new LoginException(111);
                }else
                if (pass.equals("") || pass.equals(" ")){
                    throw new LoginException(211);
                }else
                if (!user.equals(u.getUsername()) || !pass.equals(u.getPassword())){
                    throw new LoginException(345);
                }
                break;
            }catch (LoginException ue) {
                System.out.println(ue.getErorMessage());
                continue;
            }
        }

        System.out.println("\nSelamat datang, "+u.getUsername());

    }

    private static UsernameException getUsernameException() {
        return new UsernameException(1);
    }

    public static Boolean validEmail(String email){
        if (!email.contains("@")){
            return false;
        }
        int At=email.lastIndexOf("@");
        String emailNew="";
        for (int i = At; i < email.length(); i++) {
            emailNew+=email.charAt(i);
        }
        if (emailNew.equals("@ukdw.com")){
            return true;
        }
        return false;
    }

    public static boolean passCheck(String pass){
        boolean small=false;
        boolean big=false;
        boolean num=false;
        boolean sym=false;
        for (int i = 0; i < pass.length(); i++) {
            char a=pass.charAt(i);
            if (Character.isUpperCase(a)){
                big=true;
            }
            if (Character.isLowerCase(a)){
                small=true;
            }
            if (Character.isDigit(a)){
                num=true;
            }
            if (!Character.isDigit(a) && !Character.isAlphabetic(a)){
                sym=true;
            }
        }
        if (small && big && num && sym){
            return true;
        }
        return false;
    }
}