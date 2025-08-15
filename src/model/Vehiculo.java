package model;

public abstract class Vehiculo {
    public String placa;
    public String marca;
    public String tipo;
    public String color;

    public double costoBase;
    public double costoKm;

    public Vehiculo(String placa, String marca, String tipo, String color, double costoBase, double costoKm) {
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.costoBase = costoBase;
        this.costoKm = costoKm;
    }

    public abstract double salida(double recorridoKm, String turno);
}
