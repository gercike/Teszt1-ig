import java.util.Scanner;

public class Gyemant {
    public static void main(String[] args) {
//        Írj egy programot, ami kirajzol egy gyémántot egy bekért szám alapján:
//           szám: 5
//                      sp      qm      row
//              ?       2       1       1
//             ? ?      1       2       2
//            ? ? ?     0       3       3
//             ? ?      1       2       4
//              ?       2       1       5
//        A gyémántnak annyi sorban kell lennie, mint amekkora a szám.
        System.out.print("Kérek egy páratlan számot! ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 2 + 1;
        int x;
        if (num % 2 == 0) {
            System.out.println("Ez nem páratlan szám, ebből nem lesz gyémánt.");
        } else {
            for (int i = 1; i <= num; i++) {
                x = Math.abs(a - i);
                while (x > 0) {
                    System.out.print(" ");
                    x--;
                }
                x = Math.abs(a - i);
                while (x < a) {
                    System.out.print("? ");
                    x++;
                }
                System.out.println();
            }
        }
    }
}
