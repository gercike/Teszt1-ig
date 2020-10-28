import java.util.Scanner;

public class isDiv7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy számot! ");
        int number = sc.nextInt();
        if (isDiv7(number)) {
            System.out.println("A szám osztható héttel.");
        } else {
            System.out.println("A szám nem osztható héttel.");
        }
    }

    static boolean isDiv7(int n) {
        boolean valasz = false;
        if (n % 7 == 0) {
            valasz = true;
        }
        return valasz;
    }
}
