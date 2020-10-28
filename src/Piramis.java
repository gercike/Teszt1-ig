import java.util.Scanner;

public class Piramis {
    public static void main(String[] args) {
//        írj programot ami kap egy számot és annak megfelelően ír ki egy piramist:
//
//        pl:4          sp (num-1)      k (num*2-1)
//           @          3               1
//          @@@         2               3
//         @@@@@        1               5
//        @@@@@@@       0               7
//
//        A piramisnak annyi sorban kell lennie, mint amekkora a szám.
        System.out.print("Kérek egy számot! ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sp = num - 1;
        int k = num * 2 - 1;
        for (int i = 0; i < num; i++) {
            for (int f = 0; f < sp; f++) {
                System.out.print(" ");
            }
            for (int w = num * 2 - 1; w <= k; w++) {
                System.out.print("@");
            }
            System.out.println();
            k += 2;
            sp--;
        }
    }
}
