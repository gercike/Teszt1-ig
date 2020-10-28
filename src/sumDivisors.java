//Írj metódust, amely visszaadja egy szám nála kisebb osztóinak összegét!
//        (Tehát a 8-ra ez az összeg 1+2+4 = 7.)

import java.util.Scanner;

public class sumDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot! ");
        int szam = sc.nextInt();
        System.out.println("A szám osztóinak az összege: " + sumDivisors(szam) + ".");
    }

    static int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

