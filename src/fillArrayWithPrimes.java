import java.util.Arrays;

public class fillArrayWithPrimes {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println(Arrays.toString(fillArrayWithNumbers(numbers)));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]*10);
        }
    }

    public static int[] fillArrayWithNumbers(int[] szamok) {
        for (int i = 0, j = 0; i < Integer.MAX_VALUE && j < szamok.length; i++) {
            if (primSzamMegallapito(i)) {
                szamok[j] = i;
                j++;
            }
        }
        return szamok;
    }

    public static boolean primSzamMegallapito(int num) {
        boolean valasz = false;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i != num) {
                valasz = false;
                break;
            } else if (i == num) {
                valasz = true;
            }
        }
        return valasz;
    }
}
