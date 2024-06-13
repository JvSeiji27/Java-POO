package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;

public class UsingConsumer {
    public static void main(String[] args){
        List <Product> list = new ArrayList<>();
        
        Product p1 = new Product("TV", 800.00);
        Product p2 = new Product("Microwave", 700.00);
        Product p3 = new Product("Apple", 0.50);
        Product p4 = new Product("Mouse", 40.0);
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        
        
        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);
        /*for(Product p : list){
            System.out.println(p);
        }*/
    }
}
