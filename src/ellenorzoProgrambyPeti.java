import java.util.Arrays;

public class ellenorzoProgrambyPeti {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 7, 9, 10, 11};
        int[] arr2 = {2, 3, 4, 5, 7, 9, 10, 11, 12};
        test(-1, arr1, 0);
        test(-1, arr1, 100);
        test(-1, arr1, 6);
        test(0, arr1, 2);
        test(5, arr1, 9);
        test(7, arr1, 11);

        test(-1, arr2, 0);
        test(-1, arr2, 100);
        test(-1, arr2, 6);
        test(0, arr2, 2);
        test(5, arr2, 9);
        test(7, arr2, 11);
        test(8, arr2, 12);


    }

    public static int binarySearch(int[] array, int szam){
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

    public static void test(int expected, int[] arr, int value){
        int actual = binarySearch(arr, value);
        if(actual != expected){
            System.out.println("HIBA!!! Az alábbi tömbben");
            System.out.println(Arrays.toString(arr));
            System.out.println("kerestük a " + value + " értéket");
            System.out.println("Az elvárt eredmény: " + expected + " a tényleges: " + actual);
            System.out.println();
        }
        else{
            System.out.println("OK");
        }
    }
}
