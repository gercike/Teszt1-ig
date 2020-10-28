import java.util.Arrays;
import java.util.Random;

public class Gyakorlas20201001 {
    public static void main(String[] args) {
//        int num = 2;
//        int[] numbers = new int[10];
//        numbers[numbers.length-1] = num;
//        numbers[]
        Random rndmzr = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rndmzr.nextInt(11);
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println((i + 1) + ".: " + array[i]);
//        }
        System.out.println(Arrays.toString(array));
//        System.out.println(returnMiddleElementInArray(array));
//        System.out.println(findMinimumInArray(array));
//        System.out.println(find2ndMinimuminArray(array, findMinimumInArray(array)));
//        System.out.println(Arrays.toString(reversedBubbleSort(array)));
        System.out.println(Arrays.toString(switchRelMinWithElementOnRelMinIdx(array)));
    }

    static int returnMiddleElementInArray(int[] tomb) {
        if (tomb.length % 2 == 0) {
            return tomb[tomb.length / 2 - 1];
        } else {
            return tomb[tomb.length / 2];
        }
    }

    static int findMinimumInArray(int[] tomb) {
        int min = tomb[0];
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < min) {
                min = tomb[i];
            }
        }
        return min;
    }

    static int find2ndMinimuminArray(int[] tomb, int nr) {
        int secondMin = tomb[0];
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < secondMin && tomb[i] > nr) {
                secondMin = tomb[i];
            }
        }
        return secondMin;
    }

    static int[] reversedBubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; ) {
            if (numbers[i + 1] < numbers[i]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                if (i != 0) {
                    i -= 1;
                }
            }
            if (numbers[i + 1] >= numbers[i]) {
                i++;
            }
        }
        return numbers;
    }

    public static int[] switchRelMinWithElementOnRelMinIdx(int[] szamok) {
        for (int j = 0; j < szamok.length; j++) {
            int min = szamok[j];
            int k = szamok.length - j;
            for (int i = j, temp, idxTo1st = szamok[0]; i < szamok.length; i++) {
                if (szamok[i] < min) {
                    min = szamok[i];
                    idxTo1st = i;
                }
                if (i == szamok.length - 1) {
                    if (szamok[j] != min) {
                        temp = szamok[szamok.length - k];
                        szamok[szamok.length - k] = szamok[idxTo1st];
                        szamok[idxTo1st] = temp;
                    }
                    k--;
                }
            }
        }
        return szamok;
    }

//    static int[] bubbleSort(int[] szamok) {
//        for (int i = 0; i < szamok.length - 1; ) {
//
//        }
//    }

//    static int[] sortRndNumArrayW2ndArray (int[] tomb){
//        int[] sortedArray = new int[tomb.length];
//        int index = 0;
//        int min = tomb[];
//        for (int i = 0; i < tomb.length; i++) {
//            tomb[i]
//        }
//    }
}
