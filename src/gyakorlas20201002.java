import java.util.Arrays;
import java.util.Random;

public class gyakorlas20201002 {
    public static void main(String[] args) {
        int[] tomb = new int[10];
        Random rndmzr = new Random();
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = rndmzr.nextInt(101);
        }
        System.out.println(Arrays.toString(tomb));
        System.out.println("A tömb maximuma: " + findMaximum(tomb) + ".");
    }

    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
