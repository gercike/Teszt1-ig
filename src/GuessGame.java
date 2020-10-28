import java.util.Scanner;

public class GuessGame {
    /*
        Írj gondoltam egy számot játékot! A program generáljon egy véletlen számot 1 és 20 között,
        majd kérdezze meg a felhasználót: "Szerinted mely számra gondoltam?". Ellenőrizze,
        hogy a felhasználó által beírt tipp megegyezik-e az általa generált véletlen számmal.
        Ha nem, írja ki, hogy “Tippelj újra!”, és adjon lehetőséget az újabb tippre.
        Ha a felhasználó eltalálta a generált számot, akkor a program írja ki, hogy “GRATULÁLOK”,
        majd álljon le!
        Módosítsd a fenti programot úgy, hogy rossz tipp esetén azt is írja ki,
        hogy a program által generált véletlenszám nagyobb vagy kisebb-e a felhasználó tippjénél!
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szerinted melyik számra gondoltam 1 és 20 között? ");
        int numInput = sc.nextInt();
        int numToGuess = (int) (Math.random() * 20 + 1);
//        System.out.println(numToGuess);
        if (numInput == numToGuess) {
            System.out.println("Gratulálok!");
        }
        while (numInput != numToGuess) {
            System.out.println("ennél " + ((numInput < numToGuess) ?
                    "nagyobb" : "kisebb"));
            System.out.print("Tippelj újra! ");
            numInput = sc.nextInt();
            if (numInput == numToGuess) {
                System.out.println("Gratulálok!");
                break;
            }
        }
    }
}
