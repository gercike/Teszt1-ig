import java.util.Scanner;

public class PrimszamEldonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy egész számot! ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Ez nem prim szám.");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Ez prim szám.");
        }
    }
}
