import java.util.Arrays;

public class arrayAlapmuveletek {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 8, 4};
        int[][] twoDArray = {{76, 157}, {78, 188}, {77, 101}};
//        System.out.println(Arrays.toString(bubbleSort(array)));
//        for (int i = 0; i < twoDArray.length; i++) {
//            System.out.print(Arrays.toString(bubbleSort2DArrayBy1stColumn(twoDArray)[i]) + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < twoDArray.length; i++) {
//            System.out.print(Arrays.toString(bubbleSort2DArrayBy2ndColumn(twoDArray)[i]) + " ");
//        }
    }

    public static int[] bubbleSort(int[] tomb) {
        for (int i = 0, temp; i < tomb.length - 1; i++) {
            if (tomb[i] > tomb[i + 1]) {
                temp = tomb[i];
                tomb[i] = tomb[i + 1];
                tomb[i + 1] = temp;
                i = -1;
            }
        }
        return tomb;
    }

    public static int[][] bubbleSort2DArrayBy1stColumn(int[][] tomb) {
        for (int i = 0, temp1stCol, temp2ndCol; i < tomb.length - 1; i++) {
            for (int j = 0; j < tomb[j].length - 1; j++) {
                if (tomb[i][j] < tomb[i + 1][j] || tomb[i][j] == tomb[i + 1][j] && tomb[i][j+1] < tomb[i + 1][j+1]) {
                    temp1stCol = tomb[i][j];
                    tomb[i][j] = tomb[i + 1][j];
                    tomb[i + 1][j] = temp1stCol;
                    temp2ndCol = tomb[i][j + 1];
                    tomb[i][j + 1] = tomb[i + 1][j + 1];
                    tomb[i + 1][j + 1] = temp2ndCol;
                    i = -1;
                }
            }
        }
        return tomb;
    }

    public static int[][] bubbleSort2DArrayBy2ndColumn(int[][] tomb) {
        for (int i = 0, temp1stCol, temp2ndCol; i < tomb.length - 1; i++) {
            for (int j = 1; j < tomb[j].length; j++) {
                if (tomb[i][j] < tomb[i + 1][j] || tomb[i][j] == tomb[i + 1][j] && tomb[i][j-1] < tomb[i + 1][j-1]) {
                    temp1stCol = tomb[i][j - 1];
                    tomb[i][j - 1] = tomb[i + 1][j - 1];
                    tomb[i + 1][j - 1] = temp1stCol;
                    temp2ndCol = tomb[i][j];
                    tomb[i][j] = tomb[i + 1][j];
                    tomb[i + 1][j] = temp2ndCol;
                    i = -1;
                }
            }
        }
        return tomb;
    }
}
