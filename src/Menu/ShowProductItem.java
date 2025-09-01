package Menu;

import model.Product;

import java.util.List;
import java.util.Scanner;

public class ShowProductItem implements  MenuItem{
    private List<Product> products;

    public ShowProductItem(List<Product> products) {
        this.products = products;
    }

    @Override
    public String description() {
        return "Mostrar productos";
    }

    @Override
    public void execute() {

        products.forEach( p -> System.out.println(p.toString()) );

    }
}
