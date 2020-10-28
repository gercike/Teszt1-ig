public class PrimSzamMegallapito {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 100000; i++) {
            if (primSzamMegallapito(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Kérek egy 1-nél nagyobb pozitív egész számot! ");
//        int number = sc.nextInt();
//        if (primSzamMegallapito(number)) {
//            System.out.println("Ez prímszám.");
//        } else {
//            System.out.println("Ez nem prímszám.");
//        }

//        for (int i = 2; i <= number; i++) {
//            if (number % i == 0 && i != number) {
//                System.out.println("Ez nem prímszám.");
//                break;
//            } else if (i == number) {
//                System.out.println("Ez prímszám.");
//            }
//        }
    }

    // lentebb a prímszám-megállapító tagfüggvény
    public static boolean primSzamMegallapito(int num) {
        boolean valasz = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i != num) {
                valasz = false;
                break;
            } else if (i == num) {
                valasz = true;
            }
        }
        return valasz;
    }
}
