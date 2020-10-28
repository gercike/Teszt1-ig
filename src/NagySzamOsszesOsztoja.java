public class NagySzamOsszesOsztoja {
    public static void main(String[] args) {
//        Írd ki a 63434 összes osztóját!
        int a = 63434;
        int counter = 1;
        while(counter<=a){
            if (a%counter==0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
