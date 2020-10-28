public class Elagazasok1 {
    public static void main(String[] args) {
        int myAge=23;
        if (myAge<0){
            System.out.println("Helló, Marty!");
        }
                if (myAge>20){
                    System.out.println("Jó napot kívánok!");
                }
                else {
                    if (myAge<3){
                        System.out.println("bru-bru-bru");
                    }
                    else {
                        if(myAge>=3 && myAge<13) {
                            System.out.println("Szióka!");
                        }
                        else {
                            System.out.println("Cső!");
                        }
                    }
                }
            }
    }
}
