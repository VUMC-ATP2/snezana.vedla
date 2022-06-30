package homework.two;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int InputResult = scanner.nextInt();

        // vai x ir pozitīvs (iegūt rezultātu true)
        boolean PositiveScanner = InputResult > 0;
        if (PositiveScanner) {
            System.out.println("Pozitīvs skaitlis");
        } else {
            System.out.println("Negatīvs skaitlis");
        }
// 1. uzdevums
        //laikam uzdevums bija domāts izpildei bez skanera, tāpēc taisu vēlreiz, bet skanera metodi nedzēšu
        //vai x ir pozitīvs (iegūt rezultātu true)

        int x = 4;
        boolean Positive = x > 0;

        if (Positive) {
            System.out.println("Pozitīvs skaitlis!");
        } else {
            System.out.println("Negatīvs skaitlis!");
        }
        //vai x ir negatīvs (iegūt rezultātu false)

        int x2 = 17;
        boolean Negative = x2 < 0;

        if (Negative) {
            System.out.println("Negatīvs skaitlis");
        } else {
            System.out.println("Pozitīvs skaitlis");
        }

        int x3 = 7;
        if (x3 > 5 && x3 <= 10) {
            System.out.println("True, skaitlis no 5 līdz 10 ieskaitot");
        } else {
            System.out.println("False, skaitlis nav to 5 līdz 10 ieskaitot");
        }

        //vai x NAV mazāks vai vienāds par 5 un x ir mazāks par 10(iegūt rezultātu true)

        int x4 = 9;
        if (x4 > 5 && x4 < 10) {
            System.out.println("Cipars ir no 5 līdz 10");
        } else {
            System.out.println("Cipars nav intervālā no 5 līdz 10");
        }

        //vai x ir vienāds 0 vai x ir vienāds 10(rezultāts false)

        int x5 = 7;
        if (x5 == 0 || x5 == 10) {
            System.out.println("Cipars ir 0 vai 10");
        } else {
            System.out.println("Cipars nav 0 un nav 10");
        }


        //vai x * x reizinājums ir lielāks par 10 (rezultātus true)

        int SquareSide = 2;
        if (SquareSide * SquareSide > 10) {
            System.out.printf("Kvadrāta laukums ar malas garumu %d ir lielāks par 10 kvm", SquareSide);
        } else {
            System.out.printf("Kvadrāta laukums ar malas garumu %d ir mazāks par 10 kvm.", SquareSide);
        }

        System.out.println("");


// 2.uzdevums
        int MonthNumber = 5;
        switch (MonthNumber) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Nekorekts mēneša kārtas numurs");


        }

//3.uzdevums
        int a = 11;
        int b = 3;
        int c = 8;

        if (a > b && a > c) {
            System.out.printf("Lielākais skaitlis starp a, b un c ir %d", a);
        } else if (b > a && b > c) {
            System.out.printf("Lielākais skaitlis starp a, b un c ir %d", b);
        } else {
            System.out.printf("Lielākais skaitlis starp a, b un c ir %d", c);
        }

        System.out.println("");

// 4.uzdevums

        String Colour = "Red";
        if (Colour.equals("Red")) {
            System.out.println("Dont move!");
        } else if (Colour.equals("Yellow")) {
            System.out.println("Please,wait a bit more");
        } else {
            System.out.println("Surely Go!");
        }
// 5.uzdevums
        {
            System.out.println("\n");
            String currName = "Jānis";
            String surName = "Bērziņš";
            String telNum = "00371 24455522";
            int yearOfBirth = 1988;


///šis ir nepareizs, vnk mēģināju
// *          System.out.println(currName);
//            System.out.println(surName);
//            System.out.println(telNum);
//            System.out.println(yearOfBirth);*/

            PrintBusinessCard(currName, surName, telNum, yearOfBirth);

            System.out.println("\n");
            String currName2 = "Marta";
            String surName2 = "Ozola";
            String telNum2 = "00371 6789005";
            int yearOfBirth2 = 2017;

            PrintBusinessCard(currName2, surName2, telNum2, yearOfBirth2);

            System.out.println("\n");
            String currName3 = "Kristians";
            String surName3 = "Egle";
            String telNum3 = "00371 26677666";
            int yearOfBirth3 = 1955;

            PrintBusinessCard(currName3, surName3, telNum3, yearOfBirth3);
        }

        System.out.println("\n");

//6.uzdevums

        PrintBusinessCardTwo("Daniels", "Ivanovs", "vēl nav", 2021);
        System.out.println("\n");
        PrintBusinessCardTwo("Artūrs", "Priede", "00371 5544335", 1966);
        System.out.println("\n");
//7.uzdevums

        int sumOfTwo = sum(50, 10);
        System.out.println(sumOfTwo);
        System.out.println(sum(50, 15));
        System.out.println(sum(2, 1));
//8.uzdevums

        double AvrgNum = average(2, 3, 6);
        {
            System.out.println(AvrgNum);
            System.out.println(average(6, 7, 8));
            System.out.println(average(3.0, 4.0, 6.0));

        }


    }

    private static void PrintBusinessCardTwo(String currName, String surName, String telNum, int yearOfBirth) {
        System.out.printf("Vizītkarte \n ####### \n Vārds: %s \n Uzvārds: %s \n Telefona numurs: %s \n Dzimšanas gads: %d", currName, surName, telNum, yearOfBirth);
    }

    private static void PrintBusinessCard(String currName, String surName, String telNum, int yearOfBirth) {
        System.out.printf("Vizītkarte \n ####### \n Vārds: %s \n Uzvārds: %s \n Telefona numurs: %s \n Dzimšanas gads: %d", currName, surName, telNum, yearOfBirth);

    }

    private static int sum(int x, int y) {
        return x + y;


    }

    private static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
