package lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private String Imei;
    private int Memory;

    // metodo costruttore per Smartphone

    public Smartphone(String Name, String Brand, BigDecimal Price, String Imei, int Memory) {
        super(Name, Brand, Price);
        this.Imei = Imei;
        this.Memory = Memory;
    }

    // Metodi get e set particolari di Smartphone

    public String getImei() {
        return this.Imei;
    }

    public void setImei(String newImei) {
        this.Imei = newImei;
    }

    public int getMemory() {
        return this.Memory;
    }

    public void setMemory(int newMemory) {
        this.Memory = newMemory;
    }

    // metodo per la restituzione della Scheda di uno smartphone
    @Override
    public String toString() {
        if (this.Name != null) {
            final BigDecimal Sell = getPriceWithIva();
            return super.toString() + "\n" + this.Name + " " + this.Brand + "\n"
                    + "Memoria : " + this.Memory + "\n" + "Cod. Imei: " + this.Imei + "\n" + "Prezzo: " + Sell
                    + " euro (iva al 22 % inclusa) ";
        } else {
            return "Errore";
        }
    }

}
