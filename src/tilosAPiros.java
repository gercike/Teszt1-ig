import java.util.Scanner;

public class tilosAPiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy színt!");
        String color = scanner.nextLine();
        if (color.equals("piros")) {
            System.out.println("A piros tilos");
        } else if (color.equals("zöld")) {
            System.out.println("Szabad!!!");
        } else {
            System.out.println("Hibás input.");
        }
    }
}
