//Hozz létre egy 50 elemű tömböt, és generáld bele a Fibonacci sorozat első 50 számát!
//        (A tömb 0 indexű eleme 0, az 1 indexű eleme 1 legyen!)

import java.util.Arrays;

public class first50FiboPutInArray {
    public static void main(String[] args) {
        long[] arrayForFibos = new long[50];
        long f0 = 0;
        long f1 = 1;
        for (int i = 0; i < 50; i += 2) {
            arrayForFibos[i] = f0;
            arrayForFibos[i+1] = f1;
            f0 = f0 + f1;
            f1 = f1 + f0;
        }
        System.out.println(Arrays.toString(arrayForFibos));
        for (int i = 0; i < arrayForFibos.length; i++) {
            System.out.println(arrayForFibos[i]);
        }
    }
}
