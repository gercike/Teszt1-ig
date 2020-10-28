import java.sql.SQLOutput;
import java.util.Scanner;

public class szinesSzovegetKiiro {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mi a kiírandó szöveg? ");
        String text = sc.nextLine();
        System.out.print("Milyen színnel írjam ki? ");
        String color = sc.nextLine();
        if (color.equals("fekete")){
            color = ANSI_BLACK;
        }
        if (color.equals("piros")){
            color = ANSI_RED;
        }
        if (color.equals("zöld")){
            color = ANSI_GREEN;
        }
        if (color.equals("fehér")){
            color = ANSI_WHITE;
        }
        if (color.equals("kék")){
            color = ANSI_BLUE;
        }
        System.out.println("Íme: " + szinesSzoveg(text, color));
    }

    public static String szinesSzoveg (String szoveg, String szin){
        String eredmeny = (szin + szoveg + szin);
        return eredmeny;
    }
}
