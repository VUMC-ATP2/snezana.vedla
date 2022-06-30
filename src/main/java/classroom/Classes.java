package classroom;

public class Classes {
    public static void main(String[] args) {


        House myHouse = new House(); //myHouse ir jauns objekts, new House nozīmē, ka ņemt template no Class House
        System.out.println(myHouse); //ja mēģina tagad izptintēt, viņš izprintē atsauci uz Class

        //ja vajag izveidot jaunu objektu Car, veidojam Car BMW = new Car();

        System.out.println(myHouse.floors);//uzzināt info
        myHouse.floors = 3; //samainījām
        System.out.println(myHouse.floors); //print 3 - jaunā vērtība

        myHouse.printInformation(); //izveidota metode un pēc tam izsaukta house.java

        System.out.println("After changes");
        myHouse.bedrooms = 8;
        myHouse.houseNumber = 10; //samaiņīju vērtības

        myHouse.printInformation(); //izprintēs ar atjaunoto info

        System.out.println("");

        System.out.println("Manas mammas māja \n");
        House mamaHouse = new House();
        mamaHouse.houseNumber = 28;
        mamaHouse.bedrooms = 2;
        mamaHouse.floors = 5;
        mamaHouse.propertyType = "daudzdzīvokļu";
        mamaHouse.printInformation();

        System.out.println("");

        System.out.println("Haizivs \n");

        Fish sharkFish = new Fish();
        sharkFish.color = "grey";
        sharkFish.isPredator = true;
        sharkFish.weight = 2000;


        Employee snezhana = new Employee();
        snezhana.isFemale = true;
        snezhana.education = "Bakalaurs";
        snezhana.name = "Snežana";
        snezhana.surname = "Vedļa";

        snezhana.printInformation();

        Employee janis = new Employee();
        janis.surname = "Vedļa";
        janis.name = "Jānis";
        janis.education = "nepabeigta augstākā";
        janis.isFemale = false;

        janis.printInformation();

// apstājos 44. min https://drive.google.com/file/d/1GjLqFWBu9voV46FDsYDFv8fulFffkX64/view

    }


}
