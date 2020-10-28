import java.util.Arrays;
import java.util.Random;

public class countArrayElements {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rndmzr = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rndmzr.nextInt(101);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(countElementsLessThan10FromAverage(numbers));
    }

    public static int countElementsLessThan10FromAverage(int[] szamok) {
        int sum = 0;
        for (int i = 0; i < szamok.length; i++) {
            sum += szamok[i];
        }
        int average = sum / szamok.length;
        int counter = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] > average - 11 && szamok[i] < average + 11) {
                System.out.println(szamok[i]);
                counter++;
            }
        }
        return counter;
    }
}
