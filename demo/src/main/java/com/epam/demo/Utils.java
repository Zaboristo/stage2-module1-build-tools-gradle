package com.epam.demo;


import java.util.List;



public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        for(String str: args){
            if (str.startsWith("-") || str.equals(null) || str.startsWith(" ") || str.equals("")) return false;
            
        }
        return true;
        //magic happens here
    }
}