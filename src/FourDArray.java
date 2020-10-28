import java.util.Random;

public class FourDArray {
    public static void main(String[] args) {
        Random rndmzr = new Random();
        int[][][][] tomb = new int[100][100][100][100];
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                for (int k = 0; k < tomb[i][j].length; k++) {
                    for (int l = 0; l < tomb[i][j][k].length; l++) {
                        System.out.print((tomb[i][j][k][l] = rndmzr.nextInt(50)) + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
