//Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja,
//        hogy hány 6-ost sikerült eközben dobni.

import java.util.Random;

public class HundredDiceRollsCount6s {
    public static void main(String[] args) {
        System.out.println("100 kockadobás során " + HundredDiceRollsCount6s() + " alkalommal dobtam 6-ost.");
        }

    static int HundredDiceRollsCount6s(){
        Random rndmzr = new Random();
        int num = 0;
        int counter = 0;
        for (int i = 0; i <100; i++) {
            num = rndmzr.nextInt(6);
            if (num == 5){
                counter++;
            }
        }
        return counter;
    }
}
