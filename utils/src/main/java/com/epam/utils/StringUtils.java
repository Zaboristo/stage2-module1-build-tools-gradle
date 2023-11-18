package com.epam.utils;



public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return (!(str.startsWith("-") || str.equals(null) || str.startsWith(" ") || str.equals("")));
    }
}