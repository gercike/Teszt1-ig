/*
Írj egy metódust, amely eldönti három (nem feltétlen egész) számról,
        hogy lehet-e ilyen hosszú szakaszokból háromszöget szerkeszteni!
        (Megj: akkor szerkeszthető háromszög, ha mindhárom oldal kisebb,
        mint a másik kettő összege.)
*/

import java.util.Scanner;

public class canDrawTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a három számot!");
        System.out.print("Az első: ");
        double num1 = sc.nextDouble();
        System.out.print("Az második: ");
        double num2 = sc.nextDouble();
        System.out.print("Az harmadik: ");
        double num3 = sc.nextDouble();
        if (canDrawTriangle(num1, num2, num3)){
            System.out.println("Ezekből lehet háromszög.");
        }else {
            System.out.println("Ezekből nem lehet háromszög.");
        }
    }

    static boolean canDrawTriangle(double a, double b, double c) {
        boolean valasz = false;
        if (a + b > c && b + c > a && a + c > b){
            valasz = true;
        }
        return valasz;
    }
}
