package lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Smartphone S24ultra = new Smartphone("S24 Ultra", "Samsung", new BigDecimal(1200), "S24U554478598896I", 512);
        System.err.println(S24ultra.toString());
    }

}
