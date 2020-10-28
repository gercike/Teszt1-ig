import java.util.Scanner;

public class csillag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mekkora legyen a csillag szélessége/magassága (páratlan számot kérek)? ");
        int widthHeight = sc.nextInt();
        csillag(widthHeight);
    }

    static void csillag(int szelMag) {
        int cs1 = 0;
        int cs2 = szelMag - 1;
        for (int i = 0; i < szelMag; i++, cs1++, cs2--) {
            if (i < szelMag / 2 || i > szelMag / 2) {
                for (int j = 0; j < szelMag; j++) {
                    if (j == szelMag / 2 || j == cs1 || j == cs2) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
            }
            if (i == szelMag / 2) {
                for (int k = 0; k < szelMag; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
