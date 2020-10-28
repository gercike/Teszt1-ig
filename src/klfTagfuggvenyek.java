import java.util.Scanner;

public class klfTagfuggvenyek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Kérem az első egész számot! ");
//        int szam1 = sc.nextInt();
//        System.out.print("Kérem a második egész számot! ");
//        int szam2 = sc.nextInt();
//        System.out.println("A két szám összege " + ketEgeszSzamOsszege(szam1, szam2) + ".");
        System.out.print("Kérem az első szót! ");
        String szo1 = sc.nextLine();
        System.out.print("Kérem a második szót! ");
        String szo2 = sc.nextLine();
        System.out.println("A két szó együttes hossza " + ketStringHosszMegszamolo(szo1,
                szo2) + ".");
    }

    public static int ketEgeszSzamOsszege (int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static int ketStringHosszMegszamolo (String word1, String word2){
        int result = (word1 + word2).length();
        return result;
    }
}
