package homework;

import javax.sql.rowset.serial.SQLOutputImpl;

public class FirstClass {
    public static void main(String[] args) {

// Informācija par valsti

        String CountryName = "Panama";
        System.out.println(CountryName);

        int PanamaPopulation = 3929141;
        int area = 75517;
        String language = "spāņu";
        String currency = "$";
        boolean isEU = false;
        boolean isNotEU = true;

        System.out.printf("Centrālamerikas galējā dienvidu valsts ir %s.\n", CountryName);
        System.out.printf("Tās iedzīvotāju daudzums pēdējo reizi fiksēts 2015.gadā kā %d cilvēku, " + "kas dzīvo %d km2 plašā teritorijā. \n", PanamaPopulation, area);
        System.out.printf("Valsts oficiālā valoda ir %s. " + "Valsts iekšienē līdzās oficiālai ASV dolāra %s valūtai ir Panamas balboa. \n", language, currency);
        System.out.println(isEU);


        if (isEU) {
            System.out.println("Ir ES dalībvalsts");
        } else {
            System.out.println("Nav ES dalībvalsts");

        }


        //Aritmēriskie operatori

        byte a = 3;
        short b =  6;
        double c = a + b;

        // +
        System.out.println(c); //9.0
        System.out.println(a+b); //9
        System.out.println(b+c); //15.0

        // -

        System.out.println(a - b); //-3
        System.out.println(c-a); //6
        System.out.println(b-(c-a)); //0

        // *

        System.out.println(a*b); //18
        System.out.println(c*a); //27.0
        System.out.println(a*a); //9

        // /
        System.out.println(c/b); //1.5
        System.out.println(b/a); //2
        System.out.println(a/b); // 0, jo a un b ir int tips nevis double



    }



    }

