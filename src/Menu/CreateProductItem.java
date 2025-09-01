package Menu;

import model.Product;

import java.util.List;
import java.util.Scanner;

public class CreateProductItem implements  MenuItem{
    private List<Product> products;

    public CreateProductItem(List<Product> products) {
        this.products = products;
    }

    @Override
    public String description() {
        return "Crear Product";
    }

    @Override
    public void execute() {
        System.out.println("Ingrese el nombre del producto");
        String name = new Scanner(System.in).nextLine();

        Product product = new Product(name);

        products.add(product);

    }
}
