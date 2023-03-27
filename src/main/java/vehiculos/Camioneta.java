package vehiculos;

public class Camioneta extends Vehiculo {
    boolean volco;

    public Camioneta(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
