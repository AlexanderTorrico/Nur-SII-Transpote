package model;

public class Urbano extends Vehiculo {

    public Urbano(String placa, String marca, String color) {
        super(placa, marca, "Urbano", color, 2, 0.3);
    }

    @Override
    public double salida(double recorridoKm, String turno) {
        return this.costoBase + (costoKm * recorridoKm);
    }
}
