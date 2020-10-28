import java.util.Scanner;

public class countTwoConcStringsLength {
    public static void main(String[] args) {
        System.out.print("Kérem az első karakterláncot! ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.print("Kérem a második karakterláncot! ");
        String str2 = sc.next();
        System.out.println("A két karakterlánc együttes hossza: " + countTwoConcStringsLength(str1, str2) + ".");
    }

    static int countTwoConcStringsLength (String chain1, String chain2){
        String longChain = chain1 + chain2;
        return longChain.length();
    }
}
