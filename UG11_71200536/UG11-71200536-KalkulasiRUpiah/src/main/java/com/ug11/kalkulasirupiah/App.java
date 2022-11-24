package com.ug11.kalkulasirupiah;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        int Total = 0;
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String s = input.nextLine();
        String[] split1 = s.split("Rp");
        for (int i = 0; i < split1.length; i++) {
            str1.append(split1[i]);
        }
        String[] split = str1.toString().split(" ");
        for (int i = 0; i < split.length; i++) {
            if (Character.isDigit(split[i].charAt(0))) {
                if (str.length() < 1) {
                    str.append("Rp" + split[i]);
                } else {
                    str.append(" + Rp" + split[i]);
                }
            }
            String[] koma = split[i].split(",");
            String[] rp = koma[0].split("Rp");
            String num = rp[0].replace(".", "");
            try {
                Total += Integer.parseInt(num);
            } catch (NumberFormatException e) {

            }
        }
        System.out.println("Rincian biaya: " + str);
        System.out.println("Total: " + Total);


    }
}
