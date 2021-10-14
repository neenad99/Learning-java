package com.neenad;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        String s3 = s1.concat(s2);// s1 + s2

        System.out.println("Concatenation of 2 strings is "+s3);
        System.out.println("length of first string is "+s1.length());
        System.out.println("Converted second string to uppercase "+s2.toUpperCase());
        System.out.println(s2+" so touppercase does not implicitly converts the string to uppercase");


        String name = "Neenad Kambli";

        System.out.println(Arrays.toString(name.toCharArray())); // toCharArray converts strings into character array

        System.out.println(name.toLowerCase()); // creates a new object and then converts it into lower case
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("   nee nad  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}


