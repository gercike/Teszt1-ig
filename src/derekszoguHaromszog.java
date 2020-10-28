import java.util.Scanner;

public class derekszoguHaromszog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az első számot! ");
        double a = sc.nextDouble();
        System.out.print("Kérem a második számot! ");
        double b = sc.nextDouble();
        System.out.print("Kérem a harmadik számot! ");
        double c = sc.nextDouble();
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
            System.out.println("Ebből lehet derékszögű háromszög.");
        } else {
            System.out.println("Ebből nem lesz derékszögű háromszög.");
        }
    }
}
