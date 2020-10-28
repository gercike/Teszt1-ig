import java.util.Arrays;
import java.util.Random;

public class arrayMethods {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        Random rndmzr = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rndmzr.nextInt(101);
//        }
        int[] szamok = {2, 2, 2, 2, 2, 2, 2};
//        System.out.println(Arrays.toString(array));
//        System.out.println(sumArrayEvens(array));
//        System.out.println(averageOfArrayEvens(array));
//        System.out.println(countEvenFollowsOdd(array));
//        System.out.println(findBiggestNumberOfArray(array));
//        System.out.println(findFirstPrimeInArray(array));
//        System.out.println(countPrimesInArray(array));
//        printArray(array);
//        findLastPrimeInArray(array);
//        System.out.println(Arrays.toString(reverseArrayElementsOrder(array)));
//        System.out.println(Arrays.toString(put3sIntoArray(array)));
//        System.out.println(Arrays.toString(shiftNumbersInArrayToRight(array, 56)));
        System.out.println(isIntArraySortedInDescending(szamok));
    }

    static public boolean isIntArraySortedInDescending (int[] szamok){
        boolean answer = true;
        for (int i = 1; i < szamok.length; i++) {
            if (szamok[i-1]<szamok[i]){
                answer = false;
                break;
            }
        }
        return answer;
    }

    static public boolean isIntArraySortedInAscending (int[] szamok){
        boolean answer = true;
        for (int i = 1; i < szamok.length; i++) {
            if (szamok[i-1]>szamok[i]){
                answer = false;
                break;
            }
        }
        return answer;
    }

    static public int[] shiftNumbersInArrayToRight(int[] numbers, int shiftNumber) {
        int[] shiftedNumbers = new int[numbers.length];
        shiftNumber = shiftNumber % numbers.length;
        for (int i = 0, j; i < numbers.length; i++) {
            if (i + shiftNumber > numbers.length - 1) {
                j = shiftNumber + i - numbers.length;
            } else {
                j = i + shiftNumber;
            }
            shiftedNumbers[j] = numbers[i];
        }
        return shiftedNumbers;
    }

    public static int sumArrayEvens(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static float averageOfArrayEvens(int[] szamok) {
        int sumEvens = 0;
        int counter = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] % 2 == 0) {
                sumEvens += szamok[i];
                counter++;
            }
        }
        float average = (float) sumEvens / counter;
        return average;
    }

    public static int countEvenFollowsOdd(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int findBiggestNumberOfArray(int[] nms) {
        int biggest = 0;
        for (int i = 0; i < nms.length; i++) {
            if (nms[i] > biggest) {
                biggest = nms[i];
            }
        }
        return biggest;
    }

    public static int findFirstPrimeInArray(int[] tomb) {
        boolean prime = false;
        int answer = 0;
        for (int i = 0; i < tomb.length && prime == false; i++) {
            for (int j = 2; j <= Math.sqrt(tomb[i]); j++) {
                if (tomb[i] % j == 0) {
                    break;
                }
                if (tomb[i] % j != 0 && (int) Math.sqrt(tomb[i]) == j) {
                    prime = true;
                    answer = tomb[i];
                }
            }
        }
        return answer;
    }

    public static int countPrimesInArray(int[] tomb) {
        int counter = 0;
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 2; j <= Math.sqrt(tomb[i]); j++) {
                if (tomb[i] % j == 0) {
                    break;
                }
                if (tomb[i] % j != 0 && (int) Math.sqrt(tomb[i]) == j) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void printArray(int[] tomb) {
        for (int i = tomb.length - 1; i > -1; i--) {
            System.out.println(tomb[i]);
        }
    }

    public static int findLastPrimeInArray(int[] tomb) {
        boolean prime = false;
        int answer = 0;
        for (int i = tomb.length - 1; i > -1 && prime == false; i--) {
            for (int j = 2; j <= Math.sqrt(tomb[i]); j++) {
                if (tomb[i] % j == 0) {
                    break;
                }
                if (tomb[i] % j != 0 && (int) Math.sqrt(tomb[i]) == j) {
                    prime = true;
                    answer = tomb[i];
                }
            }
        }
        return answer;
    }

    public static int[] reverseArrayElementsOrder(int[] numbers) {
        int[] numbersReversed = new int[numbers.length];
        for (int i = numbers.length - 1, j = 0; i > -1; i--, j++) {
            numbersReversed[j] = numbers[i];
        }
        return numbersReversed;
    }

    public static int[] put3sIntoArray(int[] tomb) {
        int counter = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 3 == 0) {
                counter++;
            }
        }
        int[] threesMultiples = new int[counter];
        for (int i = 0, j = 0; i < tomb.length; i++) {
            if (tomb[i] % 3 == 0) {
                threesMultiples[j] = tomb[i];
                j++;
            }
        }
        return threesMultiples;
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
}
