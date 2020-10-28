import java.util.Scanner;

public class Szokoev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy évszámot! ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("szökőév");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("szökőév");
        } else {
            System.out.println("nem szökőév");
        }
    }
}
