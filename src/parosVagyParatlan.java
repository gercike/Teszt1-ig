import java.util.Scanner;

public class parosVagyParatlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot!");
        int number = sc.nextInt();
        int result = number%2;
        if (result == 0){
            System.out.println("Páros szám");
        }
        else {
            System.out.println("Páratlan szám");
        }
    }
}
