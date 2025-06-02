package lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Smartphone S24ultra = new Smartphone("S24-Ultra", "Samsung", new BigDecimal(1200.00), "S24U554478598896I", 512);

        Televisore Bravia = new Televisore("BraviaX", "Sony", new BigDecimal(400.00), true, 48);
        Televisore FourKLG = new Televisore("Techno4k", "LG", new BigDecimal(380.00), true, 50);
        Televisore Funk = new Televisore("Funk-10", "Telefunken", new BigDecimal(120), false, 22);

        Cuffie WJBL = new Cuffie("WirePower", "JBL", new BigDecimal(550.00), true, "Black");
        Cuffie Major = new Cuffie("Major-V", "Marshall", new BigDecimal(150.00), false, "White");
        Cuffie OnTrack = new Cuffie("OnTrack", "DYSON", new BigDecimal(500.00), true, "Gold");

        // Stampa prodotti
        System.out.println("ELENCO DEI PRODOTTI \n");
        System.out.println("--------------------");
        System.out.println("SMARTPHONE: \n \n");
        System.out.println(S24ultra.toString() + "\n");
        System.out.println("--------------------");
        System.out.println("TELEVISORI: \n \n");
        System.out.println(Bravia.toString() + "\n");
        System.out.println(FourKLG.toString() + "\n");
        System.out.println(Funk.toString() + "\n");
        System.out.println("--------------------");
        System.out.println("CUFFIE: \n \n");
        System.out.println(WJBL.toString() + "\n");
        System.out.println(Major.toString() + "\n");
        System.out.println(OnTrack.toString() + "\n");

    }

}
