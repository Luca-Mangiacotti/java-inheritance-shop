package lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;
import java.math.RoundingMode;

public class Prodotto {

    protected int CodeProd;
    protected String Name;
    protected String Brand;
    protected BigDecimal Price;
    protected BigDecimal iva;

    // metodo costruttore default
    public Prodotto() {

        this.CodeProd = 0;
        this.Name = "";
        this.Brand = "";
        this.Price = new BigDecimal(0);
        this.iva = new BigDecimal(0);
    }

    // metodo costruttore con l'iva impostata al 22%
    public Prodotto(String Name, String Brand, BigDecimal Price) {

        Random rand = new Random();
        this.CodeProd = rand.nextInt(9999);
        this.Name = Name;
        this.Brand = Brand;
        this.Price = Price;
        this.iva = new BigDecimal(0.22);
    }

    // metodo costruttore
    public Prodotto(String Name, String Brand, BigDecimal Price, BigDecimal iva) {

        Random rand = new Random();
        this.CodeProd = rand.nextInt(9999);
        this.Name = Name;
        this.Brand = Brand;
        this.Price = Price;
        this.iva = iva;
    }

    // metodi get e set per le variabili del prodotto

    public int getCode() {
        return this.CodeProd;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String newName) {
        this.Name = newName;
    }

    public String getBrand() {
        return this.Brand;
    }

    public void setBrand(String newBrand) {
        this.Brand = newBrand;
    }

    public BigDecimal getPriceNoIva() {
        return this.Price;
    }

    public void setPrice(BigDecimal newPrice) {
        this.Price = newPrice;
    }

    // metodo per la restituzione del prezzo con iva

    public BigDecimal getPriceWithIva() {

        return this.Price.multiply(this.iva.add(BigDecimal.ONE)).setScale(2, RoundingMode.DOWN);
    }

}
