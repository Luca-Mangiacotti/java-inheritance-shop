package lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {

    private Boolean isSmart;
    private int Inches;

    // metodo costruttore per Televisore

    public Televisore(String Name, String Brand, BigDecimal Price, Boolean isSmart, int Inches) {
        super(Name, Brand, Price);
        this.isSmart = isSmart;
        this.Inches = Inches;
    }

    // Metodi get e set particolari di Televisore

    public Boolean getisSmart() {
        return this.isSmart;
    }

    public void setisSmart(Boolean newisSmart) {
        this.isSmart = newisSmart;
    }

    public int getInches() {
        return this.Inches;
    }

    public void setInches(int newInches) {
        this.Inches = newInches;
    }

}
