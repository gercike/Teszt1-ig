import java.util.Scanner;

public class lala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mekkora az X szára?");
        int n = sc.nextInt();
        String sp = ".";
        String bS = "\\";
        String fS = "/";
        String[][] x = new String[2*n+2][2*n+2];
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x.length; j++){
                x[i][j] = sp;
            }
        }
        for (int i=1; i<2*n-1; i++){
            x[i][i] = bS;
        }
        for (int i=2*n-2, j=1; i>0; i--, j++){
            x[j][i] = fS;
        }
//        System.out.println(x[0][1]);
        for (int i=0; i<2*n; i++){
            for (int j=0; j<2*n; j++){
                System.out.print(x[i][j]);
            }
            System.out.println("");
        }
    }
}
