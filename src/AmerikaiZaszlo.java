public class AmerikaiZaszlo {
    public static void main(String[] args) {
        String ANSI_RED = "\u001B[31m";
        String ANSI_WHITE = "\u001B[37m";
        String ANSI_BLUE = "\u001B[34m";
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 50; j++) {
                if (j < 15 && i < 6) {
                    System.out.print(ANSI_BLUE + "*" + ANSI_BLUE);
                } else if (i % 2 == 0) {
                    System.out.print(ANSI_RED + "0" + ANSI_RED);
                } else if (i % 2 != 0) {
                    System.out.print(ANSI_WHITE + "0" + ANSI_WHITE);
                }
            }
            System.out.println();
        }
    }
}
