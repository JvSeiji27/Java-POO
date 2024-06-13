package application;  //- Usando predicado como parâmetro, portanto função como parâmetr
import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import model.services.ProductService;


public class FuncaoSobreFuncao {
    public static void main(String[] args){
        List <Product> list = new ArrayList<>();
        list.add(new Product("Tv", 400.0));
        list.add(new Product("Microwave", 100.0));
        list.add(new Product("Mouse", 20.0));
        list.add(new Product("Mousepad", 10.0));
        
        
        
        System.out.println(ProductService.sum(list, p -> p.getName().charAt(0) == 'T'));
        
    }
}
