package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){
        if ( expected.equals(actual)){
            System.out.println("Passed");
        }else {
            System.out.println("Fail");
            System.out.println(expected);
            System.out.println(actual);
        }

        }



}
