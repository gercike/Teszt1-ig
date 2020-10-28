/*
Egy szám osztóösszegének nevezzük az összes osztójának (beleértve az 1-et és önmagát is)
        az összegét. Egy számot szupertökéletesnek nevezünk, ha osztóösszegének az osztóösszege
        megegyezik a szám kétszeresével.
        Pl. a 4 szupertökéletes szám, mert 4 osztóösszege: 1+2+4 = 7, és 7 osztóösszege:
        1+7=8, ami épp 2*4. Írj metódust, ami egy számról eldönti, hogy szupertökéletes-e!
*/

public class findFirst5SuperPerfect {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Kérek egy számot, amiről eldöntöm, hogy szupertökéletes-e! ");
//        int numToCheck = sc.nextInt();
//        if (decideSuperPerfect(numToCheck)) {
//            System.out.println("Ez a szám szupertökéletes.");
//        } else {
//            System.out.println("Ez a szám nem szupertökéletes.");
//        }
        System.out.println("Íme, az első 5 szupertökéletes szám:");
        for (int i = 1, counter = 0; counter < 5; i++) {
            if (decideSuperPerfect(i)) {
                counter++;
                System.out.println(i);
            }
        }
    }

    static boolean decideSuperPerfect(int num) {
        boolean answer;
        int divsum = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                divsum += i;
            }
            i++;
        }
        int divsum2 = 0;
        int j = 1;
        while (j <= divsum) {
            if (divsum % j == 0) {
                divsum2 += j;
            }
            j++;
        }
        answer = (2 * num == divsum2);
        return answer;
    }
}
