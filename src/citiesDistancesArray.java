public class citiesDistancesArray {

    private static final String[] CITIES = {"Budapest", "Békéscsaba", "Debrecen", "Eger"};
    private static final int[][] DISTANCES =
            {       //            Bp      Bcsab   Debr    Eger
                    /*Bp*/        {0,     216,    231,    158},
                    /*Békéscsaba*/{216,    0,     137,    200},
                    /*Debrecen*/  {231,    137,   0,      136},
                    /*Eger*/      {158,    200,   136,    0},
            };

    public static void main(String[] args) {
        for (int i = 0; i < CITIES.length; i++) {
            System.out.println(CITIES[i]);
        }
    }
}
