package lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // chiediamo all'utente se possiede una carta fedeltà
        System.out.println("Possiedi una carta fedeltà? (si/no)");
        String Fcard = scanner.nextLine().trim().toLowerCase();
        // creiamo una variabile booleana che ci dirà in seguito se l'utente ha diritto
        // allo sconto
        boolean hasValidCard = false;
        if (Fcard.equals("si")) {
            System.out.println("inserisci la tua carta fedeltà: ");
            Fidelity cardToCheck = new Fidelity();
            String card = scanner.nextLine().trim();
            // verifichiamo se la carta è valida
            if (cardToCheck.isValidCard(card)) {
                hasValidCard = true;
                System.out.println("hai diritto al 2% di sconto sul prezzo del prodotto.");
            } else {
                System.out.println("carta non valida");
            }

        }

        // facciamo inserire all'utente un nuovo prodotto
        System.out.println("Inserisci un nuovo prodotto: ");
        // chiediamo che tipo di prodotto vuole inserire
        System.out.println("Che tipo di prodotto vuoi inserire? Smartphone, Televisore o Cuffie?");
        String typeOfProduct = scanner.nextLine().trim().toLowerCase();
        // creiamo il tipo di prodotto richiesto
        if (typeOfProduct.equals("smartphone")) {
            System.out.println("Inserisci il nome dello smartphone: ");
            String name = scanner.nextLine().trim();
            System.out.println("Inserisci la marca dello smartphone:");
            String brand = scanner.nextLine().trim();
            System.out.println("inserisci il prezzo dello smartphone;");
            BigDecimal price = scanner.nextBigDecimal();
            scanner.nextLine(); // consuma il newline rimasto dopo il nextBigDecimal
            System.out.println("inserisci il codice IMEI dello smartphone:");
            String imei = scanner.nextLine().trim();
            System.out.println("Inserisci la memoria dello smartphone in GB: ");
            int memory = scanner.nextInt();
            // creiamo l'oggetto smarthone
            Smartphone newSmartphone = new Smartphone(name, brand, price, imei, memory);
            // verifichiamo se l'utente ha diritto allo sconto
            if (hasValidCard) {
                newSmartphone.setPrice(newSmartphone.getPriceFidelity(new BigDecimal(0.02)));
            }
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
