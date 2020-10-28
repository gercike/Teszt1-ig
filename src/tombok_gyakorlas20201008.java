import java.lang.reflect.Array;
import java.util.Arrays;

public class tombok_gyakorlas20201008 {
    public static void main(String[] args) {
        int[] tomb = {5, 9, 1, 2, 4, 7, 8};
        System.out.println(trimmedAverage(tomb));
    }

    //    Írj programot, ami kiszámolja egy tömb elemeinek átlagát úgy, hogy a legkisebb és a legnagyobb értéket
    //    figyelmen kívül hagyja!
    public static float trimmedAverage(int[] input) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }
        }
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != min && input[i] != max) {
                sum += input[i];
                counter++;
            }
        }
        return sum / (float)counter;
    }

    //    Írj programot, ami egy tömbbe adott pozícióra beszúr egy elemet! Ha a i-edik Indexre szúrunk be egy elemet,
    //    akkor az i.. indextől kezdve minden elemet eggyel toljunk el! Pl. {1, 5, 3, 7, 2, 8} tömbbe a 3. Indexre
    //    beszúrva a 12-t ezt kapjuk: {1, 5, 3, 12, 7, 2, 8}
    public static int[] insert(int[] original, int posIdx, int value) {
        int[] newArray = new int[original.length + 1];
        for (int i = 0, j = 0; i < original.length; i++, j++) {
            if (i == posIdx) {
                newArray[j] = value;
                newArray[j + 1] = original[i];
                j++;
            } else {
                newArray[j] = original[i];
            }
        }
        return newArray;
    }

    //    Írj programot, ami megadja, hogy egy egész számokat tartalmazó tömbben mely elemek fordulnak elő egynél
    //    többször!
    static public int[] findDuplicatesInArray(int[] array) {
        Arrays.sort(array);
        int[] duplicates = new int[array.length];
        for (int i = 0, j = 0; i < array.length - 1; i++) {
            if (array[i + 1] == array[i]) {
                for (int k = 0; k < duplicates.length; k++) {
                    if (duplicates[k] != array[i]) {
                        duplicates[j] = array[i];
                        j++;
                        break;
                    }
                }
            }
        }
        return duplicates;
    }

    public static int binarySearch(int[] array, int szam) {
        int answer = -1;
        int startIdx = 0;
        int endIdx = array.length - 1;
        int i = (endIdx + startIdx) / 2;
        while (endIdx >= startIdx) {
            if (szam < array[i]) {
                endIdx = i - 1;
            }
            if (szam > array[i]) {
                startIdx = i + 1;
            }
            if (szam == array[i]) {
                return i;
            }
            i = (endIdx + startIdx) / 2;
        }
        return answer;
    }
}
