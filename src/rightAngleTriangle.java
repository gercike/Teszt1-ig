//Írj metódust, ami a két befogó hosszát paraméterül adva kiszámolja,
//        hogy mennyi a derékszögű háromszög átfogója!

import java.util.Scanner;

public class rightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az egyik befogó értékét! ");
        double side1 = sc.nextInt();
        System.out.print("Kérem a másik befogó értékét! ");
        double side2 = sc.nextInt();
        System.out.println("Az átfogó értéke: " + rightAngleTriangle(side1, side2));
    }

    static double rightAngleTriangle(double a, double b){
        double h;
        h = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(h);
        return c;
    }
}
