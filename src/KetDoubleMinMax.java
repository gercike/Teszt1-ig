import java.util.Scanner;

public class KetDoubleMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az egyik nem egész számot! ");
        double num1 = sc.nextDouble();
        System.out.print("Kérem a másik nem egész számot! ");
        double num2 = sc.nextDouble();
        System.out.println("A két szám minimuma " + DoubleMinimum(num1, num2) + ", a maximuma " +
                DoubleMaximum(num1, num2) + ".");
    }

    public static double DoubleMinimum(double num1, double num2) {
        double mininum = num1 < num2 ? num1 : num2;
        return mininum;
    }

    public static double DoubleMaximum(double num1, double num2) {
        double maximum = num1 > num2 ? num1 : num2;
        return maximum;
    }
}
