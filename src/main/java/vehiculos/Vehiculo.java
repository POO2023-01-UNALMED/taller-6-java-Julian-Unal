package vehiculos;

import java.util.HashMap;

public class Vehiculo {
    String placa;
    int puertas;
    double velocidadMaxima;
    String nombre;
    double precio;
    double peso;
    String traccion;
    Fabricante fabricante;
    static int CantidadVehiculos;
    static HashMap<String, Integer> cantidadPorTipo = new HashMap<String, Integer>();
    public Vehiculo(String placa, int puertas, double velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos += 1;
        addVehiculoByTipo(traccion);
        Pais.addVentaPais(fabricante.getPais().getNombre());
        Fabricante.addVentaFabricante(fabricante.getNombre());
    }

    public String vehiculosPorTipo() {
        return "Automoviles: " + cantidadPorTipo.get("automovil") + "\n" +
                "Camionetas: " + cantidadPorTipo.get("camioneta") + "\n" +
                "Camiones:" +  cantidadPorTipo.get("camion");
    }

    private void addVehiculoByTipo(String traccion) {
        int cantidadVehiculos;
        if (traccion == "4X4") {
            cantidadVehiculos = cantidadPorTipo.getOrDefault("camioneta", 0);
            cantidadPorTipo.put("camioneta", cantidadVehiculos + 1);
        }
        if (traccion == "4X2") {
            cantidadVehiculos = cantidadPorTipo.getOrDefault("camion", 0);
            cantidadPorTipo.put("camion", cantidadVehiculos + 1);
        }
        if (traccion == "FWD") {
            cantidadVehiculos = cantidadPorTipo.getOrDefault("automovil", 0);
            cantidadPorTipo.put("automovil", cantidadVehiculos + 1);
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }
}
