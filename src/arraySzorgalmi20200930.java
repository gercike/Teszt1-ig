/*
Hozz létre egy új 10000 elemű tömböt.  Írj egy metódust amely egy paraméterként megkapott tömböt
        feltölt 0 és 20 közötti véletlen számokkal, és megszámolja, hogy az egyes számokból
        hány darab van a tömbben. A metódus visszatérési értéke egy olyan 20 elemű tömb legyen,
        amely leírja, hogy az adott számot hányszor generáltuk bele az eredeti tömbbe!
*/

import java.util.Arrays;
import java.util.Random;

public class arraySzorgalmi20200930 {
    public static void main(String[] args) {
        int[] rndNumbers = new int[10000];
        System.out.println(Arrays.toString(countRandomNumbersInArray(rndNumbers)));
    }

    static int[] countRandomNumbersInArray(int[] rndnums) {
        Random rndmzr = new Random();
        for (int i = 0; i < rndnums.length; i++) {
            rndnums[i] = rndmzr.nextInt(21);
        }
        int[] numbers1_20InArray = new int[20];
        int counter = 0;
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < rndnums.length; i++) {
                if (rndnums[i] == j) {
                    counter++;
                }
            }
            numbers1_20InArray[j] = counter;
            counter = 0;
        }
        return numbers1_20InArray;
    }
}
