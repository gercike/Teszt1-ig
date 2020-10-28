import java.util.Arrays;

public class GandalfEsATombok {
    private static final int[] DOMBOK = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};
    private static final int[] WEIGHTS = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};
    private static final int[][] HEIGHTSANDWEIGHTS =
            {{84, 144}, {83, 130}, {82, 138}, {76, 135}, {61, 128}, {70, 130}, {58, 120}, {67, 125},
                    {72, 130},
                    {85, 110}};
    private static final int[] HEIGHTSofDWARVES = {130, 138, 135, 128, 130, 120, 125, 130, 110};
    private static final int[] proba1 = {3, 1, 6, 14, 5};
    private static final int[] proba2 = {7, 10, 6, 2, 5, 3};
    private static final String[] GREETING =
            {"látlak!", "Üdvözöllek, ", "Gandalf, ", "jó, ", "hogy ", "újra "};
    private static final String[] MESSAGE = {"obbnagy", "intm", "incharm", "sé", "ím!pr", "enjM",
            "eb", "a", "ebblegkis", "ámúsz", "tónaj", "nekmely", "ámasz"};

    public static void main(String[] args) {
        for (int i = 0; i < MESSAGE.length; i++) {
            System.out.print(theMessageOfPeredhelQuendi(MESSAGE, 8, 3)[i] + " ");
        }
        System.out.println(theNumberOfTheDoor(30));
    }

    public static int theNumberOfTheDoor (int szam){
        int ajtoszam = 0;
        while (!primSzamMegallapito(szam)){
            szam++;
            if (primSzamMegallapito(szam)){
                ajtoszam = szam;
            }
        }
        return ajtoszam;
    }

    public static String[] theMessageOfPeredhelQuendi(String[] message, int wordShift,
                                                      int letterShift) {
        String[] wordsIntoLettersArray = shiftStringElementsToRight(message, wordShift);
        String[] newWords = new String[wordsIntoLettersArray.length];
        for (int i = 0; i < newWords.length; i++) {
            newWords[i] = shiftStringCharsToLeft(wordsIntoLettersArray[i], letterShift);
        }
        return newWords;
    }

    public static String shiftStringCharsToLeft(String word, int shiftNumber) {
        char[] letters = word.toCharArray();
        char[] shiftedLetters = new char[letters.length];
        shiftNumber = shiftNumber % letters.length;
        for (int i = 0, j; i < letters.length; i++) {
            if (i - shiftNumber < 0) {
                j = letters.length - shiftNumber + i;
            } else {
                j = i - shiftNumber;
            }
            shiftedLetters[j] = letters[i];
        }
        String shiftedWord = String.valueOf(shiftedLetters);
        return shiftedWord;
    }

    /**
     * Írj metódust, ami egy Stringeket tartalmazó tömb összes elemét ciklikusan jobbra csúsztatja
     * egyel! A ciklikusság azt jelenti, hogy a tömb utolsó elemét az első helyre rakd!
     */
    public static String[] shiftStringElementsToRight(String[] sentence, int shiftNumber) {
        String[] newSentence = new String[sentence.length];
        shiftNumber = shiftNumber % sentence.length;
        for (int i = 0, j; i < sentence.length; i++) {
            if (i + shiftNumber > sentence.length - 1) {
                j = shiftNumber + i - sentence.length;
            } else {
                j = i + shiftNumber;
            }
            newSentence[j] = sentence[i];
        }
//        for (int i = 0; i < newSentence.length; i++) {
//            System.out.print(newSentence[i]);
//        }
        return newSentence;
    }

    /**
     * Írj programot, ami válaszol erre a kérdésre. A törpök magasságait egy tömb tartamazza, a
     * troll magasságát pedig egy int változó. Kérdés, hogy van-e a tömbnek két olyan eleme, amik
     * együtt legalább akkorák mint a troll magassága. A törpök magasságai: { 130, 138, 135, 128,
     * 130, 120, 125, 130, 110}. A troll magassága: 270.
     */
    public static boolean are2DwarvesHigherThanTroll(int[] dwarvesHeights, int trollHeight) {
        boolean answer = false;
        for (int i = 0; i < dwarvesHeights.length - 1; i++) {
            for (int j = i + 1; j < dwarvesHeights.length; j++) {
                if (dwarvesHeights[i] + dwarvesHeights[j] >= trollHeight) {
                    answer = true;
                    break;
                }
            }
        }
        return answer;
    }

    /**
     * Írj metódus, ami ismerve az egyes személyek súlyát és magasságát, megadja, hogy mi az a
     * legmagasabb torony, amit ezek a személyek alkothatnak, ha egymás vállára állnak, feltéve hogy
     * valakinek a vállára csak olyan valaki állhat, aki alacsonyabb is és könnyebb is nála! A
     * törpök (és Gandalf) súlya és magassága az alábbiak: (a első szám a súly, a második a
     * magasság) {(84, 144), (83, 130), (82, 138), (76, 135), (61, 128), (70,130), (58, 120), (67,
     * 125), (72, 130), (85, 110)}
     */
    public static void towerOfDwarvesAndGandalf(int[][] wsHs) {
        int[][] bunchByWeight = arrayAlapmuveletek.bubbleSort2DArrayBy2ndColumn(wsHs);
        for (int i = 0; i < bunchByWeight.length; i++) {
            System.out.print(Arrays.toString(bunchByWeight[i]) + " ");
        }
        System.out.println();
        int[][] bunchByHeight = arrayAlapmuveletek.bubbleSort2DArrayBy1stColumn(wsHs);
        for (int i = 0; i < bunchByHeight.length; i++) {
            System.out.print(Arrays.toString(bunchByHeight[i]) + " ");
        }
//        for (int i = 0, j = i +1, ladderHeight = wsHs[i][1]; j < wsHs.length; j++) {
//            if (wsHs[i][0] > wsHs[j][0] && wsHs[i][1] > wsHs[j][1]) {
//                    ladderHeight += wsHs[j][1];
//                    i = j;
//            }
//        }
    }

    /**
     * Segíts Gandalfnak megtalálni a legmagasabb dombot! Írj metódust, ami megkeresi egy tömb
     * legnagyobb elemét!
     */
    public static int findMaxInArray(int[] tomb) {
        int max = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] > max) {
                max = tomb[i];
            }
        }
        return max;
    }

    /*
        Írj metódust, ami válaszol Gandalf kérdésére, vagyis egy tömb minden elemét
         lecseréli a tőle jobbra lévő elemek (és saját maga) közül a legnagyobbra.
         Pl.
         {3, 1, 6, 14, 5} -> {14, 14, 14, 14, 5}
         {7, 10, 6, 2, 5, 3} -> {10, 10, 6, 5, 5, 3}
         Meg tudod ezt a feladatot egy ciklussal is oldani?
    */
    public static int[] switchArrayElementWithMaxFromRight(int[] tomb) {
        int actualMax = 0;
        for (int i = 0, j = 0; i < tomb.length; i++) {
            if (tomb[i] > actualMax) {
                actualMax = tomb[i];
            }
            if (i == tomb.length - 1) {
                tomb[j] = actualMax;
                j++;
                i = j - 1;
                actualMax = 0;
            }
            if (j == tomb.length) {
                break;
            }
        }
        return tomb;
    }

    /**
     * súly szerint sorba állnak és először a legkönnyebb és a legnehezebb megy át, utána a második
     * legkönnyebb és a második legnehezebb és így tovább. Ha valamelyik pár nehezebb 150 kg-nál,
     * akkor ők egyesével mennek át. Egy személy ill. egy pár 5 perc alatt kel át a hídon. Mennyi
     * ideig tartott a teljes átkelés? Írj programot, ami válaszol a kérdésre! A törpök (és Gandalf)
     * súlyát az alábbi tömb tartalmazza: {84, 83, 82, 76, 61, 70, 58, 67, 72, 85}
     */
    public static int crossingTheBridge(int[] individuals) {
        int duration = 0;
        int[] sortedIndividuals = arrayAlapmuveletek.bubbleSort(individuals);
        for (int i = 0, j = sortedIndividuals.length - 1; i < sortedIndividuals.length / 2;
             i++, j--) {
            if (sortedIndividuals[i] + sortedIndividuals[j] > 150) {
                duration += 2 * 5;
            } else {
                duration += 5;
            }
        }
        if (sortedIndividuals.length % 2 != 0) {
            duration += 5;
        }
        return duration;
    }

    public static boolean primSzamMegallapito(int num) {
        boolean valasz = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i != num) {
                valasz = false;
                break;
            } else if (i == num) {
                valasz = true;
            }
        }
        return valasz;
    }
}
