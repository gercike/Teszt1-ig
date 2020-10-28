import java.util.Scanner;

public class Haromszogcsillagokbol {
    public static void main(String[] args) {
//        Írj programot ami kap egy számot, és annak megfelelően ír ki egy három szöget:
//        pl:3
//            *
//            **
//            ***
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy számot! ");
        int num = sc.nextInt();
        for (int i = 1; i<=num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
