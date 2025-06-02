package lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

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
        // System.out.println("ELENCO DEI PRODOTTI \n");
        // System.out.println("--------------------");
        // System.out.println("SMARTPHONE: \n \n");
        // System.out.println(S24ultra.toString() + "\n");
        // System.out.println("--------------------");
        // System.out.println("TELEVISORI: \n \n");
        // System.out.println(Bravia.toString() + "\n");
        // System.out.println(FourKLG.toString() + "\n");
        // System.out.println(Funk.toString() + "\n");
        // System.out.println("--------------------");
        // System.out.println("CUFFIE: \n \n");
        // System.out.println(WJBL.toString() + "\n");
        // System.out.println(Major.toString() + "\n");
        // System.out.println(OnTrack.toString() + "\n");

        // facciamo inserire all'utente un nuovo prodotto
        System.out.println("Inserisci un nuovo prodotto: ");
        // chiediamo che tipo di prodotto vuole inserire
        System.out.println("Che tipo di prodotto vuoi inserire? Smartphone, Televisore o Cuffie?");
        Scanner scanner = new Scanner(System.in);
        String typeOfProduct = scanner.nextLine().trim().toLowerCase();
        // creiamo il tipo di prodotto richiesto
        if (typeOfProduct.equals("smartphone")) {
            System.out.println("Inserisci il nome dello smartphone: ");
            String name = scanner.nextLine().trim();
            System.out.println("Inserisci la marca dello smartphone:");
            String brand = scanner.nextLine().trim();
            System.out.println("inserisci il prezzo dello smartphone;");
            BigDecimal price = scanner.nextBigDecimal();
            System.out.println("inserisci il codice IMEI dello smartphone:");
            String imei = scanner.nextLine();
            System.out.println("Inserisci la memoria dello smartphone in GB: ");
            int memory = scanner.nextInt();
            // creiamo l'oggetto smarthone
            Smartphone newSmartphone = new Smartphone(name, brand, price, imei, memory);
            // stampiamo la scheda dello smartphone appena creato
            System.out.println("Scheda del nuovo smartphone: \n");
            System.out.println(newSmartphone.toString());
        } else if (typeOfProduct.equals("televisore")) {
            System.out.println("Inserisci il nome dello Televisore: ");
            String name = scanner.nextLine().trim();
            System.out.println("Inserisci la marca dello Televisore:");
            String brand = scanner.nextLine().trim();
            System.out.println("inserisci il prezzo dello Televisore;");
            BigDecimal price = scanner.nextBigDecimal();
            System.out.println("Questo Televisore è Smart? (true/false)");
            boolean isSmart = scanner.nextBoolean();
            System.out.println("Inserisci la grandezza dello schermo del Televisore in pollici: ");
            int inches = scanner.nextInt();
            // creiamo l'oggetto smarthone
            Televisore newTelevisore = new Televisore(name, brand, price, isSmart, inches);
            // stampiamo la scheda dello Televisore appena creato
            System.out.println("Scheda del nuovo Televisore: \n");
            System.out.println(newTelevisore.toString());
        } else if (typeOfProduct.equals("cuffie")) {
            System.out.println("Inserisci il nome dello Cuffie: ");
            String name = scanner.nextLine().trim();
            System.out.println("Inserisci la marca dello Cuffie:");
            String brand = scanner.nextLine().trim();
            System.out.println("inserisci il prezzo dello Cuffie;");
            BigDecimal price = scanner.nextBigDecimal();
            System.out.println("Queste Cuffie sono wireless? (true/false)");
            boolean isWireless = scanner.nextBoolean();
            System.out.println("Inserisci il colore delle cuffie: ");
            String color = scanner.nextLine();
            // creiamo l'oggetto smarthone
            Cuffie newCuffie = new Cuffie(name, brand, price, isWireless, color);
            // stampiamo la scheda dello Cuffie appena creato
            System.out.println("Scheda delle nuove Cuffie: \n");
            System.out.println(newCuffie.toString());
        } else {
            System.out.println("Tipo di prodotto non riconosciuto. Errore nell'inserimento.");
        }
        scanner.close();
    }

}
