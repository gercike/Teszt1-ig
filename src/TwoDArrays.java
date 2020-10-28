import java.util.Arrays;

public class TwoDArrays {
    private static final String[] CITIES = {"Budapest", "Békéscsaba", "Debrecen", "Eger"};
    private static final int[][] DISTANCES =
            {   //              Bp      Bcsab   Debr    Eger
                /*Bp*/          {0,     216,    231,    158},
                /*Békéscsaba*/  {216,   0,      137,    200},
                /*Debrecen*/    {231,   137,    0,      136},
                /*Eger*/        {158,   200,    136,    0},
                };

    public static void main(String[] args) {
//        System.out.println(smallestDistanceAmongCities(DISTANCES));
//        System.out.println(find2NearestCities(CITIES, DISTANCES));
//        System.out.println(find2FarestCities(CITIES, DISTANCES));
//        System.out.println(calcDistanceBetweenCities("Budapest", "Békéscsaba"));
//        System.out.println(findNearestCity("Békéscsaba"));
//        System.out.println(sumAllCitiesTour("Debrecen"));
        System.out.println(visitAllCitiesCalcKm("Békéscsaba", "Budapest", "Eger",
                "Budapest"));
    }

    /** Írj programot, ami megmondja, hogy mekkora a legkisebb távolság két város között!
     */
    public static int smallestDistanceAmongCities (int[][] tomb){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                if (tomb[i][j]<min && tomb[i][j]>0){
                    min = tomb[i][j];
                }
            }
        }
        return min;
    }

    /**Írj programot, ami megmondja,hogy melyik két város van egymáshoz legközelebb!*/
    public static String find2NearestCities (String[] varosok, int[][] tavolsagok){
        int min = Integer.MAX_VALUE;
        int city1 = 0;
        int city2 = 0;
        for (int i = 0; i < tavolsagok.length; i++) {
            for (int j = 0; j < tavolsagok[i].length; j++) {
                if (tavolsagok[i][j]<min && tavolsagok[i][j]>0){
                    min = tavolsagok[i][j];
                    city1 = i;
                    city2 = j;
                }
            }
        }
        String answer = "A legközelebb egymáshoz " + varosok[city1] + " és " + varosok[city2] +
                " van.";
        return answer;
    }

    /**Írj programot, ami megmondja,hogy melyik két város van egymástól legmesszebb!
     */
    public static String find2FarestCities (String[] varosok, int[][] tavolsagok){
        int max = 0;
        int city1 = 0;
        int city2 = 0;
        for (int i = 0; i < tavolsagok.length; i++) {
            for (int j = 0; j < tavolsagok[i].length; j++) {
                if (tavolsagok[i][j]>max){
                    max = tavolsagok[i][j];
                    city1 = i;
                    city2 = j;
                }
            }
        }
        String answer = "A legtávolabb egymástól " + varosok[city1] + " és " + varosok[city2] +
                " van.";
        return answer;
    }

    /**Írj programot, ami bekér a felhasználótól két városnevet, és megmondja, hgy
     a két város egymástól milyen távolságra van! Ha a felhasználó olyan városok
     nevét adja meg, amik nem szerepelnek a tömbben, akkor írd ki, hogy "Nincs
     adat."!
     */
    public static String calcDistanceBetweenCities (String varos1, String varos2){
        String answer;
        int varos1Idx = -1;
        int varos2Idx = -1;
        for (int i = 0; i < CITIES.length; i++) {
            if (CITIES[i].equals(varos1)){
                varos1Idx = i;
            }
            if (CITIES[i].equals(varos2)){
                varos2Idx = i;
            }
            if (varos1Idx!=-1 && varos2Idx!=-1){
                break;
            }
        }
        if (varos1Idx==-1 || varos2Idx==-1) {
            answer = "Nincs adat.";
        } else {
            answer = varos1 + " és " + varos2 + " " + DISTANCES[varos1Idx][varos2Idx] + " km.-re " +
                    "vannak egymástól.";
        }
        return answer;
    }

    /**Írj programot, ami bekér a felhasználótól egy városnevet és megmondja,
     hogy az adott városhoz melyik másik város van legközelebb!*/
    public static String findNearestCity (String varos){
        int varosIdx = -1;
        for (int i = 0; i < CITIES.length; i++) {
            if (CITIES[i].equals(varos)){
                varosIdx=i;
                break;
            }
        }
        int smallestDistance = Integer.MAX_VALUE;
        int nearestCityIdx = -1;
        for (int i = 0; i < DISTANCES[varosIdx].length; i++) {
            if (DISTANCES[varosIdx][i]<smallestDistance && DISTANCES[varosIdx][i]!=0){
                smallestDistance = DISTANCES[varosIdx][i];
                nearestCityIdx = i;
            }
        }
        String answer =
                varos + " városhoz legközelebb " + CITIES[nearestCityIdx] + " található, " + smallestDistance + " km.-re.";
        return answer;
    }

    /**Írj programot, ami bekér a felahasználótól egy városnevet és megmondja, ha
     ebből a városbók kindulva az adatbázisban szereplő összes városba
     ellátogatunk csillagtúra szerűen (vagyis elmegyünk az első városba, majd
     vissza a kindulási helyre, el a következő városba, vissza a kindlási helyre,
     stb.), akkor összesen hány kilométert fogunk megtenni.*/
    public static String sumAllCitiesTour (String varos){
        int sum = 0;
        int startCityIdx = -1;
        for (int i = 0; i < CITIES.length; i++) {
            if (CITIES[i].equals(varos)){
                startCityIdx = i;
            }
        }
        for (int i = 0; i < DISTANCES[startCityIdx].length; i++) {
            if (i != startCityIdx){
                sum += 2*DISTANCES[startCityIdx][i];
            }
        }
        String answer = "Ha a csillagtúra " + varos + " városból indul, " + sum + " km.-t fogunk " +
                "megtenni.";
        return answer;
    }

    /**Írj programot, ami bekér a felahasználótól négy városnevet és megmondja,
     hogy ha az első városból kindulva sorba látogatjuk az összes várost (abban a
     sorrendben, ahogy a felhasználó megadta), akkor összesen hány kilométert
     fogunk megtenni.*/
    public static String visitAllCitiesCalcKm (String varos0, String varos1, String varos2,
                                               String varos3){
        int sum = 0;
        String[] varosok = {varos0, varos1, varos2, varos3};
        int[] citiesIdxs = new int[varosok.length];
        for (int i = 0, k = 0; i < citiesIdxs.length; i++) {
            for (int j = 0; j < varosok.length; j++) {
                if (CITIES[j].equals(varosok[k])){
                    citiesIdxs[i] = j;
                    k++;
                    break;
                }
            }
        }
        for (int i = 0; i < citiesIdxs.length-1; i++) {
            sum = sum + DISTANCES[citiesIdxs[i]][citiesIdxs[i+1]];
        }
        System.out.println(Arrays.toString(citiesIdxs));
        String answer;
        answer = "Ha " + varos0 + " városból indulva " + varos1 + ", " + varos2 + ", " + varos3 +
                " útvonalat járjuk be, akkor " + sum + " km.-t fogunk megtenni.";
        return answer;
    }
}

