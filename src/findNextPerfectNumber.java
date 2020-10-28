import java.util.Scanner;

public class findNextPerfectNumber {
    public static void main(String[] args) {
        System.out.print("Kérek egy számot! ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(
                "A " + number + " után következő tökéletes szám a(z) " +
                        findNextPerfectNumber(number) + ".");
    }

    static int findNextPerfectNumber(int num) {
        int sum = 0;
        int start = num + 1;
        do {
            for (int i = 1; i <= start / 2; i++) {
                if (start % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum != start) {
                sum = 0;
                start++;
            }
        } while (sum != start);
        return start;
    }
}
