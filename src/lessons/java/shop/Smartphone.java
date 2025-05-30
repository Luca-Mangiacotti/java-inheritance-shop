package lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private int Imei;
    private int Memory;

    // metodo costruttore per Smartphone

    public Smartphone(String Name, String Brand, BigDecimal Price, BigDecimal iva, int Imei, int Memory) {
        super(Name, Brand, Price, iva);
        this.Imei = Imei;
        this.Memory = Memory;
    }

    // Metodi get e set particolari di Smartphone

    public int getImei() {
        return this.Imei;
    }

    public void setImei(int newImei) {
        this.Imei = newImei;
    }

    public int getMemory() {
        return this.Memory;
    }

    public void setMemory(int newMemory) {
        this.Memory = newMemory;
    }

}
