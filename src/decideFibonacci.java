//Írj egy metódust, mely egy számról eldönti, hogy eleme-e a Fibonacci-sorozatnak!

import java.util.Scanner;

public class decideFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik számról szeretnéd tudni, hogy Fibonacci-szám-e? ");
        int number = sc.nextInt();
        if (decideFibonacci(number)) {
            System.out.println("A " + number + " Fibonacci-szám.");
        } else {
            System.out.println("A " + number + " nem Fibonacci-szám.");
        }
    }

    static boolean decideFibonacci(int n) {
        int Fibo0 = 0;
        int Fibo1 = 1;
        boolean valasz = false;
        for (int i = 0; i < n; i++) {
            Fibo0 += Fibo1;
            Fibo1 += Fibo0;
            if (Fibo0 == n || Fibo1 == n) {
                valasz = true;
                break;
            }
            if (Fibo1 > n * 2) {
                break;
            }
        }
        return valasz;
    }
}
