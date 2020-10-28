import java.util.Scanner;

public class FrodoReferenceAge {
    //    Írj Frodo-reference-age programot. Frodo 33 éves a Lord of the Rings elején, és 50,
//    amikor útnak indul a gyűrűvel. Írj programot, ami bekéri a felhasználó korát, és megadja,
//    hogy az hogyan viszonyul Frodo e két életkorához. Pl., ha a felhasználó 40 éves
//    a program ezt írja ki: "Ön 7 évvel idősebb, mint Frodo Bilbó 101-edik születésnapján,
//    és 10 évvel fiatalabb mint amikor útrakelt."
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ön hány éves? ");
        int age = sc.nextInt();
        if (age < 33) {
            System.out.println("Ön " + (33 - age) +
                    " évvel fiatalabb, mint Frodó Bilbó 101-edik születésnapján, és " + (50 - age) +
                    " évvel fiatalabb, mint amikor útrakelt.");
        }
        if (age == 33) {
            System.out.println(
                    "Ön épp olyan idős, mint Frodó Bilbó 101-edik születésnapján, és " +
                            (50 - age) +
                            " évvel fiatalabb, mint amikor útrakelt.");
        }
        if (age > 33 && age < 50) {
            System.out.println("Ön " + (age - 33) +
                    " évvel idősebb, mint Frodó Bilbó 101-edik születésnapján, és " + (50 - age) +
                    " évvel fiatalabb, mint amikor útrakelt.");

        }
        if (age == 50) {
            System.out.println("Ön " + (age - 33) +
                    " évvel idősebb, mint Frodó Bilbó 101-edik születésnapján, és épp olyan idős," +
                    " mint amikor útrakelt.");

        }
        if (age > 50) {
            System.out.println("Ön " + (age - 33) +
                    " évvel idősebb, mint Frodó Bilbó 101-edik születésnapján, és " + (age - 50) +
                    " évvel idősebb, mint amikor útrakelt.");

        }

    }
}
