public class textIn2DArray {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        String szo = "GERGELY";
        char[] word = szo.toCharArray();
        char[][] wordXword = new char[word.length][word.length];
        for (int i = 0; i < wordXword.length; i++) {
            for (int j = 0; j < wordXword[i].length; j++) {
                wordXword[i][j] = word[j];
            }
        }
        for (int i = 0; i < wordXword.length; i++) {
            for (int j = 0; j < wordXword[i].length; j++) {
                if (i == j) {
                    System.out.print(ANSI_RED + wordXword[i][j] + ANSI_RED);
                } else {
                    System.out.print(ANSI_WHITE + wordXword[i][j] + ANSI_WHITE);
                }
            }
            System.out.println();
        }
    }
}
