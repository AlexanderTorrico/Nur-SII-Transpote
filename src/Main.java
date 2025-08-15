import model.Minibus;
import model.Urbano;
import model.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Minibus("4555-QWE", "Toyota", "Blanco"));
        vehiculos.add(new Urbano("4555-QWE", "Toyota", "Azul"));


        
        Vehiculo v1 = new Minibus("4555-QWE", "Toyota", "Blanco");
        double coste = v1.salida(5, "noche");

        System.out.println("Mi coste es " + coste);




    }
}