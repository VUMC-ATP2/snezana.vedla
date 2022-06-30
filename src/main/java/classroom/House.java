package classroom;

import com.sun.source.tree.ForLoopTree;

public class House {

    int houseNumber = 14;
    String propertyType = "private";
    byte floors = 1;
    int bedrooms = 4;
    double marketValue = 250;

    public void printInformation() {
        System.out.println("Mājas numurs " + houseNumber);
        System.out.println("Mājas veids ir " + propertyType);
        System.out.println("Stāvu skaits ir " + floors);
        System.out.println("Guļamistabu skaits ir " + bedrooms);
    }
}





