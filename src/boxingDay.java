import java.util.Arrays;

public class boxingDay {

    static int[] englishBoxers = {73, 64, 81, 54, 82, 73, 62, 91, 83};
    static int[] frenchBoxers = {51, 82, 58, 67, 85, 100, 78, 91, 130, 72};
    static int[] everyBoxersWeight = {73, 64, 81, 54, 82, 73, 62, 91, 83, 51, 82, 58, 67, 85, 100, 78, 91, 130, 72};
    static int[] weightCategories = {52, 57, 63, 71, 79, 91, 500};
    static int[][] boxers = {{73, 1}, {64, 1}, {81, 1}, {54, 1}, {82, 1}, {73, 1}, {62, 1}, {91, 1}, {83, 1},
            {51, 2}, {82, 2}, {58, 2}, {67, 2}, {85, 2}, {100, 2}, {78, 2}, {91, 2}, {130, 2}, {72, 2}};


    public static void main(String[] args) {
//        System.out.println("Az angol boxolók átlagos testsúlya " + countAverageWeightofEngBoxers(boxers) + ".");
//        System.out.println("A legnehezebb bokszoló súlya " + heaviestBoxer(boxers) + ".");
//        for (int i = 0; i < twoEasierTogetherThanHeaviest(everyBoxersWeight).length &&
//                twoEasierTogetherThanHeaviest(everyBoxersWeight)[i] != 0; i++) {
//            System.out.print(twoEasierTogetherThanHeaviest(everyBoxersWeight)[i] + ", ");
//        for (int i = 0; i < countBoxersInCategories(boxers).length; i++) {
//            System.out.println(Arrays.toString(countBoxersInCategories(boxers)[i]));
//        }
        for (int i = 0; i < countBoxersInCategories(boxers).length; i++) {
            for (int j = 0; j < countBoxersInCategories(boxers)[i].length; j++) {
                if (countBoxersInCategories(boxers)[i][j]!=0){
                    System.out.print(countBoxersInCategories(boxers)[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    /**
     * Hányan boxolnak az egyes súlycsoportokban?
     */
    public static int[][] countBoxersInCategories(int[][] bokszolok) {
        int[][] boxersInCategories = new int[weightCategories.length][10];
        for (int i = 0; i < weightCategories.length; i++) {
            boxersInCategories[i][0] = weightCategories[i];
        }
        for (int i = 0; i < bokszolok.length; i++) {
            for (int j = 0; j < boxersInCategories.length; j++) {
                if (bokszolok[i][0] <= boxersInCategories[j][0]) {
                    boxersInCategories[j][1]++;
                    for (int k = 3; k < boxersInCategories[j].length;) {
                        if (boxersInCategories[j][k]==0){
                            boxersInCategories[j][k] = bokszolok[i][0];
                            break;
                        } else {
                            k++;
                        }
                    }
                    if (boxersInCategories[j][2]!=bokszolok[i][1] && boxersInCategories[j][2]!=3){
                        boxersInCategories[j][2] += bokszolok[i][1];
                    }
                    break;
                }
            }
        }
        return boxersInCategories;
    }

    /**
     * Van két olyan boxoló, akik együtt is könnyebbek mint a legnehezebb boxoló? KIk ők (hány kg-sak)?
     */
    public static int[] twoEasierTogetherThanHeaviest(int[] bokszolok) {
        int easies[] = new int[bokszolok.length];
        int[] sortedBokszolok = arrayMethods.switchRelMinWithElementOnRelMinIdx(bokszolok);
        for (int i = 0, j = 1; i < sortedBokszolok.length; ) {
            if (sortedBokszolok[i] + sortedBokszolok[j] < sortedBokszolok[sortedBokszolok.length - 1]) {
                easies[i] = sortedBokszolok[i];
                easies[j] = sortedBokszolok[j];
                i++;
                j++;
            }
            if (sortedBokszolok[i] + sortedBokszolok[j] >= sortedBokszolok[sortedBokszolok.length - 1]) {
                i--;
            }
            if (i < 0) {
                break;
            }
        }
        return easies;
    }

    /**
     * Hány kg-s a legnehezebb boxoló?
     */
    public static int heaviestBoxer(int[][] bokszolok) {
        int maxWeight = 0;
        for (int i = 0; i < bokszolok.length; i++) {
            if (bokszolok[i][0] > maxWeight) {
                maxWeight = bokszolok[i][0];
            }
        }
        return maxWeight;
    }

    /**
     * Mennyi az angol boxolók átlagos testsúlya?
     */
    public static int countAverageWeightofEngBoxers(int[][] players) {
        int sum = 0;
        int average = 0;
        for (int i = 0, j = 0; i < englishBoxers.length && players[i][1] == 1; i++) {
            sum += players[i][j];
            average = sum / (i + 1);
        }
        return average;
    }

    public static int[][] mergeTwoIntArrays(int[] tomb1, int[] tomb2) {
        int[][] boxers = new int[tomb1.length + tomb2.length][2];
        for (int i = 0, j = 0; i < boxers.length; i++) {
            if (i <= tomb1.length - 1) {
                boxers[i][0] = tomb1[i];
                boxers[i][1] = 1;
            }
            if (i > tomb1.length - 1) {
                boxers[i][0] = tomb2[j];
                boxers[i][1] = 2;
                j++;
            }
        }
        for (int i = 0; i < boxers.length; i++) {
            System.out.print(Arrays.toString(boxers[i]) + " ");
        }
        return boxers;
    }
}
