package classroom;

import java.sql.SQLOutput;

public class MyFirstJavaCode {
    public static void main(String[] args) {
        // byte data type
        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors", floorCount);

        System.out.println("My house has " + floorCount + " floors");
        System.out.println("I`m living on the floor " + floorCount + "");

        //%d - numbers
        //%s - text
        //%b - boolean

        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1200);

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);




    }
}
