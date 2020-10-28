//Írj egy metódust, amely visszaadja egy bemenetül
// kapott egész szám számjegyeinek az összegét!

import java.util.Scanner;

public class sumIntegerDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy több számjegyű számot! ");
        int szam = sc.nextInt();
        System.out.println("A szám számjegyeinek az összege: " + sumIntegerDigits(szam));
    }

    static int sumIntegerDigits(int num) {
        int sum = 0;
        int result;
        do {
            result = num % 10;
            num = num / 10;
            sum = sum + result;
        } while (num != 0);
        return sum;
    }
}
