//Írj metódust, amely két bemeneti számról eldönti, hogy azok ikerprímek-e.
//        (Ikerprímnek két olyan prímszám együttesét nevezzük,
//        amelyek 2-vel térnek el egymástól: például 5 és 7, vagy 41 és 43.)

import java.util.Scanner;

public class decideTwinPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az egyik számot! ");
        int num1 = sc.nextInt();
        System.out.print("Kérem a másik számot! ");
        int num2 = sc.nextInt();
        if (decideTwinPrimes(num1, num2)) {
            System.out.println("Ezek a számok ikerprímek.");
        } else {
            System.out.println("Ezek a számok nem ikerprímek.");
        }
    }

    static boolean decideTwinPrimes(int n1, int n2) {
        boolean answer = false;
        if (primSzamMegallapito(n1) && primSzamMegallapito(n2) && n2 - n1 == 2 || n2 - n1 == -2) {
            answer = true;
        }
        return answer;
    }

    public static boolean primSzamMegallapito(int num) {
        boolean valasz = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i != num) {
                valasz = false;
                break;
            } else if (i == num) {
                valasz = true;
            }
        }
        return valasz;
    }
}
