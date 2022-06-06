package classroom;

import com.sun.source.tree.ForLoopTree;

public class House {

    int HouseNumber = 14;
    String PropertyType = "privātmāja";
    byte Floors = 1;
    int Bedrooms = 3;


    public void printInformation() {

        System.out.println("Mājas numurs " + HouseNumber);
        System.out.println("Īpašuma veids: " + PropertyType);
        System.out.println("Stāvu skaits: " + Floors);
        System.out.println("Guļamistabu skaits: " + Bedrooms);
    }

    public boolean isHouseFar() {
boolean isFar;
        if (HouseNumber > 10)
        {
            System.out.println("Māja ir ielas galā");

            isFar = true;
        }
        else{
            System.out.println("Māja ir tuvu ceļam");
            isFar = false;

        }
        return isFar;

    }




}





