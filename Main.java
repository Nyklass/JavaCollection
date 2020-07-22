package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner nyk =new Scanner(System.in);
        Teachers tech= new Teachers();
        System.out.println("Select operation "+"1. add Teacher");
        int nykl = nyk.nextInt();
        if(nykl==1){
            tech.view();
        }
        System.out.println(tech);

    }
}
