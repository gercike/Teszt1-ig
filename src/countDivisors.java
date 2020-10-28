//Írj egy metódust, amely megszámolja, hogy egy bemenetül kapott
//        int számnak hány osztója van!

import java.util.Scanner;

public class countDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik szám osztóinak a számára vagy kíváncsi? ");
        int number = sc.nextInt();
        System.out.println("A megadott számnak " + countDivisors(number) + " db. osztója van.");
    }

    static int countDivisors(int n){
        int counter = 0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0){
                counter++;
            }
        }
        return counter;
    }
}
