package com.ug6.soal1;

import java.util.ArrayList;
import java.util.Arrays;

public class Codes {
    private static String GOODSCODES="GD";
    private static String VENDINGMACHINESCODE="VM";
    private final String[] TYPE={"DR","FD","DG"};

    public String generateGoodsCode(String type, String name){
        int len=name.length();
        String contain=GOODSCODES+type+name.charAt(0)+name.charAt(len-1);
        return contain;
    }
    public String generateVendingMachineCode(int order){
        if (order>9){
            return VENDINGMACHINESCODE+order;
        }else{
            return VENDINGMACHINESCODE+"0"+order;
        }
    }
}
