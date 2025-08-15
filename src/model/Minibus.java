package model;

public class Minibus extends Vehiculo {

    public Minibus(String placa, String marca, String color) {
        super(placa, marca, "Minibus", color, 2, 0.3);
    }

    @Override
    public double salida(double recorridoKm, String turno) {
        double coste = costoBase + (costoKm * recorridoKm);
        if(turno.equals("noche")){
            return coste * 1.25;
        }

        return coste;
    }
}
