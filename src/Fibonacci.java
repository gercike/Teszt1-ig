public class Fibonacci {
    public static void main(String[] args) {
        long F1 = 0;
        long F2 = 1;
        int i = 0;
        while (i<40){
            F1 = F2 + F1;
            F2 = F2 + F1;
            i++;
//            System.out.print(F1 + "," + F2 + ",");
        }
        System.out.println(F1);
    }
}
