//import java.util.Scanner;
//
//public class SumOfNPrimNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Az első hány darab prím szám összegére vagy kíváncsi? ");
//        int N = sc.nextInt();
//        int Summa = SumOfNPrimNumbers(N);
//        System.out.println("Az összegük " + Summa);
//    }
//
//    public static int SumOfNPrimNumbers(int Number) {
//        int counter = 0;
//        int numberToCheck = 2;
//        int sum = 0;
//        while (counter < Number) {
//            boolean a = isNumPrime(numberToCheck);
//            if (a) {
//                counter++;
//                sum += numberToCheck;
//            }
//            numberToCheck++;
//        }
//        return sum;
//    }
//
//
//    public static boolean isNumPrime(int Szam) {
//        boolean isPrime = true;
//        for (int i = 2; i < Szam; i++) {
//            if (Szam % i == 0) {
//                return false;
//                break;
//            } else if (isPrime) {
//                return true;
//            }
//
//        }
//    }
//}
