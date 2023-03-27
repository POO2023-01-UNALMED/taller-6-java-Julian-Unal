package vehiculos;

import java.util.HashMap;

public class Pais {
    String nombre;
    static HashMap<String, Integer> ventasPorPais = new HashMap<String, Integer>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        String higherSellerName = "";
        int higherSellerSales = 0;
        for (String i: ventasPorPais.keySet()) {
            int salesPais = ventasPorPais.get(i);
            if (salesPais > higherSellerSales) {
                higherSellerName = i;
                higherSellerSales = salesPais;
            }
        }
        return new Pais(higherSellerName);
    }

    public static boolean addVentaPais(String pais) {
        int ventas = ventasPorPais.getOrDefault(pais, 0);
        ventasPorPais.put(pais, ventas + 1);
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
