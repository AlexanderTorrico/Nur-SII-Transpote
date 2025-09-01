import Menu.CreateProductItem;
import Menu.MenuItem;
import Menu.ShowProductItem;
import model.Minibus;
import model.Product;
import model.Urbano;
import model.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Minibus("4555-QWE", "Toyota", "Blanco"));
        vehiculos.add(new Urbano("4555-QWE", "Toyota", "Azul"));

        Vehiculo v1 = new Minibus("4555-QWE", "Toyota", "Blanco");
        double coste = v1.salida(5, "noche");

        System.out.println("Mi coste es " + coste);
         */

        // Agregar la funcionalidad de eliminar
        // Agregar la funcionalidad de editar
        // Enumeración de manera escalable de los menus

        List<Product> products = new ArrayList<>();

        List<MenuItem> menu = new ArrayList<>();
        menu.add( new CreateProductItem(products) );
        menu.add( new ShowProductItem(products) );


        int option;
        do {
            menu.forEach( m -> System.out.println(m.description()) );

            System.out.println("--- -Ingrese su opción");

            option = new Scanner(System.in).nextInt();
            menu.get(option - 1).execute();

        } while (option != 0);

    }
}