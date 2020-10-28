public class ElsoSzaz3malOszthatoParosSzamAtlaga {
    public static void main(String[] args) {
//        Írj programot, ami kiírja az elso 100 hárommal osztható és páros természetes szám átlagát!
        int counter = 0;
        int number = 0;
        int sum = 0;
        while (counter < 3) {
            if (number % 3 == 0 && number % 2 == 0) {
                sum = sum + number;
                System.out.println(number);
                counter++;
            }
            number++;
        }
        System.out.println(sum / (counter));
    }
}
