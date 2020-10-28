public class Bolha {
    /*
        Egy bolha az alábbi módszer szerint ugrál egy bálna hátán: egyet (egy cm-t) előre, egyet hátra,
        kettőt előre, egyet hátra, hármat előre, egyet hátra, stb… (tehát előre ugrás után mindig ugrik
        egyet hátra, és hátra ugrás után eggyel nagyobbat ugrik előre mint az előző előre ugrásban
            ugrott - időközben ugyanis megerősödik és egyre nagyobbakat tud ugrani).
        Hol lesz a bolha száz ugrás után? (1225)
        A bálna hátán 5 cm-enként vannak csiklandós pontok. Hány csiklandós pontot érint a bolha,
        ha a bálna 10 m hosszú (a bolha a bálna orra hegyétől indul, ami maga is egy csiklandós
                pont)? (19)
    */
    public static void main(String[] args) {
        int start = 0;
        int counter = 0;
        for (int i = 1; start < 1000; i++) {
            start = start + i - 1;
            if (start%5==0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
