package classroom;

public class Classes {

    public static void main(String[] args) {

        House myHouse = new House();
        System.out.println(myHouse);

        System.out.println(myHouse.Bedrooms);
        myHouse.Bedrooms = 5;
        System.out.println(myHouse.Bedrooms);

        myHouse.printInformation();

        System.out.println("\n");

        Cat myCat = new Cat();

        System.out.println(myCat);

        myCat.Specie = "Siamese";
        System.out.println(myCat.Specie); //nebija definēts sākotnēji, šajā var nodefinēt mainīgā vērtību
        myCat.printInformation();

myHouse.isHouseFar();
myHouse.HouseNumber= 9;
myHouse.isHouseFar();

    }


}
