import java.util.Scanner;

public class KetSzamKisebbVagyNagyobb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az első számot! ");
        int Szam1 = sc.nextInt();
        System.out.print("Kérem a második számot! ");
        int Szam2 = sc.nextInt();
        int Smaller = KetSzamEldonto(Szam1, Szam2);
        System.out.println("A kisebb szám: " + Smaller);
    }
    public static int KetSzamEldonto(int Num1, int Num2) {
        int Smaller = Num1 < Num2 ? Num1 : Num2;
        return Smaller;
    }
}
