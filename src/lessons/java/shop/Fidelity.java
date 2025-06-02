package lessons.java.shop;

public class Fidelity {

    private String[] Cards = { "Luca10", "Mario20", "Gianni30", "Anna40", "Sara50", "Pino60" };

    // metodo per verificare la validità di una carta fedeltà
    public boolean isValidCard(String card) {
        for (int i = 0; i < this.Cards.length; i++) {
            if (this.Cards[i].equalsIgnoreCase(card)) {
                // applichiamo il 2% di sconto sul prezzo del prodotto
                System.out.println("CARTA VALIDA: " + this.Cards[i]);
                return true;
            }

        }
        return false;
    }
}
