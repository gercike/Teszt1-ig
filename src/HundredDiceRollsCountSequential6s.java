//Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja,
//        hogy hányszor sikerült két 6-ost dobni egymás után.

import java.util.Random;

public class HundredDiceRollsCountSequential6s {
    public static void main(String[] args) {
        System.out.println("100 kockadobás során " + HundredDiceRollsCountSequential6s() + " alkalommal dobtam 6-ost " +
                "kétszer egymás után.");
    }

    static int HundredDiceRollsCountSequential6s() {
        Random rndmzr = new Random();
        int num;
        boolean elso = false;
        boolean masodik = false;
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            num = rndmzr.nextInt(6);
            System.out.println(num+1);
            if (num == 5 && (elso)) {
                counter++;
                masodik = true;
            }
            elso = num == 5;
            if (masodik){
                elso = false;
                masodik = false;
            }
        }
        return counter;
    }
}
