package homework.classHomework;

public class Main {


    public static void main(String[] args) {

        Triangle exampleOne = new Triangle();
        exampleOne.newTriangle();
        exampleOne.a = 3;
        exampleOne.b = 5;
        exampleOne.c = 6;
        exampleOne.triangleArea(3, 5, 6);
        exampleOne.isTriangleRegular();
        exampleOne.isTriangleIsosceles();

        Triangle exampleTwo = new Triangle();
        exampleTwo.newTriangle();
        exampleTwo.triangleArea(5, 5, 7);
        exampleTwo.isTriangleRegular();
        exampleTwo.isTriangleIsosceles();


    }
}
