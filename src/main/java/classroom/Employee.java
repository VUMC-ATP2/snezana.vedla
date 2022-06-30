package classroom;

import javax.swing.*;

public class Employee {

    String name;
    String surname;
    String education;
    boolean isFemale;

    public void printInformation()
    {
        System.out.printf("Employee %s %s \n ",name,surname);
        System.out.printf("Education level is " +  education);
        if (isFemale) {
            System.out.println("\n Sieviete");}
            else{
            System.out.println("\n Vīrietis");}
        }

        }






