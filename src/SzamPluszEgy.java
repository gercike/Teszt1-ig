import java.util.Scanner;

//    Írj programot, ami bekér a felhasználótól egy számot, majd hozzáad egyet.
//    Az új számot kiírja a képernyőre, és ha az új szám nagyobb mint az előző (nem elírás),
//            akkor kiírja, hogy "Bi-bi-bíííí, én nyertem". Ha kisebb, akkor pedig azt,
//            hogy ("Ohh. Te nyertél"). Tudsz nyerni ebben a játékban? (Tipp: igen, tudsz (2147483647).
public class SzamPluszEgy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mondj egy számot! ");
        int num = sc.nextInt();
        System.out.println(num + 1);
        if (num + 1 > num) {
            System.out.println("Bi-bi-bíííí, én nyertem.");
        } else {
            System.out.println("Ohh. Te nyertél.");
        }
    }
}
