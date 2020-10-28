import java.util.Scanner;

public class testmagassag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a nemét! ");
        String gender = sc.nextLine();
        System.out.print("Adja meg a magasságát cm-ben! ");
        int height = sc.nextInt();
        if (gender.equals("no") && height < 164 && height > 0 || gender.equals("ffi") && height < 176 && height > 0) {
            System.out.println("az átlagnál alacsonyabb");
        } else {
            if (gender.equals("no") && height == 164 || gender.equals("ffi") && height == 176) {
                System.out.println("a magassága átlagos");
            } else {
                if (gender.equals("no") && height > 164 && height < 250 || gender.equals("ffi") && height > 176 && height < 280) {
                    System.out.println("az átlagnál magasabb");
                } else {
                    System.out.println("ez nem ember");
                }
            }
        }
    }
}
