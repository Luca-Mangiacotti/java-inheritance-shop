package lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    private Boolean isWireless;
    private String Color;

    // metodo costruttore per Cuffie

    public Cuffie(String Name, String Brand, BigDecimal Price, Boolean isWireless, String Color) {
        super(Name, Brand, Price);
        this.isWireless = isWireless;
        this.Color = Color;
    }

    // Metodi get e set particolari di Cuffie

    public Boolean getisWireless() {
        return this.isWireless;
    }

    public void setisWireless(Boolean newisWireless) {
        this.isWireless = newisWireless;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String newColor) {
        this.Color = newColor;
    }

    // metodo per la restituzione della Scheda per Cuffie
    @Override
    public String toString() {
        if (this.Name != null) {
            final BigDecimal Sell = getPriceWithIva();
            final String Wire = this.isWireless ? ", con tecnologia Wireless." : "";
            return super.toString() + "\n" + this.Name + " " + this.Brand + "\n"
                    + "Colore " + this.Color + Wire + "\n" + "Prezzo: " + Sell
                    + " euro (iva al 22 % inclusa) ";
        } else {
            return "Errore";
        }
    }

}
