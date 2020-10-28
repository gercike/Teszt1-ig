//Írj metódust, ami megszámolja, hogy 1 és 1000 között hány tökéletes szám van!

public class countPerfectNumbers1_1000 {
    public static void main(String[] args) {
        System.out.println(countPerfectNumbers1_1000());
    }

    static int countPerfectNumbers1_1000() {
        int counter = 0;
        int sum = 0;
        for (int j = 1; j < 1000; j++) {
            for (int i = 1; i <= j / 2; i++) {
                if (j % i == 0) {
                    sum = sum + i;
                }
                if (i == j / 2 && sum == j) {
                    counter++;
                }
            }
            sum = 0;
        }
        return counter;
    }
}
