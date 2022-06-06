package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        System.out.println("1.uzdevums");

        Scanner scanner = new Scanner(System.in);

        int x = 3;
        int sum = 0;

        while (sum < 100) {
            System.out.println("Ievadiet skaitli");
            x = scanner.nextInt();
            sum = sum + x;
        }
        System.out.println("Gatavs");


        System.out.println("2.uzdevums");

 /*       NEZINU, NESANĀK, NETĒRĒŠU LAIKU!!!

 Scanner primeScanner = new Scanner(System.in);
        int p = primeScanner.nextInt();

        if (p <= 1) {
            System.out.println("Nav pirmskaitlis");
        } else if (p == 2) {
            System.out.println("Pirmskaitlis");
        } else if (p % 2 == 0 || p % 3 == 0 || p % 5 == 0 || p % 7 == 0) ;
        {
            System.out.println("Nav pirmskaitlis");
        }
else System.out.println("Ir pirmskaitlis");

  */

        System.out.println("3.uzdevums");

        System.out.println("\n int while");
        int[] flatNum = {1, 2, 3, 4, 5}; //izveidots masiivs uzreiz definējot mainīgos.
//while
        int num = 0;
        while (num < flatNum.length) {
            System.out.print(flatNum[num] + ", "); //saka, lai izprintē vērtības no saraksta flatNum
            num++;
        }
        System.out.println("\n int do while");
//do while
        num = 0;
        do {
            System.out.print(flatNum[num] + ", ");
            num++;
        }
        while (num < flatNum.length); //cikls izies vismaz vienu reizi, jo sākumā veic DO un pēc tam pārbauda while
        //kad while iziet false - cikls apstājas.
        System.out.println("\n int for");
//for
        for (num = 0; num < flatNum.length; num++) //te num nodefinēju uzreiz iekavās
        {
            System.out.print(flatNum[num] + ", ");
        }

        System.out.println("\n int for each");

//for each

        for (int number : flatNum) {
            System.out.print(number + ", ");
        }

        System.out.println("\n String while");

        String[] summerMonth = new String[]{"June", "July", "August" };
//string while
        int month = 0;
        while (month < summerMonth.length) {
            System.out.print(summerMonth[month] + ", ");
            month++;
        }
        System.out.println("\n String do while");

// do while
        month = 0;
        do {
            System.out.print(summerMonth[month] + ", ");
            month++;
        }

        while (month < summerMonth.length);
        System.out.println("\n String for");

// for

        for (month = 0; month < summerMonth.length; month++) {
            System.out.print(summerMonth[month] + ", ");
        }
        System.out.println("\n String for each");
//for each

        for (String number : summerMonth) {
            System.out.print(number + ", ");
        }


        System.out.println("");

        int[] evenNumbers = new int[100];
        for (int a = 0; a < evenNumbers.length; a++) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println("");


        char[] letters = {'A', 'B', 'C', 'D'};

        int count = 0;
        while (count <= letters.length) {
            System.out.println(letters[count]); // es nesaprotu, kas te ir par error!!!
            count++;
        }
        System.out.print("");

        do {
            System.out.print(letters[count]);
            count++;
        }
        while (count <= letters.length);


        for (count = 0; count < letters.length; count++) {
            System.out.print(letters[count] + ", ");


            for (char letter : letters) {
                System.out.println(letter);
            }

            System.out.println("5.uzdevums");


            Scanner in = new Scanner(System.in);
            System.out.print("Lūdzu, ievadiet skaitli ");
            int number = in.nextInt();
            int resultMultiple = 1; // mazākais iespējamais rezultāts
            for (int i = number; i > 0; i--) { //kad tiek izpildīts šis nosacījums, sistēma rēķina uzdevumu zemāk
                resultMultiple = resultMultiple * i;
                //aprēķins skaitlim 3
                //result = 1 * 3; pārraksta rezultāta vērtību - 3
                //result = 3 * 2; pārraksta rezultāta vērtību - 6
                //result = 6 * 1; pārraksta rezulāta vērtību 6
            }
            System.out.println("Skaitļa " + number + " faktoriālā vērtība ir " + resultMultiple);


            System.out.println();


            Scanner pinScanner = new Scanner(System.in);
            int pinCorrect = 1221;
            int pinAttempt = 1;

            System.out.println("Lūdzu, ievadiet PIN ");
            int inputPin = pinScanner.nextInt(); //String inputPin definēju, kad tas ievadīts

            while (pinAttempt < 3 && inputPin != pinCorrect) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz ");
                pinAttempt++;
                inputPin = pinScanner.nextInt();
            }
            if (pinAttempt == 3 && inputPin != pinCorrect) {
                System.out.println("Karte bloķēta");
            } else {
                System.out.println("PIN kods pareizs");
            }

        }
    }
}






