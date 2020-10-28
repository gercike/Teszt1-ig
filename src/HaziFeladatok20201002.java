import java.util.Arrays;

public class HaziFeladatok20201002 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 4, 1, 10};
        int[] array2 = {1, 2, 3, 10, 1, 4};
//        System.out.println(checkIfArrayIsMirrorSymmetric(array1));
        System.out.println(compareArraysElements(array1, array2));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(sortArrayOddsAfterEvensIntoNewArray(array1)));
//        System.out.println(Arrays.toString(mergeSortedArraysIntoSortedArray(array1, array2)));
    }

    /**
     * Írj metódust, ami igazat ad vissza, ha egy tömb tükörszimetrikus, azaz visszafelé olvasva
     * ugyanaz, mint előrefelé olvasva.
     */
    public static boolean checkIfArrayIsMirrorSymmetric(int[] tomb) {
        boolean answer = false;
        for (int i = 0, j = tomb.length - 1; i < tomb.length; i++, j--) {
            if (tomb[i] != tomb[j]) {
                break;
            } else answer = (i == tomb.length - 1 && tomb[i] == tomb[j]);
        }
        return answer;
    }

    /**
     * Írj programot, ami megállapítja, hogy két tömb azonos-e, vagyis ugyanazokat az elemeket
     * tartalmazza-e ugyanabban a sorrendben!
     */
    public static boolean checkIf2ArraysAreEqual(int[] tomb1, int[] tomb2) {
        boolean answer = false;
        for (int i = 0; i < tomb1.length; i++) {
            if (tomb1[i] != tomb2[i]) {
                break;
            } else if (i == tomb1.length - 1) {
                answer = true;
            }
        }
        return answer;
    }

    /**
     * Írj programot, ami megállapítja, hogy két tömb ugyanazokat az elemeket tartalmazza-e
     * (függetlenül az elemek sorrendjétől)!
     */
    public static boolean compareArraysElements(int[] tomb1, int[] tomb2) {
        boolean answer1 = true;
        boolean answer2 = true;
        for (int i = 0; i < tomb1.length; i++) {
            for (int j = 0; j < tomb2.length; j++) {
                if (tomb1[i] == tomb2[j]) {
                    break;
                }
                if (tomb1[i] != tomb2[j] && j == tomb2.length - 1) {
                    answer1 = false;
                }
            }
        }
        for (int i = 0; i < tomb2.length; i++) {
            for (int j = 0; j < tomb1.length; j++) {
                if (tomb2[i] == tomb1[j]) {
                    break;
                }
                if (tomb2[i] != tomb1[j] && j == tomb1.length - 1) {
                    answer2 = false;
                }
            }
        }
        if ((answer1) && (answer2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Írj metódust, ami úgy alakít át egy tömböt, hogy a páros elemek a tömb elején, a páratlanok
     * pedig a tömb végén lesznek. Írd meg a metódust úgy is, hogy létrehoz egy új tömböt és úgy is,
     * hogy a paraméterként kapott tömböt módosítja.
     */
    public static int[] sortArrayOddsAfterEvensNoNewArray(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 != 0) {
                for (int j = i + 1; j < tomb.length; j++) {
                    if (tomb[j] % 2 == 0) {
                        int temp = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = temp;
                        break;
                    }
                }
            }
        }
        return tomb;
    }

    /**
     * Írj metódust, ami úgy alakít át egy tömböt, hogy a páros elemek a tömb elején, a páratlanok
     * pedig a tömb végén lesznek. Írd meg a metódust úgy is, hogy létrehoz egy új tömböt és úgy is,
     * hogy a paraméterként kapott tömböt módosítja.
     */
    public static int[] sortArrayOddsAfterEvensIntoNewArray(int[] tomb) {
        int[] newArray = new int[tomb.length];
        for (int i = 0, newIdxForEven = 0, newIdxForOdd = newArray.length - 1; i < tomb.length;
             i++) {
            if (tomb[i] % 2 == 0) {
                newArray[newIdxForEven] = tomb[i];
                newIdxForEven++;
            } else {
                newArray[newIdxForOdd] = tomb[i];
                newIdxForOdd--;
            }
        }
        return newArray;
    }

    /**
     * Írj metódust, ami két (paraméterként kapott) rendezett tömböt összefésül egy rendezett
     * tömbbé. Pl array1 = [1,2,3,4] array2 = [2,5,7,8] result = [1,2,2,3,4,5,7,8] Próbáld meg úgy
     * (is) megoldani a feladatot, hogy mindkét bemeneti tömbön csak egyszer mész végig, és az
     * eredmény tömb már az összefésülés után rendezett (vagyis ne hívj rá további rendező
     * algoritmust)!
     */
    public static int[] mergeSortedArraysIntoSortedArray(int[] tomb1, int[] tomb2) {
        int[] sortedArray = new int[tomb1.length + tomb2.length];
        boolean tomb1kesz = false;
        boolean tomb2kesz = false;
        for (int i = 0, j = 0, k = 0; k < sortedArray.length; ) {
            if (tomb1[i] < tomb2[j]) {
                if (!tomb1kesz) {
                    sortedArray[k] = tomb1[i];
                    k++;
                    if (i < tomb1.length - 1) {
                        i++;
                    } else {
                        tomb1kesz = true;
                    }
                }
                if (tomb1kesz) {
                    sortedArray[k] = tomb2[j];
                    k++;
                    if (j < tomb2.length - 1) {
                        j++;
                    } else {
                        tomb2kesz = true;
                    }
                }
            }
            if (tomb2[j] < tomb1[i]) {
                if (!tomb2kesz) {
                    sortedArray[k] = tomb2[j];
                    k++;
                    if (j < tomb2.length - 1) {
                        j++;
                    } else {
                        tomb2kesz = true;
                    }
                }
                if (tomb2kesz) {
                    sortedArray[k] = tomb1[i];
                    k++;
                    if (i < tomb1.length - 1) {
                        i++;
                    } else {
                        tomb1kesz = true;
                    }
                }
            }
            if (tomb1[i] == tomb2[j]) {
                if (!tomb1kesz) {
                    sortedArray[k] = tomb1[i];
                    k++;
                    if (i < tomb1.length - 1) {
                        i++;
                    } else {
                        tomb1kesz = true;
                    }
                }
                if (tomb1kesz) {
                    sortedArray[k] = tomb2[j];
                    k++;
                    if (j < tomb2.length - 1) {
                        j++;
                    } else {
                        tomb2kesz = true;
                    }
                }
            }
        }
        return sortedArray;
    }
}
