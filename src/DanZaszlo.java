public class DanZaszlo {
    public static void main(String[] args) {
        String ANSI_RED = "\u001B[31m";
        String ANSI_WHITE = "\u001B[37m";
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 50; j++) {
                if (j > 20 && j < 25 || i == 5 || i == 6) {
                    System.out.print(ANSI_WHITE + "0" + ANSI_WHITE);
                } else {
                    System.out.print(ANSI_RED + "0" + ANSI_RED);
                }
            }
            System.out.println();
        }
    }
}
