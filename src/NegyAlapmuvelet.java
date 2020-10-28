import java.util.Scanner;

public class NegyAlapmuvelet {
//    Írj a négy alapműveletet tudó számológépet. A prgram kérjen be a felhasználótól két számot
//    és egy műveleti jelet. A műveleti jel lehet: +, -, *, /. Ezután a program alkalmazza a
//    műveleti jelet a két számra és írja ki az eredményt!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az első számot! ");
        int num1 = sc.nextInt();
        System.out.print("Kérem a második számot! ");
        int num2 = sc.nextInt();
        System.out.print("Kérem a műveleti jelet! ");
        String sign = sc.next();
        if (sign.equals("+")){
            System.out.println(num1 + num2);
        }
        if (sign.equals("-")){
            System.out.println(num1 - num2);
        }
        if (sign.equals("/")){
            System.out.println(num1 / num2);
        }
        if (sign.equals("*")){
            System.out.println(num1 * num2);
        }
    }
}
