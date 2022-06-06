package classroom;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

//printē skaitļus pēc kārtas, number ir indekss 0=2, 1=11, 2=45, 3=9

        int[] arr = {2, 11, 45, 9,};
        int number = 0;
        while (number < arr.length) {
            System.out.println(arr[number]);
            number++;
        }
// printē pāra skaitļus no 0 līdz 10
        System.out.println("START");
        number = 0;
        while (number < 10) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;

        }
        System.out.println("END");

        // no 18 līdz 65

        int age = 18;
        do {
            System.out.println(age + ", ");
            age++;
        }
        while (age <= 65);
// printē pāra ciparus no 0 līdz 10
        int cost = 0;

        do {
            if (cost % 2 == 0) {
                System.out.println(cost + ", ");
            }
            cost++;
        } while (cost <= 10);

        for (int x = 0; x <= 10; x++) {
            System.out.print(x + ", ");
        }
        System.out.println();


        for (int y = 20; y >= 0; y--) {
            if (y % 2 == 0) {
                System.out.print(y + " ");
            }
        }
        System.out.println("");
// for - visas vērtības no string masīva

        String[] countries = new String[]{"Latvia", "France", "Spain", "Estonia"};

        for (int counter = 0; counter < countries.length; counter++) {
            System.out.print(countries[counter] + ", ");


        }
        System.out.println("");
        for (int counter = countries.length - 1; counter >= 0; counter--) {
            System.out.print(countries[counter] + ", ");


        }
        System.out.println("");
// for each

        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println("");
        // create

        int[] numArray = new int[101];
        for (int x = 0; x < numArray.length; x++) {
            numArray[x] = x;

        }
        for (int x = 0; x < numArray.length; x++)
            if (numArray[x] >= 50) {
                System.out.println(numArray[x]);
            }


    }

}












