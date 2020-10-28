import java.util.Scanner;

public class Testtomegindexszamolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a magasságát cm-ben! ");
        int heightInt = sc.nextInt();
        double height = Math.pow((double)heightInt/100, 2);
        System.out.print("Kérem a testsúlyát kg-ban (egész számmal)! ");
        int weight = sc.nextInt();
        double TTI = weight/height;
        System.out.println(TTI);
    }
}
