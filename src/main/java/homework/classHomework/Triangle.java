package homework.classHomework;

public class Triangle {

    int a;
    int b;
    int c;
    int s;

    public void newTriangle() {

        System.out.print("Trīsstūris");


    }

    public void triangleArea(int a, int b, int c) {
        int p;
        p = (a + b + c) / 2;
        s = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = s;
        System.out.println("Trīsstūra laukums ir " + s);
    }

    public boolean isTriangleIsosceles() {
        boolean isIsosceles;
        if (a == b && b == c) {
            System.out.println("Ir vienādsānu");
            isIsosceles = true;
        } else {
            System.out.println("Nav vienādsānu");
            isIsosceles = false;
        }

        return isIsosceles;

    }

    public boolean isTriangleRegular() {
        boolean isRegular;
        if (a == b || b == c || a == b) {
            System.out.println("Vienādmalu trīsstūris");
            isRegular = true;
        } else {
            System.out.println("Nav vienādmalu trīsstūris");
            isRegular = false;
        }
        return isRegular;
    }

}

