import java.util.Scanner;

public class KetEgeszSzamMinimuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az első számot! ");
        int Szam1 = sc.nextInt();
        System.out.print("Kérem a második számot! ");
        int Szam2 = sc.nextInt();
        System.out.print("Mire vagy kíváncsi: melyik a kisebb (k) vagy a nagyobb (n)? ");
        String valasztas = sc.next();
        boolean vegso;
        if (valasztas.equals("k")) {
            vegso = true;
        } else {
            vegso = false;
        }
        if (vegso) {
            System.out.println("A kisebb szám a(z) " + Valaszto(Szam1, Szam2, vegso) + ".");
        } else {
            System.out.println("A nagyobb szám a(z) " + Valaszto(Szam1, Szam2, vegso) + ".");
        }
    }

    public static int KetSzamMinimuma(int Num1, int Num2) {
        int smaller = Num1 < Num2 ? Num1 : Num2;
        return smaller;
    }

    public static int KetSzamMaximuma(int Num1, int Num2) {
        int bigger = Num1 > Num2 ? Num1 : Num2;
        return bigger;
    }

    public static int Valaszto(int num1, int num2, boolean nr) {
        if (nr) {
            return KetSzamMinimuma(num1, num2);
        } else {
            return KetSzamMaximuma(num1, num2);
        }
    }
}