public class Elso20EgeszSzamSzorzata {
    public static void main(String[] args) {
        long b = 1;
        int a = 0;
        int j = 1;
        while (j<=20){
            b = b * (++a);
            j++;
            System.out.println(b);
        }
//        System.out.println(a);
    }
}
