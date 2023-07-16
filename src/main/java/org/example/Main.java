package org.example;

public class Main {
    public static void main(String[] args){
        String str="$100.0000";
        System.out.println(str.replace("$100.0000","100.00000"));
        String challenge="100.000";
        Double number=Double.parseDouble(challenge);
        System.out.println(number);

    }

}