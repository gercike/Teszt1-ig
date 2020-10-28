import java.util.Scanner;

public class EgyikMasikOsztojaE {
//    Írj programot, ami bekér a felhasználótól két számot, és megmondja,
//    hogy a második szám osztója-e az elsőnek (első szám másodikkal vett osztási maradéka nulla-e).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az első számot! ");
        int num1 = sc.nextInt();
        System.out.print("Kérem a második számot! ");
        int num2 = sc.nextInt();
        if (num1%num2==0) {
            System.out.println("A második szám osztója az első számnak.");
        } else {
            System.out.println("A második szám nem osztója az első számnak.");
        }
    }
}
