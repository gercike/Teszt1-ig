/*
A számelméletben tökéletes számnak nevezzük azokat a természetes számokat,
        amelyek megegyeznek az önmaguknál kisebb osztóik összegével.
        Pl. tökéletes szám a 6, mert önmagánál kisebb osztói: 1, 2, 3 és 1+2+3=6.
        Írj metódust, ami egy számról eldönti, hogy tökéletes szám-e!
*/

import java.util.Scanner;

public class decidePerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy számot, amiről eldöntöm, hogy tökéletes-e! ");
        int num = sc.nextInt();
        if (decidePerfectNumber(num)) {
            System.out.println("Ez tökéletes szám.");
        } else {
            System.out.println("Ez nem tökéletes szám.");
        }
    }

    static boolean decidePerfectNumber(int number) {
        boolean answer = false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        answer = (sum == number);
        return answer;
    }
}
