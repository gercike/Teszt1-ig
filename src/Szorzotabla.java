public class Szorzotabla {
    public static void main(String[] args) {
//        Írj programot, ami kiírja a 10-es szorzótáblát (1*1=1, 1*2=2,... stb)!
//                o   Írd ki a szorzótáblát egy 10*10-es négyzetként valahogy így:
//        1*1=1, 1*2=2, 1*3=3,...
//        2*1=2, 2*2=4, 2*3=6,...
        int num1;
        int num2 = 1;
        for (num1 = 1; num1 <= 10; num1++) {
            for (num2 = 1; num2 <= 10; num2++) {
                if (num2<10){
                    System.out.print(num1 + "*" + num2 + "=" + num1 * num2 + ", ");
                } else {
                    System.out.print(num1 + "*" + num2 + "=" + num1 * num2);
                }
            }
            System.out.println();
        }
    }
}
