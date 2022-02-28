package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//     .............. .... ...1 БИРИНЧИ ТАПШЫРМА..............

//      Prezident prezident=new Prezident("Sadir Japarov",53,Kyrgyzstan.YSSYK_KOL);
//      System.out.println(prezident);
//        prezident.info();


// ...................2 ЭКИНЧИ ТАПШЫРМА.....1 variant......................

//          Kurs kurs=new Kurs("Muxammed Allanov","java 5 online",Kundor.MONDAY);
//
//        System.out.println(kurs);
//        kurs.info();

//        .......... ЭКИНЧИ ТАПШЫРМА...2 вартант....................

        Scanner scanner=new Scanner(System.in);

        Kundor kundor=Kundor.valueOf(scanner.nextLine());

        switch(kundor){
            case MONDAY -> System.out.println("duishonbu kunu java 5 teoriya sabagi bolot");
            case TUESDAY -> System.out.println("sheishembi kunu java session sabagi bolot");
            case WEDNESDAY -> System.out.println("sharshembi kunu English sabagi bolot");
            case THURSDAY -> System.out.println("beishembi kunu soft skills sabagi bolot");
            case FRIDAY -> System.out.println("juma kunu java 5 teoriya sabagi bolot");
            case SATURDAY -> System.out.println("ishembi kunu kaitaloo sabagi bolot");
            case SUNDAY -> System.out.println("jekshembi dem aluu kun sabagi bolot");
        }





















    }
}
