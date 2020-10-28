public class proba {
    public static void main(String[] args) {
        System.out.println(sumOfNumber(3));
    }
    public static int sumOfNumber(int n) {
        int counter = 0;
        int sum = 0;
        for (int i = 1; counter < n; i++) {
            if (i % 2 == 0) {
                sum += i;
                counter++;
            }
        }
        return sum;
    }
}
