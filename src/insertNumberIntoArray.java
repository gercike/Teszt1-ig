import java.util.Arrays;
import java.util.Random;

public class insertNumberIntoArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rndmzr = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rndmzr.nextInt(101);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(insert(numbers, 4, 66)));
    }

    public static int[] insert(int[] original, int posIdx, int value) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            if (i < posIdx) {
                result[i] = original[i];
            }
            if (i == posIdx) {
                result[posIdx + 1] = original[posIdx];
                result[posIdx] = value;
            }
            if (i > posIdx) {
                result[i + 1] = original[i];
            }
        }
        return result;
    }
}
