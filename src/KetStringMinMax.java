import java.util.Scanner;

public class KetStringMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az egyik karakterláncot! ");
        String str1 = sc.nextLine();
        System.out.print("Kérem a másik karakterláncot! ");
        String str2 = sc.nextLine();
        System.out.println("A két karakterlánc minimuma " + StringMininum(str1, str2) + ", a " +
                "maximuma " + StringMaximum(str1, str2) + ".");
    }

    public static int StringMininum(String str1, String str2) {
        int str1length = str1.length();
        int str2length = str2.length();
        if (str1length < str2length){
            return str1length;
        } else {
            return str2length;
        }

    }

    public static int StringMaximum(String str1, String str2) {
        int str1length = str1.length();
        int str2length = str2.length();
        if (str1length > str2length){
            return str1length;
        } else {
            return str2length;
        }

    }
//    public static double DoubleMaximum(double num1, double num2) {
//        double maximum = num1 > num2 ? num1 : num2;
//        return maximum;
//    }
}
