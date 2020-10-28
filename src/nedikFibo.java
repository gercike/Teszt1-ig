import java.util.Scanner;

public class nedikFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hanyadik Fibonacci-szám érdekel? ");
        int szam = sc.nextInt();
        System.out.println(nedikFiboTagf(szam));
//        int fibo1 = 0;
//        int fibo2 = 1;
//        if (szam % 2 != 0) {
//            for (int i = 0; i < (szam-1)/2; i++) {
//                fibo1 = fibo1 + fibo2;
//                fibo2 = fibo2 + fibo1;
//            }
//            System.out.println(fibo1);
//        }
//        if (szam % 2 == 0) {
//            for (int i = 0; i < (szam/2-1); i++) {
//                fibo1 = fibo1 + fibo2;
//                fibo2 = fibo2 + fibo1;
//            }
//            System.out.println(fibo2);
//        }
    }

    public static int nedikFiboTagf(int hanyadik){
//        int szam = hanyadik;
        int eredmeny = 0;
        int fibo1 = 0;
        int fibo2 = 1;
        if (hanyadik % 2 != 0) {
            for (int i = 0; i < (hanyadik-1)/2; i++) {
                fibo1 = fibo1 + fibo2;
                fibo2 = fibo2 + fibo1;
            }
            eredmeny = fibo1;
        }
        if (hanyadik % 2 == 0) {
            for (int i = 0; i < (hanyadik/2-1); i++) {
                fibo1 = fibo1 + fibo2;
                fibo2 = fibo2 + fibo1;
            }
            eredmeny = fibo2;
        }
        return eredmeny;
    }
}

