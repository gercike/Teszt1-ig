/*
Legyen az alábbi sorozat definiálva a következőképp:
        n => n/2, ha n páros
        n => 3*n+1, ha n páratlan
        A fenti szabályt felhasználva, 13-ról indulva a következő sorozatot állíthatjuk elő:
        13 => 40 => 20 => 10 => 5 => 16 => 8 => 4 => 2 => 1
        Látható, hogy a sorozat (13-at és 1-et is beszámítva) 10 számból áll. Nincs bizonyítva
        (lásd Collatz-sejtés), hogy minden ilyen módon generált sorozat 1-re végződik,
        de az 1.000.000 alatti számokra ez igaz.
        Melyik 1.000.000 alatti számból generálható a leghosszabb sorozat?
        Megoldás: (837799, 525 hosszú sorozat)
*/

import java.util.Scanner;

public class collatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Egy szám sorozatára vagy kíváncsi (igen), vagy keressük meg a leghosszabb sorozatot " +
                "(nem)? ");
        String answer = sc.next();
        if (answer.equals("igen")) {
            System.out.print("Melyik szám sorozatát szeretnéd látni? ");
            long num = sc.nextInt();
            System.out.print("Íme: " + num);
            System.out.print("\n A sorozat " + collatzConjectureSequence(num) + " elemből áll.");
        } else {
            System.out.print("Kérem az intervallum alsó értékét! ");
            long first = sc.nextLong();
            System.out.print("Kérem az intervallum felső értékét! ");
            long last = sc.nextLong();
            int length;
            int longest = 0;
            long longestNumber = 1;
            for (long i = first; i < last; i++) {
                length = collatzConjectureLongest(i);
                if (longest < length) {
                    longest = length;
                    longestNumber = i;
                }
            }
            System.out.print(longestNumber);
            System.out.print("\n A(z) " + longestNumber + "-é a leghosszabb sorozat, " +
                    collatzConjectureSequence(longestNumber) +
                    " elemből áll. ");
        }
    }

    static int collatzConjectureSequence(long n) {
        int counter = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(" => " + n);
            counter++;
        }
        return counter;
    }


    static int collatzConjectureLongest(long n) {
        int counter = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            counter++;
        }
        return counter;
    }
}
