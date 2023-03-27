package vehiculos;

import java.util.HashMap;

public class Fabricante {
    String nombre;
    Pais pais;
    static HashMap<String, Integer> ventasPorFabricante = new HashMap<String, Integer>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        String higherSellerName = "";
        int higherSellerSales = 0;
        for (String i: ventasPorFabricante.keySet()) {
            int salesPais = ventasPorFabricante.get(i);
            if (salesPais > higherSellerSales) {
                higherSellerName = i;
                higherSellerSales = salesPais;
            }
        }
        return new Fabricante(higherSellerName, new Pais(""));
    }

    public static boolean addVentaFabricante(String nombre) {
        int ventas = ventasPorFabricante.getOrDefault(nombre, 0);
        ventasPorFabricante.put(nombre, ventas + 1);
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
