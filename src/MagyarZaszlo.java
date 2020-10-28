public class MagyarZaszlo {
    public static void main(String[] args) {
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_WHITE = "\u001B[37m";
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 50; j++) {
                if (i < 4) {
                    System.out.print(ANSI_RED + "*" + ANSI_RED);
                }
                if (i > 3 && i < 8) {
                    System.out.print(ANSI_WHITE + "*" + ANSI_WHITE);
                }
                if (i > 7 && i < 12) {
                    System.out.print(ANSI_GREEN + "*" + ANSI_GREEN);
                }
            }
            System.out.println();
        }
    }
}
